$(function() {
        $('#startDate').datetimepicker({ format: 'L'});
        $('#endDate').datetimepicker({
        format: 'L',
        useCurrent: false
    });
        $("#startDate").on("change.datetimepicker", function (e) {
        $('#endDate').datetimepicker('minDate', e.date);
    });
        $("#endDate").on("change.datetimepicker", function (e) {
        $('#startDate').datetimepicker('maxDate', e.date);
    });
});
