
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String search = scanner.nextLine();

                String translation = this.dictionary.translate(search);

                if (translation == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Transkatuin: " + translation);
                }
            }

            System.out.println("unknown command");
        }

    }
}
