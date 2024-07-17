package com.banking.dao;

import com.banking.model.User;
import com.banking.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private Connection connection;

    public UserDao() throws SQLException {
        this.connection = DatabaseConnection.getConnection();
    }

    public boolean validateAdmin(String username, String password) {
        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try {
        	System.out.println(connection);
        	System.out.println("im also working");
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String validateCustomer(String accountNumber, String password) {
        String sql = "SELECT full_name,balance FROM customer WHERE account_number = ? AND password = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, accountNumber);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
            	return "Name: "+rs.getString("full_name")+"  -----  Balance: "+rs.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return "null";
    }

    public boolean registerCustomer(User user) {
        String sql = "INSERT INTO customer (full_name, address, mobile_no, email, account_type, balance, date_of_birth, id_proof, account_number, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getFullName());
            stmt.setString(2, user.getAddress());
            stmt.setString(3, user.getMobileNo());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getAccountType());
            stmt.setDouble(6, user.getBalance());
            stmt.setString(7, user.getDateOfBirth());
            stmt.setString(8, user.getIdProof());
            stmt.setString(9, user.getAccountNumber());
            stmt.setString(10, user.getPassword());
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deposit(String accountNumber, double amount) {
        String sql = "UPDATE customer SET balance = balance + ? WHERE account_number = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, amount);
            stmt.setString(2, accountNumber);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean withdraw(String accountNumber, double amount) {
        String sql = "UPDATE customer SET balance = balance - ? WHERE account_number = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, amount);
            stmt.setString(2, accountNumber);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean changePassword(String accountNumber, String newPassword) {
        String sql = "UPDATE customer SET password = ? WHERE account_number = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, newPassword);
            stmt.setString(2, accountNumber);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean closeAccount(String accountNumber) {
        String sql = "DELETE FROM customer WHERE account_number = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, accountNumber);
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public double balance(String acc_no) {
    	try {
    		PreparedStatement ps=connection.prepareStatement("select balance from customer where account_number="+acc_no);
    		ResultSet k=ps.executeQuery();
    		if(k.next()) {
    			return k.getDouble("balance");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return 0;
    }
   
    public List<User> view_all_customers(){
    	try {
    		PreparedStatement ps=connection.prepareStatement("select * from customer");
    		ResultSet rs=ps.executeQuery();
    		List<User> l=new ArrayList<User>();
    		while(rs.next()) {
    			User s=new User();
    			s.setAccountNumber(rs.getString("account_number"));
    			s.setFullName(rs.getString("full_name"));
    			s.setBalance(rs.getDouble("balance"));
    			l.add(s);
    		}
    		return l;
    	}catch(Exception e) {
    			e.printStackTrace();
    			return null;
    	}
    }
    
    
}
