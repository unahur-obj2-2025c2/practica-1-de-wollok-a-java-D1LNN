package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    protected String titulo;
    protected Double costoBase;

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public abstract Double calcularCostoDeLicencia();

    public Double getCostoBase() {
        return this.costoBase;
    }
}
