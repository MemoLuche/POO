package Examen;

public class Cuenta{

    String titular;
    Double saldo;

    public Cuenta (String titular){

        this.titular = titular;
        this.saldo = 0.0;

    }

    public Cuenta (String titular, Double saldo){

        this.titular = titular;
        if (saldo < 0){
            saldo = 0.0;
        }
        this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(Double cantidad){

        if (cantidad > 0) {
            this.saldo += cantidad;
        }

    }

    public void retirar(double cantidad) {
        if (cantidad > this.saldo) {
            this.saldo = 0.0;
        } else {
            this.saldo -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "\nCuenta \n" +
               "Titular : " + titular + '\n' +
               "Saldo : " + saldo;
    }

}