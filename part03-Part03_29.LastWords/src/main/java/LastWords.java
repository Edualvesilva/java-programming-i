
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");

            if (input.equals("")) {
                break;
            }
            int wow = pieces.length - 1;
            System.out.println(pieces[wow]);

        }

    }
}
