import java.util.Scanner;

//import static java.util.Collections.min;

public class NameMethodManipulation {
    public static void main(String[] args) {
        Me.sayName();
        Me.sayAge();
        Main.exampleOne();

        int a = 10;
        int b = 20;

        int max = Math.min(a, b);
        System.out.println(max);

        String name = "Ifeoluwa O";
        System.out.println(name.isBlank() ? "The requested name is empty" : name);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
       if ((sc.nextInt() % 2) == 0) {
            System.out.println("The number is an Even number");
        }
       else {
           System.out.println("The number is an Odd number");
       }



    }

    private static void min(int i, int i1, int i2) {
    }


}
