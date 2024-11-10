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
public class L4q5 {
    public static void main(String[] args) {
        
        double km = 1000;
        double miles = 1609;
        // Input distance in meters
        String distanceStr = JOptionPane.showInputDialog("Enter distance in meters:");
        double distance = Double.parseDouble(distanceStr);

        // Input time in hours, minutes, and seconds
        String hoursStr = JOptionPane.showInputDialog("Enter time in hours:");
        int hours = Integer.parseInt(hoursStr);

        String minutesStr = JOptionPane.showInputDialog("Enter time in minutes:");
        int minutes = Integer.parseInt(minutesStr);

        String secondsStr = JOptionPane.showInputDialog("Enter time in seconds:");
        int seconds = Integer.parseInt(secondsStr);

        // Convert time to total seconds
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Calculate speeds
        double metersPerSec = distance / totalSeconds;
        double kmPerHour = (distance / km) / (totalSeconds / 3600);
        double milesPerHour = (distance / miles) / (totalSeconds / 3600);

        // Display results
        String message = String.format("Speed in meters per second is : %.2f", metersPerSec) +
                String.format("\nSpeed in kilometers per hour is : %.2f", kmPerHour) +
                String.format("\nSpeed in miles per hour is : %.2f", milesPerHour);
        JOptionPane.showMessageDialog(null, message);
//        JOptionPane.showMessageDialog(null, "Speed in meters per second: " + metersPerSec);
//        JOptionPane.showMessageDialog(null, "Speed in kilometers per hour: " + kmPerHour);
//        JOptionPane.showMessageDialog(null, "Speed in miles per hour: " + milesPerHour);
    }
}
