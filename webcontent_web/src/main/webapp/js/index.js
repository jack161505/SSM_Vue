//1.页面加载完成之后发送Ajax请求，得到分页数据
$(function () {
    var totalRecord, currentPage;

    function selectAll() {

    }

    function addUser() {

    }

    function reviseUser() {

    }

    function deleteUser() {

    }

    function deleteSomeUser() {

    }

    $("#user_save_btn").onclick(function () {

        $.ajax({
            url: "",
            type: "POSt",
            data: "",
            dataType: "json",
            success: function (result) {
                if (result.res == true) {
                    alert("注册成功！");
                } else {
                    alert("注册失败！");
                }
            }
        })
    })
});