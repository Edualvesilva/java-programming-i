
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Books> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());

            
            book.add(new Books(title,pages,year));
        }

        System.out.println("");
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();

        for (Books eachBook : book) {
            if (answer.equals("everything")) {
                System.out.println(eachBook);
            }

            if (answer.equals("name")) {
                System.out.println(eachBook.getName());
            }

        }

        // implement here the program that allows the user to enter 
        // book information and to examine them
    }
}
