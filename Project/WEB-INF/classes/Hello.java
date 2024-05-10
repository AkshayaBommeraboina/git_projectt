import javax.servlet.*;
import java.io.*;
public class Hello extends GenericServlet
{
//GenericServlet
public void service(ServletRequest req,ServletResponse rs)throws
ServletException,IOException
{
rs.setContentType("text/html");
String ss=req.getParameter("hh");
PrintWriter pw=rs.getWriter();
pw.println("<html><body style='background-color:powderblue;'>");
pw.println("Hi.."+ss+" you have successfully registered...");
pw.println("</body></html>");
pw.close();
}
}
