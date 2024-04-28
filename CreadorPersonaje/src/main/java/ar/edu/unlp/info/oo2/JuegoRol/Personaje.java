package ar.edu.unlp.info.oo2.JuegoRol;

public abstract class Personaje {
	private String name;
	private String habilidad;
	private Armadura Armadura;
	private Arma Arma;
	private Integer vida;
	
	
	public Personaje(String name,String habilidad,Armadura Armadura, Arma Arma) {
		this.name = name;
		this.habilidad = habilidad;
		this.Armadura =Armadura;
		this.Arma = Arma;
		this.vida = 100;
	}
	
	public  void  Atacar(Personaje personaje) {
		if(this.vivo()) {
		Integer daño = this.Arma.Attack(personaje.getArmadura());
		personaje.recibirAtaque(daño);
		personaje.contraAtracar(this);
		}
		else
			throw new Error("su personaje no tiene vida");
	};
	
	public void contraAtracar(Personaje personaje) {
		if(this.vivo()) {
			Integer daño = this.Arma.Attack(personaje.getArmadura());
			personaje.recibirAtaque(daño);
		}else
			throw new Error("su personaje no tiene vida");
	}
	public void recibirAtaque(Integer daño ) {
		this.vida = this.vida - daño;
	}
	
	public Boolean vivo() {
		return this.vida>0;
	}

	public Armadura getArmadura() {
		return Armadura;
	}

	public void setArmadura(Armadura armadura) {
		Armadura = armadura;
	}

	public Arma getArma() {
		return Arma;
	}

	public void setArma(Arma arma) {
		Arma = arma;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}
	
}
