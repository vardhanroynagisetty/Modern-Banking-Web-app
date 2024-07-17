package com.banking.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.banking.dao.UserDao;
import com.banking.model.User;

public class RegisterCustomerServlet extends HttpServlet {
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
        User user = new User();
        user.setFullName(request.getParameter("full-name"));
        user.setAddress(request.getParameter("address"));
        user.setMobileNo(request.getParameter("mobile-no"));
        user.setEmail(request.getParameter("email"));
        user.setAccountType(request.getParameter("account-type"));
        user.setBalance(Double.parseDouble(request.getParameter("balance")));
        user.setDateOfBirth(request.getParameter("date-of-birth"));
        user.setIdProof(request.getParameter("id-proof"));
        user.setAccountNumber(request.getParameter("account-number"));
        user.setPassword(request.getParameter("password"));

        if (userDao.registerCustomer(user)) {
            response.sendRedirect("register_customer.jsp?success=Customer+registered+successfully");
        } else {
            response.sendRedirect("register_customer.jsp?error=Failed+to+register+customer");
        }
    }
}
