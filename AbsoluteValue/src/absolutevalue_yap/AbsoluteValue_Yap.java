/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absolutevalue_yap;

/**
 *
 * @author Me
 */
import javax.swing.JOptionPane;
public class AbsoluteValue_Yap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numbers;
        int temp;
        String num;
        
        num = JOptionPane.showInputDialog("Enter an integer: ");
        
        numbers = Integer.parseInt(num);
        temp = numbers;
        
        if (numbers < 0)
            numbers = -numbers;
        JOptionPane.showMessageDialog(null, "The absolute value of " + temp + " is " + numbers, " Absolute Value", JOptionPane.INFORMATION_MESSAGE);
     JOptionPane.showMessageDialog(null, "That's all");
        System.exit(0);
   
    
    
    }
    
}
