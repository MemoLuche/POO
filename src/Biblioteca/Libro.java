package Biblioteca;

public class Libro {
    static int idLibro = 1;
    private int isbn = -1, anPub = 0, numPag = 0, numEjemplares = 0;
    private String nombre = "Nulo", autor = "Nulo", genero = "Nulo";
    private double precio = 0.0;

    public Libro() {}

    public Libro(String nombre, String autor, String genero, int numPag, int anPub, double precio, int numEjemplares) {
        this.isbn = Libro.idLibro++;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.numPag = numPag;
        this.anPub = anPub;
        this.precio = precio;
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", autor: " + this.autor + " numero Ejemplares: " + numEjemplares;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAnPub() {
        return anPub;
    }

    public void setAnPub(int anPub) {
        this.anPub = anPub;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
