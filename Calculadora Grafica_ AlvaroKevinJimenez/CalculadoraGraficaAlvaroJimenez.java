import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class CalculadoraGraficaAlvaroJimenez extends JFrame{
        JPanel panel;  JLabel etiqueta, etiqueta1, etiqueta3, etiqueta2, etiqueta4, i1, i2, i3, i4;
        JTextField campo1, campo2;
        Double cam1, cam2;
        public CalculadoraGraficaAlvaroJimenez(){
            this.setSize(500,700); //Le damos un tamaño a la ventana
            setTitle("Calculadora Grafica: El Pichula");//Le damos un titulo
            //setLocation(200,200);
            //setBounds(100, 200, 500, 500); //Le damos tamaño y ubicación a la ventana
            setLocationRelativeTo(null); //La ponemos en el centro desde que se abre

            iniciarC();    

            ponerbotones();
            cajas();

            setDefaultCloseOperation(EXIT_ON_CLOSE);//Finaliza el programa cuando cierras la ventana
            

        }

        private void etiquetas(){
                //Etiqueta para titulo
                etiqueta = new JLabel("",SwingConstants.CENTER);//INstanciamos la etiqueta
                etiqueta.setOpaque(true);
                etiqueta.setText("Bienvenido a la Calculadora Gráfica");
                etiqueta.setBounds(115, 10, 250, 20);
                etiqueta.setForeground(Color.black);
                etiqueta.setBackground(Color.yellow);
                panel.add(etiqueta);


                //Etiqueta para campo 1 
                etiqueta3 = new JLabel("",SwingConstants.CENTER);//INstanciamos la etiqueta
                etiqueta3.setOpaque(true);
                etiqueta3.setText("Campo 1:");
                etiqueta3.setBounds(100, 80, 70, 20);
                etiqueta3.setForeground(Color.white);
                etiqueta3.setBackground(Color.blue);
                panel.add(etiqueta3);


                //Etiqueta para campo 2 
                etiqueta2 = new JLabel("",SwingConstants.CENTER);//INstanciamos la etiqueta
                etiqueta2.setOpaque(true);
                etiqueta2.setText("Campo 2:");
                etiqueta2.setBounds(250, 80, 70, 20);
                etiqueta2.setForeground(Color.white);
                etiqueta2.setBackground(Color.blue);
                panel.add(etiqueta2);




                //Etiquetas para instrucciones
                i1 = new JLabel("",SwingConstants.CENTER);
                i1.setText("Instrucciones:");
                i1.setBounds(0, 435, 200, 20);
                panel.add(i1);
                i1.setForeground(Color.black);

                
                i2 = new JLabel("",SwingConstants.CENTER);
                i2.setText("Escriba los 2 valores con los que quiere trabajar en el campo 1 y 2 respectivamente");
                i2.setBounds(0, 465, 500, 20);
                panel.add(i2);
                i2.setForeground(Color.black);


                i3 = new JLabel("",SwingConstants.CENTER);
                i3.setText("Nota: La resta y división se le harán al campo 1 desde el campo 2");
                i3.setBounds(0, 520, 520, 20);
                panel.add(i3);
                i3.setForeground(Color.black);
                

                i4 = new JLabel("",SwingConstants.CENTER);
                i4.setText("después haga click en la operación que desea realizar");
                i4.setBounds(0, 480, 500, 20);
                panel.add(i4);
                i4.setForeground(Color.black);


                //Etiqueta para nombre
                etiqueta1 = new JLabel("",SwingConstants.CENTER);
                etiqueta1.setText("Alvaro Kevin Jiménez Quintero");
                etiqueta1.setBounds(10, 600, 200, 20);
                panel.add(etiqueta1);
                etiqueta1.setForeground(Color.black);

                

        }

        private void iniciarC(){ //Método que inicializa los componentes
                 panel = new JPanel();
                 panel.setLayout(null);
                this.getContentPane().add(panel);
                etiquetas();
        }

        private void ponerbotones(){
            //Boton de Suma
                JButton boton1 = new JButton("+");
                boton1.setBounds(150, 190, 60, 60);
                panel.add(boton1);
                ImageIcon suma = new ImageIcon("suma.jpg");
                boton1.setIcon(new ImageIcon(suma.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));


                //Boton de Resta
                JButton boton2 = new JButton("-");
                boton2.setBounds(250, 190, 60, 60);
                panel.add(boton2);
                ImageIcon resta = new ImageIcon("resta.png");
                boton2.setIcon(new ImageIcon(resta.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));


                //Boton de División
                JButton boton3 = new JButton("/");
                boton3.setBounds(250, 270, 60, 60);
                panel.add(boton3);
                ImageIcon divi = new ImageIcon("divi.png");
                boton3.setIcon(new ImageIcon(divi.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));


                //Boton de Multiplicación
                JButton boton4 = new JButton("x");
                boton4.setBounds(150, 270, 60, 60);
                panel.add(boton4);
                ImageIcon multi = new ImageIcon("multi.png");
                boton4.setIcon(new ImageIcon(multi.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));



                //Etiqueta para el resultado
                etiqueta4 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                etiqueta4.setOpaque(true);
                etiqueta4.setBounds(120, 140, 150, 20);
                etiqueta4.setForeground(Color.black);
                panel.add(etiqueta4);


                //EVENTOS
                //EVENTO SUMA
                ActionListener wea = new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                                if(comprobar()){
                                        cam1 = cam1 + cam2;
                                        etiqueta4.setText("El resultado es: "+cam1);
                                }
                        }
                };
                boton1.addActionListener(wea); 

                //EVENTO RESTA
                ActionListener wea1 = new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                            if(comprobar()){
                                    cam1 = cam1 - cam2;
                                    etiqueta4.setText("El resultado es: "+cam1);
                            }
                    }
                };
                boton2.addActionListener(wea1); 

                //Evento División
                ActionListener wea2 = new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                                if(comprobar()){
                                        cam1 = cam1 / cam2;
                                        etiqueta4.setText("El resultado es: "+cam1);
                                }
                        }
                };
                boton3.addActionListener(wea2);


                //Evento Multiplicación
                ActionListener wea3 = new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                            if(comprobar()){
                                    cam1 = cam1 * cam2;
                                    etiqueta4.setText("El resultado es: "+cam1);
                            }
                    }
                };
                boton4.addActionListener(wea3);


        } 


        private void cajas(){ //Metodo que pone los campos de texto
            //Campo 1
            campo1 = new JTextField();
            campo1.setBounds(100, 100, 100, 20);
            panel.add(campo1);


            //Campo 2
            campo2 = new JTextField();
            campo2.setBounds(250, 100, 100, 20);
            panel.add(campo2);
        }

        public boolean comprobar(){ //Método que comprueba que sean números y retorna un booleano
            try{
                    cam1 = Double.valueOf(campo1.getText());
                    cam2 = Double.valueOf(campo2.getText());
                    return true;
            }catch(Exception e){
                    return false;
            }
        }
}

 