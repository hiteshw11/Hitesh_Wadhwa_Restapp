package packer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delrestserv
 */
@WebServlet("/Delrestserv")
public class Delrestserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delrestserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String mid=request.getParameter("Model_ID");
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/DB_NAME","USERNAME","PASSWORD");
			
			Statement st= con.createStatement(); 
			 
			
			int i=st.executeUpdate("Delete From onetwo WHERE Model_ID = '"+st+"'");			
		}
		catch (Exception e)
		{
			out.println(e);
		}
		 
		
		
			 
		
		out.println("Record successfully deleted");
		out.println("<br><br>");
		out.println("<a href=/index.jsp>Back Home</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
