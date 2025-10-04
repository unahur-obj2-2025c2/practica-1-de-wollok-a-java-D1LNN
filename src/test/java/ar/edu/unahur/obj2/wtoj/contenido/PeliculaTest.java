package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PeliculaTest {
    @Test

    public void testCalcularCostoDeLicencia() {
        
        Pelicula pelicula = new Pelicula("Matrix", 3.0);

        Double valorEsperado = 3.0;

        
        Double valorObtenido = pelicula.calcularCostoDeLicencia();

        assertEquals(valorEsperado, valorObtenido);


    }
}
