package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class RemoveBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		
		if(code.isEmpty()) {
			request.setAttribute("error", "CODE를 입력하세요.");
			request.getRequestDispatcher("view/remove.jsp").forward(request, response);
			return;
		}
		
		
		
		BookService service = new BookService();
		service.removeBook(code);
		
		request.setAttribute("code", code);
		
		request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
	}

}
