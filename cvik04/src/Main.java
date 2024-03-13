public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Alik", 2);
        AnimalDataBase animalDataBase = new AnimalDataBase();
        animalDataBase.add(dog);
        Cat cat = new Cat("Micka", 4.5);
        Cat cat2 = new Cat("Micka", 4.5);
        animalDataBase.add(cat2);

        animalDataBase.add(cat);
        System.out.println(animalDataBase);
        System.out.println(dog);
        System.out.println(animalDataBase.getNumberOfAnimal());
        System.out.println(animalDataBase.getAnimalsByName("M"));
        System.out.println(animalDataBase.prumernyVek());

        System.out.println(animalDataBase.nejstarsi());
    }

}