package Debito;

public class Debito {

    double saldo;
    String usuario;
    boolean status;

    public Debito(String usuario, double saldo, boolean status){

        this.saldo = saldo;
        this.usuario = usuario;
        this.status = status;

    }

    public void retirar(double cantidad){

        if (this.status = true){
            if (this.saldo >= cantidad){
                this.saldo -= cantidad;
                System.out.println("Retirando...");
                System.out.println("Tu nuevo saldo es: " + this.saldo);
            } else {
                System.out.println("No se puede retirar debido que no cuenta con saldo suficiente!");
            }
        } else {
            System.out.println("Es necesario activar la cuenta para realizar movimientos");
        }
        
    }

    public void depositar(double cantidad){
        
        if (this.status = true){
            if (cantidad > 0){
                System.out.println("Depositando...");
                System.out.println("Tu nuevo saldo es: " + this.saldo);
            } else{
                System.out.println("No es posible depositar una cantidad negativa o igual a cero.");
            }
        } else {
            System.out.println("Es necesario activar la cuenta para realizar movimientos");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Debito [saldo=" + saldo + ", usuario=" + usuario + ", status=" + status + "]";
    }

}
