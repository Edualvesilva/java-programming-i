
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int i = 1;
        for (String each : this.list) {
            System.out.println(i + ": " + each);
            i++;
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }

}
