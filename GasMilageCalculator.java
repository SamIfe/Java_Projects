// Question *4.17

import java.util.Scanner;

	public class GasMilageCalculator{
		public static void main(String... arg){
			Scanner gas= new Scanner(System.in);


		System.out.print("Enter number of trips: ");
			int trips = gas.nextInt();


			int milesTotal = 0;
			int totalGallons = 0;

		for (int counter = 1; counter <= trips; counter++) {
		
			System.out.print("Enter the miles driven: ");
			int miles = gas.nextInt();
			milesTotal = milesTotal + miles;

			System.out.print("Enter the galons used: ");
			int gallons = gas.nextInt();
	
			totalGallons = totalGallons + gallons;

			float average = miles/gallons;


		}

		float totalAverage = milesTotal / totalGallons;
			System.out.print("The combined miles-per-gallons " + totalAverage);


			
	}
}