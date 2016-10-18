/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Double n1, n2;
    n1= Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer número "));
    n2= Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer número "));
    JOptionPane.showMessageDialog(null,"La Suma de los números da "+ (n1+n2)+"\nLa Resta de los números da "+ (n1-n2)+ "\nLa Multiplicación de los números da "+ (n1*n2)+ "\nLa División de los números da "+ (n1/n2));
    }
    
}
