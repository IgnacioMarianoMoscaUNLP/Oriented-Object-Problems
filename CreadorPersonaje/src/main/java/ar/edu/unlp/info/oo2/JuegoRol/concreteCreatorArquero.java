package ar.edu.unlp.info.oo2.JuegoRol;

public class concreteCreatorArquero implements CreadorPersonaje{

	@Override
	public Personaje creadorPersonaje(String name) {
		Armadura Cuero = new Cuero();
		Arma arma = new Arco();
		Personaje a = new Arquero(name,"especialistas en tiros de flechas",Cuero,arma);
		return a;
	}

}
