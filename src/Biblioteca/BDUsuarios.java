package Biblioteca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BDUsuarios {
    private ArrayList<Usuario> baseDatos;

    public void cargarUsuariosDesdeArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                String nombre = datos[0].replace("\"", "").trim();
                String direccion = datos[1].replace("\"", "").trim();
                int edad = Integer.parseInt(datos[2].trim());

                Usuario usuario = new Usuario(nombre, direccion, edad);
                baseDatos.add(usuario);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de usuarios no encontrado.");
        }
    }

    public void guardarUsuariosEnArchivo(String nombreArchivo) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);
            escritor.write(this.toString());
            escritor.close();
            System.out.println("Información de usuarios guardada en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar la información de usuarios en el archivo.");
        }
    }
    
    public BDUsuarios() {
        this.baseDatos = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        baseDatos.add(usuario);
    }

    public void quitarUsuario(Usuario usuario) {
        baseDatos.remove(usuario);
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : baseDatos) {
            System.out.println(usuario);
        }
    }

    public void mostrarUsuariosConDeuda() {
        for (Usuario usuario : baseDatos) {
            if (usuario.getDeuda() > 0) {
                System.out.println(usuario);
            }
        }
    }

    public Usuario encontrarUsuarioPorId(int id) {
        for (Usuario usuario : baseDatos) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario
    }

    public Usuario encontrarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : baseDatos) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario
    }

    public void actualizarUsuariosDespuesDePrestamo(Libro libro, Usuario usuario) {
        usuario.setLibrosPrestados(usuario.getLibrosPrestados() + 1);
        libro.setNumeroEjemplares(libro.getNumeroEjemplares() - 1);
    }

    @Override
    public String toString() {
        StringBuilder contenido = new StringBuilder();
        for (Usuario usuario : baseDatos) {
            contenido.append(usuario).append("\n");
        }
        return contenido.toString();
    }
}
