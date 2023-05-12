/*
 Escribir un programa que pida dos números enteros por teclado y calcule la 
suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author Mayra
 */
public class Suma {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero:");
        num1= leer.nextInt();
        System.err.println("Ingrese el segundo numero");
        num2= leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos numeros es de: " +suma);
        
    }
    
}
