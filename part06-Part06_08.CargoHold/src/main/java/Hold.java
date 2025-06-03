
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcase;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;

        for (Suitcase s : this.suitcase) {
            currentWeight += s.totalWeight();
        }

        if (currentWeight + suitcase.totalWeight() > this.maximumWeight) {
            return;
        }

        this.suitcase.add(suitcase);

    }

    public void printItems() {
       
        for (Suitcase i : this.suitcase) {
           i.printItems();
            
        }
    }

    public String toString() {
        int eachWeight = 0;
        for (Suitcase i : this.suitcase) {
            eachWeight += i.totalWeight();
        }

        return this.suitcase.size() + " suitcases (" + eachWeight + " kg)";
    }

}
