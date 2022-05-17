package co.membership.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.membership.service.MemberService;
import co.membership.vo.MemberVO;



@WebServlet("/fileUploadServlet")
public class FileUploadServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FileUploadServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int number = Integer.parseInt(request.getParameter("num"));
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		String category = request.getParameter("category");
		String comment = request.getParameter("comment");
		int sale = Integer.parseInt(request.getParameter("sale"));
		String pimg = request.getParameter("pimg");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setProDuctNum(number);
		vo.setProDuctName(name);
		vo.setProDuctPrice(price);
		vo.setCateGory(category);
		vo.setComment(comment);
		vo.setSale(sale);
		vo.setpImg(pimg);
		vo.setGender(gender);
		vo.setEmail(email);
		
		MemberService service = new MemberService();
		service.insertMember(vo);
		
		
		
		String saveDir = "upload";
		saveDir = getServletContext().getRealPath(saveDir);
		int maxSize = 1024 * 1024 * 10;
		String encoding = "UTF-8";
		// multipart 요청.
		// request, 저장위치, 최대사이즈, 인코딩, 리네임정책. file.jpg, file1.jpg
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		
		
		// Dispatcher 객체 forward.
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}