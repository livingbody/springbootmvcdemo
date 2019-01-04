<html>
<head>
    <title>FreeMarker的HelloWorld</title>
</head>
<body>
<#list list as item>
    ID：${item.id} , 年龄${item.user_name}, 密码${item.user_password}
    <br>
</#list>

</body>
</html>