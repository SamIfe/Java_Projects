import java.util.Scanner;

	public class MortgageCalculator {
		public static void main(String... args){

			Scanner sc =new Scanner(System.in);

		System.out.println("Enter the principal amount: ");
			double principalAmount;
			principalAmount = sc.nextDouble();

		System.out.println("Enter the annual interest rate: ");
			double interestRate;
			interestRate = sc.nextDouble();

		System.out.println("Enter the duration in year: ");
			double loanDuration;
			loanDuration = sc.nextDouble();


			double monthlyRate = interestRate / 100 / 12;
			double durationOfLoan = loanDuration * 12;

			double powerRate1 = 1 + monthlyRate;
			double powerRate2 = Math.pow(powerRate1, durationOfLoan);

			double monthlyPaymentValue = principalAmount * (monthlyRate * powerRate2) / (powerRate2 - 1);
			

			System.out.printf("Your monthly payment is: %c %.2f ", '$', monthlyPaymentValue);
			



		}
}
		
			
		
			
	


		