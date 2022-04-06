package com.edu.JackDaniels;

import java.sql.SQLException;
import java.util.List;

public class ReplyServiceOracle extends DAO implements ReplyService {


	@Override
	public void create(Reply dto) {
	 conn = getConnect();
	 String sql = "insert into reply (replytext, replyer, rno)\r\n"
				+ " values(?, ?, ?)"; 
	 try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, dto.getReplytext());
		psmt.setString(2, dto.getWriter());
		psmt.setInt(3, dto.getRno());
	
	   int r = psmt.executeUpdate();
	   System.out.println(r + "건 입력됨.");
	 
	 } catch (SQLException e) {
		
		e.printStackTrace();
	} finally {
		disconnect();
	}
	 
		
	}

	@Override
	public List<Reply> list(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(int bno) {
		// TODO Auto-generated method stub
		return 0;
	}

}