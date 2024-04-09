package ar.edu.unlp.info.oo2.toDoItem;


import java.util.List;
import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;
public class ToDoItem {

	private String name;
	private List<String>comments;
	private state estado;
	private Duration duration;
	private Instant inicio;
	private Instant fin;
	
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<String>();
		this.estado = new pending();
	}
	public Instant getInicio() {
		return this.inicio;
	}
	public Instant getFin() {
		return this.fin;
	}
	public void iniciarTemporizador() {
		this.inicio =Instant.now();
	}
	public void finalizarTemporizdor() {
		this.fin=Instant.now();
	}
	public void start() {
		this.estado.start(this);
	};
	public void togglePause() {
		this.estado.start(this);
	}
	public void finish() {
		this.estado.start(this);
	}
	public Duration workedTime() {
		return this.estado.workerTime(this);
	}
	public void addComment(String comment) {
		this.estado.addComment(comment,this);
	}
	public void finishAddcomment(String comment) {
		this.comments.add(comment);
	}
	public void changeState(state newState) {
		this.estado = newState;
	}
}
