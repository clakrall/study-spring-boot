$(document).ready(function(){
    var table = $('#client_list').DataTable({
        "sAjaxSource": "/api/clients",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "name" },
            { "mData": "email" }
        ]
    });

    $('#clients_list tbody').on('click', 'td', function() {
        var column = table.cell(this).index().column;
        if (column == 4) return;
        var  data = table.row($(this).parents('tr')).data();
        $(location).attr('href', "/clients/" + data.id);
    });
})