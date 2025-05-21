
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            boolean found = false;
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                if (name.contains(searchedFor)) {
                    found = true;
                    System.out.println("Found!");

                    break;
                }

            }

            if (found == false) {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + e + " failed.");
        }

    }
}
