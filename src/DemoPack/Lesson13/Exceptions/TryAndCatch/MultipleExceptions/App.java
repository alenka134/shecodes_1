package DemoPack.Lesson13.Exceptions.TryAndCatch.MultipleExceptions;

import java.io.IOException;
import java.text.ParseException;

public class App {

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Could not parse command file.");
        }
    }
}
