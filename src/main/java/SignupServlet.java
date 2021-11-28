import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginTRIAL.userDB;
import loginTRIAL.userDetails;


@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("name");
		String Mob=request.getParameter("mob");
		
		
			userDetails obj=new userDetails();
			
			obj.setMob(Mob);

			obj.setName(Name);
			
			userDB DB=new userDB();
			if(DB.save(obj)) {
				out.print("Details Stored Successfully");
				out.print("<br><a href='Login.jsp'>LOGIN</a>");
			}else {
				out.print("<br><a href='signup.jsp'>try again</a>");	
			}
			
			
		
		
;
	}

}
