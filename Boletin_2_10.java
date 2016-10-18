/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int dinero;
        int b20;
        
        dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de dinero"));
        b20=(dinero%100)/20;
        JOptionPane.showMessageDialog(null,dinero+"€ son: \n"+(dinero/100)+" billetes de 100 \n"+((dinero%100)/20)+" billetes de 20 \n"+(((dinero%100)%20)/5)+" billetes de 5 \n"+(((dinero%100)%20)%5)+" monedas de un euro");
        
    }
    
}
