/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

import static com.mycompany.ejerciciotres.LambdaYColecciones.concatenarSegunLongitud;
import static com.mycompany.ejerciciotres.LambdaYColecciones.convertirAMayusculas;
import java.util.List;

/**
 *
 * @author cyka
 */
public class EjercicioTres {

    public static void main(String[] args) {
        List<String> palabras = List.of("hola", "mundo", "java", "programación");

        List<String> palabrasMayusculas = convertirAMayusculas(palabras);

        System.out.println("Lista de palabras en mayúsculas:");
        palabrasMayusculas.forEach(System.out::println);
        
        
        int longitudMinima = 5;
        String palabrasConcatenadas = concatenarSegunLongitud(palabras, longitudMinima);

        System.out.println("Palabras con más de " + longitudMinima + " caracteres:");
        System.out.println(palabrasConcatenadas);
    }
}
