package pr11new;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private Integer gpa;
    private String firstname;
    private String secondname;
    private Integer numberofcourse;
    private String group;

    private Date date;

    public Student() {
    }

    public Student(Integer gpa, String firstname, String secondname, Integer numberofcourse, String group) {
        this.gpa = gpa;
        this.firstname = firstname;
        this.secondname = secondname;
        this.numberofcourse = numberofcourse;
        this.group = group;
    }

    public Student(String firstname, Integer gpa) {
        this.gpa = gpa;
        this.firstname = firstname;
    }

    public Student(Integer gpa) {
        this.gpa = gpa;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", numberofcourse=" + numberofcourse +
                ", group='" + group + '\'' +
                ", date=" + date +
                '}';
    }
}
