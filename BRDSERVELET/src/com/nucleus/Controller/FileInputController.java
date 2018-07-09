package com.nucleus.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.modelPackage.*;

/**
 * Servlet implementation class FileInputController
 */
@WebServlet("/FileInputController")
public class FileInputController extends HttpServlet {
	private static final long serialVersionUID = 1L;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileInputController() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rejectionLevel=request.getParameter("rejectionLevel");
		String filelocation=request.getParameter("loc");
      	CustomerClass11Dao customerClass11Dao=new CustomerClass11DaoRdbms();
		customerClass11Dao.readFromFile(filelocation, rejectionLevel);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Success");
        requestDispatcher.forward(request, response);
		
      
		
		}
	
	
}
