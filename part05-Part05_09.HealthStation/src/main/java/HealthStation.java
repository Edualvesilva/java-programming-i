
public class HealthStation {

   
    private int weighings;

    public int weigh(Person person) {
        this.weighings++;
        return person.getWeight();
       
        // return the weight of the person passed as the parameter
        
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {

        return this.weighings;
    }
}
