<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/classes/query.action">
    姓名:<input type="text" name="username" /><br>
    密码:<input type="text" name="password" /><br>
    <button type="submit" value="提交">提交</button>
</form>

<form action="${pageContext.request.contextPath}/classes/query.action" method="post">
    姓名:<input type="text" name="classes.classesId" /><br>
    密码:<input type="text" name="classes.classesName" /><br>
    <button type="submit" value="提交">提交</button>
</form>
</body>
</html>
