
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int inputted = 0;

        while (true) {
            System.out.println("input: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;

            } else if (number > 0) {
                sum = sum + number;
                inputted++;
                continue;
            }

        }

        if (inputted <= 0) {
            System.out.println("Cannot calculate the average");
        }
        double avg = sum / inputted;
        System.out.println(avg);

    }
}
