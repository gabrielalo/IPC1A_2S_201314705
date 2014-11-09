//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ElegirHotel {
public static int posicion = 0;

    //Cargar Nombres

    public void ComboboxElegirHotel() {
        for (int i = 0; i <Menu.conthotel; i++) {
            if (Menu.hotel[i].getNombreHotel() != null) {
                comboboxelegir.addItem(Menu.hotel[i].getNombreHotel());
            }
        }
    }

     JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("hotel11.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameElegirHotel.add(imagen);
    }
    

    JFrame frameElegirHotel;
    JComboBox comboboxelegir;
    JLabel lbltitulo;
    JButton botonir;

    public void inicio() {
        frameElegirHotel = new JFrame("Elegir Hotel");
        frameElegirHotel.setSize(300, 300);
        frameElegirHotel.getContentPane().setBackground(Color.white);
        frameElegirHotel.setVisible(true);
        frameElegirHotel.setLocationRelativeTo(null);
        frameElegirHotel.setLayout(null);

        comboboxelegir = new JComboBox();
        comboboxelegir.setBounds(40, 50, 120, 25);

        lbltitulo = new JLabel("Elegir Hotel");
        lbltitulo.setForeground(Color.BLACK);
        lbltitulo.setBounds(70, 2, 200, 50);
        lbltitulo.setVisible(true);

        botonir = new JButton("Acceder");
        botonir.setBounds(170, 45, 100, 30);
        botonir.setVisible(true);
        botonir.setFocusable(true);
        botonir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                
                Reservacion pri = new Reservacion();
                pri.inicio();
                frameElegirHotel.setVisible(false);
                
                String nom = comboboxelegir.getSelectedItem().toString();
                //posicion
                for (int i = 0; i < Menu.conthotel; i++) {
                    if (Menu.hotel[i].nomHotel.equals(nom)) {
                        posicion = i;
                        System.out.println(posicion);
                        
                        
                    }
                }

            }
        });

        //Agregar
        frameElegirHotel.add(comboboxelegir);
        frameElegirHotel.add(lbltitulo);
        frameElegirHotel.add(botonir);
        ComboboxElegirHotel();
        Fondo();

    }

}
