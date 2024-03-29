    package Biblioteca;
    import java.io.*;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws IOException {

            // Inicio de la aplicación, inicialización de objetos
            String pathBiblioteca = "C:\\Users\\guill\\OneDrive\\Documentos\\PROGRAMACION\\GITHUB\\POO\\src\\Biblioteca\\biblioteca.txt"; // ruta del archivo
            String pathBDUsers = "C:\\Users\\guill\\OneDrive\\Documentos\\PROGRAMACION\\GITHUB\\POO\\src\\Biblioteca\\BD_POO.txt"; // ruta del archivo
            Biblioteca biblioteca = new Biblioteca();
            Libro libro = new Libro();
            BDUsuarios baseDatos = new BDUsuarios();
            Usuario usuario = new Usuario();
            CrearColeccion(pathBiblioteca, biblioteca, libro);
            CrearColeccion(pathBDUsers, baseDatos, usuario);
    
            // Utilizar la interfaz Gráfica
            VentanaLogin ventana = new VentanaLogin(300, 300, "login biblioteca");
            ventana.setVisible(true); // Mostrar la ventana
    
            // Guardar Cambios
            Guardar(pathBiblioteca, biblioteca);
            Guardar(pathBDUsers, baseDatos);
        }

        public static void Guardar(String path, Object obj) {
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)))) {
                writer.println(obj.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Documento actualizado");
        }

        public static void CrearColeccion(String path, Biblioteca biblioteca, Libro libro) {
            File doc = new File(path); // crear mi objeto archivo con la ruta
            try (Scanner lectura = new Scanner(doc)) {
                lectura.nextLine(); // Saltar la primera fila (encabezados)
                while (lectura.hasNextLine()) {
                    String contenido = lectura.nextLine();
                    String[] datosFila = contenido.split(",");
                    // Manejar correctamente las comillas dobles en los datos
                    for (int j = 0; j < datosFila.length; j++) {
                        datosFila[j] = datosFila[j].replaceAll("^\"|\"$", "").trim(); // Eliminar comillas dobles y espacios
                                                                                      // en blanco al inicio y al final
                    }
                    // Asegurarse de que la fila tenga la misma longitud que la matriz
                    if (datosFila.length == 7) { // La matriz bd tiene 7 columnas
                        // Aquí puedes crear y agregar el libro a la biblioteca
                        // Nota: La lógica para crear y agregar un libro a la biblioteca debería estar
                        // aquí
                    } else {
                        System.out.println("Error: Longitud incorrecta en la fila");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void CrearColeccion(String path, BDUsuarios BD, Usuario usuario) {
            File doc = new File(path); // crear mi objeto archivo con la ruta
            System.out.println(ConteoFilas(doc)); // imprimir filas totales del documento
            int filas = ConteoFilas(doc); // guardar dicho numero en una variable
            String[][] bd = new String[filas][3]; // matriz de datos (usuarios)
            ImprimirMatriz(bd); // Mostrar matriz vacía
            System.out.println("-----------------------");
            bd = LlenadoMatriz(bd, doc); // Rellenamos matriz con datos del txt
            ImprimirMatriz(bd); // Mostramos matriz llena
            System.out.println("-----------------------");
            System.out.println("Creando Objetos");
            for (int i = 0; i < filas; i++) {
                usuario = new Usuario(bd[i][0], bd[i][1], Integer.parseInt(bd[i][2]));
                BD.AgregarUser(usuario);
            }
        }

        public static void ImprimirMatriz(String[][] matriz) {
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.print(matriz[f][c] + " ");
                }
                System.out.println();
            }
        }

        public static int ConteoFilas(File doc) {
            Scanner lectura;
            int conteo = 0;
            try {
                lectura = new Scanner(doc);
                while (lectura.hasNext()) {
                    lectura.nextLine();
                    conteo++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return conteo;
        }

        public static String[][] LlenadoMatriz(String[][] bd, File doc) {
            Scanner lectura;
            try {
                lectura = new Scanner(doc);
                for (int i = 0; i < ConteoFilas(doc); i++) {
                    String contenido = lectura.nextLine();
                    String[] datosFila = contenido.split(",");
                    for (int j = 0; j < bd[0].length; j++) {
                        bd[i][j] = datosFila[j].trim().toLowerCase();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bd;
        }
    }
