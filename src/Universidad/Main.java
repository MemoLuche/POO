package Universidad;

public class Main {

    public static void ImprimirMatriz(double[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static void ImprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        
        Alumno a1 = new Alumno(37,"Joel","García","Pérez","SOF","FIF");
        System.out.println(a1.getExpediente ()); a1.InscPracticas();
        System.out.println(a1.isReinscrito()); a1.Reinscripcion(9,6); //Modifica el número de materias 
        System.out.println(a1.isReinscrito());
        a1.CalifCheckOut(); System.out.println(a1.getPromedioG());
        System.out.println(a1.getPromedioS()); System.out.println(a1.getSemestre());
        ImprimirVector(a1.calificaciones); System.out.println(a1.isReinscrito());
        a1.Reinscripcion(9,4); //Modifica el número de materias
        System.out.println(a1.isReinscrito()); a1.CalifCheckOut();
        System.out.println(a1.getPromedioG());
        System.out.println(a1.getPromedioS());
        System.out.println(a1.getSemestre());
        ImprimirVector(a1.calificaciones); System.out.println(a1.isReinscrito());
        

        // Matriz
        Matriz m1 = new Matriz("2D", 2, 2);
        m1.RellenarMatriz();
        Matriz m2 = new Matriz("2D2", 2, 2);
        m2.RellenarMatriz();
        ImprimirMatriz(m1.SumarMatrices(m2));
    }
}
