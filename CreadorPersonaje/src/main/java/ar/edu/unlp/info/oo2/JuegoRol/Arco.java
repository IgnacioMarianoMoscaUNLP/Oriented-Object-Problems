package ar.edu.unlp.info.oo2.JuegoRol;

public class Arco implements Arma{

	@Override
	public Integer Attack(Armadura armadura) {
		return armadura.deffend(this);
	}

}
