/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author tn0786647
 */
public class Product 
{
    private String code, ItemName, description;
    private double price;
    private double total;
    private int quanity;
    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    
   
    
    public double getPrice()
    {
        return price;
    }
    
    public double getTotal() 
    {
    	total = total + price;
    	return total;
    }
    
    public void test() 
    {
    	
    	System.out.println("Price is: " + price + " code is: " + total);
    	
    }

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
}
