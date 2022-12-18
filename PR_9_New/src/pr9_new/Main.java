package pr9_new;

public class Main {
    public static void main(String[] args) {

        //Напишите класс SortingStudentsByGPA который реализует интерфейс Comparator таким образом,
        // чтобы сортировать список студентов по их итоговымбаллам в порядке убывания с использованием
        // алгоритма быстрой сортировки.

        Student[] arr1 = new Student[5];

        for (int i = 0; i < 5; i++) {
            arr1[i] = new Student(i);
        }

        for (Student student: arr1) {
            System.out.println(student);
        };

        System.out.println('\n');

        SortingStudentsByGPA sorting = new SortingStudentsByGPA();

        sorting.quickSort(arr1, 0 , 4);

        System.out.println();

        for (Student student: arr1) {
            System.out.println(student);
        };
    }
}
