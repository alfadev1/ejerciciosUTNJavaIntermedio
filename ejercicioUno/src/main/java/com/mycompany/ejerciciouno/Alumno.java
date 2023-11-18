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
public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private ArrayList<Materia> materiasAprobadas;
    
    

    public Alumno(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getDni() {
        return dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }
    
    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
   
}
