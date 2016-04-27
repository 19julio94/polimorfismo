package ejpolimorfismo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class EjPolimorfismo {

    
    public static void main(String[] args) {
        
        ArrayList <Animal> lista = new ArrayList();
        Animal can1 = new Can ("Brisa","Palleiro");
        Animal gato1 = new Gato ("Minino", "Gris");
        
        lista.add(can1);
        lista.add(gato1);
        
        JOptionPane.showMessageDialog(null, lista);
    }
    
}
