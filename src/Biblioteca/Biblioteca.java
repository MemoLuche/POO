package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public void AgregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void MostraLibros() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }

    public void MostraLibrosPorGenero(String genero) {
        for (Libro libro : listaLibros) {
            if (libro.getGenero().equals(genero))
                System.out.println(libro);
        }
    }

    public Libro EncontrarLibroId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn() == id) {
                return libro;
            }
        }
        return new Libro();
    }

    public Libro EncontrarLibroNombre(String nombre) {
        for (Libro libro : listaLibros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }
        return new Libro();
    }

    public void PrestarLibro(int id) {
        Libro libroAux = this.EncontrarLibroId(id);
        if (!libroAux.getNombre().equals("Nulo")) {
            if (libroAux.getNumEjemplares() - 1 >= 0) {
                libroAux.setNumEjemplares(libroAux.getNumEjemplares() - 1);
            } else {
                System.out.println("Imposible prestar, libro agotado");
            }
        } else {
            System.out.println("Imposible prestar, libro inexistente");
        }
    }

    @Override
    public String toString() {
        String contenido = "";
        for (Libro libro : listaLibros) {
            contenido += libro.getNombre() + ',' + libro.getAutor() + ',' + libro.getGenero() + ',' +
                         libro.getNumPag() + ',' + libro.getAnPub() + ',' + libro.getPrecio() + ',' +
                         libro.getNumEjemplares() + '\n';
        }
        contenido = contenido.trim();
        return contenido;
    }
}
