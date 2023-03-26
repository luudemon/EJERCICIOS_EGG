/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4EGG;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre
 * y la edad de N personas e imprima los datos de las personas ingresadas por 
 * teclado e indique si son mayores o menores de edad. Después de cada persona,
 * el programa debe preguntarle al usuario si quiere seguir mostrando personas 
 * y frenar cuando el usuario ingrese la palabra “No”.
 * @author Usuario
 */
public class Ejercicio2EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,respuesta;
        int edad;
        Scanner leer = new Scanner(System.in);
       
        
        do {
        System.out.println("Ingrese nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese edad: ");
        edad=leer.nextInt();
        leer.nextLine();
            if (edad < 18 ){
                System.out.println(nombre + " es menor de edad");
            }else{
            System.out.println(nombre + " es mayor de edad");
                        }
                System.out.println("Desea seguir mostrando personas? si/no");
                respuesta=leer.nextLine();
        } while ("si".equals(respuesta));
}
}
                
        
   
    

