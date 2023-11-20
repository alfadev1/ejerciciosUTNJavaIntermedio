/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import context.Cancion;

/**
 *
 * @author cyka
 */
public class Normal implements Estado {
    Icono cohete = Icono.ROCKET;
    Icono notaMusical = Icono.MUSICAL_NOTE;
    Icono fuego = Icono.FIRE;



    @Override
    public void normal(Cancion c) {
        System.out.println("Esta canción se acaba de lanzar");
    }

    @Override
    public void enAuge(Cancion c) {
        System.out.println(cohete.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                            + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Auge());
    }

    @Override
    public void enTendencia(Cancion c) {
        System.out.println(fuego.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Tendencia());
    }
}
