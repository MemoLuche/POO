package Banco;

public class CuentaHabiente {
    
    int id = 0;
    String nombre = "", tipoCuenta = "";
    double saldo = 0.0, limiteCuenta = 0.0, numMovimientos = 0.0;
    boolean estado = false;

    public CuentaHabiente(int id, String nombre, String tipoCuenta, double saldo, double limiteCuenta, double numMovimientos, boolean estado){

        this.id = id;
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.limiteCuenta = limiteCuenta;
        this.numMovimientos = numMovimientos;
        this.estado = estado;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteCuenta() {
        return limiteCuenta;
    }

    public double getNumMovimientos() {
        return numMovimientos;
    }

    public boolean isEstado() {
        return estado;
    }

}
