/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4EGG;

import java.util.Scanner;

/**
 *Crea una aplicación que le pida dos números al usuario y
 * este pueda elegir entre sumar, restar, multiplicar y dividir.
 * La aplicación debe tener una función para cada operación matemática
 * y deben devolver sus resultados para imprimirlos en el main. 
 */
public class Ejercicio1EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   
     
  Scanner leer = new Scanner(System.in); 
  int num1,num2,eleccion,resultado;
  System.out.println("Ingrese numero 1 ");
  num1=leer.nextInt();
  System.out.println("Ingrese numero 2 ");
  num2=leer.nextInt();
  
        System.out.println("Elija una operacion:");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        eleccion=leer.nextInt();

        switch (eleccion) {
            case 1:
                // Acción a realizar si la opción es igual a 1
                resultado = sumar (num1,num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
        // Acción a realizar si la opción es igual a 2
            case 2:
                resultado = restar (num1,num2);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
        // Acción a realizar si la opción es igual a 3
            case 3:
                resultado = multiplicar (num1,num2);
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
        // Acción a realizar si la opción es igual a 4
            case 4:
                 resultado = dividir (num1,num2);
                System.out.println("El resultado de la division es: " + resultado);
                break;
            default:
                System.out.println("VALOR NO VALIDO");
                break;
        }
    }
    public static int sumar(int num1, int num2) {
    	int sumados;
    	sumados = num1 + num2;
    	return sumados;
	}
     public static int restar(int num1, int num2) {
    	int restados;
    	restados = num1 - num2;
    	return restados;
}
      public static int multiplicar(int num1, int num2) {
    	int multiplicados;
    	multiplicados = num1 * num2;
    	return multiplicados;
}
       public static int dividir(int num1, int num2) {
    	int divididos;
    	divididos = num1 / num2;
    	return divididos;
}
    }
    
 
    
    