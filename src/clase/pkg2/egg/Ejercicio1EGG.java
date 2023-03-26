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
public class Ejercicio1EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);
       int n1,n2,suma;
    System.out.println("Ingresa primer numero");
    n1 = leer.nextInt();
    System.out.println ("Ingresa segundo numero" );
    n2 = leer.nextInt();
    suma= n1+n2;
    System.out.println ("La suma de ambos sumeros es " + suma +"");
    
    
    }
    
    
}
