package com.banking.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.banking.dao.UserDao;

/**
 * Servlet implementation class ViewAll
 */
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserDao s=new UserDao();
			HttpSession ss=request.getSession();
			ss.setAttribute("view", s.view_all_customers());
			response.sendRedirect("view_customers.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
