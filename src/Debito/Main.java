package Debito;

public class Main {

    public static void main(String[] args) {
        
        Debito cuenta1 = new Debito("001", 1000, true);
        Debito cuenta2 = new Debito("002", 50, false);

        cuenta1.depositar(1000);
        cuenta1.retirar(50);
        cuenta1.retirar(50000);
        cuenta2.depositar(1000);
        cuenta2.retirar(1000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);

    }

}
