import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityDatabase {
    private Map<Country, List<City>> data;
    public CityDatabase(){
        this.data = new HashMap<>();
    }

    public void add(Country country, City city){
        List<City> cities = this.data.get(country);

        if (cities == null){
            cities = new ArrayList<>();
        }
        cities.add(city);
        this.data.put(country, cities);
    }
    public int getTotalPopulation(){
        int result = 0;

        for(Country country : this.data.keySet()){
            List<City> cities = this.data.get(country);
            for (City city : cities){
                result = result + city.getPopulation();

            }


        }


        return result;
    }
}
