import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashSet<String> uniqueWords = new HashSet<>();
        File file = new File("C:\\Users\\Brend\\IdeaProjects\\Module2.4\\illiad.txt");
        try {
            Scanner words = new Scanner(file);
            while (words.hasNext()) {
                Word word = new Word(words.next());
                uniqueWords.add(word.specialWord);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(uniqueWords.size());

    }
}