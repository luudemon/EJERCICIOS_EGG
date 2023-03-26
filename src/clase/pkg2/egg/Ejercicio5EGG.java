/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg2.egg;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre 
 * por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * @author Usuario
 */
public class Ejercicio5EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Double num,numdoble,raiz;

        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num=leer.nextDouble();
        numdoble=num*2;
        raiz= Math.sqrt(num);
        System.out.println("El doble de su numero es " + numdoble + "");
        System.out.println("La raiz cuadrada de su numero es " + raiz + "");
        
    }
    
}
