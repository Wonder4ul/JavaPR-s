package pr_2_00;
import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball bl1=new Ball(20, 20);
        Ball bl2=new Ball ();
        bl1.move(11, 12);
        System.out.println(bl1);
        bl2.setXY(5, 10);
        bl2.setXYSpeed();
        bl1.setXYSpeed(1, 2);
        bl2.move(1, 1);
        System.out.println(bl2);
        bl1.showSpeed();
        bl2.showSpeed();
    }
}
