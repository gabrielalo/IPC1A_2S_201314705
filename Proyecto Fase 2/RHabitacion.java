import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class RHabitacion {

    //Cargar
    public void TablaReservaciones() {
        for (int i = 0; i < Menu.conthabitacion; i++) {
            if (Menu.habitacion[i].getNombreHabitacion() != null) {
                if(Menu.habitacion[i].getReservacion()==1){
                mod.addRow(new Object[]{i+1,Menu.habitacion[i].getNombreHabitacion(),"Reservada"});    
                }
                else{
                    mod.addRow(new Object[]{i+1,Menu.habitacion[i].getNombreHabitacion(),"No Reservada"});    
                } 
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
       freporte.add(imagen);
    }
    

    JTable tabla;
    String datos[][] = {};//Filas
    String encabezado[] = {"No.", "Nombre de Habitacion", "Estado"};//columnas
    DefaultTableModel mod;
    JScrollPane pan;
    JFrame freporte;

    public void inicio() {
        freporte = new JFrame("Reporte de Habitaciones");
        freporte.setSize(500, 400);
        freporte.getContentPane().setBackground(Color.white);
        freporte.setVisible(true);
        freporte.setLocationRelativeTo(null);
        freporte.setLayout(null);

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
        freporte.add(pan);
        TablaReservaciones();
        Fondo();

    }

}
