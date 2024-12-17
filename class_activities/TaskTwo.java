import java.util.Scanner;
public class TaskTwo{
	public static void main (String...arg){
	Scanner input = new Scanner(System.in); 
	float sum = 0;
	float average= 0;
	for(int number = 0; number < 10; number++){
	System.out.print("Enter number: ");
	sum += input.nextInt();

		}
	average = sum / 10;
	System.out.print("The average of the sum number is " + average);

	}

}