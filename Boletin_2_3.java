/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double euros;
    euros= Float.parseFloat (JOptionPane.showInputDialog("Introduzca la cantidad de euros"));
    JOptionPane.showMessageDialog(null,"La cantidad de dólares que le corresponde es de "+ euros*0.89);
    }
    
}
