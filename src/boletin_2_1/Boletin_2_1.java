/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class Boletin_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Comentario Comentado
     
    float base,altura;
    
    base= Float.parseFloat(JOptionPane.showInputDialog("inserte la base"));
    altura= Integer.parseInt(JOptionPane.showInputDialog("inserte la altura"));

    JOptionPane.showMessageDialog(null,"El area del triangulo es "+ base*altura/2);
    }
    
}
