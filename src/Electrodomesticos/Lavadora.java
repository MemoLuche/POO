package Electrodomesticos;

public class Lavadora extends Electrodomesticos{

    boolean estado;

    public Lavadora(double precio, double peso, double altura, double longitud, String color){
        super(precio, peso, altura, longitud, color);

        this.estado = false;
    }
    
    public Lavadora(double precio, double peso){
        super(precio, peso, 0, 0, null);

    }

    public Lavadora(){
        super(0, 0, 0, 0, null);

    }

    public void prender(){

        if (this.estado = true){
            System.out.println("Ya esta prendida");
        } else {
            this.estado = true;
            System.out.println("Ya se prendio");
        }

    }
    
    public void apagar(){

        if (this.estado = true){
            this.estado = false;
            System.out.println("Ya se apago");
        } else {
            System.out.println("Ya esta apagada");
        }

    }

    public void lavar(){

        if (this.estado = true){
            System.out.println("Lavando la ropa...");
            System.out.println("Lavando la ropa...");
            System.out.println("Lavando la ropa...");
            System.out.println("Ropa lavada!");
        } else {
            System.out.println("La lavadora esta apagada, no se puede lavar.");
        }

    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
