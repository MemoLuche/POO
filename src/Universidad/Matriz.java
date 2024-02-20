package Universidad;

import java.util.Scanner;

public class Matriz {

    // atributos
    String nombre;
    int filas, columnas;
    double[][] valores; // no definida

    // constructor
    public Matriz(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.valores = new double[this.filas][this.columnas];
    }

    // métodos
    public void MostrarMatriz() {
        for (int f = 0; f < this.valores.length; f++) {
            for (int c = 0; c < this.valores[0].length; c++) {
                System.out.print(this.valores[f][c] + " ");
            }
            System.out.println();
        }
    }

    public void RellenarMatriz() {
        Scanner sc = new Scanner(System.in);
        for (int f = 0; f < this.valores.length; f++) {
            for (int c = 0; c < this.valores[0].length; c++) {
                System.out.println(String.format("Ingresa el valor %d,%d: ", f, c));
                this.valores[f][c] = sc.nextDouble();
            }
        }
    }

    // sumar Matrices
    public double[][] SumarMatrices(Matriz m2) {
        double[][] matRes = this.valores;
        if (this.filas == m2.filas && this.columnas == m2.columnas) {
            for (int f = 0; f < this.valores.length; f++) {
                for (int c = 0; c < this.valores[0].length; c++) {
                    matRes[f][c] += m2.valores[f][c];
                }
            }
        } else {
            System.out.println("Error!! Dimensiones diferentes!!");
        }
        return matRes;
    }

    public double[][] RestaMatrices(Matriz m2) {
        double[][] matRes = this.valores;
        if (this.filas == m2.filas && this.columnas == m2.columnas) {
            for (int f = 0; f < this.valores.length; f++) {
                for (int c = 0; c < this.valores[0].length; c++) {
                    matRes[f][c] -= m2.valores[f][c];
                }
            }
        } else {
            System.out.println("Error!! Dimensiones diferentes!!");
        }
        return matRes;
    }

    public double Determinante() {
        double det = 0.0;
        if (this.filas == 2 && this.columnas == 2) {
            det = (this.valores[0][0] * this.valores[1][1]) - (this.valores[0][1] * this.valores[1][0]);
        } else {
            return 0;
        }
        return det;
    }

    // Getters/setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public double[][] getValores() {
        return valores;
    }

    public void setValores(double[][] valores) {
        this.valores = valores;
    }
}
