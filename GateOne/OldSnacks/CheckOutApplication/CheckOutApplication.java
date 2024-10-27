import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApplication {
	public static void main(String [] args) {
	ArrayList<String> goods =  new ArrayList<>();
	ArrayList<Integer> quantity = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the customer's Name :");
	String name = input.nextLine();
	
	int flag = 1;
	while(flag == 1) {
	
	System.out.println("What did the user buy ? ");
	goods.add (input.next());
	
	System.out.println("How many pieces ?" );
	int pieces = input.nextInt();
	while(pieces < 1) {

	System.out.println("How many pieces ?" );
	pieces = input.nextInt();
		}
	quantity.add (pieces);
	
	System.out.println("How much per unit ?");
	int unit = input.nextInt();
	while(unit < 1) {
		System.out.println("How much per unit ?");
		unit = input.nextInt();

		}

	



}
	}
}	