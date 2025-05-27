
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> identifier = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            if (!identifier.contains(id)) {
                identifier.add(id);
                list.add(name);
            }

            if (!list.contains(name) && identifier.contains(id)) {
                list.add(name);
                
            }

        }
       // System.out.println("==Items==");
        for (int i = 0; i < identifier.size(); i++) {

            System.out.println(identifier.get(i) + ": " + list.get(i));
            //
        }
    }
}
