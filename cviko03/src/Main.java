import jdk.jshell.execution.LocalExecutionControl;

public class Main {
    public static void main(String[] args) {
        Backpack backpack = new Backpack("Samsonite","Black", 10);
        System.out.println(backpack);
        backpack.add(new Item("Kniha", 1, 1));
        System.out.println(backpack);
        backpack.add(new Item("Knihovna", 150, 300));
        System.out.println(backpack);



        Calculate calculate = new Calculate(10000,50);
        System.out.println(calculate.add());

    }
}