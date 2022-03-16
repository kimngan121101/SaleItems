/*
 * author Ngan Hoang 
 * date Nov/26
 * program SaleItems
 * course csc110ab
 */

/* 
 * Example to show how the program works
 * ------Thanksgiving special hours------- 
 * The turkeys in supermarket is on sale; the original price is 20 dollars; if clients buy more than 2 turkeys (assume 5 turkeys) 
 * it will automatically discount 10% over the amount of turkeys that they purchased
 * 
 * the discount amount for 5 turkeys is 10 dollars (price * quantity) * 10/100
 * The revenue of supermarket if customer get discounts will be 90 dollars (total sales - total discount) 
 */

package In_class;
import java.util.Scanner;
public class SalesItemsDriver {

	public static void main(String[] args) { 
		
		Scanner scnr = new Scanner(System.in);
		
		// ask for seller's input
		System.out.println("Please enter number of sales: ");
		int sold_quantity = scnr.nextInt(); 
		
		// open and duplicate SaleItems file
		SaleItems saleProgram = new SaleItems(sold_quantity);
		
		// type-in necessary inputs
		System.out.print("The cost of product ");
		saleProgram.getCost(scnr.nextDouble());
		System.out.println(saleProgram.setCost());
		
		System.out.print("The minimum bulk quantity ");
		saleProgram.getBulkMinimum(scnr.nextInt());
		System.out.println(saleProgram.setBulkMinimum());
		
		System.out.print("The discount percentage ");
		saleProgram.getDiscount(scnr.nextDouble());
		System.out.println(saleProgram.setDiscount());
		
		// register for Sale Program method
		saleProgram.registerSale();
		
		// execute the results
		saleProgram.displaySales();
		
		scnr.close();
	}

}
