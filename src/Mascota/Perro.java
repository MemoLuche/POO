package Mascota;

public class Perro extends Mascota {
    
    public int trucosAprendidos;
    public String raza;

    public Perro(String nombre, int edad, int trucosAprendidos, String raza) {
        super(nombre, 1, edad);
        this.trucosAprendidos = trucosAprendidos;
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está corriendo.");
    }

    public int getTrucosAprendidos() {
        return trucosAprendidos;
    }

    public void setTrucosAprendidos(int trucosAprendidos) {
        this.trucosAprendidos = trucosAprendidos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}