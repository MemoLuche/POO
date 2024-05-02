package Electrodomesticos;

public class Main {

    public static void main(String[] args) {
        
        Television tv1 = new Television();
        Television tv2 = new Television(2500, 50);
        Television tv3 = new Television(3000, 50, 30, 45, 1444, "Negro", false);
        tv3.prender();
        tv3.prender();
        tv3.apagar();
        tv3.prender();
        tv3.cambiarCanal(2);
        tv3.cambiarCanal(1);
        tv3.apagar();
        System.out.println(tv3);

        Lavadora lv1 = new Lavadora();
        Lavadora lv2 = new Lavadora(8500, 60);
        Lavadora lv3 = new Lavadora(9000, 65, 85, 45, "Blanco");
        lv3.lavar();
        lv3.prender();
        lv3.apagar();
        lv3.apagar();
        lv3.prender();
        lv3.lavar();
        lv3.apagar();
        System.out.println(lv3);

    }

}
