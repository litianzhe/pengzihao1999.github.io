package packet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fservlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	  /*  PrintWriter printWriter=response.getWriter();
	    printWriter.print("hahaha");
	    response.setHeader("Refresh", "5;URL=/webdemo1/Cservlet");
	  */
		System.out.println(request.getMethod());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getHeader("User-Agent"));
	}

}
