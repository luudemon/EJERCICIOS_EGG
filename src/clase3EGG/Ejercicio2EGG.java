/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;

import java.util.Scanner;

public class Ejercicio2EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String palabraA = "eureka";
        System.out.println("INGRESE LA CLAVE");
        String palabraB= leer.nextLine();
        
        if (palabraA.equals(palabraB))
            System.out.println ("CORRECTO");
        else
            System.out.println ("INCORRECTO");
              
    }
}