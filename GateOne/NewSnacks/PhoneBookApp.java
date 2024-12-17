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
		String firstName;
		String lastName;
		String phoneNumber;

		System.out.println("""
		Main Menu
			1. Add Contact 
			2. Remove Contact
			3. Find contact by phone number
			4. Find contact by first name
			5. Find contact by last name
			6. Edit contact
			7. Exit

			Enter your choice 
""");
			int choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {
			case 1:				
				
					System.out.println ("Enter first name: ");
					firstName = sc.nextLine();

                       			
					System.out.println ("Enter last name: ");
					lastName = sc.nextLine();

                       							
					System.out.print ("Enter phone number: ");
					phoneNumber = sc.nextLine();
				
				contactInfo.add(firstName + " " + lastName + " - " + phoneNumber);


				System.out.println("====================================================");

				for(int element = 0; element < contactInfo.size(); element++) {
					System.out.print("New contact: \n " + contactInfo.get(element));
				}

				System.out.println (" ");
				System.out.println("The contact added successfully");
				System.out.println("====================================================");	
				break;


			//case 2:
				

				
		}				

	

	}




}


