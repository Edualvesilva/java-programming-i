
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> list;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.list = ingredients;
        this.name = name;
        this.time = time;
    }

    public void add(String ingredients) {
        this.list.add(ingredients);

    }

    public String toString() {
        return this.name + ", cooking time: " + this.time+".";
    }

    
    public String getName(){
    return this.name;
    }
    
    public int getTime(){
    return this.time;
    }
    
    public ArrayList<String> getIngredients(){
    return this.list;
    }
    
}
