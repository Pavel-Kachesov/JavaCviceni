
import java.util.HashSet;
import java.util.Set;

public class AnimalDataBase {
    private Set<Animal> animals;

    public AnimalDataBase(){
        this.animals = new HashSet<>();
    }

    public void add(Animal animal){
        this.animals.add(animal);
    }

    public int getNumberOfAnimal(){
        return this.animals.size();
    }

    public Set<Animal> getAnimalsByName(String startsWith){
        Set<Animal> result = new HashSet<>();
        for (Animal animal: this.animals){
            if (animal.getName().startsWith(startsWith)){
                result.add(animal);
            }
        }
        return result;
    }



    public double prumernyVek() {
        double prumer = 0;
        double sum = 0;
        if (getNumberOfAnimal() == 0) {
            return 0;}
        else{
            for (Animal animal : this.animals) {
                prumer = animals.size();
                sum += animal.getAge();
            }
            sum = sum / prumer;
            return sum;
        }

    }
    public Animal nejstarsi() {
        Animal nej = null;
        for (Animal animal : this.animals) {
            double i = 0;
            if (animal.getAge() > i) {
                i = animal.getAge();
                nej = animal;
            }
        }
        return nej;
    }


    @Override
    public String toString() {
        return "AnimalDataBase{" +
                "animals=" + animals +
                '}';
    }
}
