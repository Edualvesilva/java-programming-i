
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<BirdInfo> birdList = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();

                System.out.println("Name in latin: ");
                String nameLatin = scan.nextLine();

                BirdInfo bird = new BirdInfo();
                bird.setBirdName(name);
                bird.setLatinName(nameLatin);
                birdList.add(bird);

            } else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                boolean found = false;
                for (BirdInfo birds : birdList) {
                    if (birds.getBirdName().equals(bird)) {
                        birds.observation();;
                        found = true;

                    }

                }

                if (!found) {
                    System.out.println("Not a bird!");
                }

            } else if (command.equals("All")) {

                for (BirdInfo birds : birdList) {
                    System.out.println(birds);

                }

            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();

                for (BirdInfo birdOne : birdList) {
                    if (birdOne.getBirdName().equals(bird)) {
                        System.out.println(birdOne);
                    }
                }

            }

        }

    }

}
