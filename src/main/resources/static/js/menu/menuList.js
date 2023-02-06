import Grid from 'tui-grid';

const initGrid = () => {

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

	const menuListGrid = new Grid({
		el: document.getElementById('menuListGrid'),
		data: {
			api: {
				readData: {
					url: '/menu/menuInfoList',
					method: 'GET'
				}
			}
		},
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
}