package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido {
    private CanonIDRA canonIDRA;

    public Documental(String titulo, double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    public  Double calcularCostoDeLicencia() {
        return costoBase + CanonIDRA.getValor();
    }

}
