package ar.edu.unlp.info.oo2.JuegoRol;

public class concreteCreatorGuerrero implements CreadorPersonaje{

	
	
	
	public Personaje creadorPersonaje(String name) {
		
		Armadura Acero = new Acero();
		Arma arma = new Espada();
		Personaje g = new Guerrero(name,"combate cuerpo a cuerpo",Acero,arma);
		return g;
	}

}
