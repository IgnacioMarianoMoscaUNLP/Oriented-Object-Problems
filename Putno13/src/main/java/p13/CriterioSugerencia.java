package p13;

import java.util.List;
import java.util.stream.Collectors;

public  abstract class CriterioSugerencia {
	public List<Pelicula> obtenerSugerencias(Decodificador decodificador){
		return this.sugerirPeliculas(decodificador).stream()
				.filter(pelicula -> !decodificador.getPeliculasReproducidas().contains(pelicula))
				.limit(3).collect(Collectors.toList());
	
	}
	
	protected abstract List<Pelicula> sugerirPeliculas(Decodificador decodificador);
}
