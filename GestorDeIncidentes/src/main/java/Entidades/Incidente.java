/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author cyka
 */
public class Incidente {
    private int idIncidente;
    private String descripcion;
    private String tipo;
    private LocalDate fechaReporte;
    private String estado;
    private boolean colchonHoras;

    public Incidente(int idIncidente, String descripcion, String tipo, LocalDate fechaReporte, String estado, boolean colchonHoras) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaReporte = fechaReporte;
        this.estado = estado;
        this.colchonHoras = colchonHoras;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isColchonHoras() {
        return colchonHoras;
    }

    public void setColchonHoras(boolean colchonHoras) {
        this.colchonHoras = colchonHoras;
    }
    
    
}
