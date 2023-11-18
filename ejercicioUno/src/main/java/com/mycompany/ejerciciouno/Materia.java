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
public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    
    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }
    
    
    
    
}
