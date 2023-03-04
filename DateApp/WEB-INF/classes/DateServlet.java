//DateServlet.java
package com.nt.servlet; 

import jakarta.servlet.*;  //For servlet api using
import java.io.*;	   //For IO Streams
import java.util.*;        //For utility api (Date class)

public class DateServlet extends GenericServlet {

	//implenting service(-,-) method
	public void service(ServletRequest req, ServletResponse res)throws IOException,ServletException {
		
		//get PrintWriter stream object from response object
		PrintWriter pw = res.getWriter();

		//Write B-logic 
		Date d = new Date();

		//Write the results/outputs to res object
		pw.println("<h1 style='background:black;color:white'>Date and Time ::"+d+"</h1>");

		//close the stream
		pw.close();
	}//service close 
}//DateServlet close