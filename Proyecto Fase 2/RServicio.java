//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RServicio {
//Cargar
    public void TablaReservacion() {
        for (int i = 0; i < Menu.contservicioes; i++) {
            if (Menu.servicioes[i].getEntreteser() != null && Menu.servicioes[i].getNombreClienteSer() != null && Menu.servicioes[i].getPlatiSer() != null && Menu.servicioes[i].getProSer() != null && Menu.servicioes[i].getRestauranteServ() != null) {
                mod.addRow(new Object[]{i + 1, Menu.servicioes[i].getNombreClienteSer(), "Estrella"});
                mod.addRow(new Object[]{i + 2, Menu.servicioes[i].getEntreteser(), " "});
                mod.addRow(new Object[]{i + 3, Menu.servicioes[i].getPlatiSer(), " "});
                mod.addRow(new Object[]{i + 4, Menu.servicioes[i].getProSer(), " "});
                mod.addRow(new Object[]{i + 5, Menu.servicioes[i].getRestauranteServ(), " "});

            }
        }
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("elegir.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        freporte2.add(imagen);
    }

    JTable tabla;
    String datos[][] = {};//Filas
    String encabezado[] = {"No.", "Servicio", "Monto"};//columnas
    DefaultTableModel mod;
    JScrollPane pan;
    JFrame freporte2;

    public void inicio() {
        freporte2 = new JFrame("Reporte de Servicios");
        freporte2.setSize(500, 400);
        freporte2.getContentPane().setBackground(Color.cyan);
        freporte2.setVisible(true);
        freporte2.setLocationRelativeTo(null);
        freporte2.setLayout(null);

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
        freporte2.add(pan);
        TablaReservacion();
     Fondo();

    }

}
