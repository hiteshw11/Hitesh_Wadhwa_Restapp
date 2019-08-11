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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Restdata
 */
@WebServlet("/Restdata")
public class Restdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Restdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor=\"#FFEBCD\">");
		out.println("<a href='https://evening-savannah-34179.herokuapp.com'>Back Home</a>");
		out.println("<br><br>");
		
		
try {
			
			Class.forName("com.mysql.jdbc.Driver"); 
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/heroku_a37659de952362a	","b65974ec261c44","b755a171"); 
			Statement st= con.createStatement(); 
			ResultSet rs=st.executeQuery("select * from onetwo");
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			String a1=rsmd.getColumnLabel(1);
			String b2=rsmd.getColumnLabel(2);
			String c3=rsmd.getColumnLabel(3);	
			String d4=rsmd.getColumnLabel(4);
			String e5=rsmd.getColumnLabel(5);
			String f6=rsmd.getColumnLabel(6);
			out.println(a1+"    "+b2+"    "+c3+"   "+d4+"   "+e5+"    "+f6);
			rs.first();
			while(rs.next())
			{
				
				String a =rs.getString(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				String e=rs.getString(5);
				String f=rs.getString(6);
				
				out.println(a+"                "+b+"             "+c+"            "+d+"            "+e+"                     "+f);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
