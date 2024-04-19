public class Main {
    public static void main(String[] args) {
        PersonDatabase personDatabase1 = PersonDatabase.getInstance();
        personDatabase1.addPerson(new Student("Ban", "Novak", 10));
        personDatabase1.addPerson(new Employee("ALoise", "Novak", 20, 40));
        PersonDatabase personDatabase2 = PersonDatabase.getInstance();
        personDatabase2.addPerson(new Employee("Vilem", "Louk", 30, 54));
        PersonDatabase personDatabase3 = PersonDatabase.getInstance();
        System.out.println(personDatabase3.getPersonsSortedByName());
        System.out.println(personDatabase3.getPersonsSortedByAge());


    }
}