import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Game {
    private static List<String> WORDS = List.of("pes", "kocka", "muflon", "cap");
    private String word;
    private Set<String> letters;

    public Game() {
        Random random = new Random();
        this.word = WORDS.get(random.nextInt(4));
        this.letters = new HashSet<>();

    }

    public String guess(String letter) {

        if (letter.length() > 1) {
            return "Chyba";
        } else {
            this.letters.add(letter);
            return this.word.replaceAll( "[^" + getLetters() + "]", "_");
        }
    }

    private String getLetters() {
        StringBuilder result = new StringBuilder();
        for (String letter : this.letters) {
            result.append(letter);
        }
        return result.toString();
    }
}

