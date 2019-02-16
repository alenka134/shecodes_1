package DemoPack.Lesson13.Exceptions.TryAndCatch.Demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AppFileReader {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/alenka/Documents/pavel.txt"); // enter path for file object
        FileReader fr = new FileReader(file); //pass File object "file" to the constructor
    }

}
