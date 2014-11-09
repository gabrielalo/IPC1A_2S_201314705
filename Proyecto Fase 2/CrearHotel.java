//ya
import java.awt.*;//importa los componentes de los botones
import java.awt.event.ActionEvent;//click de botones
import java.awt.event.ActionListener;//click de los botones
import javax.swing.*;
import javax.swing.ImageIcon;

public class CrearHotel extends JFrame{

    //Atributos
    int ID_h, No_hab;
    String nomHotel, pais;

    
    public CrearHotel(String nombreh) {
        this.nomHotel = nombreh;
    }


    public String getNombreHotel() {
        return nomHotel;
    }

    public void setNombreHotel(String nombhotel) {
        this.nomHotel = nombhotel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pai) {
        this.pais = pai;
    }

    public int getNoHabitaciones() {
        return No_hab;
    }

    public void setNoHabitaciones(Integer nohab) {
        this.No_hab= nohab;
    }

    public int getIDHotel() {
        return ID_h;
    }

    public void setIDHotel(Integer ID) {
        this.ID_h = ID;
    }
    //Frames

    JButton botonmenuagregar, botonir, bmostrar;
    JFrame framehotel;
    JComboBox comboboxhotel;
    JTextField txtNomHotel, txtIDh, txtNo_hab, txtPais;
    JTextField txtmostrar;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {  
        fondo = new ImageIcon("crearh.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framehotel.add(imagen);
    }

    public void inicio() {

        framehotel = new JFrame("Crear hotel");//Titulo del JFrame
        framehotel.setSize(400, 400);//Tamaño del JFrame
        //framehotel.getContentPane().setBackground(Color.ORANGE);
        framehotel.setVisible(true);//Se hace visible
        framehotel.setLocationRelativeTo(null);//Para que quede en medio
        framehotel.setLayout(null);//Para que no se muevan nuestros botones

        lb1 = new JLabel("ID del hotel");
        lb1.setBounds(20, 15, 200, 50);//tamaño del boton
        lb1.setVisible(true);

        lb2 = new JLabel("Nombre del Hotel");
        lb2.setBounds(20, 50, 200, 50);//tamaño del boton
        lb2.setVisible(true);

        lb3 = new JLabel("Número Habitaciones");
        lb3.setBounds(20, 80, 200, 50);//tamaño del boton
        lb3.setVisible(true);

        lb4 = new JLabel("Pais: ");
        lb4.setBounds(20, 110, 200, 50);//tamaño del boton
        lb4.setVisible(true);

        txtIDh = new JTextField();
        txtIDh.setBounds(new Rectangle(150, 30, 100, 21));
        txtIDh.setEditable(true);
        txtIDh.setHorizontalAlignment(JTextField.LEFT);

        txtNomHotel = new JTextField();
        txtNomHotel.setBounds(new Rectangle(150, 65, 200, 21));
        txtNomHotel.setEditable(true);
        txtNomHotel.setHorizontalAlignment(JTextField.LEFT);

        txtNo_hab = new JTextField();
        txtNo_hab.setBounds(new Rectangle(150, 95, 200, 21));
        txtNo_hab.setEditable(true);
        txtNo_hab.setHorizontalAlignment(JTextField.LEFT);

        txtPais = new JTextField();
        txtPais.setBounds(new Rectangle(150, 125, 200, 21));
        txtPais.setEditable(true);
        txtPais.setHorizontalAlignment(JTextField.LEFT);

        botonmenuagregar = new JButton("Guardar");
        botonmenuagregar.setBounds(50, 200, 100, 25);
        botonmenuagregar.setVisible(true);
        botonmenuagregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.conthotel < 5) {

                    ID_h = Integer.parseInt(txtNo_hab.getText());
                    nomHotel = txtNomHotel.getText();
                    No_hab = Integer.parseInt(txtNo_hab.getText());
                    pais = txtPais.getText();

                    CrearHotel temp = new CrearHotel(null);
                    temp.setIDHotel(ID_h);
                    temp.setNombreHotel(nomHotel);
                    temp.setNoHabitaciones(No_hab);
                    temp.setPais(pais);

                    Menu.hotel[Menu.conthotel] = temp;
                    Menu.conthotel++;

                    txtIDh.setText("");
                    txtNomHotel.setText("");
                    txtNo_hab.setText("");
                    txtPais.setText("");

                    JOptionPane.showMessageDialog(null, "Hotel Guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puede crear màs hoteles");
                }
                //System.out.println(nombreHotel);
                //System.out.println(Menu.hotel[Menu.conthotel-1].No_habitaciones);

            }
        });

        //Agregando 
        framehotel.add(lb1);
        framehotel.add(lb2);
        framehotel.add(lb3);
        framehotel.add(lb4);
        framehotel.add(txtIDh);
        framehotel.add(txtNomHotel);
        framehotel.add(txtPais);
        framehotel.add(txtNo_hab);
        framehotel.add(botonmenuagregar);
        Fondo();

    }

}
