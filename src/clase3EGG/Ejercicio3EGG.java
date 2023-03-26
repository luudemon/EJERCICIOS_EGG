/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 
 * 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
 * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.

 * @author Usuario
 */
public class Ejercicio3EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
       Scanner leer = new Scanner (System.in);
       System.out.println("Inserte una palabra o frase");
       String cadena2= leer.nextLine();
        
       int longitud = cadena2.length();
       
        if (longitud == 8){ 
                System.out.println ("CORRECTO");
        }else
            System.out.println ("INCORRECTO");
    }

}
