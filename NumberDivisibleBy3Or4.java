// Question *5.11

import java.util.Scanner;

	public class NumberDivisibleBy3Or4{
		public static void main(String... arg){
			Scanner number= new Scanner(System.in);


			int counter = 0;
			for(int count = 100; count <= 200; count++) {

			if(count % 3 == 0 || count % 4 == 0) counter++;

			System.out.print(count + " ");
			if(counter % 10 == 0) {
			System.out.print(" ");


					}

			
				}
		




		}
}

