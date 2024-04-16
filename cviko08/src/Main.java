import java.util.Scanner;

public class Main {
    public static final String END_COMMAND = "konec";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        while (true) {
            int pocetPokusu = 0;
            String line = scanner.nextLine();

            if (line.startsWith(END_COMMAND)) {
                break;
            }
            else if( pocetPokusu < 3) {
                System.out.println(game.guess(line));
                pocetPokusu += 1;
            }

        }

    }
}