package scs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class RegSer
 */
@WebServlet("/RegSer")
public class RegSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try
		{
		String e = request.getParameter("txtemail");
		String p = request.getParameter("txtpass");
		String m = request.getParameter("txtmobile");
		String f = request.getParameter("txtfname");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
		Statement st = con.createStatement();
		int x = st.executeUpdate("insert into register(email,pass,mobile,fname) values('"+e+"','"+p+"','"+m+"','"+f+"')");
        if(x!=0)
        	response.sendRedirect("index.jsp?msg=inserted sucessfully");
        else
        	response.sendRedirect("index.jsp?msg=inserted not sucessfully");
        	
		}
		catch(Exception ex)
		{
			
		}
		
		
	}

}
