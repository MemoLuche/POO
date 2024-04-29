package Password;

import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public void generarPassword() {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = random.nextInt(3); // 0: mayúscula, 1: minúscula, 2: número

            switch (tipoCaracter) {
                case 0:
                    password.append((char) (random.nextInt(26) + 'A'));
                    break;
                case 1:
                    password.append((char) (random.nextInt(26) + 'a'));
                    break;
                case 2:
                    password.append(random.nextInt(10));
                    break;
            }
        }

        contraseña = password.toString();
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}