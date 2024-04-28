package ar.edu.unlp.info.oo2.JuegoRol;

public class Hierro implements Armadura {

	@Override
	public Integer deffend(Espada espada) {
		return 5;
	}

	@Override
	public Integer deffend(Baston baston) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Integer deffend(Arco arco) {
		// TODO Auto-generated method stub
		return 3;
	}

}
