const initGrid = () => {

	const Grid = tui.Grid;
	let gridData;

	Grid.applyTheme('defualt', {
		cell: {
			normal: {
				border: 'black'
			},
			header: {
				background: 'gray',
				text: 'white'
			},
			evenRow: {
				background: '#fee'
			}
		}
	});

	$.ajax({
		type: "GET",
		url: "/menu/menuInfoList",
		async: false,
		dataType: "json",
		contentType: "application/json; charset=utf-8",
		error: function() {
			alert("오류 발생");
		},
		success: function(data) {

			for (let i = 0; i < data.length; i++) {

				if(data[i].children.length != 0){
					data[i]._children = data[i].children;
				}
				delete data[i].children;
			}

			gridData = data;
		}
	});

	const menuListGrid = new Grid({
		el: document.getElementById('menuListGrid'),
		data: gridData,
		scrollX: true,
		scrollY: true,
		draggable: false,
		header: { height: 30 },
		rowHeaders: ['checkbox'],
		bodyHeight: 700,
		contextMenu: null,
		treeColumnOptions: {
			name: 'menuNo',
			useIcon: true,
			useCascadingCheckbox: false
		},
		columns: [
			{
				header: '메뉴번호',
				name: 'menuNo',
				align: "center",
				width: 150,
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: '메뉴이름',
				name: 'menuName',
				align: "left",
				width: 100,
				editor: 'text',
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: 'URL',
				name: 'menuUrl',
				align: "left",
				width: 150,
				editor: 'text',
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: '정렬순서',
				name: 'menuSeq',
				align: "left",
				width: 150,
				editor: 'text',
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: '사이트',
				name: 'siteDiviCd',
				align: "left",
				width: 150,
				editor: 'text',
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: '사용여부',
				name: 'useYn',
				align: "left",
				width: 150,
				editor: 'text',
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: '등록자',
				name: 'regId',
				align: "left",
				width: 150,
				editor: 'text',
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			},
			{
				header: '부모메뉴번호',
				name: 'menuParentNo',
				editor: 'text',
				hidden : false,
				formatter: function(e) {
					return e.value
				},
			}
		]
	});

	return menuListGrid;
}

window.onload = () => {

	const menuListGrid = initGrid();

	// 동일 행 추가
	document.getElementById("addLevelMenuBtn").addEventListener("click", function(){

		const selectRowKey = menuListGrid.getFocusedCell().rowKey;

		if(selectRowKey == null){
			alert("row를 선택해주세요");
			return false;
		}

		if(menuListGrid.getParentRow(selectRowKey) == null){

			const rowData = {menuNo: "", menuName: "", menuUrl: "",  menuSeq: "", siteDiviCd : "" , useYn: "Y", regId: "", menuParentNo: ""};

			menuListGrid.appendRow(rowData, {
				at: selectRowKey + 1,
				extendPrevRowSpan: true,
				focus: true
			});
		} else {

			const parentRowData = menuListGrid.getParentRow(selectRowKey);

			const rowData = {menuNo: "", menuName: "", menuUrl: "",  menuSeq: "", siteDiviCd : "" , useYn: "Y", regId: "", menuParentNo: parentRowData.menuNo};

			menuListGrid.appendTreeRow(rowData, {
				parentRowKey: parentRowData.rowKey,
				extendPrevRowSpan: true,
				focus: true
			});
		}
	});

	// 하위 행 추가
	document.getElementById("addLowLevelMenuBtn").addEventListener("click", function(){

		const selectRowKey = menuListGrid.getFocusedCell().rowKey;

		if(selectRowKey == null){
			alert("row를 선택해주세요");
			return false;
		}

		if(menuListGrid.getDepth(selectRowKey) == 2){
			alert("메뉴의 최대 깊이는 2입니다.");
			return false;
		}

		const parentRowData = menuListGrid.getRow(selectRowKey);

		const rowData = {menuNo: "", menuName: "", menuUrl: "",  menuSeq: "", siteDiviCd: "", useYn: "Y", regId: "", menuParentNo: parentRowData.menuNo};

		menuListGrid.appendTreeRow(rowData, {
			parentRowKey: parentRowData.rowKey,
			extendPrevRowSpan: true,
			focus: true
		});
	});

	// 메뉴저장
	document.getElementById("saveMenuBtn").addEventListener("click", function(){

		const selectRowData = menuListGrid.getCheckedRows();

		let formMenuNo;

		if(selectRowData[0].menuNo == ""){
			formMenuNo = String(menuListGrid.getRowCount());
		} else {
			formMenuNo = selectRowData[0].menuNo;
		}

		$.ajax({
			type: "GET",
			url: "/menu/menuSave",
			data : {
				menuNo: formMenuNo,
				menuName: selectRowData[0].menuName,
				menuUrl: selectRowData[0].menuUrl,
				menuSeq: parseInt(selectRowData[0].menuSeq),
				siteDiviCd: selectRowData[0].siteDiviCd,
				useYn: selectRowData[0].useYn,
				regId: selectRowData[0].regId,
				menuParentNo: selectRowData[0].menuParentNo
			},
			error: function() {
				alert("오류 발생");
			},
			success: function() {
				alert("저장 성공!");
				// window.location.reload();
			}
		});
	});

	// //찾기
	// $("#srchFilterBtn").click(function() {
	// 	menuGrid.SearchRow({ id: "MENU_NM", keyword: $("#menu_nm").val() });
	// });
	//
	// //키보드 엔터키로 찾기 기능 ASCII엔터키값(13)
	// $("#menu_nm").keypress(function(event) {
	// 	if (event.which == 13) {
	// 		event.preventDefault();
	// 		$("#srchFilterBtn").click();
	// 	}
	// });

}