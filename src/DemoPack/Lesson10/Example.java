package DemoPack.Lesson10;
//An Array of Objects

public class Example {
    public static void main(String[] args) {

        Machine[] machine = new Machine[3];

        for (int i = 0; i < machine.length; i++) {
            System.out.println("Enter the car model, please: ");

            machine[i] = new Machine();
        }

        for (int i = 0; i < machine.length; i++) {
            System.out.println("Model: " + machine[i].getModel());
        }
    }
}
