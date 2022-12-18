package pr9_new;

public class Student implements Comparable<Student>{
    public Integer midmark;

    public Student(int index) {
        this.midmark = index;
    }

    @Override
    public int compareTo(Student o) {
        return this.midmark.compareTo(o.midmark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "index=" + midmark +
                '}';
    }
}