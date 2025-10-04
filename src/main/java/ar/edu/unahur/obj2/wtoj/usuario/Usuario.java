package ar.edu.unahur.obj2.wtoj.usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.Plan;

public class Usuario {
    private Plan planDeSubscripcion;
    private List<Contenido> contenidosVistos;

    public Usuario(Plan newPlan) {
        this.planDeSubscripcion = newPlan;
        this.contenidosVistos = new ArrayList<Contenido>();
    }

    public List<Contenido> getContenidos() {
        return contenidosVistos;
    }

    public Plan getPlan() {
        return planDeSubscripcion;
    }
    


}
