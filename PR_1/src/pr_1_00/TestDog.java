package pr_1_00;
import java.lang.*;
public class TestDog {
    public static void main(String[] args){
        Dog dg1=new Dog("Max", 3);
        Dog dg2=new Dog("Jake", 4);
        Dog dg3=new Dog("Monika");
        dg3.setAge(4);
        System.out.println(dg1);
        dg1.intoHumanAge();
        dg2.intoHumanAge();
        dg3.intoHumanAge();
    }
}
