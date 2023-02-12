window.addEventListener('DOMContentLoaded', function () {
    const GrpGrid = initGrpGrid();
    const DtlGrid = initDtlGrid();

    $.ajax({
        type: 'GET',
        url: '/api/v1/commGrp/all',
        async: false,
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        success: function (data) {
            GrpGrid.resetData(data)
        }
    }).fail(function (error) {
        console.log(JSON.stringify(error));
    });

    $.ajax({
        type: 'GET',
        url: '/api/v1/commDtl/all',
        async: false,
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            DtlGrid.resetData(data)
        }
    }).fail(function (error) {
        console.log(JSON.stringify(error));
    });

    /* Button click event Start */
    const grpAppendBtn = document.querySelector('#section-group > .btn-group > .btn-add');
    const dtlAppendBtn = document.querySelector('#section-detail > .btn-group > .btn-add');
    const newGrpRow = {
        checkGrpCd: '<input type="checkbox" id="check-grp-cd" name="check-grp-cd" value="newG">'
    };
    const newDtlRow = {
        checkGrpCd: '<input type="checkbox" id="check-dtl-cd" name="check-dtl-cd" value="newD">'
    };

    grpAppendBtn.addEventListener('click', event => {
        GrpGrid.appendRow(newGrpRow, {
            at: 0
        });
    }, false);

    dtlAppendBtn.addEventListener('click', event => {
        DtlGrid.appendRow(newDtlRow, {
            at: 0
        });
    }, false);


    /* Button click event End */
});

/* Grid Setting Start */
const Grid = tui.Grid;

const initGrpGrid = () => {
    Grid.applyTheme('default', {
        cell: {
            normal: {
                border: 'black'
            },
            header: {
                background: 'gray',
                text: 'white'
            }
        }
    });

    const commGrpCdInfoListGrid = new Grid({
        el: document.getElementById('commGrpCdInfoListGrid'),
        scrollX: true,
        scrollY: true,
        draggable: false,
        header: {height: 30},
        rowHeaders: ['rowNum', 'checkbox'],
        bodyHeight: 300,
        contextMenu: null,
        columns: [
            {
                header: '부서',
                name: 'commonType',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '그룹 공통 코드',
                name: 'commonGrpCdId',
                align: 'center',
                width: 200,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '그룹 공통 코드명',
                name: 'commonGrpCdNm',
                align: 'center',
                width: 200,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '정렬 순서',
                name: 'commonSortSeq',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '사용 여부',
                name: 'useYn',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
        ]
    });
    return commGrpCdInfoListGrid;
};

const initDtlGrid = () => {
    Grid.applyTheme('default', {
        cell: {
            normal: {
                border: 'black'
            },
            header: {
                background: 'gray',
                text: 'white'
            }
        }
    });

    const commDtlCdInfoListGrid = new Grid({
        el: document.getElementById('commDtlCdInfoListGrid'),
        scrollX: true,
        scrollY: true,
        draggable: false,
        header: {height: 30},
        rowHeaders: ['rowNum', 'checkbox'],
        bodyHeight: 300,
        contextMenu: null,
        columns: [
            {
                header: 'Chk.',
                name: 'commonCdNo',
                align: 'center',
                width: 10,
                whiteSpace: 'normal',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '상세 공통 코드',
                name: 'commonCdId',
                align: 'center',
                width: 200,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '상세 공통 코드명',
                name: 'commonCdNm',
                align: 'center',
                width: 200,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '구분 1',
                name: 'commonTypeCd1',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '구분 2',
                name: 'commonTypeCd2',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '구분 3',
                name: 'commonTypeCd3',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '정렬 순서',
                name: 'commonSortSeq',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
            {
                header: '사용 여부',
                name: 'useYn',
                align: 'center',
                width: 100,
                whiteSpace: 'normal',
                editor: 'text',
                formatter: function(e) {
                    return e.value
                }
            },
        ]
    });
    return commDtlCdInfoListGrid;
};
/* Grid Setting End */

let main = {
    init: function () {
        let _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save: function () {
        let data = {
            commonType: $('#comm-type').val(),
            commonCdId: $('#comm-cd-id').val(),
            commonCdNm: $('#comm-cd-nm').val(),
            commonCdDesc: $('#comm-cd-desc').val(),
            commonGroupCdId: $('#comm-grp-cd-id').val(),
            commonGroupCdNm: $('#comm-grp-cd-nm').val(),
            commonGroupCdDesc: $('#comm-grp-cd-desc').val(),
            commonSortSeq: $('#comm-sort-seq').val(),
            commonCdEditYn: $('#comm-cd-edit-yn').val(),
            useYn: $('#use-yn').val(),
            regId: $('#reg-id').val(),
        };

        let result = "";
        $.ajax({
            type: 'POST',
            url: '/api/v1/commCd',
            async: false,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data),
            success: function (data) {
                result = data;
            }
        }).done(function () {
            alert('등록되었습니다.');
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });

        $.ajax({
            type: 'GET',
            url: '/api/v1/commCd/' + result,
            async: false,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: {
                commonNo: result
            },
            success: function (data) {
                console.log(data);
            }
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();