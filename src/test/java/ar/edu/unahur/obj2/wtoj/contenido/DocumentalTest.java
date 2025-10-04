package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DocumentalTest {
    @Test

    public void testCostoConCanonPorDefecto() {
        Documental documental = new Documental("Planeta Tierra", 2.0);

        assertEquals(2.5, documental.calcularCostoDeLicencia());
    }

    @Test
    public void testCostoConCanonModificado() {
        Documental documental = new Documental("Planeta Tierra", 2.0);

        CanonIDRA.setValor(1.0);

        assertEquals(3.0, documental.calcularCostoDeLicencia());
    }
}
