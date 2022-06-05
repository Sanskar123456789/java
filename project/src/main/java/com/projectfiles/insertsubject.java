package com.projectfiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertsubject
 */
@WebServlet("/insertsubject")
public class insertsubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertsubject() {
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
		new_subject obj = new new_subject();
		try {
			obj.createconnection();
			boolean out =obj.newSubject(request.getParameter("subjectname"),Integer.parseInt( request.getParameter("teacher")),Integer.parseInt(request.getParameter("class")));
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
