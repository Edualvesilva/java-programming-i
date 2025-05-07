
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                size = list.size() - 1;

                break;
            }

            list.add(input);
        }

        System.out.println(list.get(0));
        System.out.println(list.get(size));
    }
}
