package com.projectfiles;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newClass
 */
@WebServlet("/newClass")
public class newClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		
		Classmethods obj1 = new Classmethods();
		try {
			obj1.createconnection();
			System.out.println(request.getParameter("newClass"));
			boolean out = obj1.newClass(request.getParameter("newClass"));
			if(out) {
				res.setContentType("text/html");
			     PrintWriter pwriter=res.getWriter();
			     pwriter.println("Added");
			     pwriter.close();
			}else {
				res.setContentType("text/html");
			     PrintWriter pwriter=res.getWriter();
			     pwriter.println("Not Added");
			     pwriter.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
