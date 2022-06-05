package com.projectfiles;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newTeacher
 */
@WebServlet("/newTeacher")
public class newTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newTeacher() {
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
		new_teacher obj1 = new new_teacher();
		try {
			obj1.createconnection();
			System.out.println(request.getParameter("newteach"));
			boolean out = obj1.newTeacher(request.getParameter("newteach"));
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
