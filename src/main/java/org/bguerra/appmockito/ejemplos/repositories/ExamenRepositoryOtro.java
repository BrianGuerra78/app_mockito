package org.bguerra.appmockito.ejemplos.repositories;

import org.bguerra.appmockito.ejemplos.Datos;
import org.bguerra.appmockito.ejemplos.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryOtro implements ExamenRepository{
    @Override
    public Examen guardar(Examen examen) {
        System.out.println("ExamenRepositoryOtro.guardar");
        return Datos.EXAMEN;
    }

    @Override
    public List<Examen> findAll() {
        System.out.println("ExamenRepositoryOtro.findAll");
        try {
           // System.out.println("ExamenRepositoryOtro");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        return Datos.EXAMENES;
    }
}
