
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int total = 0;
        for (Gift each : this.gifts) {
            total = total + each.getWeight();

        }
        return total;
    }
}
