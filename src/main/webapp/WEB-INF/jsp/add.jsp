
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  action="${pageContext.request.contextPath}/add.html" method="post">
       <table border="1" cellspacing="0" cellpadding="0" align="center">
           <tr>
              <td>
                  部门：<select name="DEPartment_id" id="DEPartment_id">
                  <option value="0">全部</option>
                  <option value="1">开发部</option>
                  <option value="2">研究部</option>
                  <option value="3">讨论部</option>
              </select>
              </td>
           </tr>
           <tr>
               <td> 岗位：<select name="Position_id" id="Position_id">
                   <option value="0">全部</option>
                   <option value="1">董事长</option>
                   <option value="2">项目经理</option>
                   <option value="3">开发组长</option>
               </select>
               </td>
           </tr>
           <tr>
               <td>
                   姓名：<input name="uname" type="text"/>
               </td>
           </tr>
           <tr>
               <td>
                   密码：<input name="upassword" type="password"/>
               </td>
           </tr>
           <tr>
              <td>
                  在线状态：
                  <select name="status" id="status">
                      <option value="0">离线</option>
                      <option value="1">在线</option>
                  </select>
              </td>
           </tr>
       </table>
          <input type="submit" value="添加"/>
</form>
</body>
</html>
