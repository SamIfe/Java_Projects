// Question *5.1

import java.util.Scanner;

	public class CreditLimitCalculator{
		public static void main(String... arg){
			Scanner creditLimit= new Scanner(System.in);

		
		System.out.print("Enter the account number: ");
			int accountNumber = creditLimit.nextInt();

		System.out.print("Enter the the balance at the beginning of the month: ");
			int balance = creditLimit.nextInt();

		
		System.out.print("Enter the total of all items charges by the customer this month: ");
			int totalChargesByCustomer = creditLimit.nextInt();

		
		System.out.print("Enter the total of all credits applied to the customer's account this month: ");
			int totalCreditToCustomer = creditLimit.nextInt();

		
		System.out.print("Enter the allowed credit limit: ");
			int allowedCreditLimit = creditLimit.nextInt();

			
			int newBalance = accountNumber + balance - totalChargesByCustomer;

			System.out.print(newBalance);

			if(newBalance > totalCreditToCustomer) {
			System.out.print(newBalance);

			}








		}
}
