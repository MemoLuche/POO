package Universidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    
    //Todas las funciones para hacer funcionar el menu de usuario en main.java
    public static Matriz crearMatrizUno() {

        Scanner sc = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        //boolean cond = true;

        do {
            try {
                System.out.println("De cuantas filas sera la matriz 1?");
                filas = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero!");
                sc.nextLine();
            }
        } while (true);
        
        do {
            try {
                System.out.println("De cuantas columnas sera la matriz 1?");
                columnas = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero!");
                sc.nextLine();
            }
        } while (true);

        Matriz m1 = new Matriz(filas, columnas);
        return m1;
    }

    public static Matriz crearMatrizDos() {

        Scanner sc = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        //boolean cond = true;

        do {
            try {
                System.out.println("De cuantas filas sera la matriz 2?");
                filas = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero!");
                sc.nextLine();
            }
        } while (true);
        
        do {
            try {
                System.out.println("De cuantas columnas sera la matriz 2?");
                columnas = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero!");
                sc.nextLine();
            }
        } while (true);

        Matriz m2 = new Matriz(filas, columnas);
        return m2;
    }

    public static void MostrarMatriz(Matriz m1, Matriz m2) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("Seleccione la matriz que desea ver: ");
                System.out.println("1. Matriz uno");
                System.out.println("2. Matriz dos");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    m1.MostrarMatriz();
                    break;
                }else if(opcion == 2) {
                    m2.MostrarMatriz();
                    break;
                } else if (opcion == 3) {
                    break;
                } else System.out.println("Favor de ingresar 1 o 2 para la opcion deseada");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un numero de tipo entero!");
                sc.nextLine();
            }
        } while (true);

    }

    public static void SumarMatrices(Matriz m1, Matriz m2) {

        System.out.println("La suma de ambas matrices es: ");
        Matriz resultado = m1.SumarMatrices(m2);
        resultado.MostrarMatriz();
        
    }
    
    public static void RestarMatrices(Matriz m1, Matriz m2) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("1. Restar matriz uno - matriz dos");
                System.out.println("2. Restar matriz dos - matriz uno");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("La resta de ambas matrices es: ");
                    Matriz resultado = m1.RestaMatrices(m2);
                    resultado.MostrarMatriz();
                    break;
                } else if (opcion == 2) {
                    System.out.println("La resta de ambas matrices es: ");
                    Matriz resultado = m2.RestaMatrices(m1);
                    resultado.MostrarMatriz();            
                    break;
                } else if (opcion == 3) {
                    break;
                } else System.out.println("Favor de seleccionar una opcion valida!");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero");
                sc.nextLine();
            }
        } while (true);

    }

    public static void DeterminanteUniversal(Matriz m1,Matriz m2) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("De cual matriz deseas saber la determinante?");
                System.out.println("Considera que solo se puede calcular la determinante si esta es cuadrada y de maximo 4x4");
                System.out.println("1. Matriz uno");
                System.out.println("2. Matriz dos");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                if (opcion == 1 && m1.filas == 2 && m1.columnas == 2) {
                    System.out.println(m1.Determinante());
                    break;
                } else if (opcion == 1 && m1.filas == 3 && m1.columnas == 3){
                    System.out.println(m1.Determinante3x3());
                    break;
                } else if (opcion == 1 && m1.filas == 4 && m1.columnas == 4) {
                    System.out.println(m1.Determinante4x4());
                    break;
                } else if (opcion == 2 && m2.filas == 2 && m2.columnas == 2) {
                    System.out.println(m2.Determinante());
                    break;
                } else if (opcion == 2 && m2.filas == 3 && m2.columnas == 3) {
                    System.out.println(m2.Determinante3x3());
                    break;
                } else if (opcion == 2 && m1.filas == 4 && m1.columnas == 4) {
                    System.out.println(m2.Determinante4x4());
                    break;
                } else if (opcion == 3){
                    break;
                }else System.out.println("Favor de ingresar una opcion valida!");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero");
                sc.nextLine();
            }
        } while (true);

    }

    public static void MultipicarXEscalar(Matriz m1, Matriz m2) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;

        do {
            try {
                System.out.println("Que matriz deseas multiplicar?");
                System.out.println("1. Matriz uno");
                System.out.println("2. Matriz dos");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                System.out.println("Por cuanto deseas multiplicar la matriz?");
                cantidad = sc.nextInt();
                if (opcion == 1) {
                    Matriz temp = (m1.MxEscalar(cantidad));
                    temp.MostrarMatriz();
                    break;
                } else if (opcion == 2) {
                    Matriz temp = (m2.MxEscalar(cantidad));
                    temp.MostrarMatriz();
                    break;
                } else if (opcion == 3){
                    break;
                }else System.out.println("Favor de ingresar una opcion valida");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero!");
                sc.nextLine();            
            }
        } while (true);

    }

    public static void MultiplicarMxM (Matriz m1, Matriz m2) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("Seleccione la opcion deseada");
                System.out.println("Recuerde que el numero de columnas de la matriz uno x el numero de filas de la matriz dos, deben ser iguales!");
                System.out.println("1. Multiplicar matriz uno x matriz dos");
                System.out.println("2. Multiplicar matriz dos x matriz uno");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("La multiplicacion de ambas matrices es: ");
                    Matriz resultado = m1.MultiplicarMxM(m2);
                    resultado.MostrarMatriz();
                    break;
                } else if (opcion == 2) {
                    System.out.println("La multiplicacion de ambas matrices es: ");
                    Matriz resultado = m2.MultiplicarMxM(m1);
                    resultado.MostrarMatriz();            
                    break;
                } else if (opcion == 3) {
                    break;
                }else System.out.println("Favor de seleccionar una opcion valida!");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero");
                sc.nextLine();
            }
        } while (true);

    }

    public static void Transpuesta (Matriz m1, Matriz m2) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("Que matriz deseas transponer?");
                System.out.println("1. Matriz uno");
                System.out.println("2. Matriz dos");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    Matriz resultado = m1.Transpuesta();
                    resultado.MostrarMatriz();
                    break;
                } else if (opcion == 2) {
                    Matriz resultado = m2.Transpuesta();
                    resultado.MostrarMatriz();
                    break;
                } else if (opcion == 3){
                    break;
                }else System.out.println("Favor de ingresar una opcion valida");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero!");
                sc.nextLine();
            }
        } while (true);

    }

    public static void invertirMatriz (Matriz m1, Matriz m2) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("Que matriz deseas invertir?");
                System.out.println("1. Matriz uno");
                System.out.println("2. Matriz dos");
                System.out.println("3. Cancelar");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    Matriz resultado = m1.invertirMatriz();
                    resultado.MostrarMatriz();
                    break;
                } else if (opcion == 2) {
                    Matriz resultado = m2.invertirMatriz();
                    resultado.MostrarMatriz();
                    break;
                } else if (opcion == 3){
                    break;
                }else System.out.println("Favor de ingresar una opcion valida");
            } catch (InputMismatchException e) {
                System.out.println("Error! Favor de ingresar un dato de tipo entero");
                sc.nextLine();
            }
        } while (true);

    }

}
