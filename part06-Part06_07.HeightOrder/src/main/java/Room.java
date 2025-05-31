
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();

    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        return this.person.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.person;

    }

    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }

        Person returnObj = this.person.get(0);

        for (Person per : this.person) {

            if (per.getHeight() < returnObj.getHeight()) {
                returnObj = per;
            }

        }

        return returnObj;
    }

    public Person take() {
        if (this.person.isEmpty()) {
            return null;
        }

        Person shortest = shortest();

        this.person.remove(shortest);
        return shortest;

    }

}
