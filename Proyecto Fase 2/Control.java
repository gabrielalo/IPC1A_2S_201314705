//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Control {
    
    public void CargarCombobxNombreHotel(){
        for(int i=0; i<Menu.conthotel;i++){
            if(Menu.hotel[i].getNombreHotel()!=null){
                comboboxcontrol.addItem(Menu.hotel[i].getNombreHotel());
            }
        
        }
        
    
    }
    
    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {  
        fondo = new ImageIcon("control.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framecontrol.add(imagen);
    }

    JButton botonbuscar, botonseleccionar;
    JFrame framecontrol;
    JTextField txtcodigo;
    JTextArea txtmostrardatos;
    JComboBox comboboxcontrol;
    

    public void inicio() {

        framecontrol = new JFrame("Control de Ingresos y Salidas");
        framecontrol.setSize(500, 400);
        framecontrol.getContentPane().setBackground(Color.white);
        framecontrol.setVisible(true);
        framecontrol.setLocationRelativeTo(null);
        framecontrol.setLayout(null);

        txtcodigo = new JTextField();
        txtcodigo.setBounds(new Rectangle(50, 80, 150, 20));
        txtcodigo.setEditable(true);
        txtcodigo.setVisible(true);
        txtcodigo.setHorizontalAlignment(JTextField.LEFT);

        txtmostrardatos = new JTextArea();
        txtmostrardatos.setBounds(new Rectangle(30, 140, 150, 100));
        txtmostrardatos.setEditable(false);
        txtmostrardatos.setVisible(true);
       
        comboboxcontrol = new JComboBox();
        comboboxcontrol.setBounds(20, 30, 120, 25);
        comboboxcontrol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent myEvent) {


            }
        });

        botonbuscar = new JButton("Buscar Cliente");
        botonbuscar.setBounds(200, 80, 150, 20);
        botonbuscar.setVisible(true);
        botonbuscar.setFocusable(false);
        botonbuscar.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e) {
                
               int temporal= 0;
               for (int i = 0; i < Menu.conthotel; i++) {
                   if(comboboxcontrol.getSelectedItem().toString().equals(Menu.hotel[i].nomHotel)){
                   temporal = i;
                   }
                   
               }
                
                //busqueda
            
                int codigo = Integer.parseInt(txtcodigo.getText());
                String usuario = " ";
                if (Menu.conthotel != 0) {
                    for (int i = 0; i < Menu.contReservacion; i++) {
                        if (Menu.Reservaciones[i].getCodigo() == codigo) {
                        if (Menu.Reservaciones[i].getPos() == temporal) {
                          
                            usuario = (i + 1)+"\n" + "Nombre: " + Menu.Reservaciones[i].getNombreCliente() + "\n" 
                                    + " Apellido: " + Menu.Reservaciones[i].getApellidoCliente() + "\n"
                                    + "Fecha de entrada: " + Menu.Reservaciones[i].getIngresoCliente() + "\n" 
                                    + "Fecha de salida: "
                                    + Menu.Reservaciones[i].getSalidaCliente() + "\n \n";

                        }} else {
                            txtmostrardatos.setText("No se encontro al Hu�sped");
                        }
                    
            
                    txtmostrardatos.setText(usuario);
                }
                }
            }

        });
        
        botonseleccionar = new JButton("Seleccionar");
        botonseleccionar.setBounds(150, 100, 150, 30);
        botonseleccionar.setVisible(false);
        botonseleccionar.setFocusable(false);
        botonseleccionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int posicion = 0;
                if(comboboxcontrol.getSelectedItem()!=null){
                txtcodigo.setVisible(false);
                botonbuscar.setVisible(false);
                txtmostrardatos.setVisible(true);
                }
                else{
                JOptionPane.showMessageDialog(null, "Seleccione el Hotel Deseado");
                }
                //Seleccionando el Item del ComboBox
                String nom = comboboxcontrol.getSelectedItem().toString();
                for (int i =0; i<Menu.conthabitacion;i++){
                    if(Menu.hotel[i].nomHotel.equals(nom)){
                        posicion = i;
                        System.out.println(posicion);
                    }
                }
                
            }

        });
        
      //Agregando

        framecontrol.add(txtcodigo);
        framecontrol.add(txtmostrardatos);
        framecontrol.add(botonbuscar);
        framecontrol.add(comboboxcontrol);
        framecontrol.add(botonseleccionar);
        CargarCombobxNombreHotel();
        Fondo();

    }
}