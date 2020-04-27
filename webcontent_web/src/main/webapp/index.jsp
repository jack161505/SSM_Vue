<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <%--<script src="/js/jquery-3.4.0.js"/>--%>
</head>
<body>
<h2>Hello World!</h2>
<button onclick="request()">测试</button>
<a href="/book/selectAllBfcount">点击跳转</a>
</body>
<script type="text/javascript" src="js/jquery-3.4.0.js"></script>
<script>
    function request(){
        alert("hello world!");
        $.ajax({
            url: "http://127.0.0.1:8081/book/selectAllBfcount",
//            data : {"user.uname":uname,"user.upwd":upwd},
            type: "POST",
            dataType: "json",
            success: function (result) {
                if (result.res == true) {
                    alert("注册成功！");
                } else {
                    alert("注册失败！");
                }
            }
        });
    }
</script>
</html>
