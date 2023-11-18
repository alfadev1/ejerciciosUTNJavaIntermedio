/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciouno;

import java.util.ArrayList;

/**
 *
 * @author cyka
 */
public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public boolean aprobada() {
        ArrayList<Materia> correlativas = materia.getCorrelativas();
        
        if (correlativas.isEmpty()) {
            return true;
        }
        
        ArrayList<Materia> materiasAprobadas = alumno.getMateriasAprobadas();
        
        for (Materia correlativa : correlativas) {
            if (!materiasAprobadas.contains(correlativa)) {
                return false;
            }
        }
        return true;
    }
}
