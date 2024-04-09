package ar.edu.unlp.info.oo2.toDoItem;
import java.time.Duration;
public class pending extends state{

	@Override
	public void togglePause(ToDoItem task) {
		// TODO Auto-generated method stub
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");

	}

	@Override
	public void start(ToDoItem task) {
		// TODO Auto-generated method stub
		task.changeState(new inProgress());
		task.iniciarTemporizador();
	}

	@Override
	public Duration workerTime(ToDoItem task) {
		// TODO Auto-generated method stub
		throw new RuntimeException("El objeto ToDoItem no se inicio");

	}

	@Override
	public void finish(ToDoItem task) {
		// TODO Auto-generated method stub
		throw new RuntimeException("El objeto ToDoItem no se inicio");

	}

	@Override
	public void addComment(String c,ToDoItem task) {
		// TODO Auto-generated method stub
		task.finishAddcomment(c);
	}

}
