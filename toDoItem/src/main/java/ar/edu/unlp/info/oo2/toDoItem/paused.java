package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;
import java.time.Instant;

public class paused extends state {


	@Override
	public void togglePause(ToDoItem task) {
		// TODO Auto-generated method stub
		task.changeState(new inProgress());
	}

	@Override
	public void start(ToDoItem task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Duration workerTime(ToDoItem task) {
		Instant now = Instant.now();
		return Duration.between(task.getInicio(), now);
	}

	@Override
	public void finish(ToDoItem task) {
		// TODO Auto-generated method stub
		task.changeState(new finished());
	}

	@Override
	public void addComment(String c,ToDoItem task) {
		// TODO Auto-generated method stub
		task.finishAddcomment(c);
	}
}
