package Biblioteca;

public class Libro {
    private static int idSiguiente = 1;
    private int id;
    private int isbn;
    private int añoPublicacion;
    private int numeroPaginas;
    private int numeroEjemplares;
    private String nombre;
    private String autor;
    private String genero;
    private double precioRenta;

    public Libro(int isbn, int añoPublicacion, int numeroPaginas, int numeroEjemplares, String nombre, String autor, String genero, double precioRenta) {
        this.id = idSiguiente++;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.precioRenta = precioRenta;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Año de Publicación: " + añoPublicacion +
                ", Nombre: " + nombre + ", Autor: " + autor + ", Género: " + genero +
                ", Precio de Renta: " + precioRenta + ", Ejemplares Disponibles: " + numeroEjemplares;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public static void setIdSiguiente(int idSiguiente) {
        Libro.idSiguiente = idSiguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
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

    public double getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }
}
