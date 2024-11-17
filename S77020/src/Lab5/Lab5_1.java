/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import javax.swing.JOptionPane;

/**
 *
 * @author Syazni
 */
public class Lab5_1 {
    public static void main(String[] args) {
        
    int currentYear = 2024;
    
        String input = JOptionPane.showInputDialog("Enter the IC number");
        //910507055445   //00 - 24 -> 2000  //25 - 99 -> 1900
        String yearPart = input.substring(0,2);   //91 =1991
        String monthPart = input.substring(2,4);  //05 
        String dayPart = input.substring(4,6);    //07
        
        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        
        //00 - 24 -> 2000  //25 - 99 -> 1900
        if (birthYear <= 24){
            birthYear += 2000;
        } else if (birthYear > 24){
            birthYear += 1900;
        } else
            System.out.println("The ic number is invalid");
         //System.out.println(birthYear);
       
        int age = currentYear - birthYear;
        String message = String.format("Birth date is %02d-%02d-%d\n Age is %d", day, month,birthYear,age);
        JOptionPane.showMessageDialog(null, message);
}
}