
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        String old = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int number = Integer.valueOf(parts[1]);

            if (number > greatest) {
                greatest = number;
                old = parts[0];
            }

        }
        System.out.println("Name of the oldest: " + old);
    }
}
