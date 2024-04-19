import java.text.Collator;
import java.util.Locale;

public abstract class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person  (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age =age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        Collator csCollator = Collator.getInstance(Locale.forLanguageTag("cs"));

        return this.lastName.equals(o.getLastName())?
                csCollator.compare(this.firstName, o.firstName) :
                csCollator.compare(this.lastName, o.lastName);
    }

    public abstract void doStuff();




}
