package DemoPack.Lesson13.Exceptions.TryAndCatch.Demo3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AppFileOpen {
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            //PS. This message is too vague
            System.out.println("Could not open this file");

        }
    }
    public  static void openFile() throws FileNotFoundException {
        File file = new File("/Users/alenka/Documents/kena.txt");

            FileReader fr = new FileReader(file);
            System.out.println("File not found: " + file);
        }
    }


