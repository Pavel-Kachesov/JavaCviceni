public class Employee extends Person{
    private int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public void doStuff() {

    }
}
