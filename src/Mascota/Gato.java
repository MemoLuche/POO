package Mascota;

public class Gato extends Mascota {
    
    public String color;
    public boolean esHogarenho;

    public Gato(String nombre, int tipoAnimal, int edad, String color, boolean esHogarenho){
        super(nombre, 2, edad);
        this.color = color;
        this.esHogarenho = esHogarenho;
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está saltando.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsHogarenho() {
        return esHogarenho;
    }

    public void setEsHogarenho(boolean esHogarenho) {
        this.esHogarenho = esHogarenho;
    }

}
