<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form  action="${pageContext.request.contextPath}/Time.html" method="post" align="center">
    <table cellpadding="0" cellspacing="0"  border="1">
        <tr>
            请假时间：
            <input type="text" name="CREATE_TIME" />
        </tr>
        <tr>
          到期时间：
            <input type="text" name="MODIF_TIME"/>
        </tr>
    </table>
    <input type="submit" value="查找"/>
    <a href="${pageContext.request.contextPath}/delu.html">返回</a>
</form>

<table cellspacing="0" cellpadding="0" border="1" align="center">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>请假时间</td>
        <td>到期时间</td>
        <td>假期类型</td>
        <td>状态</td>
        <td>原因</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${C}" var="c" varStatus="vs">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.CREATE_TIME}</td>
            <td>${c.MODIF_TIME}</td>
            <td>${c.EVENT}</td>
            <td>${c.STATUS}</td>
            <td>${c.TOTAL_ACCOUNT}</td>
            <td>
                <a href="${pageContext.request.contextPath}/Timeshan.html?id=${c.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
