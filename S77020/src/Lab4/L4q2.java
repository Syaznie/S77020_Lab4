/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author Syazni
 */
public class L4q2 {
    public static void main(String[] args){
        final double PI = 3.14159;
//        JOptionPane.showMessageDialog(null, "Enter the radius");
        String input = JOptionPane.showInputDialog("Enter the radius");
        double radius = Double.parseDouble(input);
        double diameter = 2*radius;
        double circumference = 2*PI*radius;
        double area = PI*radius*radius;
        String message = String.format("The diameter is %.2f ",diameter)+
                String.format("\nThe circumference is %.2f ",circumference)+
                String.format("\nThe area is %.2f ",area);
        
//        JOptionPane.showMessageDialog(null, "The diameter is "+diameter);
        JOptionPane.showMessageDialog(null, message);
//        JOptionPane.showMessageDialog(null, "The area is "+area);
        
    }
}
