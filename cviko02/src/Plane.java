public class Plane {
    private String color;
    private int span;
    private float weight;
    private int capacity;
    private Manufacturer manufacturer;

    public Plane(int spanIn, Manufacturer manufacturerIn) {
        this.span = spanIn;
        this.manufacturer = manufacturerIn;

    }

    public Plane(String color, int span, float weight, int capacity, Manufacturer manufacturer) {
        this.color = color;
        this.span = span;
        this.weight = weight;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "color='" + color + '\'' +
                ", span=" + span +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
