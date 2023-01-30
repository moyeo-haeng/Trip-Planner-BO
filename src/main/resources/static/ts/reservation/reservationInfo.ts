const initGrid = () => {
    // 그리드 객체
    const Grid = tui.Grid;

    /**
     * Grid 테마 커스텀
     * Grid.applyTheme('striped', {...}) :
     * @param {String} default : 프리셋 (기본)
     * @param {String} striped : 프리셋 (줄무늬)
     * @param {String} clean : 프리셋 (클린)
     *      - preset theme name. Available values are 'default', 'striped' and 'clean'.
     *      - https://nhn.github.io/tui.grid/latest/Grid#applyTheme
     */
    Grid.applyTheme('defualt',  {
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

    /**
     * 그리드 설정
     * @variable {Dom} el : 그리드 element(DOM)
     * @variable {boolean} scrollX : X 스크롤 사용여부
     * @variable {boolean} scrollY : Y 스크롤 사용여부
     * @variable {boolean} draggable : 드레그 사용 여부
     * @variable {Object} header
     *      - @variable {Number} height : 헤더 높이
     * @variable {Number} bodyHeight : 그리드 바디 높이
     * @variable {*} contextMenu : 마우스 우클릭 옵션
     * @variable {Array} columns :
     *      - @variable {String} header : 컬럼명(헤더)
     *      - @variable {String} name : 컬럼 name (input data와 이름이 일치해야함)
     *      - @variable {String} align : 정렬
     *      - @variable {Number} width : 너비
     *      - @variable {String} whiteSpace : 줄바꿈 설정
     *      - @variable {Function} formatter : 출력 포멧
     * 기타 옵션은 공식 document를 참조하자.
     */

    const revInfoListGrid = new Grid({
        el: document.getElementById('revInfoListGrid'),
        scrollX: true,
        scrollY: true,
        draggable: false,
        header: { height: 30 },
        bodyHeight: 200,
        contextMenu: null,
        columns: [
            {
                header: '예약번호',
                name: 'rev_no',
                align: "center",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '상품종류',
                name: 'goos_cd',
                align: "left",
                width: 100,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '회원번호',
                name: 'member_no',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '회원아이디',
                name: 'loing_id',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '예약상태',
                name: 'rev_status',
                align: "left",
                width: 150,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
        ]
    });

    return revInfoListGrid;
}

window.onload = () => {
    // 그리드 설정
    const createdGrid = initGrid();

    // 샘플 데이터
    const sampleData = [
        {
            rev_no: 'R202301010001',
            goos_cd: '숙박',
            member_no: 'M202301010001',
            loing_id: 'olj124',
            rev_status: '예약접수',
        },
        {
            rev_no: 'R202301010002',
            goos_cd: '항공권',
            member_no: 'M202301010002',
            loing_id: 'pojk124',
            rev_status: '예약완료',
        },
        {
            rev_no: 'R202301010003',
            goos_cd: '항공권',
            member_no: 'M202301010003',
            loing_id: 'poj124',
            rev_status: '환뷸완료',
        },
    ];

    // 그리드에 데이터 넣기(출력)
    createdGrid.resetData(sampleData);
}