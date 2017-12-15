package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 폼 전송 되는 내용을 콘솔에 출력하고
		String id= request.getParameter("id");
		String pwd= request.getParameter("password");
		
		System.out.println("id: "+id);
		System.out.println("password: "+pwd);
		
		
		// 클라이언트에게는 login ok~ 라고 출력해 보세요.
		PrintWriter pw= response.getWriter();
		//pw.println("login ok~");
		
		// 만일 id, pwd 가 white, 1234 라고 가정하면
			//나중에 DB 연동해서 DB select 해서...
		if(id.equals("white") && pwd.equals("1234")) {
			pw.println("login ok~!");
		}else {
			pw.println("login fail~!");
		}

	}
}
