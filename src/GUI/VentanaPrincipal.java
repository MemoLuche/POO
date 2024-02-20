package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame{
    
    /* 
    public VentanaPrincipal() {
        
        setTitle("GUI 37");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    */
    
    public VentanaPrincipal(int x, int y) {
        
        setTitle("GUI 37");
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //Evitar que modifiquen el tamaño de la ventana
        // Crea un panel p1
        JPanel p1 = new JPanel();
        add(p1); //Agrega el panel p1 a mi ventana
        //Especificar el panel del layout
        p1.setLayout(null);
        JButton btn2 = new JButton("Cambiar de boton");
        //Funcion del boton
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                cambiarColorBoton(btn2);
            }
        });
        btn2.setBounds(((x*1/2)-40), ((y*1/2)-80), 80, 40); //Coordenadas y tamaño del boton
        p1.add(btn2); //Agregar el boton al layout
        setVisible(true); //Permitir visualizar los cambios DEJAR AL FINAL DEL CODIGO

    }
    
    public VentanaPrincipal() {

        setTitle("Hello World!");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crea un panel p1
        JPanel p1 = new JPanel();
        add(p1); //Agrega el panel p1 a mi ventana
        //Especificar el panel del layout
        p1.setLayout(new FlowLayout());
        //Label
        JLabel etiqueta = new JLabel("Oprime el botom!");
        p1.add(etiqueta);
        //Input
        JTextField inputT = new JTextField(10);
        p1.add(inputT);
        //Agregamos botones
        JButton btn1 = new JButton("Click!");
        btn1.setBackground(getForeground());
        p1.add(btn1);
        setVisible(true);
        
    }

    public void cambiarColorBoton (JButton boton){

        Color nuevoColor = JColorChooser.showDialog(this, "Selecciona un color", boton.getBackground());
        if(nuevoColor != null){
            boton.setBackground(nuevoColor);
        }
    }

}
