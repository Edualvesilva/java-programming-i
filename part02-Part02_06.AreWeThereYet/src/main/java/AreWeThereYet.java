
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("input a number, 4 to quit: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 4) {
                System.out.println(number);
                break;
            }
            System.out.println(number);
        }

    }
}
