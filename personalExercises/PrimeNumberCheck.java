public class PrimeNumberCheck {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
	boolean isPrime = true;

        if (number < 2) {
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
