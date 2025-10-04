package ar.edu.unahur.obj2.wtoj.planes;

public abstract class Plan {
    protected Integer limiteDeConsumo;
    protected Double valor;

    public Plan(Integer newLimiteDeConsumo, Double newValor) {
        limiteDeConsumo = newLimiteDeConsumo;
        valor = newValor;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getLimiteDeConsumo() {
        return limiteDeConsumo;
    }
}
