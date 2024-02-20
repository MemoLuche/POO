package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class VentanaPrincipal extends JFrame{
    
    /* 
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
    */
    
    public VentanaPrincipal() {

        setTitle("Hello World!");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crea un panel p1
        JPanel p1 = new JPanel();
        add(p1); //Agrega el panel p1 a mi ventana
        //Especificar el panel del layout
        p1.setLayout(new FlowLayout());
        //Agregamos botones
        JButton btn1 = new JButton("Click!");
        btn1.setBackground(getForeground());
        p1.add(btn1);
        setVisible(true);
        
    }

}
