/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3EGG;
import java.util.Scanner;

public class Ejercicio8EGG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos por lado del cuadrado: ");
        int n = sc.nextInt();
        
        // Dibuja la primera línea del cuadrado
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
        // Dibuja las líneas intermedias del cuadrado
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        
        // Dibuja la última línea del cuadrado
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
