package co.membership.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.membership.vo.MemberVO;


public class MemberDAO extends DAO {

	public List<MemberVO> memberList() {
		conn();
		
		String sql = "select * from product";
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setProDuctNum(rs.getInt("productnum"));
				vo.setProDuctName(rs.getString("productname"));
				vo.setProDuctPrice(rs.getInt("productprice"));
				vo.setCateGory(rs.getString("category"));
				vo.setComment(rs.getString("comment"));
				vo.setSale(rs.getInt("sale"));
				vo.setpImg(rs.getString("pimg"));
				vo.setGender(rs.getString("gender"));
				vo.setEmail(rs.getString("email"));
				
				
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	


//	public BookVO selectBook(String bookCode) {
//		conn();
//		String sql = "select * from book_info where book_code=?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, bookCode);
//			rs = psmt.executeQuery();
//			if(rs.next()) {
//				BookVO vo = new BookVO();
//				vo.setBookCode(rs.getString("book_code"));
//				vo.setBookTitle(rs.getString("book_title"));
//				vo.setBookAuthor(rs.getString("book_author"));
//				vo.setBookPress(rs.getString("book_press"));
//				vo.setBookPrice(rs.getInt("book_price"));
//				return vo;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconn();
//		}
//		return null;
//	}

	public void insertMember(MemberVO member) {
		conn();
		String sql = "insert into product(productnum, productname, productprice, category, coment, sale, pimg, gender, email) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, member.getProDuctNum());
			psmt.setString(2, member.getProDuctName());
			psmt.setInt(3, member.getProDuctPrice());
			psmt.setString(4, member.getCateGory());
			psmt.setString(5, member.getComment());
			psmt.setInt(6, member.getSale());
			psmt.setString(7, member.getpImg());
			psmt.setString(8, member.getGender());
			psmt.setString(9, member.getEmail());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
	}

	public boolean modifyMember(MemberVO member) {
		conn();
		String sql = "update product set productname=?, productprice=?, category=?, comment=?, sale=?, pimg=?, gender=?, email=? where productnum=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, member.getProDuctNum());
			psmt.setString(2, member.getProDuctName());
			psmt.setInt(3, member.getProDuctPrice());
			psmt.setString(4, member.getCateGory());
			psmt.setString(5, member.getComment());
			psmt.setInt(6, member.getSale());
			psmt.setString(7, member.getpImg());
			psmt.setString(8, member.getGender());
			psmt.setString(9, member.getEmail());
			
			int r = psmt.executeUpdate();			
			System.out.println(r + "건 변경.");
			if(r>0) {
				return true;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return false;
	}

	public void deleteMember(String eMail) {
		conn();
		String sql = "delete from product where email=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, eMail);
			psmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		
	
	}
}
