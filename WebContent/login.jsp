<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
<body>
	<s:form action="user" method="post">
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:textfield name="usertype" label="类型"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>