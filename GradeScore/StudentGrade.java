import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
	public static void main (String...arg) {
		Scanner grade = new Scanner (System.in);
		System.out.print ("\n How many students do you have? : ");
		int numberOfStudents = grade.nextInt();

		System.out.print ("How many subject do they offer? : ");
		int numberOfSubjects = grade.nextInt();
		System.out.println ("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println ("Saved successfully \n\n");


		double scores = 0;
		double average = 0;
		double [][] collectScores = new double [numberOfStudents] [numberOfSubjects];
		
		for (int row = 0; row < numberOfStudents; row++) {
			System.out.println ("Entering score for student " + (row + 1));

		for (int column = 0; column < numberOfSubjects; column++) {

			do {
				System.out.print ("Enter score for subject " + (column + 1) + ": ");
				scores = grade.nextDouble();
				if (scores <= 0 || scores >= 100) {
					System.out.println("Invalid input; please enter number of scores between 0 and 100 ");
			
				}

			} while (scores <= 0 || scores >= 100);
			collectScores [row][column] = scores;

		}
		
			System.out.println ("\n Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println ("Saved successfully \n");

		}



	}



}