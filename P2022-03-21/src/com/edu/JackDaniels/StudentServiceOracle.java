package com.edu.JackDaniels;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score)\r\n"
				+ " values(?, ?, ?, ?)"; 
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStudentNumber());
			psmt.setString(2, student.getStudentName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨. ");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Student getStudent(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>(); //조회된 결과값을 담기위한 컬렉션
		conn = getConnect();
		String sql = "select * from student_info order by student_no";//newe Student() 실행하겠습니다
		try {
			psmt = conn.prepareStatement(sql);
		    rs = psmt.executeQuery(); //실행건수만큼 반복하겠다.
		    while(rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크. 있으면 하나 가지고 올께.
		    	Student student = new Student();
		    	student.setStudentNumber(rs.getInt("student_no")); //rs student의 값을 중에 student_no라는 값을 가져와서 setStudentNumber에 값을 지정한다.
		    	student.setStudentName(rs.getString("student_name"));
		    	student.setEngScore(rs.getInt("eng_score"));
		    	student.setKorScore(rs.getInt("kor_score"));
		    	
		    	list.add(student);
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
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info set eng_score = ?, kor_score = ? " + "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
		
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getStudentNumber());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨. ");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void removeStudent(int sno) {
		conn = getConnect();
	      String sql = "delete from student_info "
	            + "where employee_id = ?";
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
	public List<Student> searchStudent(String name) {
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();
	      Student student = null;
	      String sql = "select * from student_info where student_name = ?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, name);
	         rs = psmt.executeQuery();
	         if (rs.next()) {
	            student = new Student();
	            student.setStudentNumber(rs.getInt("student_no")); // employees.employee_id 테이블
	            student.setStudentName(rs.getString("student_name"));
	            student.setEngScore(rs.getInt("eng_Score"));
	            student.setKorScore(rs.getInt("kor_Score"));
	            list.add(student);
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         // 정상실행, 예외발생 => 반드시 실행코드.
	         disconnect();
	      }
	      return list;
	
	}

	@Override
	public void saveToFile() {
		// TODO Auto-generated method stub
		
	}

}
