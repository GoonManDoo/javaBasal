package com.edu.JackDaniels;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SamsungLionsServiceOracle extends DAO implements SamsungLionsService {

	@Override
	public void insertSamsung(SamsungLions samsung) {
		conn = getConnect();
		String sql = "insert into board (b_no, b_title, b_content, b_writer, b_date) values(?, ?, ?, ?, ?)";
		try {
			System.out.println(samsung.getDate());
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, samsung.getBno());
			psmt.setString(2, samsung.getBtitle());
			psmt.setString(3, samsung.getContent());
			psmt.setString(4, samsung.getWriter());
			psmt.setString(5, samsung.getDate());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨. ");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public SamsungLions getSamsung(int sno) {
		List<Reply> list1 = new ArrayList<Reply>();
//		String sql = "select * from reply order by rno";
		conn = getConnect();
		SamsungLions bod = null;
		try {
			psmt = conn.prepareStatement("select*from board where b_no = ?");
			psmt.setInt(1, sno);
			rs = psmt.executeQuery();
			if (rs.next()) {
				bod = new SamsungLions();
				bod.setBno(rs.getInt("b_no"));
				bod.setBtitle(rs.getString("b_title"));
				bod.setContent(rs.getString("b_content"));
				bod.setWriter(rs.getString("b_writer"));
				bod.setDate(rs.getString("b_date"));

//				Reply dto = new Reply();
//				dto.setRno(rs.getInt("rno"));
//				dto.setReplytext(rs.getString("replytext"));
//				dto.setWriter(rs.getString("replyer"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bod;
	}

	@Override
	public List<SamsungLions> samsungList() {
		List<SamsungLions> list = new ArrayList<SamsungLions>(); // 조회된 결과값을 담기위한 컬렉션

		conn = getConnect();
		String sql = "select * from board order by b_no";

		try {
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(); // 실행건수만큼 반복하겠다.
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크. 있으면 하나 가지고 올께.
				SamsungLions samsung = new SamsungLions();
				samsung.setBno(rs.getInt("b_no"));
				samsung.setBtitle(rs.getString("b_title"));
				samsung.setContent(rs.getString("b_content"));
				samsung.setWriter(rs.getString("b_writer"));
				samsung.setDate(rs.getString("b_date"));
				list.add(samsung);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifySamsung(SamsungLions samsung) {
		conn = getConnect();
		String sql = "update board set b_title = ?, b_content = ?, b_writer = ?, b_date = ?" + " where b_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, samsung.getBtitle());
			psmt.setString(2, samsung.getContent());
			psmt.setString(3, samsung.getWriter());
			psmt.setString(4, samsung.getDate());
			psmt.setInt(5, samsung.getBno());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨. ");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void removeSamsung(int sno) {
		conn = getConnect();
		String sql = "delete from board " + "where b_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정.
			psmt.setInt(1, sno);
			int r = psmt.executeUpdate(); // 실행.
			System.out.println(r + "건 삭제됨. ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public List<SamsungLions> searchSamsung(String name) {
		List<SamsungLions> list = new ArrayList<SamsungLions>();
		conn = getConnect();
		SamsungLions samsung = null;
		String sql = "select * from board where b_writer = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if (rs.next()) {
				samsung = new SamsungLions();
				samsung.setBno(rs.getInt("b_no")); //
				samsung.setBtitle(rs.getString("b_title"));
				samsung.setContent(rs.getString("b_content"));
				samsung.setWriter(rs.getString("b_writer"));
				samsung.setDate(rs.getString("b_date"));
				list.add(samsung);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}
		return list;

	}

	public int writeNum() {
		conn = getConnect();
		int num = 0;
		String sql = "select max(rno) from reply";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			if (rs.next()) {
				num = rs.getInt("max(rno)");
				return num;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return num;

	}

	@Override
	public int loginSamsung(String id, String pw) {
		conn = getConnect();
		String sql = "SELECT id, pw FROM member2 WHERE id = ? AND  pw = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("pw").equals(pw)) {
					return 1;
				} else {
					return 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;

	}

}
