/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_11;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    float s,c,km,d;
    
    s=Float.parseFloat(JOptionPane.showInputDialog("Inserte el sueldo"));
    c=Float.parseFloat(JOptionPane.showInputDialog("Inserte las ventas para el calculo de la comisión a recibir"));
    km=Float.parseFloat(JOptionPane.showInputDialog("Inserte el quilometraje total para el calculo de quilometraje"));
    d=Float.parseFloat(JOptionPane.showInputDialog("Inserte el número de días de desplazamiento para el calculo de dietas"));
    
    c=(c/100*5);
    km=(km*2);
    d=(d*30);
    
    JOptionPane.showMessageDialog(null,"el sueldo líquido son "+(s+c+km+d)+" €");
    }
    
}
