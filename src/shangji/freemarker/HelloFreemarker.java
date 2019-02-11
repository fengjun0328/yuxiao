import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloFreemarker extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }

    protected void doPost(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
      request.setAttribute("message","hello world");
      request.setAttribute("message2","第一个用Freemarker打印出来的");
      request.getRequestDispatcher("templates/test01.ftl").forward(request,response);
    }
}
