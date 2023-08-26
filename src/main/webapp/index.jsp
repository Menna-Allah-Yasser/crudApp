<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Insert new Customer</h1>
<form action="/CrudApp_war_exploded/hello-servlet" method="post">

    Name  : <input type="text" name="name" > <br>
    Address : <input type="text" name="address">  <br>

    <input type="submit" value="input">


</form>
</body>
</html>