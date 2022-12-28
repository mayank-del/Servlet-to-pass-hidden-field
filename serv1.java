
package hiddenField;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/send")

public class serv1 extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
    String name=req.getParameter("username");
    String college=req.getParameter("college");
    
    PrintWriter out=res.getWriter();
    out.println("<h1> Go to Second servlet and check </h1>");    
    
    out.println("<a href='servlet2?user="+name+"&college="+college+"'>Go to Second Servlet</a>");
            }
}
