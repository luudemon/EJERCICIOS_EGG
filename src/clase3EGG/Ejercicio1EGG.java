/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;

import java.util.Scanner;

/**
 * Crear un programa que determine si el numero ingresado es par o impar
 * @author Usuario
 */
public class Ejercicio1EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println (num+ " es  un numero par");
        } else {
            System.out.println (num+ " no es un numero par");
        }
    }
    
}
