
<html>
<head>
    <script type="text/javascript" src="./js/jquery-3.4.0.js"/>
</head>

<body>
<h2>Hello World!</h2>
<button onclick="request()">测试</button>
</body>
<script>
    function request(){
        alert("hello world!");
        $.ajax({
            type:"POST",
            url:"http://localhost:8081/web/selectAll",
            contentType:"application/json",
            dataType:"json",
            success:function (data) {
                alter(data);
            },
            error:function (er) {
                alert(er);
            }
        });
    }
</script>
</html>
