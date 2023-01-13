/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja8.ejercicio3;

/**
 *
 * @author DAM123
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String frase = "Me llamo Alejandro Peñil Haya";
        int conEspacios =frase.length();
        System.out.println("Longitud de la frase con espacios: "+conEspacios);
        int sinEspacios = frase.replace(" ","").length();
        System.out.println("La frasi tiene: "+sinEspacios+" letras");
    }
}
