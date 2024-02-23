package Universidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean cond = true;
        int opcion = 0;

        //Crear las matrices a usar
        System.out.println("Bienvenido a la calculadora de matrices!");
        System.out.println("Primero debemos crear nuestras dos matrices!");
        System.out.println("A continuacion sigue los pasos como se indica de favor");
        System.out.println("Datos de la matriz UNO");
        Matriz m1 = Menu.crearMatrizUno();
        System.out.println("Datos de la matriz DOS");
        Matriz m2 = Menu.crearMatrizDos();
        System.out.println("Como segundo paso debemos llenar nuestras dos matrices!");
        System.out.println("A continuacion sigue los pasos como se indica de favor");
        System.out.println("Datos de la matriz UNO");
        m1.RellenarMatriz();
        System.out.println("Datos de la matriz DOS");
        m2.RellenarMatriz();

        //Menu de opciones para el usuario
        do {
            try {
                System.out.println("Las opciones son:");
                System.out.println("1. Reconstruir matriz uno");
                System.out.println("2. Rellenar matriz uno");
                System.out.println("3. Reconstruir matriz dos");
                System.out.println("4. Rellenar matriz dos");
                System.out.println("5. Mostrar matriz");
                System.out.println("6. Sumar matrices");
                System.out.println("7. Restar matrices");
                System.out.println("8. Determinante de la matriz");
                System.out.println("9. Multiplicacion de matriz x escalar");
                System.out.println("10. Multiplicacion de matriz x matriz");
                System.out.println("11. Transpuesta de matriz");
                System.out.println("12. Invertir la matriz");
                System.out.println("13. Cerrar programa");
                opcion = sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar el unmero entero de la opcion deseada");
                sc.nextLine();
            }
            switch (opcion) {
                case 1: m1 = Menu.crearMatrizUno();
                    break;
            
                case 2: m1.RellenarMatriz();
                    break;

                case 3: m2 = Menu.crearMatrizDos();
                    break;
                    
                case 4: m2.RellenarMatriz();
                    break;

                case 5: Menu.MostrarMatriz(m1, m2);
                    break;

                case 6:  Menu.SumarMatrices(m1, m2);
                    break;

                case 7: Menu.RestarMatrices(m1, m2);
                    break;

                case 8: Menu.DeterminanteUniversal(m1, m2);
                    break;

                case 9: Menu.MultipicarXEscalar(m1, m2);
                    break;

                case 10: Menu.MultiplicarMxM(m1, m2);
                    break;

                case 11: Menu.Transpuesta(m1, m2);
                    break;

                case 12: Menu.invertirMatriz(m1, m2);
                    break;

                case 13: System.out.println("Hasta pronto!");
                cond = false;
                break;

                default: System.out.println("Ingresar una opcion valida!");
                break;
            }
        } while (cond);

        sc.close();
    }
}
