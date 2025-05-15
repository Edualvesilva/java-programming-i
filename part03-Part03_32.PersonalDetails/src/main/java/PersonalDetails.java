
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        String longestName = "";
        int longestLength = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            int nameLength = parts[0].length();

            if (input.equals("")) {
                break;
            }

            if (nameLength > longestLength) {
                longestLength = nameLength;
                longestName = parts[0];

            }

            int year = Integer.valueOf(parts[1]);

            sum = sum + year;
            count++;
            
            
        }
        avg = (double) sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: "+avg);
    }
}
