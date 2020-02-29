
$("#cont2").hide();


    function dxdl() {

        $("#cont2").show();
        $("#cont").hide();
    }
    function accountLogin111() {
        $("#cont2").hide();
        $("#cont").show();
    }
//清除session
function delsession() {
    $("#username1").hide();
    $("#cont").show();
    $.session.clear();
    $.ajax({
        type: "post",
        url: "ClientServlet?action=delsession",
        data: {},
        dataType: "json",
        success: function (data) {

        }

    })
    window.location.href=("index.html")

}



