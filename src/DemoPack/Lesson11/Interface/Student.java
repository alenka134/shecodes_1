package DemoPack.Lesson11.Interface;

public class Student {

    public String name;
    int id;
    public int points;


    public Student(String name, int id, int points) {
        this.name = name;
        this.id = id;
        this.points = points;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" Student ");
        sb.append("Name = ").append(name);
        sb.append(", id: ").append(id);
        sb.append(", exam ball: ").append(points);

        return sb.toString();
    }

    public int compareTo(Student other) {   //compareTo method

        if (this.id == other.id) {
            return 0;

        } else if (this.id < other.id) {
            return -1;
        } else {
            return 1;
        }

    }


    public String name() {
        return name;
    }

}
