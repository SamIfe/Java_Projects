import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApplication {
	public static void main(String [] args) {
		ArrayList<String> itemsPurchased =  new ArrayList<>();
		ArrayList<Integer> quantityPurchased = new ArrayList<>();
		ArrayList<Integer> priceForEach = new ArrayList<>();

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
	
		System.out.println("Enter 1 to add more items or any value to stop: ");
		control = input.nextInt();




		}

		
		System.out.println("What is your name ?");
		String cashierName = input.next();

		System.out.println("Any discount applied: : ");
		int discount = input.nextInt();

		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL : 03293828343");
		System.out.println("DATE : 27/10/2024 , 12 : 50 : 11 pm");
		System.out.println("Cashier:" + cashierName);
		System.out.println("Customer Name: "+ name);
		System.out.println("========================================================================================================================");
		System.out.println("\t\t\t\t ITEM \tQTY \tPRICE \t\tTOTAL");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");





	}
}	