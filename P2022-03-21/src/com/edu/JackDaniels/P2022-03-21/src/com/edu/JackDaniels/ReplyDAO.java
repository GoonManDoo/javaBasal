package com.edu.JackDaniels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReplyDAO {
	 Connection conn;
	  Statement stmt;
	  ResultSet rs;
	  PreparedStatement psmt;

	  public Connection getConnect() {
	     try { // DB 연결하는 부분
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	     } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	     }
	     System.out.println("연결성공!!");
	     return conn;
	  }

	  public void disconnect() {
	     try {
	        if (rs != null)
	           rs.close();
	        if (stmt != null)
	           stmt.close();
	        if (psmt !=null)
	           psmt.close();
	        
	        if (conn != null)
	           conn.close();
	        
	     } catch (SQLException e) {
	        e.printStackTrace();
	     }
	  }

	public void insertStudent(SamsungLions student) {
		// TODO Auto-generated method stub
		
	}
	}
	
	
	
	

