
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
        
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        double avg = 0;
        int grade = 0;
        int divide = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            grade += this.grades.get(i);
            divide++;
        }

        avg = (double) grade / divide;

        return avg;

    }

    
    public double averageOfPoints(){
    if(this.points.isEmpty()){return -1;}
    
    double avg = 0;
    int points = 0;
    int divide = 0;
    for(int i = 0;i < this.points.size();i++){
        points += this.points.get(i);
        divide++;
    
    }
    
    avg = (double) points / divide;
    return avg;
        
    }
    
    
}
