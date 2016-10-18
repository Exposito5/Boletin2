/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    final int METROS = 1852;
    double millas;
    
    millas= Double.parseDouble(JOptionPane.showInputDialog("Inserte el número  de millas"));
    JOptionPane.showMessageDialog(null,millas+"millas son"+(millas*METROS)+"metros");
    }
    
}
