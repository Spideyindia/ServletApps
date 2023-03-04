//HtmlServlet.java

package com.nt.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HtmlServlet extends HttpServlet{
	//2nd service(-,-) method of HttpServlet class
	protected void service(HttpServletRequest req,HttpServletResponse res)throws IOException , ServletException{
	//get printwriter object

	PrintWriter pw = res.getWriter();
	//set response content type
	res.setContentType("text/html");
	//place outputin the browser
	pw.println("<table border='1' align='center' bgcolor='cyan'>");
	pw.println("<tr><th>Player</th><th>Sport</th></tr>");
	pw.println("<tr><th>Virat Kohli</th><th>Cricket</th></tr>");
	pw.println("<tr><th>M S Dhoni</th><th>Cricket</th></tr>");
	pw.println("<tr><th>P V Sindhu</th><th>Badminton</th></tr>");
	pw.println("<tr><th>Sania Mirza</th><th>Tennis</th></tr>");
	pw.println("<tr><th>Sunit Chetri</th><th>Football</th></tr>");
	pw.println("</table>");
	
	//close stream
	pw.close();
	}//Service(-,-) close
}//class closing HtmlServlet