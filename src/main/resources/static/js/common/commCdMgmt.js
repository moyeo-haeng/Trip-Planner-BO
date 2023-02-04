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