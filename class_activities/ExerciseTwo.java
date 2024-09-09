import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter an Number: ");
            int num = sc.nextInt();
            switch (num % 2){
                case 0:
                    System.out.println("The number is even");
                    break;
                    case 1:
                        System.out.println("The number is odd");
                        break;
                        default:
                            System.out.println("The number is not even");
                            break;


            }
    }
}
