import java.util.Scanner;

public class ActivityTwo {
    public static void main(String[] args) {
        Scanner rev = new Scanner(System.in);

       
        System.out.print("Enter a word: ");
        String input = rev.nextLine();

        
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

     
        System.out.println("Reversed string: " + reversed);
    }
}
