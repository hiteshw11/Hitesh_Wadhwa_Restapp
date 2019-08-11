package packer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insertrest
 */
@WebServlet("/Insertrest")
public class Insertrest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertrest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		// TODO Auto-generated method stub
		String Fuel_1_no=request.getParameter("Fuel_1_no");
		String Fuel_2_no=request.getParameter("Fuel_2_no");
		String City_MPG_FT1=request.getParameter("City_MPG_FT1");
		String City_MPG_FT2=request.getParameter("City_MPG_FT2");
		String Highway_MPG_FT1=request.getParameter("Highway_MPG_FT1");
		String Highway_MPG_FT2=request.getParameter("Highway_MPG_FT2");
		
		 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/heroku_a37659de952362a","b65974ec261c44","b755a171");
			
			Statement st= con.createStatement(); 
			 
			
			int i=st.executeUpdate("insert into onetwo values ('"+Fuel_1_no+"','"+Fuel_2_no+"','"+City_MPG_FT1+"','"+City_MPG_FT2+"','"+Highway_MPG_FT1+"','"+Highway_MPG_FT2+"')");			
		}
		catch (Exception e)
		{
			out.println(e);
		}
		 
		
		
			 
		
		out.println("Registered"); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
