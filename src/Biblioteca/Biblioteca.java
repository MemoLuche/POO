package Biblioteca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Libro> listaLibros;

    public void cargarLibrosDesdeArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                int isbn = Integer.parseInt(datos[3].trim());
                int anioPublicacion = Integer.parseInt(datos[4].trim());
                int numPaginas = Integer.parseInt(datos[5].trim());
                double precio = Double.parseDouble(datos[6].trim());
                int ejemplares = Integer.parseInt(datos[7].trim());

                Libro libro = new Libro(isbn, anioPublicacion, numPaginas, ejemplares, datos[0], datos[1], datos[2], precio);
                listaLibros.add(libro);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de libros no encontrado.");
        }
    }

    public void guardarLibrosEnArchivo(String nombreArchivo) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);
            escritor.write(this.toString());
            escritor.close();
            System.out.println("Información de libros guardada en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar la información de libros en el archivo.");
        }
    }

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void quitarLibro(Libro libro) {
        listaLibros.remove(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }

    public void mostrarLibrosPorGenero(String genero) {
        for (Libro libro : listaLibros) {
            if (libro.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(libro);
            }
        }
    }

    public Libro encontrarLibroPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }

    public Libro encontrarLibroPorNombre(String nombre) {
        for (Libro libro : listaLibros) {
            if (libro.getNombre().equalsIgnoreCase(nombre)) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }

    public void prestarLibro(int id) {
        Libro libro = encontrarLibroPorId(id);
        if (libro != null) {
            if (libro.getNumeroEjemplares() > 0) {
                libro.setNumeroEjemplares(libro.getNumeroEjemplares() - 1);
                System.out.println("Libro prestado: " + libro.getNombre());
            } else {
                System.out.println("Imposible prestar, libro agotado");
            }
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    @Override
    public String toString() {
        StringBuilder contenido = new StringBuilder();
        for (Libro libro : listaLibros) {
            contenido.append(libro).append("\n");
        }
        return contenido.toString();
    }
}
