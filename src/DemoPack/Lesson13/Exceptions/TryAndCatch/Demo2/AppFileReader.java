package DemoPack.Lesson13.Exceptions.TryAndCatch.Demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AppFileReader {
    public static void main(String[] args)  {

        File file = new File("/Users/alenka/Documents/kena.txt"); // enter pathname for file object
        try {
            FileReader fr = new FileReader(file); //pass File object "file" to the constructor
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
    }

}