/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float i,a;
    int t;
    double n;
    
    n= Float.parseFloat(JOptionPane.showInputDialog("Introduzca el nominal"));
    i= Float.parseFloat(JOptionPane.showInputDialog("Introduzca el interés anual"));
    t= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nº de años a pagar"));
    
    a= (1+i);
    i= i/1200;
    t= t*12;
    
    double m=Math.pow(a,t);
    
    JOptionPane.showMessageDialog(null,"La renta mensual es de "+((n*m*i)/((m)-1))+"euros");
    
    }
    
}
