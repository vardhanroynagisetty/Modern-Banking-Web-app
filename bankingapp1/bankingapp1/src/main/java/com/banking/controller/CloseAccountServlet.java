package com.banking.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.banking.dao.UserDao;

public class CloseAccountServlet extends HttpServlet {
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
        String accountNumber = request.getParameter("account-number");

        if (userDao.closeAccount(accountNumber)) {
            response.sendRedirect("close_account.jsp?success=Account+closed+successfully");
        } else {
            response.sendRedirect("close_account.jsp?error=Failed+to+close+account");
        }
    }
}