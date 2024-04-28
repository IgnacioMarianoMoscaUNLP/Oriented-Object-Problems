package ar.edu.unlp.info.oo2.JuegoRol;

public class Cuero implements Armadura{

	@Override
	public Integer deffend(Espada espada) {
		return 8;
	}

	@Override
	public Integer deffend(Baston baston) {
		return 2;
	}

	@Override
	public Integer deffend(Arco arco) {
		return 5;
	}

}
