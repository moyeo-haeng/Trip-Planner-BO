// fetch("/menu/menuInfoList", {method: 'POST'}).then(function (menuInfoList) {
//     const initGrid = () => {
//
//         const Grid = tui.Grid;
//
//         Grid.applyTheme('defualt', {
//             cell: {
//                 normal: {
//                     border: 'black'
//                 },
//                 header: {
//                     background: 'gray',
//                     text: 'white'
//                 },
//                 evenRow: {
//                     background: '#fee'
//                 }
//             }
//         });
//
//         const menuListGrid = new Grid({
//             el: document.getElementById('menuListGrid'),
//             scrollX: true,
//             scrollY: true,
//             draggable: false,
//             header: {height: 30},
//             bodyHeight: 200,
//             contextMenu: null,
//             columns: [
//                 {
//                     header: '메뉴번호',
//                     name: 'menu_no',
//                     align: "center",
//                     width: 150,
//                     whiteSpace: 'normal',
//                     formatter: function (e) {
//                         return e.value
//                     },
//                 },
//                 {
//                     header: '메뉴이름',
//                     name: 'menu_name',
//                     align: "left",
//                     width: 100,
//                     whiteSpace: 'normal',
//                     formatter: function (e) {
//                         return e.value
//                     },
//                 },
//                 {
//                     header: 'url',
//                     name: 'menu_url',
//                     align: "left",
//                     width: 150,
//                     whiteSpace: 'normal',
//                     formatter: function (e) {
//                         return e.value
//                     },
//                 }
//             ]
//         });
//
//         return menuListGrid;
//     }
//
//     window.onload = () => {
//
//         const createdGrid = initGrid();
//         const sampleData = menuInfoList
//         createdGrid.resetData(sampleData);
//
//     }
// });