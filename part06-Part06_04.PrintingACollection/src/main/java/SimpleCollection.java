
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        ArrayList<String> total = this.getElements();

        String elementName = "";
        for (String names : total) {

            if (elements.size() == 1) {
                elementName = names;
            } else {
                elementName = elementName + names + "\n";
            }
        }

        String printOut = "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n" + elementName;

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n" + elementName;
        }

        return printOut;
    }

}
