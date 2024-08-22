import java.util.Scanner;
	public class ActivityOne {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);


			System.out.print("Enter the number of students: ");
        		int numberOfStudents = sc.nextInt();
       			sc.nextLine();

			String lowestScoreStudent = "";
       			String secondLowestScoreStudent = "";
        		int lowestScore = Integer.MAX_VALUE;
       			int secondLowestScore = Integer.MAX_VALUE;

		for (int i = 0; i < numberOfStudents; i++) {
           	System.out.print("Enter the name of student: " + (i + 1) + ": ");
            	String name = sc.nextLine();
		System.out.print("Enter the score of " + name + ": ");
            	int score = sc.nextInt();
            	sc.nextLine();

 		if (score < lowestScore) {
                secondLowestScore = lowestScore;
                secondLowestScoreStudent = lowestScoreStudent;

                lowestScore = score;
                lowestScoreStudent = name;
            } else if (score < secondLowestScore) {
                secondLowestScore = score;
                secondLowestScoreStudent = name;

		System.out.println("\nStudent with the lowest score: " + lowestScoreStudent);
        System.out.println("Student with the second-lowest score: " + secondLowestScoreStudent);

            }
        }





			
			
			
		
	





}
			
	}