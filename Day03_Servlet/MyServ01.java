

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv01")
public class MyServ01 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	//url se data nikal k variable me add kiya 
	int roll    = Integer.parseInt(request.getParameter("sroll"));
	String name = request.getParameter("name");
	String add  = request.getParameter("address");
	
	
	out.println("hello i am <b>GET method</b> web<br>");
	out.println("Roll = "+roll+"<br>");
	out.println("Name = "+name+"<br>");
	out.println("Address = "+add+"<br>");
		
	System.out.println("hello i am get method");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//url se data nikal k variable me add kiya 
		int roll    = Integer.parseInt(request.getParameter("sroll"));
		String name = request.getParameter("name");
		String add  = request.getParameter("address");
		
		
		out.println("hello i am <b>POST method</b> web<br>");
		out.println("Roll = "+roll+"<br>");
		out.println("Name = "+name+"<br>");
		out.println("Address = "+add+"<br>");
		
		System.out.println("hello i am post method");
	
	}

}
