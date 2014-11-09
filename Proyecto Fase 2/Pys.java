//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pys {

    //Atributos
    int No_per, costo, IDp;
    String nombrep, epoca, descripcion;

    
    public String getNombreP() {
        return nombrep;
    }

    public void setNombreP(String nompe) {
        this.nombrep= nompe;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String des) {
        this.descripcion = des;
    }


    public int getNoPersonas() {
        return No_per;
    }

    public void setNoPersonas(Integer nope) {
        this.No_per = nope;
    }


    public String getTipoEpoca() {
        return epoca;
    }

    public void setTipoEpoca(String ep) {
        this.epoca = ep;
    }
    
    public int getIDp() {
        return IDp;
    }

    public void setIDp(Integer idp) {
        this.IDp = idp;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(Integer monto) {
        this.costo = monto;
    }
    // FRAME

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("promo.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framepromociones.add(imagen);
    }
    
    
    JFrame framepromociones;
    JButton botonañadirpp;
    JComboBox comboboxepoca;
    JTextField txtnombrep, txtIDp, txtepoca, txtper, txtcostopp, txt8, txt9;
    JTextArea txtdescripcion;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;

    public void inicio() {

        framepromociones = new JFrame("Promociones y Paquetes");
        framepromociones.setSize(600, 400);
        framepromociones.getContentPane().setBackground(Color.magenta);
        framepromociones.setVisible(true);
        framepromociones.setLocationRelativeTo(null);
        framepromociones.setLayout(null);

        lb1 = new JLabel("Código");
        lb1.setBounds(20, 15, 200, 50);
        lb1.setVisible(true);
        lb1.setForeground(Color.black);
        
        lb2 = new JLabel("Promoción o Paquete");
        lb2.setBounds(20, 50, 200, 50);
        lb2.setVisible(true);
        lb2.setForeground(Color.black);

        lb3 = new JLabel("Época");
        lb3.setBounds(20, 80, 200, 50);
        lb3.setVisible(true);
        lb3.setForeground(Color.black);

        lb4 = new JLabel("Número de Personas");
        lb4.setBounds(20, 110, 200, 50);
        lb4.setVisible(true);
        lb4.setForeground(Color.black);

        lb5 = new JLabel("Monto");
        lb5.setBounds(20, 140, 200, 50);
        lb5.setVisible(true);
        lb5.setForeground(Color.black);

        lb6 = new JLabel("Descripción");
        lb6.setBounds(20, 170, 200, 50);
        lb6.setVisible(true);
        lb6.setForeground(Color.black);

        txtIDp = new JTextField();
        txtIDp.setBounds(new Rectangle(150, 30, 50, 21));
        txtIDp.setEditable(true);
        txtIDp.setHorizontalAlignment(JTextField.LEFT);

        txtnombrep = new JTextField();
        txtnombrep.setBounds(new Rectangle(150, 65, 120, 21));
        txtnombrep.setEditable(true);
        txtnombrep.setHorizontalAlignment(JTextField.LEFT);

        txtepoca = new JTextField();
        txtepoca.setBounds(new Rectangle(150, 95, 120, 21));
        txtepoca.setEditable(false);
        txtepoca.setHorizontalAlignment(JTextField.LEFT);

        txtper = new JTextField();
        txtper.setBounds(new Rectangle(150, 125, 120, 21));
        txtper.setEditable(true);
        txtper.setHorizontalAlignment(JTextField.LEFT);

        txtcostopp = new JTextField();
        txtcostopp.setBounds(new Rectangle(150, 155, 75, 21));
        txtcostopp.setEditable(true);
        txtcostopp.setHorizontalAlignment(JTextField.LEFT);

        txtdescripcion = new JTextArea();
        txtdescripcion.setBounds(new Rectangle(150, 185, 150, 100));
        txtdescripcion.setLineWrap(true);//Salto de linea
        txtdescripcion.setEditable(true);
//        txtdescripcion.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue));//Borde al TextArea

        comboboxepoca = new JComboBox();
        comboboxepoca.setBounds(285, 95, 100, 25);
//        comboboxepoca.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.RED));//Borde al Combobox
        comboboxepoca.addItem("Primavera");
        comboboxepoca.addItem("Verano");
        comboboxepoca.addItem("Otoño");
        comboboxepoca.addItem("Invierno");
        comboboxepoca.addActionListener(new ActionListener() {
        
        	
        	public void actionPerformed(ActionEvent myEvent) {
                txtepoca.setText("" + comboboxepoca.getSelectedItem());
                if (myEvent.getSource() instanceof JComboBox) {
                    if ((JComboBox) myEvent.getSource() == comboboxepoca) {
                        txtepoca.setText("" + comboboxepoca.getSelectedItem());
                    }
                }

            }
        });

        botonañadirpp = new JButton("Guardar");
        botonañadirpp.setBounds(100, 300, 100, 25);
        botonañadirpp.setVisible(true);
        botonañadirpp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.contpromo < 10) {

                    No_per = Integer.parseInt(txtper.getText());
                    IDp = Integer.parseInt(txtIDp.getText());
                    costo = Integer.parseInt(txtcostopp.getText());
                    nombrep = txtnombrep.getText();
                    epoca = txtepoca.getText();
                    descripcion = txtdescripcion.getText();

                    Pys temp = new Pys();
                    temp.setCosto(costo);
                    temp.setIDp(IDp);
                    temp.setNoPersonas(No_per);
                    temp.setNombreP(nombrep);
                    temp.setTipoEpoca(epoca);
                    temp.setDescripcion(descripcion);

                    Menu.promo[Menu.contpromo] = temp;
                    Menu.contpromo++;

                    txtIDp.setText("");
                    txtnombrep.setText("");
                    txtepoca.setText("");
                    txtper.setText("");
                    txtcostopp.setText("");

                    JOptionPane.showMessageDialog(null, "Promoción Creada");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas espacio para promociones");
                }
                System.out.println(nombrep);

            }
        });

        //Agregando
        framepromociones.add(lb1);
        framepromociones.add(lb2);
        framepromociones.add(lb3);
        framepromociones.add(lb4);
        framepromociones.add(lb5);
        framepromociones.add(lb6);
        framepromociones.add(txtIDp);
        framepromociones.add(txtnombrep);
        framepromociones.add(txtper);
        framepromociones.add(txtepoca);
        framepromociones.add(txtcostopp);
        framepromociones.add(txtdescripcion);
        framepromociones.add(comboboxepoca);
        framepromociones.add(botonañadirpp);
      Fondo();

    }

}
