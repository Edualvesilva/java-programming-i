
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        String longName = "";
        while (true) {
            String input = scanner.nextLine();
            int length = input.length();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int number = Integer.valueOf(parts[1]);

            if (number > length) {
                longName = parts[0];
            }

        }
        System.out.println("Longest name: "+longName);
    }
}
