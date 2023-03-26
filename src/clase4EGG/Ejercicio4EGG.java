/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4EGG;

import java.util.Scanner;

/**
 *Crea una aplicación que nos pida un número por teclado y con una 
 * función se lo pasamos por parámetro para que nos indique si es o 
 * no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
* Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
* sin embargo, 17 si es primo.

 * @author Usuario
 */
public class Ejercicio4EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Dijite un numero: ");
        int numero = leer.nextInt();
       
        int suma=0;
        for (int i=1; i<=numero;i++){
            int aux =numero%i;
           
        if (aux == 0){
            suma = suma+1;
        }
        }
    if (suma<=2){
        System.out.println("Tu numero es primo");
    }else {
        System.out.println("Tu numero no es primo");
    }
    } 
    
    
}
