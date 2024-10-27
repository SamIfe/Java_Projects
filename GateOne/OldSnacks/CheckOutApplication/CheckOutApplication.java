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




	}
}	