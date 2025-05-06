
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg;
        double sum = 0;
        int inputted = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                avg = sum / inputted;
                break;
            }

            sum = sum + number;
            inputted++;

        }
        
        System.out.println("Average of the numbers: " + avg);
    }
}
