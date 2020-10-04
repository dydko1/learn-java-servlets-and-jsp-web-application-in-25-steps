package webapp.com.dydko.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos=new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Web Application development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
		System.out.println("List initialization");
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo)
	{
		todos.add(todo);
	}

}
