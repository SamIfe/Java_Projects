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


		int scores = 0;
		double average = 0;
		int [][] collectScores = new int [numberOfStudents] [numberOfSubjects];
		int total = 0;
		
		for (int row = 0; row < numberOfStudents; row++) {
			System.out.println ("Entering score for student " + (row + 1));

		for (int column = 0; column < numberOfSubjects; column++) {

			do {
				System.out.print ("Enter score for subject " + (column + 1) + ": ");
				scores = grade.nextInt();
				if (scores <= 0 || scores >= 100) {
					System.out.println("Invalid input; please enter number of scores between 0 and 100 ");
			
				}

			} while (scores <= 0 || scores >= 100);
			collectScores [row][column] = scores;

		}
		

			System.out.println ("\n Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println ("Saved successfully \n");

		}

		System.out.print("======================================================\n");
		System.out.print("STUDENT  \t");
		for (int print = 0; print < numberOfSubjects; print++){
			System.out.print("SUB" + (print + 1) + "\t");

		}

		System.out.print("TOT\tAVE\tPOS\n");
		System.out.print("======================================================\n");

		for(int sum = 0; sum < collectScores.length; sum++) {
			average = 0;
			total = 0;
			System.out.print("Student" + (sum + 1) + "\t");
			for(int sum2 = 0; sum2 < collectScores[sum].length; sum2++) {
				total += collectScores[sum][sum2];
				System.out.print(collectScores[sum][sum2] + "\t");
				average = total / numberOfSubjects;


			}

				System.out.println(total + "\t" + average);
				
		}
			
		System.out.println("======================================================");
		System.out.println("======================================================");


		System.out.print("SUBJECT SUMMARY \n");

		

	}



}