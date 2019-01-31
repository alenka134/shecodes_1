package DemoPack.Lesson11.Interface.ComparableExample;

import DemoPack.Lesson11.Interface.Student;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        String name1, name2;
        name1 = ((Student) s1).name;
        switch (name2 = ((Student) s2).name()) {
        }
        return name1.compareTo(name2);
    }
}
