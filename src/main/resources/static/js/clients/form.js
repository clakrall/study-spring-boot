$(document).ready(function(){

    $(".btn-save").on("click", function() {
        save();
        return false;
    });

    function save() {
        $.ajax({
            type : "POST",
            contentType : "application/json",
            url : "/api/clients/create",
            dataType : "json",
            timeout : 10000,
            data: $('#client_form').serializeJSON(),
            success : function(data) {
                alert(data.message);
                window.location.href = "http://localhost:8080/clients";
            },
            error : function(e) {
                console.log(e);
            }
        });
    }
});