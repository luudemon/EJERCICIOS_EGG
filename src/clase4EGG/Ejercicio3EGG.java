/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4EGG;

import java.util.Scanner;

/**
 *   * @Crea una aplicación que a través de una función nos convierta una 
     * cantidad de euros introducida por teclado a otra moneda, estas pueden 
     * ser a dólares, yenes o libras. La función tendrá como parámetros, 
     * la cantidad de euros y la moneda a convertir que será una cadena, 
     * este no devolverá ningún valor y mostrará un mensaje 
     * indicando el cambio (void).
     */


public class Ejercicio3EGG {

 
  public static void main(String[] args) {
        // TODO code application logic here
    
     double cantidadMoneda,valorDolar,dolares,yenes,libras;
     while (true){
         System.out.println("CONVERSOR DE MONEDAS");
         System.out.println("""
                            1 - Euros a Dolares
                            2- Euros a Yenes 
                            3- Euros a Libras
                            4- Salir""");
         System.out.println("INGRESE UNA OPCION");
         Scanner leer = new Scanner (System.in);
         char opcion = leer.next().charAt(0);
         
        switch (opcion) {
            case '1':
                convertir(0.93, "Dolares");
                break;
            case '2':
                convertir(0.0071, "Yenes");
                break;
            case '3':
                convertir(1.13, "Libras");
                break;
            case '4':{
                System.out.println("CERRANDO PROGRAMA");
                System.exit(0);
            }
            default:
                System.out.println("OPCION INCORRECTA");
                break;
        }
     }   
  }
    static void convertir(double valorEuro,String pais){

      Scanner leer = new Scanner(System.in);
      System.out.printf("Ingrese la cantidad de euros:");
      double cantidadMoneda = leer.nextDouble();
      
      double euros= cantidadMoneda/valorEuro;
      
      euros = (double) Math.round (euros*100d)/100;
      
      System.out.println("_______________________________");
      System.out.println("|    Tienes $" +euros+" "+ pais+"      |");
      System.out.println("_______________________________");
    }
}