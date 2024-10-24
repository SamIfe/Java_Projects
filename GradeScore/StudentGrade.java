import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
	public static void main (String...arg) {
		Scanner grade = new Scanner (System.in);
		System.out.println ("How many students do you have?");
		int numberOfStudents = grade.nextInt();

		System.out.println ("How many subject do they offer? ");
		int numberOfSubjects = grade.nextInt();
		System.out.println ("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println ("Saved successfully");




		double [][] collectScores = new double [numberOfStudents] [numberOfSubjects];
		
		for (int row = 0; row < numberOfStudents; row++) {
			System.out.println ("Entering score for student " + (row + 1));

		for (int column = 0; column < numberOfSubjects; column++) {
			System.out.println ("Enter score for subject + (column + 1)");

		}
			System.out.println ("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println ("Saved successfully");

		}



	}



}