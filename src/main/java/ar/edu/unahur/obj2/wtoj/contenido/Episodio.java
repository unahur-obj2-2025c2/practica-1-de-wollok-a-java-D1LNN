package ar.edu.unahur.obj2.wtoj.contenido;

public class Episodio {
    private Integer numero;
    private String titulo;
    private Double costoBase;

    public Episodio(Integer numero, String titulo, Double costoBase) {
        this.numero = numero;
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public Double getCostoBase() {
        return this.costoBase;
    }
}
