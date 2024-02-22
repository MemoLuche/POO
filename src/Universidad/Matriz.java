package Universidad;

import java.util.Scanner;

public class Matriz {

    // atributos
    String nombre;
    int filas, columnas;
    double[][] valores; // no definida

    // constructor
    public Matriz(int filas, int columnas) {
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

    //Funcion para llenar las matrices
    public void RellenarMatriz() {
        Scanner sc = new Scanner(System.in);
        for (int f = 0; f < this.valores.length; f++) {
            for (int c = 0; c < this.valores[0].length; c++) {
                System.out.println(String.format("Ingresa el valor %d,%d: ", f, c));
                this.valores[f][c] = sc.nextDouble();
            }
        }
    }

    //Funcion para sumar matrices
    public Matriz SumarMatrices(Matriz m2) {
        if (this.filas == m2.filas && this.columnas == m2.columnas) {
            Matriz resultado = new Matriz(this.filas, this.columnas);
    
            for (int f = 0; f < this.filas; f++) {
                for (int c = 0; c < this.columnas; c++) {
                    resultado.valores[f][c] = this.valores[f][c] + m2.valores[f][c];
                }
            }
            return resultado;
        } else {
            System.out.println("Error!! Dimensiones diferentes!!");
            return null;  // O maneja el error de alguna otra manera, según tu lógica de programa.
        }
    }    

    //Funcion para restar matrices
    public Matriz RestaMatrices(Matriz m2) {
        if (this.filas == m2.filas && this.columnas == m2.columnas) {
            Matriz resultado = new Matriz(this.filas, this.columnas);
    
            for (int f = 0; f < this.filas; f++) {
                for (int c = 0; c < this.columnas; c++) {
                    resultado.valores[f][c] = this.valores[f][c] - m2.valores[f][c];
                }
            }
            return resultado;
        } else {
            System.out.println("Error!! Dimensiones diferentes!!");
            return null;  // O maneja el error de alguna otra manera, según tu lógica de programa.
        }
    }
    

    //Funcion para la determinante de 2x2
    public double Determinante() {
        double det = 0.0;
        if (this.filas == 2 && this.columnas == 2) {
            det = (this.valores[0][0] * this.valores[1][1]) - (this.valores[0][1] * this.valores[1][0]);
        } else {
            return 0;
        }
        return det;
    }

    //Funcion para la determinante de 3x3
    public double Determinante3x3() {
        if (this.filas == 3 && this.columnas == 3) {
            double det = 0.0;

            det += this.valores[0][0] * (this.valores[1][1] * this.valores[2][2] - this.valores[1][2] * this.valores[2][1]);
            det -= this.valores[0][1] * (this.valores[1][0] * this.valores[2][2] - this.valores[1][2] * this.valores[2][0]);
            det += this.valores[0][2] * (this.valores[1][0] * this.valores[2][1] - this.valores[1][1] * this.valores[2][0]);

            return det;
        } else {
            System.out.println("Error!! La matriz no es de tamaño 3x3");
            return 0;
        }
    }

    //Función para calcular la determinante de una matriz 4x4
    public double Determinante4x4() {
        if (this.filas == 4 && this.columnas == 4) {
            double det = 0.0;

            for (int i = 0; i < 4; i++) {
                det += this.valores[0][i] * cofactor(0, i);
            }

            return det;
        } else {
            System.out.println("Error!! La matriz no es de tamaño 4x4");
            return 0;
        }
    }

    //Funcion para calcular la multiplicacion de una matrix por un escalar
    public Matriz MxEscalar(double Escalar) {
        Matriz matEsc = new Matriz(this.filas, this.columnas);
        for (int f = 0; f < this.filas; f++) {
            for (int c = 0; c < this.columnas; c++) {
                matEsc.valores[f][c] = this.valores[f][c] * Escalar;
            }
        }
    
        return matEsc;
    }
    

    // Función para multiplicar dos matrices
    public Matriz MultiplicarMxM(Matriz matrizB) {
        if (this.columnas == matrizB.filas) {
            Matriz resultado = new Matriz(this.filas, matrizB.columnas);

            for (int i = 0; i < this.filas; i++) {
                for (int j = 0; j < matrizB.columnas; j++) {
                    for (int k = 0; k < this.columnas; k++) {
                        resultado.valores[i][j] += this.valores[i][k] * matrizB.valores[k][j];
                    }
                }
            }

            return resultado;
        } else {
            System.out.println("Error!! El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz");
            return null;
        }
    }

    //Funcion para caluclar la transpuesta de una matriz
    public Matriz Transpuesta() {
        Matriz resultado = new Matriz(this.columnas, this.filas);
        for (int c = 0; c < this.columnas; c++) {
            for (int f = 0; f < this.filas; f++) {
                resultado.valores[c][f] = this.valores[f][c];
            }
        }
        return resultado;
    }

    //Funcion para calcular la inversa de una matriz por medio del metodo de Gauss
    public Matriz invertirMatriz() {
        int n = this.columnas;
        Matriz aumentada = new Matriz(n, 2*n);
        //Matriz aumentada [matriz | Identidad]
        
        //Inicializar matriz aumentada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aumentada.valores[i][j] = this.valores[i][j];
                
                //Establecer la parte identidad de la matriz aumentada
                aumentada.valores[i][j + n] = (i == j) ? 1 : 0;
            }
        }

        //Aplicar la eliminación de Gauss-Jordan
        for (int i = 0; i < n; i++) {
            //Pivote actual
            double pivote = aumentada.valores[i][i];
            
            //Dividir la fila por el pivote
            for (int j = 0; j < 2 * n; j++) {
                aumentada.valores[i][j] /= pivote;
            }

            //Eliminación hacia abajo y hacia arriba
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aumentada.valores[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        aumentada.valores[k][j] -= factor * aumentada.valores[i][j];
                    }
                }
            }
        }

        //Extraer la parte derecha (la inversa)
        Matriz inversa = new Matriz(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa.valores[i][j] = aumentada.valores[i][j + n];
            }
        }

        return inversa;
    }

    //Función auxiliar para calcular cofactor
    private double cofactor(int fila, int columna) {
        int signo = (fila + columna) % 2 == 0 ? 1 : -1;
        return signo * menor(fila, columna).Determinante3x3();
    }

    //Función auxiliar para obtener la menor de una matriz 3x3
    private Matriz menor(int fila, int columna) {
        Matriz submatriz = new Matriz(3, 3);

        int subfila = 0;
        int subcolumna = 0;

        for (int i = 0; i < 4; i++) {
            if (i != fila) {
                subcolumna = 0;
                for (int j = 0; j < 4; j++) {
                    if (j != columna) {
                        submatriz.valores[subfila][subcolumna] = this.valores[i][j];
                        subcolumna++;
                    }
                }
                subfila++;
            }
        }

        return submatriz;
    }

    //Getters/setters
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
