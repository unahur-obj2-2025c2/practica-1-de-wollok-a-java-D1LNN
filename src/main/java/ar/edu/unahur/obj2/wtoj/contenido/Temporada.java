package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private Integer numero;
    private List<Episodio> episodios;
    private Double costoDeTemporada = 0.0;

    public Temporada(Integer unNumero) {
        this.numero = unNumero;
        this.episodios = new ArrayList<Episodio>();
    }

    public void setEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

    public List<Episodio> getEpisodios() {
        return new ArrayList<Episodio>(this.episodios);
    }

    public Double costoDeTemporada() {

        this.episodios.forEach(e -> this.costoDeTemporada += e.getCostoBase());
        
        return costoDeTemporada;
    }

}
