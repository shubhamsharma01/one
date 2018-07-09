package com.nucleus.View;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.modelPackage.CustomerClass11DaoRdbms;

/**
 * Servlet implementation class Success
 */
@WebServlet("/Success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	/*	FileReader fileReader=new FileReader("C:/Users/temp/Desktop/ErrorLog.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String errorLog=bufferedReader.readLine();
		while(errorLog!=null){
			out.println("<h2 center=align>Errors</h2>");
			out.println(errorLog+"<br>");
			errorLog=bufferedReader.readLine();
		}*/
		response.setContentType("text/html");
		   out.println("<a href=file:///C:/Users/temp/Desktop/ErrorLog.txt>Right Click  to Download Error File </a>");
		/*bufferedReader.close();*/
		
	}
	

}
