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
			console.log('통신실패!!');
		},
		success: function(data) {

			for (let i = 0; i < data.length; i++) {
				data[i]._children = data[i].children;
				delete data[i].children;
			}

			gridData = data;
		}
	});

	alert(gridData);

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
			useCascadingCheckbox: true
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
				whiteSpace: 'normal',
				formatter: function(e) {
					return e.value
				},
			}
		]
	});

	return menuListGrid;
}

window.onload = () => {

	initGrid();

//	// 동일레벨추가
//	$("#addLevelMenuBtn").click(function() {
//
//		if (!schr_yn) {
//			alert("조회 후 진행하세요.");
//			return;
//		}
//
//		var upper_menu_no = "";
//		var tmp_menu_no = tmpMenuNo++;
//		var row_num = -1;
//		var depth = 1;
//
//		if (menuGrid.GetRowCount() > 0) {
//			var row = menuGrid.GetRow();
//
//			if (row == null) {
//				alert("메뉴를 선택하세요");
//				return;
//			}
//			upper_menu_no = row["UPPER_MENU_NO"];
//			row_num = 0;
//			depth = row["DEPTH"];
//		}
//
//		// 상위 메뉴의 사용여부, 매체코드를 가져간다.
//		var use_yn = "<%= Const.BOOLEAN_TRUE %>";
//		var chnl_cd = "<%= Const.ST_CHNL_CD_PC %>";
//		if (menuGrid.GetRowCount() > 0) {
//			var rows = menuGrid.GetRows();
//			$.each(rows, function(idx, row) {
//				if (row["MENU_NO"] == upper_menu_no) {
//					use_yn = row["USE_YN"];
//					chnl_cd = row["CHNL_CD"];
//				}
//			});
//		}
//
//		var row = menuGrid.GetRow();
//		// 동일 레벨 추가
//		row.node.parent.addChild({
//			data: {
//				"UPPER_MENU_NO": upper_menu_no
//				, "TMP_MENU_NO": tmp_menu_no
//				, "DEPTH": depth
//				, "SYS_DIVI_CD": strSysDiviCd
//				, "POP_YN": "<%= Const.BOOLEAN_FALSE %>"
//				, "USE_YN": use_yn
//				, "SORT_SEQ": "999"
//				, "CHNL_CD": chnl_cd
//			}
//		})
//
//		//행추가시 디테일그리드 클리어처리
//		menuGrpGrd.ClearRows();
//
//
//	});
//
//
//	// 하위레벨추가
//	$("#addLowLevelMenuBtn").click(function() {
//		if (!schr_yn) {
//			alert("조회 후 진행하세요.");
//			return;
//		}
//
//		var row = menuGrid.GetRow();
//
//		if (row["LEVEL"] == endDepth) {
//			alert("상위 메뉴를 선택해 주세요.");
//			return;
//		}
//
//		var upper_menu_no = row["TMP_MENU_NO"];
//		var tmp_menu_no = tmpMenuNo++;
//		var depth = parseInt(row["DEPTH"]) + 1;
//
//		if (depth > endDepth) {
//			alert("메뉴는 " + endDepth + "DEPTH로 운영됩니다.");
//			return;
//		}
//
//		// 상위메뉴가 N일 경우 하위메뉴도 N으로 처리.
//		var use_yn = row["USE_YN"];
//
//		// 상위메뉴의 매체코드
//		var chnl_cd = row["CHNL_CD"];
//
//		// 하위 레벨 추가
//		row.addChild({
//			data: {
//				"UPPER_MENU_NO": upper_menu_no
//				, "TMP_MENU_NO": tmp_menu_no
//				, "DEPTH": depth
//				, "SYS_DIVI_CD": strSysDiviCd
//				, "POP_YN": "<%= Const.BOOLEAN_FALSE %>"
//				, "USE_YN": use_yn
//				, "SORT_SEQ": "999"
//				, "CHNL_CD": chnl_cd
//			}
//		})
//
//		//행추가시 디테일그리드 클리어처리
//		menuGrpGrd.ClearRows();
//	});
//
//	// 메뉴저장
//	$("#saveMenuBtn").click(function() {
//		if (!menuGrid.CheckRequired()) {
//			return;
//		};
//
//		// 3depth의 경우 화면명 필수
//		var rows = menuGrid.GetRows({
//			checked: true
//		});
//
//		var chr_required_cnt = 0;
//		$.each(rows, function(idx, row) {
//			if (row["DEPTH"] == endDepth) {
//
//				if (row["SCR_NM"] == "") {
//					alert(endDepth + "레벨 메뉴에는 화면을 선택해야 합니다.");
//					chr_required_cnt++;
//					return false;
//				}
//			}
//		});
//
//		if (chr_required_cnt == 0) {
//			if (msgConfirm("S")) {
//				menuGrid.DoSave({
//					action: "/system/auth/registStMenuMgmt.action",
//					cud: ["C", "U"]
//				});
//			}
//		}
//
//	});
//
//	//찾기
//	$("#srchFilterBtn").click(function() {
//		menuGrid.SearchRow({ id: "MENU_NM", keyword: $("#menu_nm").val() });
//	});
//
//	//키보드 엔터키로 찾기 기능 ASCII엔터키값(13)
//	$("#menu_nm").keypress(function(event) {
//		if (event.which == 13) {
//			event.preventDefault();
//			$("#srchFilterBtn").click();
//		}
//	});

	// menuListGrid.on('expand', (ev) => {
	// 	const rowKey = ev;
	// 	const descendantRows = menuListGrid.getDescendantRows(rowKey);
	//
	// 	console.log('rowKey: ' + rowKey);
	// 	console.log('descendantRows: ' + descendantRows);
	//
	// 	if (!descendantRows.length) {
	// 		menuListGrid.appendRow(
	// 			{
	// 				menuName: 'dynamic loading data',
	// 				_children: [
	// 					{
	// 						menuName: 'leaf row'
	// 					},
	// 					{
	// 						menuName: 'internal row',
	// 						_children: []
	// 					}
	// 				]
	// 			},
	// 			{ parentRowKey: rowKey }
	// 		);
	// 	}
	// });
	//
	// menuListGrid.on('collapse', ev => {
	// 	const rowKey = ev;
	// 	const descendantRows = menuListGrid.getDescendantRows(rowKey);
	//
	// 	console.log('rowKey: ' + rowKey);
	// 	console.log('descendantRows: ' + descendantRows);
	// });

}