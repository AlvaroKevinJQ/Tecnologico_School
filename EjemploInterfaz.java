import javax.swing.*;
public class EjemploInterfaz extends JFrame{
    public EjemploInterfaz(){
        initComponents();
    }

    private void initComponents(){
        setSize(300, 200);
        setTitle("SUPER VENTANA CON TEXTO");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel etiqueta = new JLabel("Super etiqueta perrona");
        JButton boton = new JButton("I´m feeling really good");
        JTextField texto = new JTextField(20);

        JPanel panel = new JPanel(); //Crea un contenedor
        panel.add(etiqueta);
        panel.add(boton);
        panel.add(texto);


        setContentPane(panel);
        setVisible(true);
    }
}