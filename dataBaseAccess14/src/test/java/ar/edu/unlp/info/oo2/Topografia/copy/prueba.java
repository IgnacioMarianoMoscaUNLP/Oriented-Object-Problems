package ar.edu.unlp.info.oo2.Topografia.copy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class prueba {

	public static void main(String[] args) {
		List<Topografia> lista;
		List<Topografia> lista2;
		Topografia tierra;
		Topografia agua;
		Topografia mixta1;
		Topografia mixta2;
		Topografia mixta3;

			tierra = new Tierra();
			agua = new Agua();
			lista = new ArrayList<Topografia>();
			lista.add(agua);
			lista.add(tierra);
			lista.add(tierra);
			lista.add(agua);
			mixta1 = new Mixta(lista);
			lista2 = lista;
			mixta2 = new Mixta(lista2);

	}

}
