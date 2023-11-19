/*
EJERCICIO 1
Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
lista con los strings en mayúscula.
EJERCICIO 2
Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
método debe devolver un String que concatene separando por coma y espacio todas las
palabras, en la lista, que tengan más de "n" caracteres.

 */
package com.mycompany.ejerciciotres;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author cyka
 */
public class LambdaYColecciones {

    public static List<String> convertirAMayusculas(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
    }
    
    public static String concatenarSegunLongitud(List<String> listaPalabras, int longitud) {
         return listaPalabras.stream()
                    .filter(palabra -> palabra.length() > longitud)
                    .collect(Collectors.joining(", "));
    }
}
