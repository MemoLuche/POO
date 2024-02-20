/*
package Banco;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void imprimirMatriz(String[][] matriz, int filas, int columnas) {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static int contarFilas(File doc) {
        int conteo = 0;

        try (Scanner lectura = new Scanner(doc)) {
            while (lectura.hasNext()) {
                lectura.nextLine();
                conteo++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conteo;
    }

    public static String[][] llenarMatriz(String[][] bd, File doc) {
        try (Scanner lectura = new Scanner(doc)) {
            for (int i = 0; i < bd.length; i++) {
                String contenido = lectura.nextLine();
                String[] datosFila = contenido.split(",");
                for (int j = 0; j < bd[i].length; j++) {
                    bd[i][j] = datosFila[j];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bd;
    }

    public static void main(String[] args) {
        CuentaHabiente memo = new CuentaHabiente(325786, "Guillermo", "DEBITO", 1000, 20000, 0, true);

        String path = "C:\\Users\\marid\\Documents\\Programacion\\personal\\src\\Banco\\baseDeDatos.txt";
        File doc = new File(path);

        System.out.println(contarFilas(doc));

        int filas = contarFilas(doc);
        String[][] bd = new String[filas][6];

        bd = llenarMatriz(bd, doc);

        System.out.println("Matriz original:");
        imprimirMatriz(bd, filas, 6);

        System.out.println("-----------------------");

        bd[1][1] = "Pancho";

        System.out.println("Matriz modificada:");
        imprimirMatriz(bd, filas, 6);
    }
}
*/
package Banco;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void imprimirMatriz(String[][] matriz, int filas, int columnas) {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static int contarFilas(File doc) {
        int conteo = 0;

        try (Scanner lectura = new Scanner(doc)) {
            while (lectura.hasNext()) {
                lectura.nextLine();
                conteo++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conteo;
    }

    public static String[][] llenarMatriz(String[][] bd, File doc) {
        try (Scanner lectura = new Scanner(doc)) {
            for (int i = 0; i < bd.length; i++) {
                String contenido = lectura.nextLine();
                String[] datosFila = contenido.split(",");
                for (int j = 0; j < bd[i].length; j++) {
                    bd[i][j] = datosFila[j];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bd;
    }

    public static void cambiarRegistroPorId(String[][] bd, int id, String nuevoNombre, int nuevaCantidad) {
        for (int i = 0; i < bd.length; i++) {
            if (Integer.parseInt(bd[i][0]) == id) {
                // Encontramos la fila correspondiente al ID
                bd[i][1] = nuevoNombre; // Cambiar el nombre
                bd[i][3] = String.valueOf(nuevaCantidad); // Cambiar la cantidad
                break; // Salir del bucle una vez que se ha actualizado el registro
            }
        }
    }

    public static int buscarPorId(String[][] bd, int id) {
        for (int i = 0; i < bd.length; i++) {
            if (Integer.parseInt(bd[i][0]) == id) {
                // Encontramos la fila correspondiente al ID
                return i; // Devolver el índice de la fila
            }
        }
        return -1; // Devolver -1 si no se encuentra el ID
    }

    public static void main(String[] args) {
        CuentaHabiente memo = new CuentaHabiente(325786, "Guillermo", "DEBITO", 1000, 20000, 0, true);

        String path = "C:\\Users\\guill\\OneDrive\\Documentos\\PROGRAMACION\\Semestre 2\\POO\\POO\\src\\Banco\\baseDeDatos.txt";
        File doc = new File(path);

        System.out.println(contarFilas(doc));

        int filas = contarFilas(doc);
        String[][] bd = new String[filas][6];

        bd = llenarMatriz(bd, doc);

        System.out.println("Matriz original:");
        imprimirMatriz(bd, filas, 6);

        System.out.println("-----------------------");

        // Ejemplo de cambio de registro por ID
        cambiarRegistroPorId(bd, 325786, "NuevoNombre", 5000);
        System.out.println("Matriz después del cambio:");
        imprimirMatriz(bd, filas, 6);

        System.out.println("-----------------------");

        // Ejemplo de búsqueda por ID
        int idBuscado = 1345;
        int indiceFila = buscarPorId(bd, idBuscado);
        if (indiceFila != -1) {
            System.out.println("Registro encontrado en la fila " + indiceFila);
        } else {
            System.out.println("Registro con ID " + idBuscado + " no encontrado.");
        }
    }
}
