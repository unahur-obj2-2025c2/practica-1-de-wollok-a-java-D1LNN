package ar.edu.unahur.obj2.wtoj.contenido;

public class CanonIDRA {

    private static CanonIDRA instancia;
    private static Double valor;

    public CanonIDRA() {
        valor = 0.5;
    }

    private static CanonIDRA getInstancia() {
        if (instancia == null) {
            instancia = new CanonIDRA();
        }
        return instancia;
    }

    public static Double getValor() {
        return CanonIDRA.valor;
    }

    public static void setValor(Double nuevoValor) {
        valor = nuevoValor;
    }

}
