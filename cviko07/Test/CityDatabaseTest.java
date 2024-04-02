import static org.junit.jupiter.api.Assertions.*;

class CityDatabaseTest {

    @org.junit.jupiter.api.Test
    void getTotalPopulation() {

        CityDatabase database = new CityDatabase();
        database.add(Country.CZECHIA, new City("Prague", 1200000));
        database.add(Country.CZECHIA, new City("Ricany", 20000));
        database.add(Country.SLOVAKIA, new City("Bratislava", 425000));
        assertEquals(1645000, database.getTotalPopulation());
    }
}