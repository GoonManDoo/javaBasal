package co.membership.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;



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
		
		String name = request.getParameter("name");
		String coment = request.getParameter("coment");
		System.out.println("name: " + name + ", coment: " + coment);
		
		String saveDir = "upload";
		saveDir = getServletContext().getRealPath(saveDir);
		int maxSize = 1024 * 1024 * 10;
		String encoding = "UTF-8";
		// multipart 요청.
		// request, 저장위치, 최대사이즈, 인코딩, 리네임정책. file.jpg, file1.jpg
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		name = multi.getParameter("name");
		coment = multi.getParameter("coment");
		String profile = multi.getOriginalFileName("profile");
		String fileName = multi.getFilesystemName("profile"); 
		System.out.println("name1: " + name + ", coment1: " + coment + ", profiel: " + profile + ", file: " + fileName);
		
	}

}