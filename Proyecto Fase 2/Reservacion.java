//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Reservacion {   
	//Atributos
    int cod, no_ID, tel, poshotel;
    String nombrecli, apellidocli, ingreso, salida;
 
    public void CargarComboboxReservacion() {
        for (int i = 0; i < Menu.conthabitacion; i++) {
            if (Menu.habitacion[i].getNombreHabitacion() != null) {
                comboboxreservacion.addItem(Menu.habitacion[i].getNombreHabitacion());
            }

        }

    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(Integer codi) {
        this.cod = codi;
    }

    public String getNombreCliente() {
        return nombrecli;
    }

    public void setNombreCliente(String nom) {
        this.nombrecli = nom;
    }

    public String getApellidoCliente() {
        return apellidocli;
    }

    public void setApellidoCliente(String ap) {
        this.apellidocli = ap;
    }

    public int NoIdent() {
        return no_ID;
    }

    public void setNoIdent(Integer identi) {
        this.no_ID = identi;
    }

    public int getTelefono() {
        return tel;
    }

    public void setTelefono(Integer ce) {
        this.tel = ce;
    }

    public String getIngresoCliente() {
        return ingreso;
    }

    public void setIngresoCliente(String ing) {
        this.ingreso = ing;
    }

    public String getSalidaCliente() {
        return salida;
    }

    public void setSalidaCliente(String sali) {
        this.salida = sali;
    }
    
    
    public void setPos(int sal) {
        this.poshotel = sal;
    }

    public int getPos() {
        return poshotel;
    }
    
    
     JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("hotel1.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framereservacion.add(imagen);
    }
    
    
    JButton botongua, botonverh, botonirse;
    JFrame framereservacion;
    JTextField txtcod, txtnombrecli, txtapellido, txtidentificacion, txttel, txtingreso, txtsalida, txthabitacion, txt19;
    JLabel lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19;
    JComboBox comboboxreservacion;
    JTextArea txtcontenido;

    public void inicio() {
        framereservacion = new JFrame("Reservaciones");//Titulo del JFrame
        framereservacion.setSize(700, 500);//Tamaño del JFrame
        framereservacion.getContentPane().setBackground(Color.gray);
        framereservacion.setVisible(true);//Se hace visible
        framereservacion.setLocationRelativeTo(null);//Para que quede en medio
        framereservacion.setDefaultCloseOperation(framereservacion.EXIT_ON_CLOSE);//Termina el proceso del JFrame
        framereservacion.setLayout(null);//Para que no se muevan nuestros botones

        lb11 = new JLabel("Asignación de ID");
        lb11.setBounds(20, 15, 200, 50);//tamaño del boton
        lb11.setVisible(true);
        lb11.setForeground(Color.WHITE);

        lb12 = new JLabel("Nombre");
        lb12.setBounds(20, 50, 200, 50);
        lb12.setVisible(true);
        lb12.setForeground(Color.WHITE);

        lb13 = new JLabel("Apellido");
        lb13.setBounds(20, 80, 200, 50);
        lb13.setVisible(true);
        lb13.setForeground(Color.WHITE);

        lb14 = new JLabel("Número Identificación");
        lb14.setBounds(20, 110, 200, 50);
        lb14.setVisible(true);
        lb14.setForeground(Color.WHITE);

        lb15 = new JLabel("Teléfono");
        lb15.setBounds(20, 140, 200, 50);
        lb15.setVisible(true);
        lb15.setForeground(Color.WHITE);

        lb16 = new JLabel("Fecha de Ingreso");
        lb16.setBounds(20, 175, 200, 50);
        lb16.setVisible(true);
        lb16.setForeground(Color.WHITE);

        lb17 = new JLabel("Fecha de salida");
        lb17.setBounds(20, 210, 200, 50);
        lb17.setVisible(true);
        lb17.setForeground(Color.WHITE);

        lb18 = new JLabel("Tipo de habitación");
        lb18.setBounds(20, 250, 200, 50);
        lb18.setVisible(true);
        lb18.setForeground(Color.WHITE);

        lb19 = new JLabel("Datos de la habitación");
        lb19.setBounds(450, 15, 250, 50);
        lb19.setVisible(true);
        lb19.setForeground(Color.WHITE);

        txtcod = new JTextField();
        txtcod.setBounds(new Rectangle(150, 30, 50, 21));
        txtcod.setEditable(true);
        txtcod.setHorizontalAlignment(JTextField.LEFT);

        txtnombrecli = new JTextField();
        txtnombrecli.setBounds(new Rectangle(150, 65, 125, 21));
        txtnombrecli.setEditable(true);
        txtnombrecli.setHorizontalAlignment(JTextField.LEFT);

        txtapellido = new JTextField();
        txtapellido.setBounds(new Rectangle(150, 95, 125, 21));
        txtapellido.setEditable(true);
        txtapellido.setHorizontalAlignment(JTextField.LEFT);

        txtidentificacion = new JTextField();
        txtidentificacion.setBounds(new Rectangle(150, 125, 125, 21));
        txtidentificacion.setEditable(true);
        txtidentificacion.setHorizontalAlignment(JTextField.LEFT);

        txttel = new JTextField();
        txttel.setBounds(new Rectangle(150, 160, 125, 21));
        txttel.setEditable(true);
        txttel.setHorizontalAlignment(JTextField.LEFT);

        txtingreso = new JTextField();
        txtingreso.setBounds(new Rectangle(150, 190, 125, 21));
        txtingreso.setEditable(true);
        txtingreso.setHorizontalAlignment(JTextField.LEFT);

        txtsalida = new JTextField();
        txtsalida.setBounds(new Rectangle(150, 220, 125, 21));
        txtsalida.setEditable(true);
        txtsalida.setHorizontalAlignment(JTextField.LEFT);

        txtcontenido = new JTextArea();
        txtcontenido.setBounds(450, 50, 200, 200);
        txtcontenido.setEditable(false);

        comboboxreservacion = new JComboBox();
        comboboxreservacion.setBounds(150, 260, 100, 25);

        botongua = new JButton("Guardar Reservación");
        botongua.setBounds(220, 330, 150, 25);
        botongua.setVisible(true);
        botongua.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {

                if (Menu.contReservacion < 10) {
                    //Lo que se obtiene del textfield
                    cod = Integer.parseInt(txtcod.getText());
                    nombrecli = txtnombrecli.getText();
                    apellidocli = txtapellido.getText();
                    no_ID = Integer.parseInt(txtidentificacion.getText());
                    tel= Integer.parseInt(txttel.getText());
                    ingreso = txtingreso.getText();
                    salida = txtsalida.getText();

                    //Dandole memoria para que pueda guardar
                    Reservacion memoria = new Reservacion();

                    memoria.setCodigo(cod);
                    memoria.setNombreCliente(nombrecli);
                    memoria.setApellidoCliente(apellidocli);
                    memoria.setNoIdent(no_ID);
                    memoria.setTelefono(tel);
                    memoria.setIngresoCliente(ingreso);
                    memoria.setSalidaCliente(salida);
                    memoria.setPos(ElegirHotel.posicion);
                    
                    //guardo las reservacion
                    Menu.Reservaciones[Menu.contReservacion] = memoria;

                    // contador de reservaciones
                    Menu.contReservacion++;

                    //Empeza en blanco los textField
                    txtcod.setText("");
                    txtnombrecli.setText("");
                    txtapellido.setText("");
                    txtidentificacion.setText("");
                    txttel.setText("");
                    txtingreso.setText("");
                    txtsalida.setText("");
                    

                    //Sale
                    JOptionPane.showMessageDialog(null, "Reservacion Exitosa");
//                    Reservada                    
                    
                    String nom = comboboxreservacion.getSelectedItem().toString();
                    for (int i = 0; i < Menu.conthabitacion; i++) {
                        if (Menu.habitacion[i].nombreHabitacion.equals(nom)) {
                            JOptionPane.showMessageDialog(null, "Habitacion Elegida");
                            Menu.habitacion[i].setReservacion(1);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ya no hay Cupo para Reservación" + "\n" + "Desea ir a cola");
                }
                
                

            }

        });

        botonverh = new JButton("Ver Habitación");
        botonverh.setBounds(270, 260, 130, 25);
        botonverh.setVisible(true);
        botonverh.addActionListener(new ActionListener() {
            
        	public void actionPerformed(ActionEvent e) {
                String mostrar = comboboxreservacion.getSelectedItem().toString();
                String usuario = "";
                for (int i = 0; i < Menu.conthabitacion; i++) {
                    if (Menu.habitacion[i].nombreHabitacion.equals(mostrar)) {
                        usuario = (i + 1) + ")" + "\n" + "Nombre de habitación: " + Menu.habitacion[i].getNombreHabitacion()
                                + "\n" + "Tipo de Habitación: " + Menu.habitacion[i].getTipodeHab()
                                + "\n" + "Número de huésped: " + Menu.habitacion[i].getNoHuesped()
                                + "\n" + "Costo de Habitación: " + Menu.habitacion[i].getCostoHabitacion()
                                + "\n" + "Servicios"//+Menu.habitacion[i].getServicios();
                                + "\n" + "Televisión: " + Menu.habitacion[i].getTipodeTelevision()
                                + "\n" + "Internet: " + Menu.habitacion[i].getTipodeInternet();

                    }

                }

                txtcontenido.setText(usuario);

            }
        });
        
        botonirse = new JButton("Ir Servicios");
        botonirse.setBounds(50, 380, 130, 25);
        botonirse.setVisible(true);
        botonirse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Servicios pri = new Servicios();
                pri.inicio();

            }
        });

        //Agregando
        framereservacion.add(lb11);
        framereservacion.add(lb12);
        framereservacion.add(lb13);
        framereservacion.add(lb14);
        framereservacion.add(lb15);
        framereservacion.add(lb16);
        framereservacion.add(lb17);
        framereservacion.add(lb18);
        framereservacion.add(lb19);
        framereservacion.add(txtcod);
        framereservacion.add(txtnombrecli);
        framereservacion.add(txtapellido);
        framereservacion.add(txtidentificacion);
        framereservacion.add(txttel);
        framereservacion.add(txtingreso);
        framereservacion.add(txtsalida);
        framereservacion.add(botongua);
        framereservacion.add(botonverh);
        framereservacion.add(comboboxreservacion);
        framereservacion.add(txtcontenido);
        framereservacion.add(botonirse);
        CargarComboboxReservacion();
        Fondo();

    }

}
