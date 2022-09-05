package pr_2_00;
import java.lang.*;
public class Ball {
    private double x=0.0;
    private double y=0.0;
    private double xSpeed=0.0;
    private double ySpeed=0.0;

    public Ball(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Ball(){

    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void setXYSpeed(double xSpeed, double ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void setXYSpeed(){
        this.xSpeed=0;
        this.ySpeed=0;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    public String toString(){
        return "Ball ("+this.x+","+this.y+")" ;
    }
    public void showSpeed(){
        System.out.println("Ball's speed is ("+this.xSpeed+","+this.ySpeed+")");
    }
}
