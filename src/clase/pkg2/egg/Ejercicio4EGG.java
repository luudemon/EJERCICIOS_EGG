/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg2.egg;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer= new Scanner(System.in);
    double F,C;
        System.out.println("Ingrese la cantidad de Grados Celsius a convertir: ");
        C = leer.nextDouble();
        F = (9/5.0)*C + 32;
        System.out.println(C + "grados Celsius equivalen a " +F+ 
                " grados Fahrenheit");
    }
    
}
