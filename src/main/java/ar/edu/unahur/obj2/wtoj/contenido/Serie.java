package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas;
    private Double costoTotal = 0.0;
    private Integer cantidadDeEpTotal = 0;

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
        this.temporadas = new ArrayList<Temporada>();
    }

    public void agregarTemporada(Temporada nuevaTemporada) {
        this.temporadas.add(nuevaTemporada);
    }

    @Override
    public Double calcularCostoDeLicencia() {
        
        this.temporadas.forEach(t -> this.costoTotal += t.costoDeTemporada());

        this.temporadas.forEach(t -> this.cantidadDeEpTotal += t.getEpisodios().size());

        return this.costoBase + (costoTotal / cantidadDeEpTotal );
    }

}
