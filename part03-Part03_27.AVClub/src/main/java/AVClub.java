
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            String av = "";

            if (input.equals("")) {
                break;
            }
            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    av = pieces[i];
                    System.out.println(av);
                }

            }

        }
    }
}
