package Mascota;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rocky", 5, 10, "Labrador");
        Gato gato = new Gato("Whiskers", 3, 5, "Negro", true);
        Pajaro pajaro = new Pajaro("Tweety", 2, 10, true, "Amarillo");
        Pez pez = new Pez("Nemo", 1, 2, "salada", "Payaso");

        perro.hacerRuido();
        gato.comer();
        pajaro.moverse();
        pez.hacerRuido();

        System.out.println(perro);
        System.out.println(gato);
        System.out.println(pajaro);
        System.out.println(pez);
    }
}
