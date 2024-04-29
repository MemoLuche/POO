package Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int debiles = 0;

        System.out.print("Introduce la longitud de los passwords: ");
        int longitud = scanner.nextInt();
        
        System.out.print("Introduce el tamaño del array de passwords: ");
        int tamañoArray = scanner.nextInt();
        
        Password[] passwords = new Password[tamañoArray];
        boolean[] fuertes = new boolean[tamañoArray];
        
        for (int i = 0; i < tamañoArray; i++) {
            passwords[i] = new Password(longitud);
            fuertes[i] = passwords[i].esFuerte();
        }
        
        System.out.println("\nContraseñas generadas:");
        
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Password " + (i + 1) + ": " + passwords[i].getContraseña());
            System.out.println("¿Es fuerte? " + (fuertes[i] ? "Sí": "No"));
            if (fuertes[i]){

            } else{
                debiles++;
            }
        }
        System.out.println("Cantidad contraseñas fuertes: " + (passwords.length - debiles));
        System.out.println("Cantidad contraseñas debiles: " + debiles);
    }
}
