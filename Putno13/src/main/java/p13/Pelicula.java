package p13;

import java.util.List;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private double puntaje;
    private int anioEstreno;
    private List<Pelicula> similares;

    public Pelicula(String titulo, double puntaje, int anioEstreno) {
        this.titulo = titulo;
        this.puntaje = puntaje;
        this.anioEstreno = anioEstreno;
        this.similares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }

    public void agregarSimilar(Pelicula pelicula) {
        if (!similares.contains(pelicula)) {
            similares.add(pelicula);
            pelicula.agregarSimilar(this);
        }
    }
}
