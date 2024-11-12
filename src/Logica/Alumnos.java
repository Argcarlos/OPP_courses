
package Logica;

import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        int ID;
        String nombre;
        String apellido;


        // Leer una cadena
        System.out.print("Ingresa tu nombre: ");
        String Nombre = scanner.nextLine();
        System.out.println("Hola, " + Nombre + "!");

        // Leer un número entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tienes " + edad + " años.");

        // Cerrar el Scanner cuando termines
        scanner.close();
    }
}
