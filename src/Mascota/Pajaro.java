package Mascota;

public class Pajaro extends Mascota {
    
    public boolean puedeVolar;
    public String colorPlumas;

    public Pajaro(String nombre, int tipoAnimal, int edad, boolean puedeVolar, String colorPlumas){
        super(nombre, 3, edad);
        this.puedeVolar = puedeVolar;
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Pío!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void moverse() {
        if (puedeVolar) {
            System.out.println(nombre + " está volando.");
        } else {
            System.out.println(nombre + " está caminando.");
        }
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

}
