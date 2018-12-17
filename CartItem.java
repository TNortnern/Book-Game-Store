/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.Scanner;


/**
 *
 * @author tn0786647
 */
public class CartItem
{
    public static void main(String[] args) 
    {
    	Scanner ms = new Scanner(System.in);
        System.out.println("WELCOME TO FROGGY'S BOOK STORE!");
        System.out.println("What is your name?");
        Customer cust = new Customer(ms.nextLine());
        System.out.println("Hello, " + cust.getName() + ".");
        System.out.println("Here is a list of items we have: ");
        System.out.println(" ");
        cust.displayList();
        cust.printReceipt();
       
        
        
        
    }
    
}
