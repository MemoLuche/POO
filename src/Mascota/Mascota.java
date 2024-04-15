package Mascota;

public class Mascota {
    
    String nombre;
    int tipoAnimal, edad;

    public Mascota(String nombre, int tipoAnimal, int edad){

        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.edad = edad;

    }

    public void comer(){}
    public void hacerRuido(){}
    public void moverse(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(int tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Animal: \n" + 
        "Nombre: " + nombre +
        "\nTipo Animal: " + tipoAnimal +
        "\nEdad: " + edad;
    }

}
