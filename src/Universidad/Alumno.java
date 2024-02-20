package Universidad;

import java.util.Scanner;

public class Alumno {
    // atributos
    static int contExpediente = 100000;
    // explicar después
    int edad, semestre = 1, grupo, expediente = 0, totalMat = 0;
    int[] calificaciones = new int[4];
    double promedioG = 0, promedioS = 0;
    boolean reinscrito = false;
    String nombre, apellidoP, apellidoM, carrera, facultad;

    // constructores
    public Alumno() {

    }

    public Alumno(int grupo, String nombre, String apellidoP, String apellidoM, String carrera, String facultad) {
        this.expediente = ++Alumno.contExpediente;
        this.grupo = grupo;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.facultad = facultad;
    }

    // métodos
    public void CalcCalif() {
        System.out.println("Calculando promedio...");
        System.out.println("Ingresa tus calificaciones: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.calificaciones.length; i++) {
            System.out.println(String.format("Calificación #%d:", i));
            this.calificaciones[i] = sc.nextInt();
        }
    }

    public void CalifCheckOut() {
        if (isReinscrito()) {
            System.out.println("Final de semestre... calculando promedio");
            this.CalcCalif();
            double aux = this.promedioS;
            this.promedioS = 0;
            for (int i = 0; i < this.calificaciones.length; i++) {
                this.promedioS += this.calificaciones[i];
            }
            this.promedioS = this.promedioS / this.calificaciones.length;
            if (this.semestre == 1) {
                this.promedioG = this.promedioS;
            } else {
                this.promedioG = (this.promedioG + aux) / 2;
            }
            this.semestre++;
            this.reinscrito = false;
        }
    }

    public void VerCalif() {
        for (int i = 0; i < this.calificaciones.length; i++) {
            System.out.println(String.format("Calificación #%d: %d", i, this.calificaciones[i]));
        }
    }

    // Inscribirse a prácticas
    public void InscPracticas() {
        if (this.semestre >= 9) {
            System.out.println("Te puedes inscribir!");
        } else {
            System.out.println("No te puedes inscribir, te faltan " + (9 - semestre) + " semestres");
        }
    }

    // método reinscripción
    public void Reinscripcion(int totalReins, int nMat) {
        if (this.reinscrito) {
            System.out.println("No te puedes inscribir!\nYa estás reinscrito en este periodo");
        } else if (this.semestre < totalReins + (totalReins / 2)) {
            System.out.println("Reinscribiendo...");
            System.out.println("¿Deseas pagar?\n1-Si\n2-No");
            Scanner sc = new Scanner(System.in);
            int entrada = sc.nextInt();
            if (entrada == 1) {
                System.out.println("Pago realizado, estás reinscrito");
                this.reinscrito = true;
                this.calificaciones = new int[nMat];
                this.totalMat = this.totalMat + nMat;
            } else
                System.out.println("Terminando proceso...");
        } else
            System.out.println("Imposible reinscribir, máximo número de reinscripciones alcanzado.");
    }

    // CheckOut-> Calcular promedios, calcular promedioS, calcular promedioG = (promG + promS)/2

    // método imprimir matriz

    public int getTotalMat() {
        return totalMat;
    }

    public void setTotalMat(int totalMat) {
        this.totalMat = totalMat;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean isReinscrito() {
        return reinscrito;
    }

    public void setReinscrito(boolean reinscrito) {
        this.reinscrito = reinscrito;
    }

    // Getterss - setters
    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public double getPromedioG() {
        return promedioG;
    }

    public void setPromedioG(double promedioG) {
        this.promedioG = promedioG;
    }

    public double getPromedioS() {
        return promedioS;
    }

    public void setPromedioS(double promedioS) {
        this.promedioS = promedioS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreP) {
        this.nombre = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}

