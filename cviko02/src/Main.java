public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer(1950, "Airbus");
        Plane myFirstPlane = new Plane(10, manufacturer);
        Plane mySecondPlane = new Plane("Red", 20, 3400, 300, manufacturer);

        System.out.println(manufacturer);
        System.out.println(myFirstPlane);
        System.out.println(mySecondPlane);

    }
}