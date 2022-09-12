package Harm_row;
import java.lang.*;
public class Raw {
    private int memb=1;
    private int chisl;
    public Raw(){
        chisl=0;
        memb=0;
    }
    public int getChisl(int chisl){
        return chisl;
    }
    public int getMemb(int memb){
        return memb;
    }
    public void setChisl(int chisl){
        this.chisl=chisl;
    }
    public void setMemb(int memb){
        this.memb=memb;
    }
    public String toString(){
       return this.chisl+"/"+this.memb;}
}
