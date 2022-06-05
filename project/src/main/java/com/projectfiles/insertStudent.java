package com.projectfiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertStudent
 */
@WebServlet("/insertStudent")
public class insertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertStudent() {
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
		new_student obj = new new_student();
		try {
			obj.createconnection();
			boolean out =obj.newStudent(request.getParameter("studentname"),Integer.parseInt( request.getParameter("subject")));
			obj.closeconn();
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
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
