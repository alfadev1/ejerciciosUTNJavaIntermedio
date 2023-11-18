/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cyka
 */
public class EjercicioDos {
    
    public static List<String> Transformador (List<String> lista, Transformador transformador) {
        List<String> resultado = new ArrayList<>();
        for (String texto : lista) {
            String textoTransformado = transformador.aMayuscula(texto);
            resultado.add(textoTransformado);
        }
        return resultado;
    }

    public static void main(String[] args) {

        List<String> palabras = List.of("hola", "mundo", "java", "programación");
        
        Transformador aMayuscula = texto -> texto.toUpperCase();
        
        List<String> palabrasMayusculas = Transformador(palabras, aMayuscula);
        
        System.out.println("Lista de palabras en mayúsculas:");
        for (String palabra : palabrasMayusculas) {
            System.out.println(palabra);
        }
        
        
    }
}
