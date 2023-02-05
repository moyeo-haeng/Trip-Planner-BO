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

    const commCdInfoListGrid = new Grid({
        el: document.getElementById('commCdInfoListGrid'),
        scrollX: true,
        scrollY: true,
        draggable: false,
        header: {height: 30},
        bodyHeight: 500,
        contextMenu: null,
        columns: [
            {
                header: '췤!',
                name: 'check',
                align: "center",
                width: 10,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '타입',
                name: 'common_type',
                align: "center",
                width: 100,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '공통 코드 ID',
                name: 'common_cd_id',
                align: "left",
                width: 200,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '공통 코드 이름',
                name: 'common_cd_nm',
                align: "left",
                width: 200,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '공통 코드 설명',
                name: 'common_cd_desc',
                align: "left",
                width: 300,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '수정 가능 여부',
                name: 'common_cd_edit_yn',
                align: "center",
                width: 120,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '정렬 순서',
                name: 'common_sort_seq',
                align: "center",
                width: 100,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
            {
                header: '사용 여부',
                name: 'use_yn',
                align: "center",
                width: 100,
                whiteSpace: 'normal',
                formatter: function (e) {
                    return e.value
                },
            },
        ]
    });

    return commCdInfoListGrid;
}

window.onload = () => {
    // 그리드 설정
    const createdGrid = initGrid();

    // 샘플 데이터
    const sampleData = [
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-mbr',
            common_cd_nm: 'MBR',
            common_cd_desc: '회원',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '8',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-set',
            common_cd_nm: 'SET',
            common_cd_desc: '정산',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '7',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-ast',
            common_cd_nm: 'AST',
            common_cd_desc: '자산/자원',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '6',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-evt',
            common_cd_nm: 'EVT',
            common_cd_desc: '이벤트',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '5',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-res',
            common_cd_nm: 'RES',
            common_cd_desc: '예약',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '4',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-goods',
            common_cd_nm: 'GOODS',
            common_cd_desc: '상품',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '3',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-pay',
            common_cd_nm: 'PAY',
            common_cd_desc: '결제',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '2',
            use_yn: 'Y',
        },
        {
            check: '<input type="checkbox" id="checkCd" name="checkCd"/>',
            common_type: 'COMM',
            common_cd_id: 'comm-option-comm',
            common_cd_nm: 'COMM',
            common_cd_desc: '공통',
            common_cd_edit_yn: 'Y',
            common_sort_seq: '1',
            use_yn: 'Y',
        },
    ];

    // 그리드에 데이터 넣기(출력)
    createdGrid.resetData(sampleData);
}