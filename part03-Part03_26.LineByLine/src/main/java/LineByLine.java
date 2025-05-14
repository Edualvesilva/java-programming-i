
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] pieces = line.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);

            if (pieces[i].equals("halted")) {
                System.out.println("halted");
                break;
            }

        }
        line = scanner.nextLine();
        String[] pieces2 = line.split(" ");
        for (int j = 0; j < pieces2.length; j++) {
            System.out.println(pieces2[j]);

            if (pieces2[j].equals("halted")) {
                System.out.println("halted");
                break;
            }
        }

    }
}
