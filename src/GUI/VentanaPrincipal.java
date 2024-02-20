package GUI;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
    
    public VentanaPrincipal() {

        setTitle("GUI 37");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public VentanaPrincipal(int x, int y) {

        setTitle("GUI 37");
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    
    public VentanaPrincipal(int x, int y, String titulo) {

        setTitle(titulo);
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
