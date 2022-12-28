
package hiddenField;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/servlet2")

public class servlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException ,ServletException{
        
        String name=req.getParameter("user");
        String college=req.getParameter("college");
        PrintWriter out=res.getWriter();
        out.println(" Your name is:" +name+ "");      
        out.println(" Your college is:" +college+ "");
        

    }
    
}
