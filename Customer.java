/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tn0786647
 */
public class Customer {
    private String name;
    ArrayList < Product > CartItem = new ArrayList < Product > ();
    ArrayList <Product> BoughtItems = new ArrayList <Product>();
    double thetotal = 0;
    double tax = .076;
    double subtotal = 0;
    int quanity = 0;

    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() 
    {
    	return name;
    }
    public void displayList() {

        Scanner vc = new Scanner(System.in);
        String choice = " ";
        File fn = new File("Games.txt");
        File bn = new File("Books.txt");
        System.out.println("Games Available:");
        System.out.println(" ");
        try {
            Scanner readFile = new Scanner(fn);
            while (readFile.hasNext()) {
                String[] reader = new String[6];
                reader = readFile.nextLine().split(",");
                for (String games: reader) {
                    System.out.println(games);

                }
                
                Product aGame = new Product();
                aGame.setCode(reader[0]);
                aGame.setItemName(reader[1]);
                aGame.setPrice(Double.parseDouble(reader[3]));
                String description = reader[2];
                String price = reader[3];
                String rating = reader[4];
                CartItem.add(aGame);

            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        System.out.println(" ");
        System.out.println("Books Available:");
        System.out.println(" ");
        String[] reader = new String[6];
        try {
            Scanner readFile = new Scanner(bn);
            while (readFile.hasNext()) {
                
                reader = readFile.nextLine().split(",");

                for (String books: reader) {
                    System.out.println(books);
                    
                    Book aBook = new Book();
                    aBook.setCode(reader[0]);
                    aBook.setItemName(reader[1]);
                    aBook.setDescription(reader[2]);
                    aBook.setPrice(Double.parseDouble(reader[3]));
                    aBook.setAuthor(reader[4]);
                    CartItem.add(aBook);
                }

            }

           
            while (!choice.equals("N")) {
                System.out.println("Which would you like? ");
                choice = vc.nextLine();
                
                for (Product items: CartItem) {
                        if (choice.equals(items.getCode())) {
                            System.out.println("How many would you like? ");
                            quanity = vc.nextInt();
                            items.setQuanity(quanity);
                            System.out.println("Quanity: " + items.getQuanity());
                            System.out.println("Item: " + items.getItemName());
                            
                            vc.nextLine();
                            System.out.println("Price: $" + items.getPrice());
                            subtotal = items.getPrice() * items.getQuanity();
                            
                            System.out.printf("Subtotal: $%.2f\n", subtotal);
                            
                           
                            System.out.println("Would you like another?");
                            choice = vc.nextLine();
                            BoughtItems.add(items);
                            
                            
                            
                            
                            
                            
                        }
                       
                }
                    

                }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
       

    }

public void printReceipt() 
{
	System.out.println("*******************\nFroggy's Book Store\n*******************");
	System.out.println("Quanity\t\t" + "Item\t\t\t" + "Price\t" + "Total" );
	for(Product receipt: BoughtItems) 
    {
    	thetotal = thetotal + receipt.getPrice();
    	subtotal = thetotal * receipt.getQuanity();
    	
    	System.out.println(receipt.getQuanity() + "\t\t" + receipt.getItemName() + "\t" + "$" + receipt.getPrice() + "\t" + "$" + receipt.getTotal()*receipt.getQuanity() );

    	
    	
    	
    }
	tax = tax * subtotal;
	subtotal = subtotal + tax;
	System.out.printf("Total: $%.2f\n", thetotal);
	System.out.printf("Tax: $%.2f\n", tax);
	System.out.printf("Subtotal: $%.2f\n", subtotal);
}

}