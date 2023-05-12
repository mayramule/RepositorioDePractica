/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
muestre por pantalla.
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author Mayra
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String nombre;
        System.out.println("Ingresa tu nombre, por favor: ");
        nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre );
    }
    
}
