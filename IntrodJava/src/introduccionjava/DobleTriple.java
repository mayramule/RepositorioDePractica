/*
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author Mayra
 */
public class DobleTriple {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num; 
        double doble, triple, raiz;
        System.out.println("Ingrese un numero para saber el doble, triple y raiz cuadrada: ");
        num = leer.nextInt();
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("El doble de " + num + " es igual a: " + doble);
        System.out.println("El triple de " + num + " es igual a: " + triple);
        System.out.println("La raiz de " + num + " es igual a: " + raiz);
    }

}