package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;

public abstract class state {
	public abstract void togglePause(ToDoItem task);
	public abstract void start(ToDoItem task);
	public abstract Duration workerTime(ToDoItem task);
	public abstract void finish(ToDoItem task);
	public abstract void addComment(String c,ToDoItem task);
}
