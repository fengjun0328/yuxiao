
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div class="login-top"></div>
<div class="login-area">
  <form  action="${pageContext.request.contextPath}/index.html" method="post">
     <table align="center" cellpadding="0" cellspacing="0" border="1">
         <label>
             用户名：
         </label>
         <input  type="text" name="uname"/><br/>
         <label>
             密码：
         </label>
         <input type="password" name="upassword"><br/>
         <input type="submit" value="提交"/>
     </table>
  </form>
</div>
</body>
</html>