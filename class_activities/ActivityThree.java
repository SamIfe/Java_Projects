import java.util.Scanner;

public class ActivityThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		
	        System.out.print("Enter an Integer: ");
		int number;
		number = sc.nextInt();

		if(number % 2 == 0) {
		System.out.println("Even Number");
		}
		 if(number % 2 != 0) {

		System.out.println("Odd Number");
			
		}
	}
}
		
		
