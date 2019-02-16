package DemoPack.Lesson12.Abstract.Anonymous.ExampleAnonymous;

public class TaskMain {
    public static void main(String[] args) {

        //Create anonymous class "task" in which redefine method "run"
        Task task = new Task() {

            public void run() {
                System.out.println("Run task!!!");
            }
        };

        task.run();
        System.out.println(task.getClass().toString());
    }
}
