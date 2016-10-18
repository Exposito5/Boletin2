/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    long b100,b20,b5,m;
    
    b100=Long.parseLong(JOptionPane.showInputDialog("¿Cuantos billetes de 100€ hay?"));
    b20=Long.parseLong(JOptionPane.showInputDialog("¿Cuantos billetes de 20€ hay?"));
    b5=Long.parseLong(JOptionPane.showInputDialog("¿Cuantos billetes de 5€ hay?"));
    m=Long.parseLong(JOptionPane.showInputDialog("¿Cuantas monedas de 1€ hay?"));
    
    JOptionPane.showMessageDialog(null,((b100*100)+(b20*20)+(b5*5)+m)+"€");
    }
    
}
