package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 넘어오는 파라메타
		String code = request.getParameter("bookCode");
		String title = request.getParameter("bookTitle");
		String author = request.getParameter("bookAuthor");
		String press = request.getParameter("bookPress");
		int price = Integer.parseInt(request.getParameter("bookPrice"));
		
		
		
		BookVO book = new BookVO();
		book.setBookCode(code);
		book.setBookTitle(title);
		book.setBookAuthor(author);
		book.setBookPress(press);
		book.setBookPrice(price);
		
		BookService service = new BookService();
		service.modifyBook(book);
		
		request.setAttribute("code", code);
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
	}

}
