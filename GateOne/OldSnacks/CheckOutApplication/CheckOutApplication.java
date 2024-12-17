import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApplication {
	public static void main(String [] args) {
		ArrayList<String> itemsPurchased =  new ArrayList<>();
		ArrayList<Integer> quantityPurchased = new ArrayList<>();
		ArrayList<Integer> priceForEach = new ArrayList<>();

		System.out.println("""
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		WELCOME TO SEMI-COLON AFRICA MULTI-PURPOSE STORE.

			ADDRESS : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
			PHONE NUMBER: +23490884456.
			EMAIL: store@semicolonafrica.com.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


""");

		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter customer's name :");
		String name = input.nextLine();
	
		int control = 1;
		while(control == 1) {
	
			System.out.println("What items did the user purchase? ");
			itemsPurchased.add (input.next());
	
			System.out.println("How many pieces ?" );
			int pieces = input.nextInt();
			while(pieces < 1) {

				System.out.println("How many pieces ?" );
				pieces = input.nextInt();
			}
			quantityPurchased.add (pieces);
	
				System.out.println("How much per unit ?");
				int unit = input.nextInt();
			while(unit < 1) {
				System.out.println("How much per unit ?");
				unit = input.nextInt();

			}

			priceForEach.add(unit);
	
		System.out.println("Enter 1 to add more items or any numeric value to stop: ");
		control = input.nextInt();




		}

		System.out.println("Any discount applied: : ");
		int discount = input.nextInt();		

		System.out.println("What is your name ?");
		String cashierName = input.next();

		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL : 03293828343");
		System.out.println("DATE : 27/10/2024 , 12 : 50 : 11 pm");
		System.out.println("Cashier:" + cashierName);
		System.out.println("Customer Name: "+ name);

		System.out.println("====================================================================================================================");


		System.out.printf("%-20s%-15s%-15s%-20s%n", "ITEM(s)", "QTY", "PRICE", "TOTAL" );


		System.out.println("-------------------------------------------------------------------------------------------------------------------- \n");


		double subtotal = 0;
		for(int index = 0; index < itemsPurchased.size(); index++){
		double total = 0;
	 	total = quantityPurchased.get(index) * priceForEach.get(index);
		subtotal += total;
		System.out.printf("%-20s%-15d%-15d%-20.2f%n",itemsPurchased.get(index),quantityPurchased.get(index), priceForEach.get(index), total);
		

		}

		
		double totalDiscount = subtotal - discount;
		System.out.println("--------------------------------------------------------------------------------------------------------------------");

		System.out.print("Sub Total : " + subtotal);
		System.out.println("Discount at " + discount + ": " + totalDiscount);


		double vat = (subtotal / 100) * 7.50;
		System.out.println("VAT @ 7.50% : " + vat);
		System.out.println("====================================================================================================================");
	 	double billtotal = totalDiscount + vat ;

		System.out.println("Bill Total:  " + billtotal);
		System.out.println("====================================================================================================================");


		System.out.println("HERE IS YOUR RECEIPT Of " + billtotal + "\n THANK YOU FOR BEING A VALUED CUSTOMER OF SEMI-COLON AFRICA!!" );


		System.out.println("====================================================================================================================");





	}
}	