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
 * Servlet implementation class BalanceServlet
 */
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BalanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			UserDao us=new UserDao();
			double d=us.balance(request.getParameter("acc_no"));
			HttpSession ss=request.getSession();
			System.out.println();
			ss.setAttribute("balance", d);
			response.sendRedirect("balance.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
