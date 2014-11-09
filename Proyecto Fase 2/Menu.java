//ya
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

    //VECTORES 
    public static CrearHotel[] hotel = new CrearHotel[5];
    public static int conthotel = 0;
    public static Habitaciones[] habitacion = new Habitaciones[100];
    public static int conthabitacion = 0;
    public static Pys[] promo = new Pys[100];
    public static int contpromo = 0;
    public static CrearServicios[] servicio = new CrearServicios[100];
    public static int contservicio = 0;
    public static Reservacion[] Reservaciones = new Reservacion[100];
    public static int contReservacion = 0;
    public static Servicios[] servicioes = new Servicios[100];
    public static int contservicioes = 0;
    

    JFrame framemenu;
    JButton botonmenu1, botonmenu2, botonmenu3, botonmenu4, botonmenu5, botonmenu6, botonmenu7, botonmenu8, botonmenu9,botonmenu10,botonmenu11,botonmenu12;
    JLabel pantalla, imagen;
    ImageIcon fondo;

    public void Fondo() {

        fondo = new ImageIcon("mari.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        //getLayeredPane().add(imagen, JLayeredPane.FRAME_CONTENT_LAYER);
        imagen.setVisible(true);

        framemenu.add(imagen);
        
        ((JPanel) getContentPane()).setOpaque(false);
        fondo = new ImageIcon(this.getClass().getResource("/Imagenes/mari.jpg"));
        pantalla = new JLabel(fondo);
        pantalla.setIcon(fondo);
        pantalla.setVisible(true);////        getLayeredPane().add(pantalla, JLayeredPane.FRAME_CONTENT_LAYER);
        pantalla.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());

   }

    public void inicio() {
        framemenu = new JFrame("Hoteles de Centro América");
        framemenu.setSize(550, 500);
        framemenu.setVisible(true);
        //framemenu.getContentPane().setBackground(Color.ORANGE);//Color al JFrame
        framemenu.setLocationRelativeTo(null);
        framemenu.setDefaultCloseOperation(framemenu.EXIT_ON_CLOSE);
        framemenu.setLayout(null);

        botonmenu1 = new JButton("Crear Hotel");
        botonmenu1.setBounds(50, 50, 200, 40);
        botonmenu1.setVisible(true);
        botonmenu1.setFocusable(true);
        botonmenu1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrearHotel pri = new CrearHotel(null);
                pri.inicio();

            }
        });

        botonmenu2 = new JButton("Crear Habitaciones");
        botonmenu2.setBounds(270, 50, 200, 40);
        botonmenu2.setVisible(true);
        botonmenu2.setFocusable(true);
        botonmenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Habitaciones pri = new Habitaciones(null);
                pri.inicio();

            }
        });

        botonmenu3 = new JButton("Crear Servicios");
        botonmenu3.setBounds(50, 110, 200, 40);
        botonmenu3.setVisible(true);
        botonmenu3.setFocusable(true);
        botonmenu3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrearServicios pri = new CrearServicios();
                pri.inicio();

            }
        });

        botonmenu4 = new JButton("Crear Promociones");
        botonmenu4.setBounds(270, 110, 200, 40);
        botonmenu4.setVisible(true);
        botonmenu4.setFocusable(true);
        botonmenu4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pys pri = new Pys();
                pri.inicio();
            }
        });

        botonmenu5 = new JButton("Elegir Hotel");
        botonmenu5.setBounds(50, 160, 200, 40);
        botonmenu5.setVisible(true);
        botonmenu5.setFocusable(true);
        botonmenu5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ElegirHotel pri = new ElegirHotel();
                pri.inicio();
            }
        });

        botonmenu6 = new JButton("Reporte de Habitación");
        botonmenu6.setBounds(270, 160, 200, 40);
        botonmenu6.setVisible(true);
        botonmenu6.setFocusable(true);
        botonmenu6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RHabitacion pri = new RHabitacion();
                pri.inicio();

            }
        });

        botonmenu7 = new JButton("Eliminar Reservación");
        botonmenu7.setBounds(270, 220, 200, 40);
        botonmenu7.setVisible(true);
        botonmenu7.setFocusable(true);
        botonmenu7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EliminarReservacion pri = new EliminarReservacion();
                pri.inicio();

            }
        });

        botonmenu8 = new JButton("Control de Huéspedes");
        botonmenu8.setBounds(50, 220, 200, 40);
        botonmenu8.setVisible(true);
        botonmenu8.setFocusable(true);
        botonmenu8.addActionListener(new ActionListener() {
               	public void actionPerformed(ActionEvent e) {
                Control pri = new Control();
                pri.inicio();

            }
        });

        botonmenu9 = new JButton("Reporte de Sevicios");
        botonmenu9.setBounds(50, 280, 200, 40);
        botonmenu9.setVisible(true);
        botonmenu9.setFocusable(true);
        botonmenu9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                RServicio pri = new RServicio();
                pri.inicio();

            }
        });
        
        botonmenu10 = new JButton("Huéspedes Registrados");
        botonmenu10.setBounds(270, 280, 200, 40);
        botonmenu10.setVisible(true);
        botonmenu10.setFocusable(true);
        botonmenu10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ControldeHuespedes pri = new ControldeHuespedes();
                pri.inicio();

            }
        });
        
        botonmenu11 = new JButton("Registro");
        botonmenu11.setBounds(50, 340, 200, 40);
        botonmenu11.setVisible(true);
        botonmenu11.setFocusable(true);
        botonmenu11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               Reservacion pri = new Reservacion();
                pri.inicio();

                
            }
        });
        
        botonmenu12 = new JButton("Servicios");
        botonmenu12.setBounds(270, 340, 200, 40);
        botonmenu12.setVisible(true);
        botonmenu12.setFocusable(true);
        botonmenu12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               Servicios pri = new Servicios();
                pri.inicio();
            }
        });
        //Agregando
        framemenu.add(botonmenu1);
        framemenu.add(botonmenu2);
        framemenu.add(botonmenu3);
        framemenu.add(botonmenu4);
        framemenu.add(botonmenu5);
        framemenu.add(botonmenu6);
        framemenu.add(botonmenu7);
        framemenu.add(botonmenu8);
        framemenu.add(botonmenu9);
        framemenu.add(botonmenu10);
        framemenu.add(botonmenu11);
        framemenu.add(botonmenu12);
      Fondo();
    }

}
