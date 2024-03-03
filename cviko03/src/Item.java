public class Item {
    private String name;
    private double weight;
    private int volume;

    public Item(String name, double weight, int volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }
}
