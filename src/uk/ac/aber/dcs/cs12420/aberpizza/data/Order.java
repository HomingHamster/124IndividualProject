package uk.ac.aber.dcs.cs12420.aberpizza.data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Order {
	private Hashtable<Item, Integer> items = new Hashtable<Item, Integer>();
	private Date date;
	private String customerName;
	
	public Order(){
		
	}
	
	/**
	 * set a new customer name.
	 * @param name
	 */
	public void setCustomerName(String name){
		this.customerName = name;
	}

	/**
	 * get the current customer name
	 * @return String customer name
	 */
	public String getCustomerName(){
		return this.customerName;
	}
	
	/**
	 * add a new item into the order and give an amount of that
	 * item to add.
	 * @param item
	 * @param quantity
	 */
	public void addItem(Item item, int quantity){
		this.items.put(item, quantity);
	}
	
	/**
	 * update the quantity of any item currently in the order.
	 * @param item
	 * @param quantity
	 */
	public void updateItemQuantity(Item item, int quantity){
		try {
			this.items.put(item, quantity);
		} catch (Exception e){}
	}
	
	/**
	 * Get the subtotal cost of all the items in the items ArrayList.
	 * @return BigDecimal total cost of all items in order.
	 */
	public BigDecimal getSubtotal(){
		BigDecimal subtotal = new BigDecimal(0);
		for (Entry<Item, Integer> item : this.items.entrySet()){
			subtotal.add(item.getKey().getPrice().multiply(new BigDecimal(item.getValue())));
		}
		return subtotal;
	}
	
	/**
	 * find out if any discounts are satisfied and return the amount to 
	 * be discounted from the total.
	 * @return BigDecimal the amount discounted.
	 */
	public BigDecimal getDiscount(){
		return null;
	}
}
