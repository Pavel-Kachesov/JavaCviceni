import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("/Users/Kachesov/Desktop/Vývojář/IdeaProjects/JavaCviceni/cviko10/biostats.csv");
        List<String> lines = Files.readAllLines(filePath);

        double count = 0;
        double ageSum = 0;

        for (String line : lines){
           if (line.contains("Name")) {
               continue;
           }
            String[] values = line.replaceAll( "\"", "").replaceAll(" ", "").split(",");
            if (values.length == 5) {
                count ++;

                Person person = new Person(values[0], Sex.getByCode(values[1]),
                        Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]));
                ageSum += person.getAge();
            }
        }
        Files.write(filePath, String.valueOf(ageSum/ count).getBytes(), StandardOpenOption.APPEND);
        System.out.println(ageSum/count);


        System.out.println(lines);
    }
}