import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Perfect number checker:");
        System.out.println("Enter a number:  ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(isPerfectNumber(number));

    }

    private static boolean isPerfectNumber(int number) {

        //since 6 is the smallest perfect number
        if (number < 6) {
            return false ;
        }

        int sum=0 ;
        // every perfect number that is discovered as of now is even.
        int iterationLimit = number/2 ;
        for (int i = 1; i <= iterationLimit; i++) {

            if (number % i == 0) {
                sum+=i ;
            }

        }
        return sum == number;
    }
}
