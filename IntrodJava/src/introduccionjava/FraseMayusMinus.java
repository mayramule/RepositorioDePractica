/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Mayra
 */
public class FraseMayusMinus {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        System.out.println("A continucion se mostrara la frase en mayuscula.");
        System.out.println(frase.toUpperCase());
        System.out.println("A continucion se mostrara la frase en minuscula.");
        System.out.println(frase.toLowerCase());
    }
    
}
