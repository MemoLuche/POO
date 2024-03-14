package Biblioteca;
import java.awt.FlowLayout;
import javax.swing.*;

public class VentanaLogin extends JFrame {

    public VentanaLogin() {

    }

    public VentanaLogin(int x, int y, String titulo) {
        setTitle(titulo);
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        add(p1); // agregando el panel p1 a mi ventana
        // especificar el layout del panel
        // Label
        p1.setLayout(null);
        JLabel etiqueta = new JLabel("Ingresa tus credenciales");
        etiqueta.setBounds(x / 2 - 80, 0, 140, 60);
        p1.add(etiqueta);

        JLabel usuarioEtiqueta = new JLabel("Ingresa tu usuario");
        usuarioEtiqueta.setBounds(x / 2 - 60, 70, 140, 30);
        p1.add(usuarioEtiqueta);

        JTextField usuarioInput = new JTextField(1);
        usuarioInput.setBounds(x / 2 - 60, 100, 100, 20);
        p1.add(usuarioInput);

        JLabel pswEtiqueta = new JLabel("Ingresa tu contraseña");
        pswEtiqueta.setBounds(x / 2 - 60, 120, 140, 30);
        p1.add(pswEtiqueta);

        JPasswordField pswInput = new JPasswordField(1);
        pswInput.setBounds(x / 2 - 60, 160, 100, 20);
        p1.add(pswInput);

        JButton btnLogin = new JButton("Ingresar");
        btnLogin.setBounds(300 - (100) - 20, 200, 100, 20);

        p1.add(btnLogin);

        JButton btnRegistro = new JButton("Regístrate");
        btnRegistro.setBounds(x / 4 - 60, 200, 100, 20);
        p1.add(btnRegistro);

        JPanel panel2 = new JPanel();

        JLabel resultado = new JLabel("Login exitoso");
        resultado.setBounds(x / 2 - 60, 80, 140, 30);
        panel2.add(resultado);

        btnLogin.addActionListener(e -> {
            Login(usuarioInput.getText(), pswInput.getPassword(), panel2, p1);
        });

        setVisible(true);
    }

    public void Login(String usuario, char[] psw, JPanel nuevo, JPanel viejo) {
        String pswCorrecta = "class";
        if (usuario.equalsIgnoreCase("rafael")) {
            boolean banderaPsw = true;
            if (psw.length == pswCorrecta.length()) {
                for (int i = 0; i < psw.length; i++) {
                    if (!(psw[i] == pswCorrecta.charAt(i))) {
                        banderaPsw = false;
                        System.out.println(psw[i] + " " + pswCorrecta.charAt(i));
                        break;
                    }
                }
                if (banderaPsw) {
                    System.out.println("Exito");
                    CambioPantalla(nuevo, viejo);
                } else
                    System.out.println("Credenciales incorrectas");
            } else
                System.out.println("Credenciales incorrectas");
        } else
            System.out.println("Credenciales incorrectas");
    }

    public void CambioPantalla(JPanel nuevoPanel, JPanel viejoPanel) {
        this.getContentPane().remove(viejoPanel);
        this.getContentPane().add(nuevoPanel);
        this.revalidate();
        this.repaint();
    }
}
