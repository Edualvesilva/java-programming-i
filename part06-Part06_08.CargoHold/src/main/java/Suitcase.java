
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {
        int currentWeight = 0;
        for (Item i : this.items) {
            currentWeight += i.getWeight();

        }

        if (currentWeight + item.getWeight() > this.maximumWeight) {
            return;
        }
        this.items.add(item);

    }

    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i.toString());

        }

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : this.items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item i : this.items) {

            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }

        }

        return heaviest;

    }

    public String toString() {
        int eachWeight = 0;
        for (Item each : this.items) {
            eachWeight += each.getWeight();
        }

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + eachWeight + "kg)";
        }

        return this.items.size() + " items (" + eachWeight + "kg)";
    }
}
