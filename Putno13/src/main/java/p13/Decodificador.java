package p13;

import java.util.List;
import java.util.ArrayList;

public class Decodificador {
    private List<Pelicula> grillaPeliculas;
    private List<Pelicula> peliculasReproducidas;
    private CriterioSugerencia criterioSugerencia;

    public Decodificador(List<Pelicula> grillaPeliculas) {
        this.grillaPeliculas = grillaPeliculas;
        this.peliculasReproducidas = new ArrayList<>();
    }

    public List<Pelicula> getGrillaPeliculas() {
        return grillaPeliculas;
    }

    public List<Pelicula> getPeliculasReproducidas() {
        return peliculasReproducidas;
    }

    public void agregarPeliculaReproducida(Pelicula pelicula) {
        if (!peliculasReproducidas.contains(pelicula)) {
            peliculasReproducidas.add(pelicula);
        }
    }

    public void setCriterioSugerencia(CriterioSugerencia criterioSugerencia) {
        this.criterioSugerencia = criterioSugerencia;
    }

    public List<Pelicula> sugerirPeliculas() {
        if (criterioSugerencia == null) {
            throw new IllegalStateException("No se ha configurado un criterio de sugerencia.");
        }
        return criterioSugerencia.sugerirPeliculas(this);
    }
}
