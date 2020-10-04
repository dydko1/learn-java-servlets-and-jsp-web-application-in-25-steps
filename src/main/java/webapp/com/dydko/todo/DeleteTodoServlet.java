package webapp.com.dydko.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;
import webapp.com.dydko.todo.TodoService;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		todoService.deleteTodo(new Todo(request.getParameter("todo")));
		response.sendRedirect("/todo.do");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String newTodo = request.getParameter("todo");
		todoService.addTodo(new Todo(newTodo));
		response.sendRedirect("/todo.do");		
		// request.setAttribute("todos", todoService.retrieveTodos());
		// request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
}