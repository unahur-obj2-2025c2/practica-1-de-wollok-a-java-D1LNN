package ar.edu.unahur.obj2.wtoj.plataforma;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class Plataforma {
    private Double costoMensual;

    public Double costoMensual(Usuario usuario) {
        if (usuario.getContenidos().size() > usuario.getPlan().getLimiteDeConsumo()) {
            costoMensual = 
        }
    }

}
