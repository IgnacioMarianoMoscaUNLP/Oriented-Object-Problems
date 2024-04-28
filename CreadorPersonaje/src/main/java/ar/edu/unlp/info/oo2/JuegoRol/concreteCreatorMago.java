package ar.edu.unlp.info.oo2.JuegoRol;

public class concreteCreatorMago implements CreadorPersonaje {

	@Override
	public Personaje creadorPersonaje(String name) {
		Armadura Cuero = new Cuero();
		Arma arma = new Baston();
		Personaje m = new Mago(name,"Magia y combate a distancia",Cuero,arma);
		return m;
	}

}
