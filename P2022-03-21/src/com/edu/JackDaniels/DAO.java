package com.edu.JackDaniels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB연결처리, 연결해제
// 스태틱이 아닌 인스턴스를 선언하여 만든다.
public class DAO {
	
//  DriverManager 컨트롤+쉬프트+O
  Connection conn;
  Statement stmt;
  ResultSet rs;
  PreparedStatement psmt;

  public Connection getConnect() {
     try { // DB 연결하는 부분
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "hr", "hr");
     } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
     }
     System.out.println("                                                                 \r\n                                                                     　　○⌒＼\r\n"
     		+ "                                                                　　(二二二)\r\n"
     		+ "                                                                （⌒(　･∀･)\r\n"
     		+ "                                                                (　　ｏ　　つ🎁연결성공!!\r\n"
     		+ "                                                                (＿＿し―Ｊ \r\n");
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

public void loginSamsung(String samsung) {
	// TODO Auto-generated method stub
	
}
}