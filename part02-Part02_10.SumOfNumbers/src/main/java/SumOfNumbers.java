
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int inputted = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            sum = sum + number;
            inputted++;
        }
        System.out.println("Number of numbers : " + inputted);
        System.out.println("Sum of the numbers: " + sum);
    }
}
