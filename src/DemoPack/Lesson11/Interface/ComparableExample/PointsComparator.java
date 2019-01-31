package DemoPack.Lesson11.Interface.ComparableExample;

import DemoPack.Lesson11.Interface.Student;

import java.util.Comparator;

public class PointsComparator implements Comparator<Student> {   //Class PointsComparator includes function COMPARATOR for Student class

    public int compare(Student s1, Student s2) {
        if (s1.points == s2.points) {
            return 0;
        }
        if (s1.points > s2.points) {
            return 1;
        } else {
            return -1;
        }
    }
}
