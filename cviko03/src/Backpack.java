public class Backpack implements Storage{
    private int capacity;
    private String brand;
    private String color;
    private double weight;

    public Backpack(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public boolean add(Item item){
        if (this.capacity >= item.getVolume()){
            // vkladame vec
            this.capacity -= item.getVolume();
            this.weight += item.getWeight();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
