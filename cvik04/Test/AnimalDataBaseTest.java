import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnimalDataBaseTest {

    @org.junit.jupiter.api.Test
    void getNumberOfAnimal() {
        AnimalDataBase dataBase = new AnimalDataBase();
        assertEquals(0, dataBase.getNumberOfAnimal());
        dataBase.add(new Dog("punta", 4));
        assertEquals(1, dataBase.getNumberOfAnimal());

    }

    @org.junit.jupiter.api.Test
    void getAnimalsByName() {
        String startsWith = "R";
        AnimalDataBase dataBase = new AnimalDataBase();
        dataBase.add(new Cat("Monty", 4));
        dataBase.add(new Dog("Res", 5));
        Set<Animal> result = dataBase.getAnimalsByName(startsWith);
        assertEquals(1, result.size());

        for (Animal animal : result) {
            assertTrue(animal.getName().startsWith(startsWith));
        }

    }

    @org.junit.jupiter.api.Test
    void prumernyVek() {
        AnimalDataBase dataBase = new AnimalDataBase();
        assertEquals(0.0, dataBase.prumernyVek());
        dataBase.add(new Dog("Punta", 4));
        dataBase.add(new Cat("Micka", 2));
    }


    @Test
    void nejstarsi() {

        AnimalDataBase dataBase = new AnimalDataBase();
        assertEquals(null, dataBase.nejstarsi());
        dataBase.add(new Dog("Havr", 4));
        dataBase.add(new Cat("Mura", 5));

        Animal pomocna = dataBase.nejstarsi();

        double vek = pomocna.getAge();
        String jmeno = pomocna.getName();

        assertEquals(vek, dataBase.nejstarsi().getAge());
        assertEquals(jmeno, dataBase.nejstarsi().getName());


    }
}

