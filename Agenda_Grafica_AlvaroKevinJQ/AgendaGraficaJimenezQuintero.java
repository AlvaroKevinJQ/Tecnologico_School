import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.LinkedList;
import javax.sound.midi.SysexMessage;
import javax.swing.*;
import javax.swing.table.*;


public class AgendaGraficaJimenezQuintero extends JFrame{
        JPanel panel, panelContactos, panelLogin, panelA, panelEliminar;  
        JLabel etiqueta, etiqueta1, etiqueta3, etiqueta2, etiqueta4, i1, i2, i3, i4, em1, ac1, ac2, ac3, ac4, ac5, ac6, ac7, mn1, mc1, ma1, mcum1, mtel1;  
        JLabel mn3, mc3, ma3, mcum3, mtel3, mn4, mc4, ma4, mcum4, mtel4,  mn2, mc2, ma2, mcum2, mtel2,  mn5, mc5, ma5, mcum5, mtel5;
        JTextField campo1, campoNombre, campoCorreo, campoTel, campoArea, campoCumpleaños;
        JPasswordField campo2;
        String cam1, cam2;
        PersonaA[] arreglo = new PersonaA[5];//Creamos el arreglo de personas
        PersonaA persona1 = new PersonaA();
        PersonaA persona2 = new PersonaA();
        PersonaA persona3 = new PersonaA();
        PersonaA persona4 = new PersonaA();
        PersonaA persona5 = new PersonaA();


        public AgendaGraficaJimenezQuintero (){
            this.setSize(700,700); //Le damos un tamaño a la ventana
            setTitle("Agenda: Alvaro Kevin");//Le damos un titulo
            //setLocation(200,200);
            //setBounds(100, 200, 500, 500); //Le damos tamaño y ubicación a la ventana
            setLocationRelativeTo(null); //La ponemos en el centro desde que se abre
            iniciarC();    //Método que inicia los componentes
            setDefaultCloseOperation(EXIT_ON_CLOSE);//Finaliza el programa cuando cierras la ventana
            arreglo[0] = persona1;
            arreglo[1] = persona2;
            arreglo[2] = persona3;
            arreglo[3] = persona4;
            arreglo[4] = persona5;

            for(int x = 0; x < 5; x++){
                        arreglo[x].setArea(null);
                        arreglo[x].setNombre(null);
                        arreglo[x].setTelefono(null);
                        arreglo[x].setfc(null);
                        arreglo[x].setCorreo(null);
            }

        }

        private void etiquetas(){
                //Etiqueta de Bienvenida a la Agenda
                etiqueta = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                etiqueta.setOpaque(true);
                etiqueta.setText("Bienvenido a la Agenda AK");
                etiqueta.setFont(new Font("arial",Font.BOLD,25));
                etiqueta.setBounds(150, 130, 350, 100);
                etiqueta.setForeground(Color.blue);
                etiqueta.setBackground(Color.white);
                panel.add(etiqueta);


                //Etiqueta de Login de correo
                etiqueta1 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                etiqueta1.setOpaque(true);
                etiqueta1.setText("Ingrese su correo: ");
                etiqueta1.setBounds(70, 300, 150, 20);
                etiqueta1.setForeground(Color.black);
                //etiqueta.setBackground(Color.white);
                panel.add(etiqueta1);


                //Etiqueta de Login de contraseña
                etiqueta2 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                etiqueta2.setOpaque(true);
                etiqueta2.setText("Ingrese su contraseña: ");
                etiqueta2.setBounds(55, 348, 150, 20);
                etiqueta2.setForeground(Color.black);
                //etiqueta.setBackground(Color.white);
                panel.add(etiqueta2);


                //Etiqueta para nombre
                etiqueta1 = new JLabel("",SwingConstants.CENTER);
                etiqueta1.setText("Alvaro Kevin Jiménez Quintero");
                etiqueta1.setBounds(10, 600, 200, 20);
                panel.add(etiqueta1);
                etiqueta1.setForeground(Color.black);


                //Etiqueta para la fecha
                Date fecha = new Date(); 
                etiqueta1 = new JLabel("",SwingConstants.CENTER);
                etiqueta1.setText(fecha.toString());
                etiqueta1.setBounds(480, 600, 200, 20);
                panel.add(etiqueta1);
                etiqueta1.setForeground(Color.black);
        }

