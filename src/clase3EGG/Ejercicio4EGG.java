/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la 
 * primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
 * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Substring y equals() de Java.
 * @author Usuario
 */
public class Ejercicio4EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabraA = "a";
        Scanner leer = new Scanner (System.in);
        System.out.println (" INGRESE UNA FRASE O PALABRA");
        String palabraB= leer.nextLine();
        
        String subcadena1 = palabraB.substring(0,1);
        if (subcadena1.equals(palabraA))
            System.out.println ("CORRECTO");
        else
            System.out.println ("INCORRECTO");
              
    }
    
}