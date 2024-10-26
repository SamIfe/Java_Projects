import java.util.Scanner;
import java.util.Arrays;
public class PhoneBookApp {
	public static void main (String...args) {

		Scanner sc = new Scanner (System.in);
		System.out.print ("How many contact do you want to save? ");
		int contact = sc.nextInt();
		String [] contactInfo = new String [contact];

		System.out.println("""
		Main Menu
			1. Add Contact 
			2. Remove Contact
			3. Find contact by phone number
			4. find contact by first name
			5. find contact by last name
			6. edit contact

			Enter your choice 
""");

			int choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println ("Enter first name: ");
				String firstName = sc.nextLine();
				sc.nextLine();

				System.out.println ("Enter last name: ");
				String lastname = sc.nextLine();
				
				
				System.out.print ("Enter phone number: ");
				String phoneNumber = sc.nextLine();

				for (int check = 0; check < contactInfo.length(); check++) {

				}

				

			}	
					


	}



}