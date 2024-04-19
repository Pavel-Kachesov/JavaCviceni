import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonDatabase {
    private List<Person> persons;
    private static PersonDatabase instance;


    private PersonDatabase(){
        persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
        Collections.sort(persons);
    }


    public static PersonDatabase getInstance(){
        if (instance == null){
            instance = new PersonDatabase();
        }
        return instance;
    }

    public List<Person> getPersonsSortedByAge(){
        Collections.sort(persons, new AgeComparator());
        return persons;
    }

    public List<Person> getPersonsSortedByName(){
        Collections.sort(persons);
        return persons;
    }


    @Override
    public String toString() {
        return "PersonDatabase{" +
                "persons=" + persons +
                '}';
    }

}
