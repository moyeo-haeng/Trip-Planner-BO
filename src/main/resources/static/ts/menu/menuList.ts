const initGrid = () => {

    const Grid = tui.Grid;

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
        scrollX: true,
        scrollY: true,
        draggable: false,
        header: {height: 30},
        rowHeaders: ['checkbox'],
        bodyHeight: 500,
        contextMenu: null,
        treeColumnOptions: {
            name: 'name',
            useCascadingCheckbox: true
        },
        columns: [
            {
                header: '메뉴번호',
                name: 'menuNo',
                align: "center",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '메뉴이름',
                name: 'menuName',
                align: "left",
                width: 100,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'url',
                name: 'menuUrl',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'seq',
                name: 'menuSeq',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'divi',
                name: 'siteDiviCd',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'yn',
                name: 'useYn',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'rid',
                name: 'regId',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'rt',
                name: 'regDtime',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'uid',
                name: 'uptId',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: 'ut',
                name: 'uptDtime',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            }
        ]
    });

    return menuListGrid;
}
