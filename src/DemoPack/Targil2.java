package DemoPack;

public class Targil2 {
    public static void main(String[] args) {

        class Student {
            private String firstName;
            private String lastName;

            public Student(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

        }

        Student[] students = new Student[]{
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName);
        }
    }
}
