package Biblioteca;

public class Usuario {
    static int contId = 0;
    String nombre = "", direccion = "";
    int idUser, edad = 0, librosPrestados = 0;
    double deuda = 0.0;
    boolean estado = true, tieneLibro = false, fault = false;

    public Usuario() {

    }

    public Usuario(String nombre, String direccion, int edad) {
        this.idUser = ++Usuario.contId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEstado: " + this.estado + "\nDeuda: " + this.deuda + "\nPrestamos: " + this.tieneLibro;
    }

    public static int getContId() {
        return contId;
    }

    public static void setContId(int contId) {
        Usuario.contId = contId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isTieneLibro() {
        return tieneLibro;
    }

    public void setTieneLibro(boolean tieneLibro) {
        this.tieneLibro = tieneLibro;
    }

    public boolean isFault() {
        return fault;
    }

    public void setFault(boolean fault) {
        this.fault = fault;
    }
}
