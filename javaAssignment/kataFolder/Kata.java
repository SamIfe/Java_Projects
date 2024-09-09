import java.util.Scanner;

public class Kata {
	public static void main(String... args){

		Scanner sc = new Scanner(System.in);

			
		System.out.print("Enter an integer: ");
		int firstNumber;
		firstNumber = sc.nextInt(); 
		System.out.println(isEven(firstNumber));
		
		System.out.print("Enter a number: ");
		int primeNumber;
		primeNumber = sc.nextInt();
		System.out.println(isPrime(primeNumber));

		System.out.print("Enter the first integer: ");
		int difference1 = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int difference2 = sc.nextInt();
		System.out.println(positiveDifference(difference1, difference2));

		System.out.print("Enter the first integer: ");
		int numberOne = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int numberTwo = sc.nextInt();
		System.out.print(calculateQoutient(numberOne, numberTwo));



		

		}


		public static boolean isEven(int even) {
		
		if(even % 2 == 0) {

		return true;
		}
		return false;

		
		}
		

		public static boolean isPrime (int numberPrime){

		for(int counter = 1; counter <= 10; counter++)
	
		if(numberPrime % 2 == counter++) {

		return true;
		}
		return false;
		
			
		}
		
		public static int positiveDifference(int numb1, int numb2) {
		return Math.abs(numb1 - numb2);
		}

		public static float calculateQoutient(int number1, int number2) {
		if(number2 == 0) {
		return 0;
		}
		return number1 / number2;
		}

}


