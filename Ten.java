import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        try {
            String line;
            int happy = 0;
            int sad = 0;

            File myObj = new File("happyorsad.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                line = myReader.nextLine();
                switch(line) {
                    case ":-)":
                        happy++;
                        break;
                    case ":-(":
                        sad++;
                        break;
                }
            }
            myReader.close();

            if (happy == 0 && sad == 0){
                System.out.println("none");
            } else if (happy == sad) {
                System.out.println("unsure");
            } else if (happy > sad) {
                System.out.println("happy");
            } else{ // must be more sad
                System.out.println("sad");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
