//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Entrar Aqui
 */
public class EliminarReservacion {

    public void ComboboxEliminarReservacion() {
        for (int i = 0; i < Menu.conthabitacion; i++) {
            if (Menu.habitacion[i].getReservacion() == 1) {
                comboboxeliminar.addItem(Menu.habitacion[i].getNombreHabitacion());
            }
        }
    }
    
    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("eli.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameEliminar.add(imagen);
    }


    JFrame frameEliminar;
    JComboBox comboboxeliminar;
    JLabel lbltitulo;
    JButton botoneliminar, botondetalles;
    JTextArea txtdetalles;

    public void inicio() {
        frameEliminar = new JFrame("Eliminar reservacion");//Titulo del JFrame
        frameEliminar.setSize(300, 400);//Tamaño del JFrame
        frameEliminar.getContentPane().setBackground(Color.white);
        frameEliminar.setVisible(true);//Se hace visible
        frameEliminar.setLocationRelativeTo(null);//Para que quede en medio
        frameEliminar.setLayout(null);//Para que no se muevan nuestros botones

        comboboxeliminar = new JComboBox();
        comboboxeliminar.setBounds(40, 50, 120, 25);

        lbltitulo = new JLabel("Eliminar Reservacion");
        lbltitulo.setForeground(Color.white);
        lbltitulo.setBounds(70, 2, 200, 50);
        lbltitulo.setVisible(true);

        botoneliminar = new JButton("Eliminar");
        botoneliminar.setBounds(170, 45, 100, 30);
        botoneliminar.setVisible(true);
        botoneliminar.setFocusable(true);
        botoneliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nom = comboboxeliminar.getSelectedItem().toString();
                for (int i = 0; i < Menu.conthabitacion; i++) {
                    if (Menu.habitacion[i].nombreHabitacion.equals(nom)) {
                        JOptionPane.showMessageDialog(null, "Reservacion Eliminada");
                        Menu.habitacion[i].setReservacion(0);
                    }
                }

            }
        });

        botondetalles = new JButton("Datos");
        botondetalles.setBounds(40, 90, 150, 30);
        botondetalles.setVisible(true);
        botondetalles.setFocusable(true);
        botondetalles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String detalles = comboboxeliminar.getSelectedItem().toString();
                String ver = "";
                for (int i = 0; i < Menu.conthabitacion; i++) {
                    if (Menu.habitacion[i].nombreHabitacion.equals(detalles)) {
                        //for (int n = 0; n < Menu.contReservacion; n++) {
                        //if(reservacion[i].equals(n)){
                        ver = (i + 1) + ")" + "\n" + "Nombre del cliente: " + Menu.Reservaciones[i].getNombreCliente()
                                + "\n" + "Apellido del cliente: " + Menu.Reservaciones[i].getApellidoCliente();

                            //}
                        //}
                    }
                }
                txtdetalles.setText(ver);

            }
        });

        txtdetalles = new JTextArea();
        txtdetalles.setBounds(50, 125, 200, 200);
        txtdetalles.setEditable(false);

        //Agregando
        frameEliminar.add(comboboxeliminar);
        frameEliminar.add(lbltitulo);
        frameEliminar.add(botoneliminar);
        frameEliminar.add(botondetalles);
        frameEliminar.add(txtdetalles);
        ComboboxEliminarReservacion();
        Fondo();
    }

}
