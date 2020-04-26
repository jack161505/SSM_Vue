
<html>
<head>
    <%--<script src="/js/jquery-3.4.0.js"/>--%>
</head>
<body>
<h2>Hello World!</h2>
<%--<button onclick="request()">测试</button>--%>
<a href="/book/selectAllBfcount">点击跳转</a>
</body>
<script>
    function request(){
        alert("hello world!");
//        $.ajax({
//            type:"POST",
//            url:"http://localhost:8081/book/selectAll",
//            contentType:"application/json",
//            dataType:"json",
//            success:function (data) {
//                alter(data);
//            },
//            error:function (er) {
//                alert(er);
//            }
//        });
    }
</script>
</html>
