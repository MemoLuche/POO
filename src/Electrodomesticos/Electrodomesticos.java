package Electrodomesticos;

public class Electrodomesticos{

    double precio, peso, altura, longitud;
    String color;

    public Electrodomesticos(double precio, double peso, double altura, double longitud, String color){

        this.precio = precio;
        this.peso = peso;
        this.altura = altura;
        this.longitud = longitud;
        this.color = color;

    }

    public double calcularPrecio(double price){
        double precioFinal = 0;
        precioFinal = price * 1.16;
        return precioFinal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
