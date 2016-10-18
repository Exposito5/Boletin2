package boletin_2_2;

import javax.swing.JOptionPane;

public class Boletin_2_2 {

    public static void main(String[] args) {
        
    float lado;
    lado=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el lado"));
    
    double m=Math.pow(lado,2);
    JOptionPane.showMessageDialog(null,"El área del cuadrado es cuyo lado es"+lado+"su área es de"+m+"cm cuadrados");
    }

    
}