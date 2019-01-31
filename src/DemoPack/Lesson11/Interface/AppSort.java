package DemoPack.Lesson11.Interface;

import DemoPack.Lesson11.Interface.ComparableExample.PointsComparator;
import DemoPack.Lesson11.Interface.ComparableExample.StudentComparatorByName;

import java.util.ArrayList;
//import java.util.TreeSet;

public class AppSort {
    public static void main(String[] args) {

         //TreeSet<Student> myStudentsArrayList = new TreeSet<>();
       ArrayList<Student> myStudentsArrayList = new ArrayList<>();
        Student firstStudent = new Student("Lena", 1235, 98);
        Student secondStudent = new Student("Boris", 458, 80);
        Student thirdStudent = new Student("Yon", 475874, 76);

        myStudentsArrayList.add(firstStudent);
        myStudentsArrayList.add(secondStudent);
        myStudentsArrayList.add(thirdStudent);

        for (Student s : myStudentsArrayList) {
            System.out.println(s);
        }

        PointsComparator myPointsComparator = new PointsComparator(); // see it in the Class PointsComparator includes function COMPARATOR for Student class
        myStudentsArrayList.sort(myPointsComparator);

        System.out.println("\nSorted by exam's points: ");
        for (Student s : myStudentsArrayList) {
            System.out.println(s);
        }

        StudentComparatorByName myStudentComparator = new StudentComparatorByName();
        myStudentsArrayList.sort(myStudentComparator);

        System.out.println("\nSorted by Name: ");
        for (Student s : myStudentsArrayList) {
            System.out.println(s);
        }
    }

}




