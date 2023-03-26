/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;

import java.util.Scanner;

/**
 *a un programa en el cual se ingrese un valor límite positivo, 
  y a continuación solicite números al usuario hasta que la suma
  de los números introducidos supere el límite inicial
 * @author Usuario
 */
public class Ejercicio5EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un valor limite positivo: ");
        int limite = input.nextInt();

        int suma = 0;
        int contador = 0;
        while (suma < limite) {
            contador++;
            System.out.print("Ingresa el numero #" + contador + ": ");
            int numero = input.nextInt();
            suma += numero;
        }

        System.out.println("La suma total es: " + suma);
        System.out.println("Se introdujeron " + contador + " números para alcanzar el límite.");
    }
}