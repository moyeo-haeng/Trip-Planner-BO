    // 그리드 객체
    const Grid = tui.Grid;

    Grid.applyTheme('clean',  {
        cell: {
            normal: {
                border: 'black'
            },
            header: {
                background: 'white',
                text: 'black'
            },
            evenRow: {
                background: '#fee'
            }
        }
    });



    const revInfoListGrid = new Grid({
        el: document.getElementById('revInfoListGrid'),
        data: {
            api: {
                readData: {url: '/findReservationInfo', method: 'POST'}
            }
        },
        scrollX: true,
        scrollY: true,
        rowHeaders: ['checkbox'],
        draggable: false,
        columns: [
            {
                header: '예약번호',
                name: 'reservation_no',
                align: "left",
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '상품종류',
                name: 'goods_cd',
                align: "center",
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '회원번호',
                name: 'member_no',
                align: "left",
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '회원아이디',
                name: 'login_id',
                align: "left",
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '예약상태',
                name: 'reservation_divi_cd',
                align: "left",
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
        ]
    });

    // 샘플 데이터
    const sampleData = [
        {
            reservation_no: 'R202301010001',
            goods_cd: '숙박',
            member_no: 'M202301010001',
            login_id: 'olj124',
            reservation_divi_cd: '예약접수',
        },
        {
            reservation_no: 'R202301010002',
            goods_cd: '항공권',
            member_no: 'M202301010002',
            login_id: 'pojk124',
            reservation_divi_cd: '예약완료',
        },
        {
            reservation_no: 'R202301010003',
            goods_cd: '항공권',
            member_no: 'M202301010003',
            login_id: 'poj124',
            reservation_divi_cd: '환뷸완료',
        },
    ];

    function searchGrid() {
        $.ajax({
            url: "/reservation/findReservationInfo",
            method: "GET",
            dataType: "JSON",
            success: function (result) {
                revInfoListGrid.resetData(result);
            }
        });
    }

    //조회
    function search() {
        searchGrid();
    }

    //행추가
    function addRow() {
        revInfoListGrid.appendRow({reservation_no: "R1234124"});
    }

    //행삭제
    function deleteRow() {
        revInfoListGrid.removeRow(revInfoListGrid.getRowCount() - 1);
    }

    //초기화
    function reset() {
        document.getElementById("searchForm").reset();
    }
