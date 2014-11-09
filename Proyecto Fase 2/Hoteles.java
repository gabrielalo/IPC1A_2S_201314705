//ya
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Hoteles{

    public static void main(String[] args) {
        new Menu().inicio();
        for (int i = 0; i < Menu.hotel.length; i++) {
        	Menu.hotel[i] = new CrearHotel(null);

        }
        
        for(int i=0;i<Menu.habitacion.length;i++){
        	Menu.habitacion[i]=new Habitaciones(null);
        }
        
   
        try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            
        }
        catch(Exception e){ 
        e.printStackTrace();

        }
        Menu f = new Menu();

    }

}
