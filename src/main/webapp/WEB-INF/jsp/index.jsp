<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/statics/css/style.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<h1>登录</h1>
<div class="main-agileinfo">
    <h2>现在登录</h2>
    <form action="${pageContext.request.contextPath}/index.html" method="post">

        <input  type="text" name="uname" placeholder="Usename" required=""/><br/>

        <input type="password" name="upassword" placeholder="Password" required=""><br/>
        <ul>
            <li>
                <input type="checkbox" id="brand1" value="">
                <label for="brand1"><span></span>记得我</label>
            </li>
        </ul>
        <a href="#">忘记密码?</a><br>
        <div class="clear"></div>
        <input type="submit" value="提交">
    </form>
</div>
<div class="footer-w3l">
    <p class="agile"> <a>&copy;</a></p>
</div>
</body>
</html>