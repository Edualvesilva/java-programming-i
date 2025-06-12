
public class GradeDistribution {

    private int[] gradesCount;

    public GradeDistribution() {
        this.gradesCount = new int[6];
    }

    public void addPoint(int score) {

        if (score > 100 || score < 0) {
            return;
        }

        if (score < 50) {

            this.gradesCount[0]++;
        } else if (score < 60) {

            this.gradesCount[1]++;
        } else if (score < 70) {

            this.gradesCount[2]++;
        } else if (score < 80) {

            this.gradesCount[3]++;
        } else if (score < 90) {

            this.gradesCount[4]++;
        } else {

            this.gradesCount[5]++;
        }
    }

    public void printDistribution() {
        String star = "*";
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            for (int j = 0; j < this.gradesCount[i]; j++) {
                System.out.print(star);

            }
            System.out.println();
        }
    }

}
