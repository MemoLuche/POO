package Temperatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de temperatura.");
        double temperatura;
        String unidadOrigen;
        String unidadDestino;
        double resultado;

        while (true) {
            try {
                System.out.print("Introduce la temperatura: ");
                temperatura = scanner.nextDouble();
        
                System.out.print("Introduce la unidad de origen (Celsius, Fahrenheit, Kelvin): ");
                unidadOrigen = scanner.next();
        
                System.out.print("Introduce la unidad destino (Celsius, Fahrenheit, Kelvin): ");
                unidadDestino = scanner.next();
        
                ConvertidorTemperatura conversor = new ConvertidorTemperatura(temperatura, unidadOrigen, unidadDestino);
                resultado = conversor.convertir();
                break;
                
            } catch (Exception e) {
                System.out.println("Ingresa una opcion valida");
                scanner.nextLine();
            }
        }
        
        System.out.printf("%.2f %s es igual a %.2f %s%n", temperatura, unidadOrigen, resultado, unidadDestino);

        scanner.close();
    }

}
