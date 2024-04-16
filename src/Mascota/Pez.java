package Mascota;

public class Pez extends Mascota {

    String tipoAgua, especie;

    public Pez(String nombre, int tipoAnimal, int edad, String tipoAgua, String especie){
        
        super(nombre, tipoAnimal, edad);
        this.tipoAgua = tipoAgua;
        this.especie = especie;

    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " no hace ruido.");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está nadando.");
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}