package Harm_row;
import java.lang.*;
public class TestRaw {
    public static void main(String[] args){
        Raw r1=new Raw();
        r1.setChisl(1);
        for(int i=1;i<=10;i++){
            r1.setMemb(i);
            System.out.println(r1);
        }
    }
}
