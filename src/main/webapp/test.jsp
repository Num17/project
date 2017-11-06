<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="uploadForm"  action="uploadFile" enctype="multipart/form-data" method="post">
<input name="file"  type="file"/>
<input name="score" type="text"/>
<input value="提交" type="submit"/>
</form>
<a href="selectAllResourcesAndUsers">资源库</a>
</body>
</html>