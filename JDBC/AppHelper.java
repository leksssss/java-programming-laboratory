package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.math.*;

public class AppHelper extends Thread{
	
	private Connection con = null; 
	public JPanel panel;
		
	public AppHelper(JPanel p) {
		
		String url = "jdbc:mysql://localhost:3306/db"; //'db' - name of your database
		String user = ""; // user-name
		String password = ""; // password
		this.panel = p;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		}
		catch(ClassNotFoundException | SQLException e) {
			//System.out.println("afawgf");
			e.printStackTrace();
		}
	}
	public void insertRow(Data data) {
		
		try {
			String check ="select * from student where rollno=?";
			PreparedStatement p = con.prepareStatement(check);
			p.setString(1,data.getRoll_no());
			ResultSet res = p.executeQuery();
			if(res.next()) {
				System.out.println("The student already present in DATABASE");
			}
			else {
				System.out.println("The student not found in DATABASE. Inserting...");
				try {
					String query = "insert into student(rollno, name, age, gender, address,mark1, mark2, mark3, mark4, mark5) values(?,?,?,?,?,?,?,?,?,?)";
					p = con.prepareStatement(query);
					p.setString(1, data.getRoll_no());
					p.setString(2, data.getName());
					p.setInt(3, data.getAge());
					p.setString(4, data.getGender());
					p.setString(5, data.getAddress());
					p.setInt(6, data.getMark1());
					p.setInt(7, data.getMark2());
					p.setInt(8, data.getMark3());
					p.setInt(9, data.getMark4());
					p.setInt(10, data.getMark5());
					p.executeUpdate();
					System.out.println("Insertion Success!");
					p.close();
				}
				catch(SQLException e) {
						e.printStackTrace();
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	
	public void displayDetails(String rno) {
		try {
			String query ="select * from student where rollno = ?";
			PreparedStatement p = con.prepareStatement(query);
			p.setString(1, rno);
			ResultSet res = p.executeQuery();
			if(res.next()) {
				 panel.add(new JLabel("Roll No. : "+res.getString("rollno")));
				 panel.add(new JLabel("Name : "+res.getString("name")));
				 panel.add(new JLabel("Age : "+res.getString("age")));
				 panel.add(new JLabel("Gender : "+res.getString("gender")));
				 panel.add(new JLabel("Address : "+res.getString("address")));
				 panel.add(new JLabel("Mark 1 : "+res.getString("mark1")));
				 panel.add(new JLabel("Mark 2 : "+res.getString("mark2")));
				 panel.add(new JLabel("Mark 3 : "+res.getString("mark3")));
				 panel.add(new JLabel("Mark 4 : "+res.getString("mark4")));
				 panel.add(new JLabel("Mark 5 : "+res.getString("mark5")));
				 panel.add(new JLabel("CGPA : "+res.getString("gpa")));
			}
			else {
				System.out.println("Student not found in DATABASE");
				panel.add(new JLabel("Student not found!"));
			}
			p.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	public void updateMarks(Data data) {
		try {
			String query = "update student set mark1 = "+data.getMark1()+", mark2 ="+data.getMark2() + ", mark3 = "+data.getMark3() + ", mark4 =" +data.getMark4()+", mark5 = "+data.getMark5()+" where rollno = ?";
			//System.out.println(query);
			PreparedStatement p = con.prepareStatement(query);
			p.setString(1, data.getRoll_no());
			p.executeUpdate();
			System.out.println("Update Success!");
			p.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calculateGPA(Data data) {
		//considering gpa = average
		Double gpa = new BigDecimal((data.getMark1()+data.getMark2() +data.getMark3()+ data.getMark4()+ data.getMark5() )/5.0).setScale(2,RoundingMode.HALF_UP).doubleValue();
	
		String query = "update student set gpa = "+gpa+"where rollno = ?";
		try {
			PreparedStatement p = con.prepareStatement(query);
			p.setString(1,data.getRoll_no());
			p.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
		

