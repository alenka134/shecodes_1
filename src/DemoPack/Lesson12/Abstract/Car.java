package DemoPack.Lesson12.Abstract;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Starting ignition...");
    }

    @Override
    public void doStaff() {
        System.out.println("Do stuff in car. Driving...");

    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown car. Switch off ignition.");
    }
}
