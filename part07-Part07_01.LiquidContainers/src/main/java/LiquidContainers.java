
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int second = 0;
        int first = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {

                if (amount > 100 || first + amount > 100) {
                    first = 100;
                    continue;

                } else if (amount <= 0) {
                    continue;
                }
                first += amount;
            }

            if (command.equals("move")) {
                if (amount <= 0) {
                    
                    continue;
                }

                if (amount > first) {
                    amount = first;
                }

                first -= amount;
                second += amount;

                if (second > 100) {
                    second = 100;
                }

            }

            if (command.equals("remove")) {

                if (amount > second) {
                    second = 0;
                    continue;
                }
                second -= amount;

            }

        }
    }

}
