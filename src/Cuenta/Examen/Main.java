package Examen;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con titular y sin cantidad inicial
        Cuenta cuenta = new Cuenta("Juan Perez");

        // Mostrar estado inicial de la cuenta
        System.out.println(cuenta);

        // Ingresar dinero en la cuenta
        cuenta.ingresar(200.0);
        System.out.println("Después de ingresar 200: " + cuenta);

        // Intentar ingresar una cantidad negativa
        cuenta.ingresar(-50.0);
        System.out.println("Intento de ingresar cantidad negativa: " + cuenta);

        // Retirar dinero de la cuenta
        cuenta.retirar(100);
        System.out.println("Después de retirar 100: " + cuenta);

        // Intentar retirar más dinero del que hay en la cuenta
        cuenta.retirar(200);
        System.out.println("Intento de retirar 200 (más del saldo disponible): " + cuenta);
    }
}
