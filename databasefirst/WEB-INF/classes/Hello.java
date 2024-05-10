import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Hello extends HttpServlet
{
Connection con;
Statement st;
ResultSet res;
String mname;
int mno;
public void init()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/one1","root","Ashu@123");
st=con.createStatement();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void doGet(HttpServletRequest req,HttpServletResponse rs)throws ServletException,IOException
{
try{
rs.setContentType("text/html");
PrintWriter pw=rs.getWriter();
pw.println("<html><body bgcolor=yellow>");
pw.println("<h3 style='text-align:center;'>Below Mobiles available in store toBuy:<br><br>");
pw.println("<table align='center'>");
res=st.executeQuery("select sno,name from mobiles");
while(res.next())
{
pw.println("<tr><td>"+res.getInt(1)+"</td>");
pw.println("<td>"+res.getString(2)+"</td><br>");
}
pw.println("</table>");
pw.println("</body></html>");
pw.close();
}
catch(Exception o)
{
System.out.println(o);
}
}
public void destroy()
{
try
{
con.close();
st.close();
}
catch(Exception r)
{
System.out.println(r);
}
}
}
