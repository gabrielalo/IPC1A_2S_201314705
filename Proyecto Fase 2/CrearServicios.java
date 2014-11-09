//ya

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CrearServicios {

    //Atributos
	String nombrerest, plato1, plato2, plato3, espe1, espe2, entrete1, entrete2, entrete3;
    int c1, c2, c3, c4, c5, c6, c7, c8;
   
    public String getNombreRestaurante() {
        return nombrerest;
    }

    public void setNombreRestaurante(String nomres) {
        this.nombrerest = nomres;
    }


    public String getNomPlato1() {
        return plato1;
    }

    public void setNomPlato1(String p1) {
        this.plato1 = p1;
    }


    public String getNomPlato2() {
        return plato2;
    }

    public void setNomPlato2(String p2) {
        this.plato2 = p2;
    }


    public String getNomPlato3() {
        return plato3;
    }

    public void setNomPlato3(String p3) {
        this.plato3 = p3;
    }


    public String getNomEspe1() {
        return espe1;
    }

    public void setNomEspe1(String e1) {
        this.espe1 = e1;
    }


    public String getNomEspe2() {
        return espe2;
    }

    public void setNomEspe2(String e2) {
        this.espe2 = e2;
    }


    public String getNomEntrete1() {
        return entrete1;
    }

    public void setNomEntrete1(String ent1) {
        this.entrete1 = ent1;
    }


    public String getNomEntrete2() {
        return entrete2;
    }

    public void setNomEntrete2(String ent2) {
        this.entrete2 = ent2;
    }

    public String getNomEntrete3() {
        return entrete3;
    }

    public void setNomEntrete3(String ent3) {
        this.entrete3 = ent3;
    }


    public int getCosto1() {
        return c1;
    }

    public void setCosto1(int co1) {
        this.c1 = co1;
    }


    public int getCosto2() {
        return c2;
    }

    public void setCosto2(int co2) {
        this.c2 = co2;
    }


    public int getCosto3() {
        return c3;
    }

    public void setCosto3(int co3) {
        this.c3 = co3;
    }


    public int getCosto4() {
        return c4;
    }

    public void setCosto4(int co4) {
        this.c4 = co4;
    }


    public int getCosto5() {
        return c5;
    }

    public void setCosto5(int co5) {
        this.c5 = co5;
    }


    public int getCosto6() {
        return c6;
    }

    public void setCosto6(int co6) {
        this.c6 = co6;
    }


    public int getCosto7() {
        return c7;
    }

    public void setCosto7(int co7) {
        this.c7 = co7;
    }


    public int getCosto8() {
        return c8;
    }

    public void setCosto8(int co8) {
        this.c8 = co8;
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {  
        fondo = new ImageIcon("serv.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameservicios.add(imagen);
	}
    //Frame
    
    JButton botonregresarhotel, b2, b3, b4, botonmenagregar, bmostrar;
    JFrame frameservicios;
    JTextField txtnombrerest, txtplato1, txtplato2, txtplato3, txtespe1, txtespe2;
    JTextField txtent1, txtent2, txtent3;
    JTextField txtc1, txtc2, txtc3, txtc4, txtc5, txtc6, txtc7, txtc8;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lbltitulo1, lbltitulo2, lblcosto1, lblcosto2;

    public void inicio() {
        frameservicios = new JFrame("Servicios");//Titulo del JFrame
        frameservicios.setSize(800, 500);//Tamaño del JFrame
        frameservicios.getContentPane().setBackground(Color.white);
        frameservicios.setVisible(true);//Se hace visible
        frameservicios.setLocationRelativeTo(null);//Para que quede en medio
        frameservicios.setLayout(null);//Para que no se muevan los botones

        //Columna1
        lbltitulo1 = new JLabel("Restaurante");
        lbltitulo1.setForeground(Color.black);
        lbltitulo1.setBounds(60, 5, 200, 50);
        lbltitulo1.setVisible(true);

        lb1 = new JLabel("Nombre Restaurante");
        lb1.setBounds(20, 35, 215, 50);
        lb1.setVisible(true);

        lb2 = new JLabel("Platos");
        lb2.setForeground(Color.black);
        lb2.setBounds(90, 65, 200, 50);
        lb2.setVisible(true);

        lblcosto1 = new JLabel("Costo");
        lblcosto1.setForeground(Color.black);
        lblcosto1.setBounds(300, 65, 200, 50);
        lblcosto1.setVisible(true);

        lb3 = new JLabel("Plato 1");
        lb3.setBounds(30, 95, 200, 50);
        lb3.setVisible(true);

        lb4 = new JLabel("Plato 2");
        lb4.setBounds(30, 125, 200, 50);
        lb4.setVisible(true);

        lb5 = new JLabel("Plato 3");
        lb5.setBounds(30, 155, 200, 50);
        lb5.setVisible(true);

        lb6 = new JLabel("Especialidades");
        lb6.setForeground(Color.black);
        lb6.setBounds(90, 185, 200, 50);
        lb6.setVisible(true);

        lb7 = new JLabel("Especialidad 1");
        lb7.setBounds(30, 215, 200, 50);
        lb7.setVisible(true);
        lb7.setForeground(Color.black);

        lb8 = new JLabel("Especialidad 2");
        lb8.setBounds(30, 245, 200, 50);
        lb8.setVisible(true);
        lb8.setForeground(Color.black);

        botonmenagregar = new JButton("Guardar");
        botonmenagregar.setBounds(150, 350, 150, 40);
        botonmenagregar.setBackground(Color.white);//Color del boton
       // botonmenuañadir.setFont(new Font("ALGERIAN", Font.BOLD, 20));
        botonmenagregar.setForeground(Color.black);
        botonmenagregar.setVisible(true);
        botonmenagregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.contservicio < 1000) {

                    c1 = Integer.parseInt(txtc1.getText());
                    c2 = Integer.parseInt(txtc2.getText());
                    c3 = Integer.parseInt(txtc3.getText());
                    c4 = Integer.parseInt(txtc4.getText());
                    c5 = Integer.parseInt(txtc5.getText());
                    c6 = Integer.parseInt(txtc6.getText());
                    c7 = Integer.parseInt(txtc7.getText());
                    c8 = Integer.parseInt(txtc8.getText());
                    nombrerest = txtnombrerest.getText();
                    plato1 = txtplato1.getText();
                    plato2 = txtplato2.getText();
                    plato3 = txtplato3.getText();
                    espe1 = txtespe1.getText();
                    espe2 = txtespe2.getText();
                    entrete1 = txtent1.getText();
                    entrete2 = txtent2.getText();
                    entrete3 = txtent3.getText();

                    CrearServicios temp = new CrearServicios();
                    temp.setCosto1(c1);
                    temp.setCosto2(c2);
                    temp.setCosto3(c3);
                    temp.setCosto4(c4);
                    temp.setCosto5(c5);
                    temp.setCosto6(c6);
                    temp.setCosto7(c7);
                    temp.setCosto8(c8);
                    temp.setNombreRestaurante(nombrerest);
                    temp.setNomPlato1(plato1);
                    temp.setNomPlato2(plato2);
                    temp.setNomPlato3(plato3);
                    temp.setNomEspe1(espe1);
                    temp.setNomEspe2(espe2);
                    temp.setNomEntrete1(entrete1);
                    temp.setNomEntrete2(entrete2);
                    temp.setNomEntrete3(entrete3);

                    Menu.servicio[Menu.contservicio] = temp;
                    Menu.contservicio++;

                    txtnombrerest.setText("");
                    txtplato1.setText("");
                    txtplato2.setText("");
                    txtplato3.setText("");
                    txtespe1.setText("");
                    txtespe2.setText("");
                    txtent1.setText("");
                    txtent2.setText("");
                    txtent3.setText("");
                    txtc1.setText("");
                    txtc2.setText("");
                    txtc3.setText("");
                    txtc4.setText("");
                    txtc5.setText("");
                    txtc6.setText("");
                    txtc7.setText("");
                    txtc8.setText("");

                    JOptionPane.showMessageDialog(null, "Servicios Creados");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya no se pueden crear servicios");
                }
                System.out.println(nombrerest);

            }
        });
        txtnombrerest = new JTextField();
        txtnombrerest.setBounds(new Rectangle(135, 50, 150, 21));
        txtnombrerest.setEditable(true);
        txtnombrerest.setHorizontalAlignment(JTextField.LEFT);

        txtplato1 = new JTextField();
        txtplato1.setBounds(new Rectangle(135, 110, 150, 21));
        txtplato1.setEditable(true);
        txtplato1.setHorizontalAlignment(JTextField.LEFT);

        txtplato2 = new JTextField();
        txtplato2.setBounds(new Rectangle(135, 140, 150, 21));
        txtplato2.setEditable(true);
        txtplato2.setHorizontalAlignment(JTextField.LEFT);

        txtplato3 = new JTextField();
        txtplato3.setBounds(new Rectangle(135, 170, 150, 21));
        txtplato3.setEditable(true);
        txtplato3.setHorizontalAlignment(JTextField.LEFT);

        txtespe1 = new JTextField();
        txtespe1.setBounds(new Rectangle(135, 230, 150, 21));
        txtespe1.setEditable(true);
        txtespe1.setHorizontalAlignment(JTextField.LEFT);

        txtespe2 = new JTextField();
        txtespe2.setBounds(new Rectangle(135, 260, 150, 21));
        txtespe2.setEditable(true);
        txtespe2.setHorizontalAlignment(JTextField.LEFT);

        txtc1 = new JTextField();
        txtc1.setBounds(new Rectangle(300, 110, 50, 21));
        txtc1.setEditable(true);
        txtc1.setHorizontalAlignment(JTextField.LEFT);

        txtc2 = new JTextField();
        txtc2.setBounds(new Rectangle(300, 140, 50, 21));
        txtc2.setEditable(true);
        txtc2.setHorizontalAlignment(JTextField.LEFT);

        txtc3 = new JTextField();
        txtc3.setBounds(new Rectangle(300, 170, 50, 21));
        txtc3.setEditable(true);
        txtc3.setHorizontalAlignment(JTextField.LEFT);

        txtc4 = new JTextField();
        txtc4.setBounds(new Rectangle(300, 230, 50, 21));
        txtc4.setEditable(true);
        txtc4.setHorizontalAlignment(JTextField.LEFT);

        txtc5 = new JTextField();
        txtc5.setBounds(new Rectangle(300, 260, 50, 21));
        txtc5.setEditable(true);
        txtc5.setHorizontalAlignment(JTextField.LEFT);

        //Columna2
        lbltitulo2 = new JLabel("Entretenimiento");
        lbltitulo2.setForeground(Color.black);
        lbltitulo2.setBounds(420, 5, 200, 50);
        lbltitulo2.setVisible(true);

        lb9 = new JLabel("Entretenimiento 1");
        lb9.setBounds(400, 35, 200, 50);
        lb9.setVisible(true);

        lb10 = new JLabel("Entretenimiento 2");
        lb10.setBounds(400, 65, 200, 50);
        lb10.setVisible(true);

        lb11 = new JLabel("Entretenimiento 3");
        lb11.setBounds(400, 95, 200, 50);
        lb11.setVisible(true);

        lblcosto2 = new JLabel("Costo");
        lblcosto2.setForeground(Color.black);
        lblcosto2.setBounds(690, 5, 200, 50);
        lblcosto2.setVisible(true);

        txtent1 = new JTextField();
        txtent1.setBounds(new Rectangle(520, 50, 150, 21));
        txtent1.setEditable(true);
        txtent1.setHorizontalAlignment(JTextField.LEFT);

        txtent2 = new JTextField();
        txtent2.setBounds(new Rectangle(520, 80, 150, 21));
        txtent2.setEditable(true);
        txtent2.setHorizontalAlignment(JTextField.LEFT);

        txtent3 = new JTextField();
        txtent3.setBounds(new Rectangle(520, 110, 150, 21));
        txtent3.setEditable(true);
        txtent3.setHorizontalAlignment(JTextField.LEFT);

        txtc6 = new JTextField();
        txtc6.setBounds(new Rectangle(690, 50, 50, 21));
        txtc6.setEditable(true);
        txtc6.setHorizontalAlignment(JTextField.LEFT);

        txtc7 = new JTextField();
        txtc7.setBounds(new Rectangle(690, 80, 50, 21));
        txtc7.setEditable(true);
        txtc7.setHorizontalAlignment(JTextField.LEFT);

        txtc8 = new JTextField();
        txtc8.setBounds(new Rectangle(690, 110, 50, 21));
        txtc8.setEditable(true);
        txtc8.setHorizontalAlignment(JTextField.LEFT);

        //Agregando
        frameservicios.add(lbltitulo1);
        frameservicios.add(lbltitulo2);
        frameservicios.add(lb1);
        frameservicios.add(lb2);
        frameservicios.add(lb3);
        frameservicios.add(lb4);
        frameservicios.add(lb5);
        frameservicios.add(lb6);
        frameservicios.add(lb7);
        frameservicios.add(lb8);
        frameservicios.add(lb9);
        frameservicios.add(lb10);
        frameservicios.add(lb11);
        frameservicios.add(lblcosto1);
        frameservicios.add(lblcosto2);
        frameservicios.add(txtnombrerest);
        frameservicios.add(txtplato1);
        frameservicios.add(txtc1);
        frameservicios.add(txtplato2);
        frameservicios.add(txtplato3);
        frameservicios.add(txtespe1);
        frameservicios.add(txtespe2);
        frameservicios.add(txtent1);
        frameservicios.add(txtent2);
        frameservicios.add(txtent3);
        frameservicios.add(txtc1);
        frameservicios.add(txtc2);
        frameservicios.add(txtc3);
        frameservicios.add(txtc4);
        frameservicios.add(txtc5);
        frameservicios.add(txtc6);
        frameservicios.add(txtc7);
        frameservicios.add(txtc8);
        frameservicios.add(botonmenagregar);
        Fondo();
    }
}
