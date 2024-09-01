import java.util.Scanner;
	
	public class PizzaWahala{
		public static void main(String... args){


		Scanner sc = new Scanner(System.in);

		double numberOfSlices = 0;
		
		double pricePerBox = 0;

		System.out.println("Enter the number of guest: ");
	
		double numberOfGuests = sc.nextDouble();

		String pizaWahala = """

					Welcome to PIZZA WAHALA HUB
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			PIZZA TYPE		NUMBER OF SLICES	PRICE PER BOX
_____________________________________________________________________________________________________
			
			1>>. Sapa Size		4				2,000
_____________________________________________________________________________________________________

			2>>. Small Money	6				2,400
_____________________________________________________________________________________________________

			3>>. Big boys		8				3,000
_____________________________________________________________________________________________________

			4>>. Odogwu		12				4,200

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

""";

System.out.println(pizaWahala);

String pizzaTypes = sc.next();
if(pizzaTypes.equals("1")){
	pricePerBox = 2000;
	numberOfSlices = 4;
}
else if(pizzaTypes.equals("2")){
	pricePerBox = 2400;
	numberOfSlices = 6;
}
else if(pizzaTypes.equals("3")){
	pricePerBox = 3000;
	numberOfSlices = 8;
}
else if(pizzaTypes.equals("4")){
	pricePerBox = 4200;
	numberOfSlices = 12;
}

double numberOfBoxes = Math.ceil(numberOfGuests / numberOfSlices);
double leftOverSlices = numberOfSlices * numberOfBoxes - numberOfGuests;
double priceToPay = pricePerBox * numberOfBoxes;

System.out.println("You are to buy "+numberOfBoxes+" boxes");
System.out.println("There will be "+leftOverSlices+ " slices left");
System.out.println("Amount to pay: "+priceToPay);




		}

}