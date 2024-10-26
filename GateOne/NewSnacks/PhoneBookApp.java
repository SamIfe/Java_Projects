import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBookApp {
	public static void main (String...args) {



System.out.print("""
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


AFEEZ'S PHONEBOOK APPLICATIONS FOR EFFICIENT CONTACT MANAGEMENT.



+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
""");

		Scanner sc = new Scanner (System.in);
		//System.out.print ("How many contact do you want to save? ");
		//int contact = sc.nextInt();
		ArrayList<String> contactInfo = new ArrayList<>();

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

				System.out.println ("Enter last name: ");
				String lastName = sc.nextLine();
				
				
				System.out.print ("Enter phone number: ");
				String phoneNumber = sc.nextLine();

				contactInfo.add(firstName + " " + lastName + " - " + phoneNumber);


				System.out.println("====================================================");

				

				for(String element : contactInfo) {
					System.out.println(element);


				}
				System.out.println("The contact has been added successfully");

				System.out.println("====================================================");


				

			}	
					


	}



}

