

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginTRIAL.userDB;




@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		String Name=request.getParameter("name");
		String Pass=request.getParameter("pass");
		
		userDB db=new userDB();
		if(db.check(Name,Pass)) {
			out.print("LOGGED IN SUCCESSFULLY");
		}else {
			out.print("Enter correct credentials ");
			out.print("<a href='Login.jsp'>Login</a>");
		}
		
	}

}
