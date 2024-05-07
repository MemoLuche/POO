package Biblioteca;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Referenciar las direcciones de los archivos desde la clase Configuracion
        String pathBiblioteca = "C:\\Users\\marid\\Desktop\\REPOR NUEVO\\POO\\src\\Biblioteca\\biblioteca3.txt"; // ruta del archivo
        String pathBDUsers = "C:\\Users\\marid\\Desktop\\REPOR NUEVO\\POO\\src\\Biblioteca\\BD_POO.txt"; // ruta del archivo

        // Crear objetos de Biblioteca y BDUsuarios
        Biblioteca biblioteca = new Biblioteca();
        BDUsuarios bdUsuarios = new BDUsuarios();

        // Cargar la información desde los archivos
        biblioteca.cargarLibrosDesdeArchivo(pathBiblioteca);
        bdUsuarios.cargarUsuariosDesdeArchivo(pathBDUsers);

        System.out.println(biblioteca);

        // Crear la ventana principal y mostrarla
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(biblioteca, bdUsuarios);
            ventanaPrincipal.setVisible(true);
        });
    }
}
