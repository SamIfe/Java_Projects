public class ArrayPartternFlicks{
	public static void main(String... arg){
	
String[][] partternManipulation = {
{"X", "O", "X", "O"},
{"X", "O", "X", "O"}, 
{"X", "O", "X", "O"}
};

for(int counter = 0; counter < partternManipulation.length; counter++) {
	for(int count = 0; count < partternManipulation[counter].length; count++) 
		System.out.print(partternManipulation[counter][count] + " ");



		System.out.println();	

		}

	}
}