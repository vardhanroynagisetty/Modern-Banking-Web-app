package com.banking.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.banking.dao.UserDao;


public class AdminLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        try {
        	System.out.println("working als");
			userDao = new UserDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("admin-username");
        String password = request.getParameter("admin-password");

        if (userDao.validateAdmin(username, password)) {
            response.sendRedirect("admin_dashboard.jsp");
        } else {
            response.sendRedirect("admin_login.jsp?error=Invalid+username+or+password");
        }
    }
}
