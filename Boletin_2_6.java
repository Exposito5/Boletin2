/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float tarifa,pagado;
    tarifa= Float.parseFloat(JOptionPane.showInputDialog("La tarifa es de "));
    pagado= Float.parseFloat(JOptionPane.showInputDialog("Has pagado "));
    JOptionPane.showMessageDialog(null, "El descuento es de "+ ((tarifa-pagado)*100/tarifa+"%"));
            
    }
    
}
