/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    float grados,kelvin,fahren;
    
    grados=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados centígrados que quiere usted convertir a kelvin y a fahrenheit "));
    JOptionPane.showMessageDialog(null,grados+" grados son"+(grados-273.15)+" kelvin"+"\n"+grados+"grados son"+(1.8*grados+32)+"fahrenheit");
    }
    
}
