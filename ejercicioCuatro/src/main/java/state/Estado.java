/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package state;

import context.Cancion;

/**
 *
 * @author cyka
 */
public interface Estado {
    public void normal(Cancion c);
    public void enAuge(Cancion c);
    public void enTendencia(Cancion c);
}
