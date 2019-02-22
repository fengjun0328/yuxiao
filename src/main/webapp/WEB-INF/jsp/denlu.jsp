<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
          <c:forEach items="${D}" var="d">
                <option value="${d.id}">${d.name}</option>
          </c:forEach>
        </select>
        </tr>
        <tr>
            岗位：<select name="Position_id" id="Position_id">
            <option value="0">全部</option>
            <c:forEach items="${P}" var="p">
                <option value="${p.id}">${p.name_GN}</option>
            </c:forEach>
        </select>
        </tr>
    </table>
    <input type="submit" value="查找"/>
    <a href="${pageContext.request.contextPath}/adds.html">添加</a>
    <a href="${pageContext.request.contextPath}/Time.html">查看病假</a>
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
            <td><c:if test="${e.position_id==3}">董事长</c:if>
                <c:if test="${e.position_id==2}">项目经理</c:if>
                <c:if test="${e.position_id==1}">开发组长</c:if>
            </td>
            <td>
                <c:if test="${e.DEPartment_id==3}">讨论部</c:if>
                <c:if test="${e.DEPartment_id==2}">研究部</c:if>
                <c:if test="${e.DEPartment_id==1}">开发部</c:if>
            </td>
            <td>${e.uname}</td>
            <td>${e.upassword}</td>
            <td>
                <c:if test="${e.status==0}">离线</c:if>
                <c:if test="${e.status==1}">在线</c:if>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/del.html?id=${e.SN}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
