<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/" method="post">
    <input type="text" name="username"/>
    <input type="text" name="password"/>
    <input type="text" name="email"/>
    <input type="text" name="gender"/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
