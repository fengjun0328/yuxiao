<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form  action="${pageContext.request.contextPath}/delu.html" method="post" align="center">
    <table cellpadding="0" cellspacing="0"  border="1">
        <tr>
            部门：<select name="DEPartment_id" id="DEPartment_id">
            <option value="0">全部</option>
            <option value="1">开发部</option>
            <option value="2">研究部</option>
            <option value="3">讨论部</option>
        </select>
        </tr>
        <tr>
            岗位：<select name="Position_id" id="Position_id">
            <option value="0">全部</option>
            <option value="1">董事长</option>
            <option value="2">项目经理</option>
            <option value="3">开发组长</option>
        </select>
        </tr>
    </table>
    <input type="submit" value="查找"/>
    <a href="${pageContext.request.contextPath}/adds.html">添加</a>
</form>

<table cellspacing="0" cellpadding="0" border="1" align="center">
    <tr>
        <td>id</td>
        <td>岗位</td>
        <td>部门</td>
        <td>用户</td>
        <td>密码</td>
        <td>在线状况</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${E}" var="e" varStatus="vs">
        <tr>
            <td>${e.SN}</td>
            <td>${e.position_id}</td>
            <td>${e.DEPartment_id}</td>
            <td>${e.uname}</td>
            <td>${e.upassword}</td>
            <td>${e.status}</td>
            <td>
                <a href="${pageContext.request.contextPath}/del.html?id=${e.SN}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
