
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
  <form  action="${pageContext.request.contextPath}/index.html" method="post">
      用户名：<input  type="text" name="uname"/><br/>
      密码：<input type="password" name="upassword"><br/>
      <input type="submit" value="提交"/>
  </form>
</body>
</html>