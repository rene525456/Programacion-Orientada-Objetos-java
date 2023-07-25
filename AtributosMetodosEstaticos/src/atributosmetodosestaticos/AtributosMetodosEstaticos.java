
package atributosmetodosestaticos;

import javax.swing.JOptionPane;


public class AtributosMetodosEstaticos {


    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Ingrese el número 1");
//        System.out.println(name);
        
        int x = 11, y = 5, z = 3;
        x = y++;
        z = y++;
        System.out.println("x = " + x + " y = " + y + " z = " + z);
        

    }
    
}
