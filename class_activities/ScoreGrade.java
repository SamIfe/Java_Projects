import java.util.Scanner;

	public class ScoreGrade {
		public static void main(String[] args) {
		
			Scanner ife = new Scanner(System.in);

			int counter = 1;
			int totalPassed = 0;
			int totalFailed = 0;
			
	
			while(counter <=10) {
			counter = counter + 1;
			System.out.print("Please enter the resuslt: ");
			int number = ife.nextInt();
			
			if(number >= 50) {
			System.out.println("Passed: ");
				totalPassed++;
			} 
                        else {
			System.out.println("Failed: ");
				totalFailed++;
			
			}
				
		}
			System.out.println("\nPassed: " + totalPassed);
			System.out.println("Failed: " + totalFailed);





	}
	
}