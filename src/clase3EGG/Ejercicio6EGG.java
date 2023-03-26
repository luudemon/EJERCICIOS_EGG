/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 
 * caracteres de largo, el primer carácter tiene que ser X y el último 
 * tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
* la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
* y toda secuencia distinta de FDE, que no respete el formato se considera 
* incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
* lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
* deberá investigar cómo se utilizan las siguientes funciones de Java 
* Substring(), Length(), equals().
 * @author Usuario
 */
public class Ejercicio6EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int correcta, incorrecta;
        correcta = 0;
        incorrecta = 0;
        String cadena;
        System.out.println ("Ingrese una cadena de 5 caracteres");
        System.out.println("el primer caracter tiene que ser una X y la ultima una O ; ");
        
        System.out.println("Ingrese una cadena de caracteres correcta: ");
        cadena = leer.nextLine();
        
    while(!cadena.equals("&&&&&")){
        int longitud = cadena.length ();
        if (cadena.substring(0,1).equalsIgnoreCase ("x") && (cadena.endsWith ("o")) && (longitud == 5)){   
        correcta++;
        } else{
        incorrecta++;
        }
        System.out.println("Ingrese una cadena de caracteres correcta: ");
        cadena = leer.nextLine();
        
      }
     System.out.println("Cadenas correctas: " + correcta);
     System.out.println("Cadenas incorrectas: " + incorrecta);
    
    }
}
