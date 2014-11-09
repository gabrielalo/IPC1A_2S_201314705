//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Servicios {

    String nomclise, restaser, promser,platiser,entreser;

    public String getNombreClienteSer() {
        return nomclise;
    }

    public void setNombreClienteSer(String nomclieser) {
        this.nomclise = nomclieser;
    }


    public String getRestauranteServ() {
        return restaser;
    }

    public void setRestauranteSer(String RestauranteServ) {
        this.restaser = RestauranteServ;
    }


    public String getPlatiSer() {
        return platiser;
    }

    public void setPlatoServ(String platilloserv) {
        this.platiser = platilloserv;
    }


    public String getEntreteser() {
        return entreser;
    }

    public void setEntretenimientoserv(String entreteser) {
        this.entreser = entreteser;
    }


    public String getProSer() {
        return promser;
    }

    public void setProSer(String promoser) {
        this.promser = promoser;
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("flor.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameEsServicios.add(imagen);
    }

    JFrame frameEsServicios;
    JLabel lbln, lbl1, lbl2, lbl3, lbl4;
    JComboBox comboboxnombrerestaurante, comboboxescogerentretenimiento, comboboxescogerpromos, comboboxnombrecliente, comboboxplatos;
    JButton botonescogernombre, botonescogerrestaurante, botonguardar;

    public void inicio() {

        frameEsServicios = new JFrame("Servicios");
        frameEsServicios.setSize(550, 500);
        frameEsServicios.setVisible(true);
        frameEsServicios.getContentPane().setBackground(Color.white);
        frameEsServicios.setLocationRelativeTo(null);
        frameEsServicios.setLayout(null);

        lbln = new JLabel("Nombre de Cliente");
        lbln.setBounds(50, 15, 200, 50);
        lbln.setVisible(true);
        lbln.setForeground(Color.white);

        lbl1 = new JLabel("Nombre Restaurante");
        lbl1.setBounds(50, 110, 200, 50);
        lbl1.setVisible(true);
        lbl1.setForeground(Color.white);

        lbl2 = new JLabel("Platos");
        lbl2.setBounds(50, 200, 200, 50);
        lbl2.setVisible(true);
        lbl2.setForeground(Color.white);

        lbl3 = new JLabel("Entretenimiento");
        lbl3.setBounds(180, 110, 200, 50);
        lbl3.setVisible(true);
        lbl3.setForeground(Color.white);

        lbl4 = new JLabel("Promociones");
        lbl4.setBounds(300, 110, 200, 50);
        lbl4.setVisible(true);
        lbl4.setForeground(Color.white);

        comboboxnombrecliente = new JComboBox();
        comboboxnombrecliente.setBounds(50, 50, 120, 25);

        comboboxnombrerestaurante = new JComboBox();
        comboboxnombrerestaurante.setBounds(50, 150, 100, 25);
        comboboxnombrerestaurante.setEnabled(false);

        comboboxplatos = new JComboBox();
        comboboxplatos.setBounds(50, 250, 100, 25);
        comboboxplatos.setEnabled(false);

        comboboxescogerentretenimiento = new JComboBox();
        comboboxescogerentretenimiento.setBounds(180, 150, 100, 25);
        comboboxescogerentretenimiento.setEnabled(false);

        comboboxescogerpromos = new JComboBox();
        comboboxescogerpromos.setBounds(300, 150, 100, 25);
        comboboxescogerpromos.setEnabled(false);

        botonescogernombre = new JButton("Elegir Cliente");
        botonescogernombre.setBounds(180, 50, 150, 25);
        botonescogernombre.setVisible(true);
        botonescogernombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comboboxnombrerestaurante.setEnabled(true);
                comboboxescogerentretenimiento.setEnabled(true);
                comboboxescogerpromos.setEnabled(true);
                botonescogerrestaurante.setEnabled(true);
                comboboxplatos.setEnabled(true);

            }
        });

        botonescogerrestaurante = new JButton("Mostrar");
        botonescogerrestaurante.setBounds(50, 180, 100, 25);
        botonescogerrestaurante.setVisible(true);
        botonescogerrestaurante.setEnabled(false);
        botonescogerrestaurante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mostrar = comboboxnombrerestaurante.getSelectedItem().toString();
                String usuario = "";
                for (int i = 0; i < Menu.contservicio; i++) {
                    if (Menu.servicio[i].nombrerest.equals(mostrar)) {
                        usuario = Menu.servicio[i].getNomPlato1()
                                + Menu.servicio[i].getNomPlato2()
                                + Menu.servicio[i].getNomPlato3();
                    }

                }

                comboboxplatos.addItem(usuario);

            }
        });

        botonguardar = new JButton("guardar");
        botonguardar.setBounds(50, 300, 100, 25);
        botonguardar.setVisible(true);
        botonguardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.contservicioes < 100) {

                    nomclise = (String) comboboxnombrecliente.getSelectedItem();
                    restaser = (String) comboboxnombrerestaurante.getSelectedItem();
                    platiser = (String) comboboxplatos.getSelectedItem();
                    entreser = (String) comboboxescogerentretenimiento.getSelectedItem();
                    promser = (String) comboboxescogerentretenimiento.getSelectedItem();
                    
                    Servicios mem = new Servicios();
                    mem.setEntretenimientoserv(entreser);
                    mem.setNombreClienteSer(nomclise);
                    mem.setPlatoServ(platiser);
                    mem.setPlatoServ(promser);
                    mem.setRestauranteSer(restaser);
                    
                    Menu.servicioes[Menu.contservicioes]= mem;
                    
                    Menu.contservicio++;
                    
                    System.out.println(nomclise);
                    
                    JOptionPane.showMessageDialog(null, "Servicios Que Se Eligieron");
                    
                    
                    
                }

            }
        });


        //Agregando
        frameEsServicios.add(comboboxnombrerestaurante);
        frameEsServicios.add(comboboxnombrecliente);
        frameEsServicios.add(lbln);
        frameEsServicios.add(botonescogernombre);
        frameEsServicios.add(botonescogerrestaurante);
        frameEsServicios.add(comboboxescogerentretenimiento);
        frameEsServicios.add(comboboxescogerpromos);
        frameEsServicios.add(comboboxplatos);
        frameEsServicios.add(lbl1);
        frameEsServicios.add(lbl2);
        frameEsServicios.add(lbl3);
        frameEsServicios.add(lbl4);
        frameEsServicios.add(botonguardar);
        NombreRestaurante();
        NombreCliente();
        NombrePlatos();
        Entretenimiento();
        Promos();
        Fondo();
    }

    public void NombreRestaurante() {
        for (int i = 0; i < Menu.contservicio; i++) {
            if (Menu.servicio[i].getNombreRestaurante() != null) {
                comboboxnombrerestaurante.addItem(Menu.servicio[i].getNombreRestaurante());
            }
        }
    }

    public void NombrePlatos() {
        for (int i = 0; i < Menu.contservicio; i++) {
            if (Menu.servicio[i].getNomPlato1() != null && Menu.servicio[i].getNomPlato2() != null && Menu.servicio[i].getNomPlato3() != null) {
                comboboxplatos.addItem(Menu.servicio[i].getNomPlato1());
                comboboxplatos.addItem(Menu.servicio[i].getNomPlato2());
                comboboxplatos.addItem(Menu.servicio[i].getNomPlato3());
            }
        }
    }

    public void NombreCliente() {
        for (int i = 0; i < Menu.contReservacion; i++) {
            if (Menu.Reservaciones[i].getNombreCliente() != null) {
                comboboxnombrecliente.addItem(Menu.Reservaciones[i].getNombreCliente());
            }
        }
    }

    public void Entretenimiento() {
        for (int i = 0; i < Menu.contservicio; i++) {
            if (Menu.servicio[i].getNomEntrete1() != null && Menu.servicio[i].getNomEntrete1() != null && Menu.servicio[i].getNomEntrete3() != null) {
                comboboxescogerentretenimiento.addItem(Menu.servicio[i].getNomPlato1());
                comboboxescogerentretenimiento.addItem(Menu.servicio[i].getNomPlato2());
                comboboxescogerentretenimiento.addItem(Menu.servicio[i].getNomPlato3());
            }
        }
    }

    public void Promos() {
        for (int i = 0; i < Menu.contpromo; i++) {
            if (Menu.promo[i].getNombreP() != null) {
                comboboxescogerpromos.addItem(Menu.promo[i].getNombreP());
            }
        }
    }

}
