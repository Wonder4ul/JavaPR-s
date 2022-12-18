package pr11new;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        OutInfo outInfo = new OutInfo();
        System.out.println(outInfo.getInfo());

        CompareTime compareTime = new CompareTime();
        compareTime.enterData();

        compareTime.compareWithCurrent();


        Student student = new Student();
        String str = "26-12-2002";
        Date format = new SimpleDateFormat("dd-MM-yyyy").parse(str);
        student.setDate(format);
        System.out.println(student);

        CompareClasses compareClasses = new CompareClasses();

        compareClasses.testAdd(60000);
        compareClasses.testInsert(60000);
        compareClasses.testRemove(60000);
        compareClasses.testFind(60000);
    }
}
