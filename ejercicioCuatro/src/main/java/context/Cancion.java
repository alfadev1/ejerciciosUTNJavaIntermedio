/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import state.Estado;

/**
 *
 * @author cyka
 */
public class Cancion {
     private String nombre;
    private String artista;
    private String album;
    private int anhoLanzamiento;
    private Estado state;
    private float likes;
    private float dislikes;
    private float reproducciones;

    public Cancion(String nombre, String artista, String album, int anhoLanzamiento, Estado state){
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.anhoLanzamiento = anhoLanzamiento;
        this.state = state;
        this.likes = 0;
        this.dislikes = 0;
        this.reproducciones = 0;
    }

    public float getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(float reproducciones) {
        this.reproducciones = reproducciones;
    }

    public float getLikes() {
        return likes;
    }

    public void setLikes(float likes) {
        this.likes = likes;
    }

    public float getDislikes() {
        return dislikes;
    }

    public void setDislikes(float dislikes) {
        this.dislikes = dislikes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getAnhoLanzamiento() {
        return anhoLanzamiento;
    }

    public Estado getState() {
        return state;
    }

    public void setState(Estado state) {
        this.state = state;
    }

    public void normal(){
        this.state.normal(this);
    }

    public void enAuge(){
        this.state.enAuge(this);

    }
    public void enTendencia(){
        this.state.enTendencia(this);
    }
}
