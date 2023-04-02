import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

// Read input string from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        // Reverse the order of the words
        int left = 0, right = words.length - 1;
        while (left < right) {

            // checking if the left string is numeric
            if (Character.isDigit(words[left].charAt(0))) {
                left++;
            }

            // checking if the right string is numeric
            while(Character.isDigit(words[right].charAt(0))) {
                right--;
            }
            if (left < right) {
                String temp = words[left];
                words[left] = words[right];
                words[right] = temp;
                left++;
                right--;
            }

        }

        // Join the words back together into a single string
        String output = String.join("", words);

        // Print the final output
        System.out.println("Output: " + output);
    }

}
