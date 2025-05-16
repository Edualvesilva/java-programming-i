
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        int numberCount = 0;
        this.count = numberCount;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {

        return this.sum;
    }

    public double average() {
        double avg = (double) this.sum / this.count;

        if (this.sum == 0) {
            return 0;
        }
        return avg;

    }

}
