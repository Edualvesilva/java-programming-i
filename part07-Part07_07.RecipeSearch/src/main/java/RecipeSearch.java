
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipeList = new ArrayList<>();

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {

                String lines = scan.nextLine();

                if (lines.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(scan.nextLine());

                ArrayList<String> things = new ArrayList<>();

                while (scan.hasNextLine()) {
                    String ingredients = scan.nextLine();

                    if (ingredients.isEmpty()) {
                        break;
                    }
                    things.add(ingredients);
                }

                recipeList.add(new Recipe(lines, cookingTime, things));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {

            System.out.println("enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {

                System.out.println("Recipes: ");
                for (Recipe r : recipeList) {
                    System.out.println(r);
                }
            } else if (command.equals("find name")) {
                System.out.println("searched word: ");
                String searchedWord = scanner.nextLine();

                for (Recipe r : recipeList) {
                    if (r.getName().contains(searchedWord)) {
                        System.out.println(r);

                    }

                }
            } else if (command.equals("find cooking time")) {
                System.out.println("max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());

                for (Recipe r : recipeList) {
                    if (r.getTime() <= time) {
                        System.out.println(r);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();

                for (Recipe r : recipeList) {

                    if (r.getIngredients().contains(ingredient)) {
                        System.out.println(r);
                    }

                }
            }

        }

    }

}
