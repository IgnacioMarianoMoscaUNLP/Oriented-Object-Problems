package ar.edu.unlp.info.oo2.toDoItem;
import java.time.Duration;
import java.time.Instant;
public class finished extends state{

	@Override
	public void togglePause(ToDoItem task) {
		// TODO Auto-generated method stub
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");

	}

	@Override
	public void start(ToDoItem task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Duration workerTime(ToDoItem task) {
		return Duration.between(task.getInicio(), task.getFin());
	}

	@Override
	public void finish(ToDoItem task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComment(String c,ToDoItem task) {
		// TODO Auto-generated method stub
		
	}

}
