package com.banking.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import com.banking.dao.UserDao;

public class CustomerLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        try {
			userDao = new UserDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accountNumber = request.getParameter("customer-account-number");
        String password = request.getParameter("customer-password");
        String s=userDao.validateCustomer(accountNumber, password);
        if (s!="null") {
        	HttpSession ss=request.getSession();
        	ss.setAttribute("acc_no",s);
            response.sendRedirect("customer_dashboard.jsp");
        } else {
            response.sendRedirect("customer_login.jsp?error=Invalid+account+number+or+password");
        }
    }
}
