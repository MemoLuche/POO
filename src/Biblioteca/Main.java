package Biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Principito", "Antoine", "fantasía", 32, 1943, 500.0, 3);
        Libro libro2 = new Libro("Cam de Rey", "Brandon S", "fantasía", 1216, 2010, 1100.0, 2);
        Libro libro3 = new Libro("Calculo I,II,III", "Stewart", "matematicas", 954, 2012, 1500.0, 5);

        biblioteca.AgregarLibro(libro1);
        biblioteca.AgregarLibro(libro2);
        biblioteca.AgregarLibro(libro3);

        System.out.println(biblioteca.EncontrarLibroId(30).toString());
        System.out.println(biblioteca.EncontrarLibroNombre("Game of thrones").toString());
        biblioteca.MostraLibrosPorGenero("fantasía");
    }
}
