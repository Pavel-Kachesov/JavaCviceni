public class Manufacturer {
    private int established;
    private String name;

    public Manufacturer(int established, String name){
        this.established = established;
        this.name = name;
    }

    public String toString() {
        return this.name + " " + this.established;
    }
}
