package com.ymcris.ipc1.exercises.BuenasPracticasDeProgramación;
import java.util.Scanner;
/**BuenasPracticasDeProgramación: Clase encargada de mostrar las buenas prácticas de programación
 *
 * @author crist
 * @version 21.0.2
 */
public class BuenasPracticasDeProgramación {
    
    private final int AÑO_ACTUAL = 2024;
    private int edad;
    private String nombre;
    
    public void main(String[] args) {
        mostrarNombreYEdad();
    }
    
    public void ingresarNombreYEdad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad = scanner.nextInt();
        System.out.println("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
    }
    
    public void mostrarNombreYEdad(){
        ingresarNombreYEdad();
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu edad es: " + nombre);
        System.out.println("En el año: " + AÑO_ACTUAL);
    }
}
