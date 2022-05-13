package co.membership.service;

import java.util.List;

import co.membership.dao.DAO;
import co.membership.dao.MemberDAO;
import co.membership.vo.MemberVO;


public class MemberService {

	MemberDAO dao;

	public MemberService() {
		dao = new MemberDAO();
	}

//	// 목록
//	public List<MemberVO> bookList() {
//		return dao.bookList();
//	}

//	// 단건조회
//	public MemberVO findBook(String bookCode) {
//		return dao.selectBook(bookCode);
//	}

	// 수정
	public void modifyMember(MemberVO Member) {
		dao.modifyMember(Member);
	}

	// 삭제
	public void deleteMember(String productnumber) {
		dao.deleteMember(productnumber);
	}

	// 입력
	public void insertMember(MemberVO member) {
		dao.insertMember(member);
	}

	public List<MemberVO> memberList() {
		return dao.memberList();
	}

}
