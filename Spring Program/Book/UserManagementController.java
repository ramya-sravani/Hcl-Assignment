import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.user.model.User;
import com.bookstore.user.model.UserDao;
import com.bookstore.user.model.UserDaoImpl;

@WebServlet("/UserManagementController.do")
public class UserManagementController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equals("adduser")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("add_user.jsp");
			dispatcher.forward(request, response);
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		userDao  = new UserDaoImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String profile = request.getParameter("profile");
		
		if(id == 0) {
			User user = new User(username, password, profile);
			userDao.addUser(user);
			response.sendRedirect("BookController.do?action=showbooks");
		}
		
	}

}