        private void iniciarC(){ //Método que inicializa los componentes
                panel = new JPanel();
                panel.setLayout(null);
                this.getContentPane().add(panel);
                etiquetas();
                ponerbotones(); //Creo que su nombre lo dice
                cajas();// Método para las cajas de texto
                
        }

        private void ponerbotones(){
                //Boton de Entrar
                JButton boton1 = new JButton("Entrar");
                boton1.setBounds(230, 440, 200, 20);
                panel.add(boton1);

                //EVENTOS

                //Evento de Entrar
                ActionListener wea = new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                                if(comprobarEntrar()){
                                        panel.setVisible(false);
                                        login();
                                }
                                
                                //aqui lo que pasa
                        }
                };
                boton1.addActionListener(wea);

                //Botón de Salir
               // JPasswordField();
        } 

        private void cajas(){ //Metodo que pone los campos de texto
            //Campo 1
            campo1 = new JTextField();
            campo1.setBounds(200, 302, 215, 20);
            panel.add(campo1);


            //Campo 2
            campo2 = new JPasswordField();
            campo2.setBounds(200, 350, 215, 20);
            panel.add(campo2);                    
        }

        public boolean comprobarEntrar(){ //Método que comprueba los datos de Login

                cam1 = campo1.getText();
                cam2 = String.valueOf(campo2.getPassword());
                try{
                                if(cam1.equals("arelip@itcg.edu.mx")){
                                                if(cam2.equals("tienes100")){
                                                        JOptionPane.showMessageDialog(null,"Esta agenda tiene capacidad para 5 contactos");
                                                        return true;
                                                }else{
                                                        JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                                                        return false;
                                                }
                                }else{
                                                JOptionPane.showMessageDialog(null,"Correo incorrecto");
                                                return false;
                                }
                }catch(Exception e){
                                return false;
            }
        }

        /*
                Tenemos una variedad de paneles para mostrar en ventana
                1.- panel - Es el panel principal para ingresar correo y contraseña, es donde se abre la ventana al inciar el programa
                2.- panelLogin - Es el panel donde una vez ingresado el correo y contraseña entra al menu
                3.- panelContactos - Es el panel donde se muestran los contactos guardados
                4.- panelMod - Es el panel para modificar algun contacto
                5.- panelEliminar - Es el panel para eliminar un contacto
                6.- panelA - es el panel que sirve para añadir contactos
        */
       
        

        //Panel del Login
        public void login(){ //Método que inicializa los componentes una vez hecho el login
                        panelLogin = new JPanel();
                        panelLogin.setLayout(null);
                        this.getContentPane().add(panelLogin);
                        menu();
        }


        //METODOS PARA PANEL DE MENU
        public void menu(){
                        //Etiqueta de Bienvenida al menú
                        em1 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        em1.setOpaque(true);
                        em1.setText("Bienvenido al Menu");
                        em1.setFont(new Font("arial",Font.BOLD,25));
                        em1.setBounds(150, 50, 350, 100);
                        em1.setForeground(Color.blue);
                        em1.setBackground(Color.white);
                        panelLogin.add(em1);


                        //BOTONES del menu
                        JButton bm1 = new JButton("Contactos"); //Boton para ver contactos
                        bm1.setBounds(100, 300, 200, 20);
                        panelLogin.add(bm1);

                        JButton bm2 = new JButton("Añadir contacto"); //Boton para añadir contactos
                        bm2.setBounds(210, 350, 200, 20);
                        panelLogin.add(bm2);

                        JButton bm3 = new JButton("Eliminar contacto"); //Booton para modificar algun contacto
                        bm3.setBounds(320, 400, 200, 20);
                        panelLogin.add(bm3);

                        JButton bm4 = new JButton("Salir"); //Booton para eliminar  algun contacto
                        bm4.setBounds(430, 450, 200, 20);
                        panelLogin.add(bm4);


                        //EVENTOS
                        ActionListener contactos = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                        if(arreglo[0].getNombre() == null){
                                                        JOptionPane.showMessageDialog(null,"La agenda está vacía");
                                        }else{
                                                        
                                                        verContactos();
                                        }
                                }
                        };
                        bm1.addActionListener(contactos);


                        ActionListener añadire = new ActionListener(){ //Evento para añadir contactos
                                public void actionPerformed(ActionEvent ae){
                                        System.out.println("presionaste el boton");
                                        if(arreglo[4].getNombre() != null){
                                                        JOptionPane.showMessageDialog(null,"La agenda está llena");
                                        }else{
                                                        
                                                        añadir();
                                        }
                                }
                        };
                        bm2.addActionListener(añadire);



                        ActionListener elimi = new ActionListener(){ //Evento para añadir contactos
                                public void actionPerformed(ActionEvent ae){
                                        System.out.println("presionaste el boton");
                                        eliminar();
                                }
                        };
                        bm3.addActionListener(elimi);


                        ActionListener volver = new ActionListener(){ //Evento para añadir contactos
                                public void actionPerformed(ActionEvent ae){
                                                panelLogin.setVisible(false);
                                                panel.setVisible(true);
                                                                                     
                                }
                        };
                        bm4.addActionListener(volver);
        }


        //Panel de contactos
        public void verContactos(){ //Método que instancia otro panel para ver contactos
                        System.out.println("Entre al metodo: verContactos");
                        panelContactos = new JPanel();
                        panelContactos.setLayout(null);
                        panelLogin.setVisible(false);
                        panelContactos.setVisible(true);
                        this.getContentPane().add(panelContactos);
                        for(int x = 0; x < 5; x++){        
                                        System.out.println(arreglo[x].getNombre());
                                        System.out.println(arreglo[x].getCorreo());
                                        System.out.println(arreglo[x].getArea());
                                        System.out.println(arreglo[x].getCumple());
                                        System.out.println(arreglo[x].getTelefono());    
                        }
                        MostrarContactos();
                        
        }

        public void MostrarContactos(){ //Metodo que muestra los contactos en el panelContactos
                        //ETIQUETAS DEL PRIMER CONTACTO
                        mn1 = new JLabel("",SwingConstants.CENTER);
                        mn1.setOpaque(true);
                        mn1.setText("Nombre: "+ arreglo[0].getNombre());
                        mn1.setBounds(70, 50, 250, 20);
                        mn1.setForeground(Color.black);
                        panelContactos.add(mn1);

                        mc1 = new JLabel("",SwingConstants.CENTER);
                        mc1.setOpaque(true);
                        mc1.setText("Correo: "+ arreglo[0].getCorreo());
                        mc1.setBounds(70, 80, 250, 20);
                        mc1.setForeground(Color.black);
                        panelContactos.add(mc1);

                        ma1 = new JLabel("",SwingConstants.CENTER);
                        ma1.setOpaque(true);
                        ma1.setText("Area: "+ arreglo[0].getArea());
                        ma1.setBounds(70, 110, 220, 20);
                        ma1.setForeground(Color.black);
                        panelContactos.add(ma1);

                        mcum1 = new JLabel("",SwingConstants.CENTER);
                        mcum1.setOpaque(true);
                        mcum1.setText("Cumpleaños: "+ arreglo[0].getCumple());
                        mcum1.setBounds(70, 140, 150, 20);
                        mcum1.setForeground(Color.black);
                        panelContactos.add(mcum1);

                        mtel1 = new JLabel("",SwingConstants.CENTER);
                        mtel1.setOpaque(true);
                        mtel1.setText("Teléfono: "+ arreglo[0].getTelefono());
                        mtel1.setBounds(70, 170, 250, 20);
                        mtel1.setForeground(Color.black);
                        panelContactos.add(mtel1);
                        
                        

                        //ETIQUETAS DEL SEGUNDO CONTACTO
                        mn2 = new JLabel("",SwingConstants.CENTER);
                        mn2.setOpaque(true);
                        mn2.setText("Nombre: "+ arreglo[1].getNombre());
                        mn2.setBounds(70, 250, 250, 20);
                        mn2.setForeground(Color.black);
                        panelContactos.add(mn2);

                        mc2 = new JLabel("",SwingConstants.CENTER);
                        mc2.setOpaque(true);
                        mc2.setText("Correo: "+ arreglo[1].getCorreo());
                        mc2.setBounds(70, 280, 250, 20);
                        mc2.setForeground(Color.black);
                        panelContactos.add(mc2);

                        ma2 = new JLabel("",SwingConstants.CENTER);
                        ma2.setOpaque(true);
                        ma2.setText("Area: "+ arreglo[1].getArea());
                        ma2.setBounds(70, 310, 220, 20);
                        ma2.setForeground(Color.black);
                        panelContactos.add(ma2);

                        mcum2 = new JLabel("",SwingConstants.CENTER);
                        mcum2.setOpaque(true);
                        mcum2.setText("Cumpleaños: "+ arreglo[1].getCumple());
                        mcum2.setBounds(70, 340, 150, 20);
                        mcum2.setForeground(Color.black);
                        panelContactos.add(mcum2);

                        mtel2 = new JLabel("",SwingConstants.CENTER);
                        mtel2.setOpaque(true);
                        mtel2.setText("Teléfono: "+ arreglo[1].getTelefono());
                        mtel2.setBounds(70, 370, 250, 20);
                        mtel2.setForeground(Color.black);
                        panelContactos.add(mtel2);

                        

                        //ETIQUETAS DEL TERCER CONTACTO
                        mn3 = new JLabel("",SwingConstants.CENTER);
                        mn3.setOpaque(true);
                        mn3.setText("Nombre: "+ arreglo[2].getNombre());
                        mn3.setBounds(330, 50, 250, 20);
                        mn3.setForeground(Color.black);
                        panelContactos.add(mn3);

                        mc3 = new JLabel("",SwingConstants.CENTER);
                        mc3.setOpaque(true);
                        mc3.setText("Correo: "+ arreglo[2].getCorreo());
                        mc3.setBounds(330, 80, 250, 20);
                        mc3.setForeground(Color.black);
                        panelContactos.add(mc3);

                        ma3 = new JLabel("",SwingConstants.CENTER);
                        ma3.setOpaque(true);
                        ma3.setText("Area: "+ arreglo[2].getArea());
                        ma3.setBounds(330, 110, 220, 20);
                        ma3.setForeground(Color.black);
                        panelContactos.add(ma3);

                        mcum3 = new JLabel("",SwingConstants.CENTER);
                        mcum3.setOpaque(true);
                        mcum3.setText("Cumpleaños: "+ arreglo[2].getCumple());
                        mcum3.setBounds(330, 140, 150, 20);
                        mcum3.setForeground(Color.black);
                        panelContactos.add(mcum3);

                        mtel3 = new JLabel("",SwingConstants.CENTER);
                        mtel3.setOpaque(true);
                        mtel3.setText("Teléfono: "+ arreglo[2].getTelefono());
                        mtel3.setBounds(330, 170, 250, 20);
                        mtel3.setForeground(Color.black);
                        panelContactos.add(mtel3);


                        //ETIQUETAS DEL CUARTO CONTACTO
                        mn4 = new JLabel("",SwingConstants.CENTER);
                        mn4.setOpaque(true);
                        mn4.setText("Nombre: "+ arreglo[3].getNombre());
                        mn4.setBounds(330, 250, 250, 20);
                        mn4.setForeground(Color.black);
                        panelContactos.add(mn4);

                        mc4 = new JLabel("",SwingConstants.CENTER);
                        mc4.setOpaque(true);
                        mc4.setText("Correo: "+ arreglo[2].getCorreo());
                        mc4.setBounds(330, 280, 250, 20);
                        mc4.setForeground(Color.black);
                        panelContactos.add(mc4);

                        ma4 = new JLabel("",SwingConstants.CENTER);
                        ma4.setOpaque(true);
                        ma4.setText("Area: "+ arreglo[3].getArea());
                        ma4.setBounds(330, 310, 220, 20);
                        ma4.setForeground(Color.black);
                        panelContactos.add(ma4);

                        mcum4 = new JLabel("",SwingConstants.CENTER);
                        mcum4.setOpaque(true);
                        mcum4.setText("Cumpleaños: "+ arreglo[3].getCumple());
                        mcum4.setBounds(330, 340, 150, 20);
                        mcum4.setForeground(Color.black);
                        panelContactos.add(mcum4);

                        mtel4 = new JLabel("",SwingConstants.CENTER);
                        mtel4.setOpaque(true);
                        mtel4.setText("Teléfono: "+ arreglo[3].getTelefono());
                        mtel4.setBounds(330, 370, 250, 20);
                        mtel4.setForeground(Color.black);
                        panelContactos.add(mtel4);



                        //ETIQUETAS DEL QUINTO CONTACTO
                        mn5 = new JLabel("",SwingConstants.CENTER);
                        mn5.setOpaque(true);
                        mn5.setText("Nombre: "+ arreglo[4].getNombre());
                        mn5.setBounds(70, 450, 250, 20);
                        mn5.setForeground(Color.black);
                        panelContactos.add(mn5);

                        mc5 = new JLabel("",SwingConstants.CENTER);
                        mc5.setOpaque(true);
                        mc5.setText("Correo: "+ arreglo[4].getCorreo());
                        mc5.setBounds(70, 480, 250, 20);
                        mc5.setForeground(Color.black);
                        panelContactos.add(mc5);

                        ma5 = new JLabel("",SwingConstants.CENTER);
                        ma5.setOpaque(true);
                        ma5.setText("Area: "+ arreglo[4].getArea());
                        ma5.setBounds(70, 510, 220, 20);
                        ma5.setForeground(Color.black);
                        panelContactos.add(ma5);

                        mcum5 = new JLabel("",SwingConstants.CENTER);
                        mcum5.setOpaque(true);
                        mcum5.setText("Cumpleaños: "+ arreglo[4].getCumple());
                        mcum5.setBounds(70, 540, 150, 20);
                        mcum5.setForeground(Color.black);
                        panelContactos.add(mcum5);

                        mtel5 = new JLabel("",SwingConstants.CENTER);
                        mtel5.setOpaque(true);
                        mtel5.setText("Teléfono: "+ arreglo[4].getTelefono());
                        mtel5.setBounds(70, 570, 250, 20);
                        mtel5.setForeground(Color.black);
                        panelContactos.add(mtel5);




                        JButton back = new JButton("Volver"); //volver
                        back.setBounds(400, 570, 200, 20);
                        panelContactos.add(back);


                        //EVENTOS
                        ActionListener el6 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                panelContactos.setVisible(false);
                                                panelLogin.setVisible(true);
                                }
                        };
                        back.addActionListener(el6);
        } 
        
        
        //Añadir contacto
        public void añadir(){
                        System.out.println("Entre al metodo: añadir");
                        panelA = new JPanel();
                        panelA.setLayout(null);
                        panelLogin.setVisible(false);
                        panelA.setVisible(true);
                        this.getContentPane().add(panelA);
                        mpanela();
        }


        //Panel para agregar:
        public void mpanela(){
 
                        ac1 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        ac1.setOpaque(true);
                        ac1.setText("Agregar Contactos");
                        ac1.setFont(new Font("arial",Font.BOLD,25));
                        ac1.setBounds(150, 50, 300, 50);
                        ac1.setForeground(Color.blue);
                        ac1.setBackground(Color.white);
                        panelA.add(ac1);


                        //Etiqueta para el registro del nombre
                        ac2 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        ac2.setOpaque(true);
                        ac2.setText("Nombre: ");
                        ac2.setBounds(70, 200, 100, 20);
                        ac2.setForeground(Color.black);
                        //etiqueta.setBackground(Color.white);
                        panelA.add(ac2);

                        //Campo para nombre
                        campoNombre = new JTextField();
                        campoNombre.setBounds(150, 200, 300, 20);
                        panelA.add(campoNombre);



                        //Etiqueta para el registro del correo
                        ac3 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        ac3.setOpaque(true);
                        ac3.setText("Correo: ");
                        ac3.setBounds(70, 248, 100, 20);
                        ac3.setForeground(Color.black);
                        //etiqueta.setBackground(Color.white);
                        panelA.add(ac3);

                        //Campo para correo
                        campoCorreo = new JTextField();
                        campoCorreo.setBounds(150, 248, 300, 20);
                        panelA.add(campoCorreo);



                        //Etiqueta para el registro del telefono
                        ac4 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        ac4.setOpaque(true);
                        ac4.setText("Teléfono: ");
                        ac4.setBounds(70, 296, 100, 20);
                        ac4.setForeground(Color.black);
                        //etiqueta.setBackground(Color.white);
                        panelA.add(ac4);

                        //Campo para Teléfono
                        campoTel = new JTextField();
                        campoTel.setBounds(150, 296, 300, 20);
                        panelA.add(campoTel);



                        //Etiqueta para el registro del Area
                        ac5 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        ac5.setOpaque(true);
                        ac5.setText("Area: ");
                        ac5.setBounds(70, 344, 100, 20);
                        ac5.setForeground(Color.black);
                        //etiqueta.setBackground(Color.white);
                        panelA.add(ac5);

                        //Campo para area
                        campoArea = new JTextField();
                        campoArea.setBounds(150, 344, 300, 20);
                        panelA.add(campoArea);




                        //Etiqueta para el registro del cumpleaños
                        ac6 = new JLabel("",SwingConstants.CENTER);//Instanciamos la etiqueta
                        ac6.setOpaque(true);
                        ac6.setText("Fecha de Cumpleaños: ");
                        ac6.setBounds(70, 392, 150, 20);
                        ac6.setForeground(Color.black);
                        //etiqueta.setBackground(Color.white);
                        panelA.add(ac6);

                        //Campo para cumpleaños
                        campoCumpleaños = new JTextField();
                        campoCumpleaños.setBounds(225, 392, 100, 20);
                        panelA.add(campoCumpleaños);



                        //BOTONES para agregar
                        JButton ba1 = new JButton("Agregar"); //Boton para ver contactos
                        ba1.setBounds(100, 600, 200, 20);
                        panelA.add(ba1);

                        ActionListener agregar = new ActionListener(){ //Evento para añadir contactos
                                public void actionPerformed(ActionEvent ae){
                                       
                                        if((campoNombre.getText() != null)&&(campoCorreo.getText() != null) && (campoArea.getText() != null) && (campoCumpleaños != null) && (campoTel.getText() != null)){
                                                for(int x = 0; x < 5; x++){
                                                        if(arreglo[x].getNombre() == null){
                                                                arreglo[x].setNombre(campoNombre.getText());
                                                                arreglo[x].setTelefono(campoTel.getText());
                                                                arreglo[x].setArea(campoArea.getText());
                                                                arreglo[x].setCorreo(campoCorreo.getText());
                                                                arreglo[x].setfc(campoCumpleaños.getText());
                                                                break;
                                                        }
                                                }
                                        }else{
                                                        JOptionPane.showMessageDialog(null,"Tiene que llenar todos los campos");
                                        }
                                }
                        };
                        ba1.addActionListener(agregar);


                        //BOTONES para agregar
                        JButton b21 = new JButton("Volver"); //Boton para ver contactos
                        b21.setBounds(300, 600, 200, 20);
                        panelA.add(b21);

                        ActionListener volver1 = new ActionListener(){ //Evento para añadir contactos
                                public void actionPerformed(ActionEvent ae){
                                        panelA.setVisible(false);
                                        panelLogin.setVisible(true);
                                }
                        };
                        b21.addActionListener(volver1);
        }
        
        
        //Panel Eliminar
        public void eliminar(){ //Método para eliminar un contacto
                panelEliminar = new JPanel();
                panelEliminar.setLayout(null);
                this.getContentPane().add(panelEliminar);
                panelLogin.setVisible(false);
                panelEliminar.setVisible(true);
                botoEli();
        }

        public void botoEli(){

                JButton eliminar1 = new JButton("Eliminar a "+arreglo[0].getNombre()); //Booton para eliminar  algun contacto
                        eliminar1.setBounds(70, 200, 200, 20);
                        panelEliminar.add(eliminar1);


                        //EVENTOS
                        ActionListener el1 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                arreglo[0].setNombre(null);
                                                arreglo[0].setArea(null);
                                                arreglo[0].setfc(null);
                                                arreglo[0].setCorreo(null);
                                                arreglo[0].setTelefono(null);
                                }
                        };
                        eliminar1.addActionListener(el1);




                        JButton eliminar2 = new JButton("Eliminar a "+arreglo[1].getNombre()); //Booton para eliminar  algun contacto
                        eliminar2.setBounds(70, 250, 200, 20);
                        panelEliminar.add(eliminar2);


                        //EVENTOS
                        ActionListener el2 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                arreglo[1].setNombre(null);
                                                arreglo[1].setArea(null);
                                                arreglo[1].setfc(null);
                                                arreglo[1].setCorreo(null);
                                                arreglo[1].setTelefono(null);
                                }
                        };
                        eliminar2.addActionListener(el2);


                        JButton eliminar3 = new JButton("Eliminar a "+arreglo[2].getNombre()); //Booton para eliminar  algun contacto
                        eliminar3.setBounds(70, 300, 200, 20);
                        panelEliminar.add(eliminar3);


                        //EVENTOS
                        ActionListener el3 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                arreglo[2].setNombre(null);
                                                arreglo[2].setArea(null);
                                                arreglo[2].setfc(null);
                                                arreglo[2].setCorreo(null);
                                                arreglo[2].setTelefono(null);
                                }
                        };
                        eliminar3.addActionListener(el3);



                        JButton eliminar4 = new JButton("Eliminar a "+arreglo[3].getNombre()); //Booton para eliminar  algun contacto
                        eliminar4.setBounds(70, 350, 200, 20);
                        panelEliminar.add(eliminar4);


                        //EVENTOS
                        ActionListener el4 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                arreglo[3].setNombre(null);
                                                arreglo[3].setArea(null);
                                                arreglo[3].setfc(null);
                                                arreglo[3].setCorreo(null);
                                                arreglo[3].setTelefono(null);
                                }
                        };
                        eliminar4.addActionListener(el4);


                        JButton eliminar5 = new JButton("Eliminar a "+arreglo[4].getNombre()); //Booton para eliminar  algun contacto
                        eliminar5.setBounds(70, 400, 200, 20);
                        panelEliminar.add(eliminar5);


                        //EVENTOS
                        ActionListener el5 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                arreglo[4].setNombre(null);
                                                arreglo[4].setArea(null);
                                                arreglo[4].setfc(null);
                                                arreglo[4].setCorreo(null);
                                                arreglo[4].setTelefono(null);
                                }
                        };
                        eliminar5.addActionListener(el5);



                        
                        JButton eliminar6 = new JButton("Volver"); //volver
                        eliminar6.setBounds(200, 450, 200, 20);
                        panelEliminar.add(eliminar6);


                        //EVENTOS
                        ActionListener el6 = new ActionListener(){ //Evento para ver contactos
                                public void actionPerformed(ActionEvent ae){
                                                panelEliminar.setVisible(false);
                                                panelLogin.setVisible(true);
                                }
                        };
                        eliminar6.addActionListener(el6);
        }


}