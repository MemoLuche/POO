package Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JPanel panelInicioSesion;
    private JPanel panelMenuPrincipal;
    private Biblioteca biblioteca; // Agregado
    private BDUsuarios bdUsuarios;

    public VentanaPrincipal(Biblioteca biblioteca, BDUsuarios bdUsuarios) {
        this.biblioteca = biblioteca;
        this.bdUsuarios = bdUsuarios;
        setTitle("Biblioteca");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarPanelInicioSesion();
        inicializarPanelMenuPrincipal();

        getContentPane().add(panelInicioSesion);
    }

    private void inicializarPanelInicioSesion() {
        panelInicioSesion = new JPanel();
        panelInicioSesion.setLayout(new GridLayout(3, 2));

        JLabel usuarioEtiqueta = new JLabel("Usuario:");
        JTextField usuarioInput = new JTextField();

        JLabel pswEtiqueta = new JLabel("Contraseña:");
        JPasswordField pswInput = new JPasswordField();

        JButton btnIngresar = new JButton("Ingresar");

        panelInicioSesion.add(usuarioEtiqueta);
        panelInicioSesion.add(usuarioInput);
        panelInicioSesion.add(pswEtiqueta);
        panelInicioSesion.add(pswInput);
        panelInicioSesion.add(new JLabel()); // Espacio en blanco
        panelInicioSesion.add(btnIngresar);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioInput.getText();
                char[] password = pswInput.getPassword();
                if (validarCredenciales(usuario, password)) {
                    getContentPane().remove(panelInicioSesion);
                    getContentPane().add(panelMenuPrincipal);
                    revalidate();
                    repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean validarCredenciales(String usuario, char[] password) {
        String usuarioCorrecto = "admin";
        String passwordCorrecto = "admin";
        return usuario.equals(usuarioCorrecto) && new String(password).equals(passwordCorrecto);
    }

    private void inicializarPanelMenuPrincipal() {
        panelMenuPrincipal = new JPanel();
        panelMenuPrincipal.setLayout(new GridLayout(2, 1));

        JButton btnVisualizarBiblioteca = new JButton("Visualizar Biblioteca");
        JButton btnVisualizarPrestamos = new JButton("Visualizar Préstamos");

        panelMenuPrincipal.add(btnVisualizarBiblioteca);
        panelMenuPrincipal.add(btnVisualizarPrestamos);

        btnVisualizarBiblioteca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar información de la biblioteca
                JOptionPane.showMessageDialog(null, biblioteca.toString(), "Biblioteca", JOptionPane.PLAIN_MESSAGE);
            }
        });

        btnVisualizarPrestamos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar información de los préstamos
                JOptionPane.showMessageDialog(null, bdUsuarios.toString(), "Usuarios", JOptionPane.PLAIN_MESSAGE);
            }
        });

        getContentPane().add(panelMenuPrincipal);
    }
}
