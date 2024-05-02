package Mouse;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        boolean rueda, conexionBlue, conexionUsb;
        int dpi, anchura, altura, botones;
        String tipoLector, tempRueda;
        int opcion = 0;
        int moverseX, moverseY;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ingresa los datos del mouse");
                System.out.println("Cual es el DPI?");
                dpi = sc.nextInt();
                System.out.println("Cual es el ancho del mouse?");
                anchura = sc.nextInt();
                System.out.println("Cual es la altura del mouse?");
                altura = sc.nextInt();
                System.out.println("Cuantos botones tiene el mouse?");
                botones = sc.nextInt();
                System.out.println("Tiene rueda el mouse? Y/N");
                tempRueda = sc.nextLine();
                tempRueda = sc.nextLine();
                if (tempRueda.equals("Y")){
                    rueda = true;
                } else{
                    rueda = false;
                }
                System.out.println("Que tipo de lector tiene?");
                tipoLector = sc.nextLine();
                System.out.println("Tiene conexion vía Bluetooth? Y/N");
                String varConexionBlue = sc.nextLine();
                if (varConexionBlue.equals("Y")){
                    conexionBlue = true;
                } else{
                    conexionBlue = false;
                }
                System.out.println("Tiene conexion vía USB? Y/N");
                String varConexionUsb = sc.nextLine();
                if (varConexionUsb.equals("Y")){
                    conexionUsb = true;
                } else{
                    conexionUsb = false;
                }
                break;
                
            } catch (Exception e) {
                System.out.println("Favor de ingresar datos validos");
                sc.nextLine();
            }
        }
        
        Mouse m1 = new Mouse(dpi, anchura, altura, botones, rueda, tipoLector, conexionBlue, conexionUsb);
        boolean cond = true;

        while (cond) {
            System.out.println("Selecciona una opcion");
            System.out.println("1. Mover mouse");
            System.out.println("2. Informacion del mouse");
            System.out.println("3. Cerrar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la cantidad en X que se movera el mouse:");
                    moverseX = sc.nextInt();
                    System.out.println("Ingresa la cantidad en Y que se movera el mouse:");
                    moverseY = sc.nextInt();
                    m1.Mover(moverseX, moverseY);
                    break;
            
                case 2:
                    System.out.println(m1);
                    break;

                case 3:
                    System.out.println("Cerrando...");
                    cond = false;
                    break;
            }
        }

    }

}
