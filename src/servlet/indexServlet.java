package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;
@WebServlet("/index")
public class indexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService ss=new StudentServiceImpl();
		List<Student> stus = ss.stus();
		if(stus!=null) {
			HttpSession session=req.getSession();
			session.setAttribute("stus",stus);
			req.getRequestDispatcher("index.jsp").forward(req,resp);
		}
	}

}
