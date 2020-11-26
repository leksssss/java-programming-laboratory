package p1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.*;
import java.sql.*;

public class FeedbackForm extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "";
		String password = "";
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		}
		catch(ClassNotFoundException | SQLException e) {
			//System.out.println("afawgf");
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Database Connected Successfully!");
		
		PrintWriter p = response.getWriter();
		
		String rollno = request.getParameter("roll_no");
		String name = request.getParameter("name");
		String branch = request.getParameter("branch");
		String course = request.getParameter("course");
		String batch = request.getParameter("batch");
		String java = request.getParameter("java");
		String lab_hours = request.getParameter("lab_hours");
		String core = request.getParameter("core");
		String code = request.getParameter("code");
		
		response.setContentType("text/html; charset=utf-8");
		try {
			String check ="select * from servlet where rollno=?";
			PreparedStatement pc = con.prepareStatement(check);
			pc.setString(1, rollno);
			ResultSet res = pc.executeQuery();
			if(res.next()) {
				System.out.println("The student already present in DATABASE");
			}
			else {
				System.out.println("The student not found in DATABASE. Inserting...");
				try {
					String query = "insert into servlet(rollno, name, branch, course, code, batch, java, lab_hours, core) values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement p1 = con.prepareStatement(query);
					p1.setString(1, rollno);
					p1.setString(2, name);
					p1.setString(3, branch);
					p1.setString(4, course);
					p1.setString(5, code);
					p1.setString(6, batch);
					p1.setString(7, java);
					p1.setString(8, lab_hours);
					p1.setString(9, core);
					
					p1.executeUpdate();
					p.println("Insertion Success!");
					p1.close();
				}
				catch(SQLException e) {
						e.printStackTrace();
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		
		p.println("<fieldset><legend>Details</legend><div> Name: "+name+" <br /> ");
		p.println("Register Number: "+rollno+" <br/> ");
		p.println("Course Name: "+course+" <br/> ");
		p.println("Branch Name: "+branch+" <br/> ");
		p.println("Course Code : "+code+" <br/> ");
		p.println("Batch: "+batch+" <br/> ");
		p.println("Was Java useful ? "+java+" <br/> ");
		p.println("Was four hours sufficient ? "+lab_hours+" <br/> ");
		p.println("Is it a core course ? "+core+" <br/> </div></fieldset>");
	
		Cookie n = new Cookie("name",name);
		response.addCookie(n);
		Cookie r = new Cookie("rollno",rollno);
		response.addCookie(r);
		Cookie c = new Cookie("subject",course);
		response.addCookie(c);
	}
	
}
