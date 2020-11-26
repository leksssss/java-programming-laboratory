package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookies extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		Cookie cookies[]= request.getCookies();
		String name="";
		String rollno="";
		String subject="";
		
		for(Cookie cook :cookies) {
			if(cook.getName().equals("name")) {
				name= cook.getValue();
				cook.setMaxAge(0);
			}
			if(cook.getName().equals("subject")) {
				subject= cook.getValue();
				cook.setMaxAge(0);
			}
			if(cook.getName().equals("rollno")) {
				rollno= cook.getValue();
				cook.setMaxAge(0);
			}
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter p = response.getWriter();
		p.print("Retrieving the cookies <br> ");
		if(name!="") {
			p.print("Name : "+name+" <br> ");
			p.print("Roll No : "+rollno+" <br> ");
			p.print("Subject : "+subject+" <br> ");
		}
		else
			p.write("No cookies available!");
	}
}
