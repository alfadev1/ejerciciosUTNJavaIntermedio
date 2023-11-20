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
public class Tendencia implements Estado {
    Icono cohete = Icono.ROCKET;
    Icono notaMusical = Icono.MUSICAL_NOTE;
    Icono fuego = Icono.FIRE;





    @Override
    public void normal(Cancion c) {
        System.out.println(notaMusical.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Normal());
    }

    @Override
    public void enAuge(Cancion c) {
        System.out.println(cohete.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Auge());
    }

    @Override
    public void enTendencia(Cancion c) {
        System.out.println("Esta cancion ya está en tendencia");
    }
}
