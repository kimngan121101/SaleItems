/*
 * author Ngan Hoang 
 * date Nov/26
 * program SaleItems
 * course csc110ab
 */

// this SaleItems.java will serve for SaleItemsDriver.java
package In_class;

public class SaleItems { 
	
	// declare variables 
	private int number_sold; 
	private double total_sales;
	private double total_discounts; 
	private double cost_per_item ;
	private int bulk_quantity;
	private double discount_percentage;
	private double new_price;
	
	// declare construction
	public SaleItems(int number_sold) {
		this.number_sold = number_sold;	
	}

	// declare getter and setter for cost/item, bulk quantity, discount
	public void getCost(double cost_per_item) {
		this.cost_per_item = cost_per_item;
	}
	public double setCost () {
		return cost_per_item;
	}
	public void getBulkMinimum (int bulk_quantity) {
		this.bulk_quantity = bulk_quantity;
	}
	public int setBulkMinimum () {
		return bulk_quantity;
	}
	public void getDiscount (double discount_percentage) {
		this.discount_percentage = discount_percentage /100;
	}
	public double setDiscount () {
		return discount_percentage;
	}
	
	// create helper method to execute main function
	public void registerSale () {
		if (this.number_sold >= this.bulk_quantity) {
			new_price = this.cost_per_item - (this.cost_per_item * this.discount_percentage);
			total_sales = new_price * number_sold;
		}
		else
			total_sales = this.cost_per_item * number_sold;
		
		cal_discount();
	}
	
	// private algorithms
	private double cal_discount () {
		return total_discounts = (this.cost_per_item * this.number_sold) - total_sales ;
	}
	
	// generate the result
	public void displaySales() {
		System.out.println("Number of Sales "+ this.number_sold);
		System.out.printf("Total discount is %.1f \n", total_discounts);
		System.out.printf("Total Revenue after being deducted is %.1f", total_sales);
		
	}
}
