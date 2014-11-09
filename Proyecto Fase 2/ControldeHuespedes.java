//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ControldeHuespedes {

    //Cargar 
    public void TablaReservacion() {
        for (int i = 0; i < Menu.contReservacion; i++) {
            if (Menu.Reservaciones[i].getIngresoCliente()!=null && Menu.Reservaciones[i].getNombreCliente() != null && Menu.Reservaciones[i].getApellidoCliente() != null) {
                mod.addRow(new Object[]{(i+1), Menu.Reservaciones[i].getNombreCliente(), Menu.Reservaciones[i].getApellidoCliente()});

            }
        }
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("contr.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framecontrolh.add(imagen);
    }

    JTable tabla;
    String datos[][] = {};//Filas
    String encabezado[] = {"Codigo", "Nombre","Apellido"};//Titulos de columnas
    DefaultTableModel mod;
    JScrollPane pan;
    JFrame framecontrolh;

    public void inicio() {
        framecontrolh = new JFrame("Huéspedes");
        framecontrolh.setSize(550, 400);
        framecontrolh.getContentPane().setBackground(Color.white);
        framecontrolh.setVisible(true);
        framecontrolh.setLocationRelativeTo(null);
        framecontrolh.setLayout(null);

        tabla = new JTable();
        mod = new DefaultTableModel(datos, encabezado);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 80));
        tabla.setModel(mod);
        tabla.setEnabled(false);
        pan = new JScrollPane(tabla);
        pan.setEnabled(false);
        pan.setBounds(40, 70, 400, 200);
        mod = (DefaultTableModel) this.tabla.getModel();

        //Agregando
         
        framecontrolh.add(pan);
       TablaReservacion();
    Fondo();

    }
    
}
