
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pay1;

import java.util.Scanner;

/**lefa motsoeneng
 *ST10449687
 * @author 
 */
public class PAY1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        double hours;
        double rate;
        double pay = 1.5;
        
        
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();
        System.out.print("How much do you get paid per hour? ");
        rate = keyboard.nextDouble();
        
        
        
        if (hours <= 40) {
            
            pay = hours * pay;
                    } else {
            
            if (hours >= 40)
                
                pay = hours * rate * pay;
                    
        
        }
        System.out.println("You earned $" + pay);
    }
        }
    
    

