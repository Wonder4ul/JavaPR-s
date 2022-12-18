package pr_10new;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.exOne();
        sortingStudentsByGPA.exTwo();
        sortingStudentsByGPA.exThree();
        sortingStudentsByGPA.setArray(5);
        sortingStudentsByGPA.mergeSort(sortingStudentsByGPA.iDNumber);
        System.out.println(sortingStudentsByGPA.iDNumber);
        Student student = sortingStudentsByGPA.find("Student0","Student1");
        System.out.println("Success");
    }
}