/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pay.pkg1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Pay1 {

    /**lefa motsoeneng
     * ST10449687
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = newScanner(System.in);
        double hours;
        double rate;
        double pay = 0;
        
        System.out.println("How many hours did you work?");
        
        hours = keyboard.nextLine();
        
        System.out.println("How much do you get paid per hour?");
        
        rate = keyboard.nextLine();
        
        if (hours <= 40) {
            pay =hours * pay;
            
        } else {
            if (hours >= 40)
                pay = hours * rate * pay;
        }
        System.out.println("You earned $" + pay);
        
    }

    
}
