/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Mayra
 */
public class GradosCentigrados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double C, F;
        System.out.println("Ingrese los grados centigrados a convertir: ");
        C = leer.nextDouble();
        F = 32 + (9*C/5);
        System.out.println("Su equivalente en grados fahrenheit es de: " + F);
    }
    
}
