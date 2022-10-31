import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {

    public static void main(String[] args) {

        System.out.println("Justin works at Codeup.");
        System.out.println("Javier works at Codeup.");
        System.out.println("Jason works at Codeup.");
        System.out.println("Laura works at Codeup.");



        Path p = Paths.get("FileIo", "people.txt");

        List<String> newNames = Arrays.asList("Stephen", "Frances", "Rodrigo", "Rich");
        try {
            Files.write(p, newNames, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
