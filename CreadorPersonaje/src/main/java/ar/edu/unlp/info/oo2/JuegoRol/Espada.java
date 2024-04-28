package ar.edu.unlp.info.oo2.JuegoRol;

public class Espada implements Arma{
	public Integer Attack(Armadura armadura) {
		return armadura.deffend(this);
	}
}
