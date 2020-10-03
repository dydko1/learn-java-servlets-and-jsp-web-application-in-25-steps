package webapp.todo;

public class Todo {
	private String name;

	public Todo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Todo [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
