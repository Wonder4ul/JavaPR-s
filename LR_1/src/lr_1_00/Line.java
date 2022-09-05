package lr_1_00;
import java.lang.*;
public class Line {
    private int memb=1;
    private int chisl;
    public int getChisl(int chisl){
        return this.chisl=chisl;
    }
    public String toString(){
        System.out.println(this.chisl+"/"+memb);
    }
}
