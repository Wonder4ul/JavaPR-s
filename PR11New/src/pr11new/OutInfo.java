package pr11new;

import java.util.Calendar;
import java.util.Date;

public class OutInfo {


    public String getInfo(){
        String info = "";
        Date dateGive = new Date(1555331863979L);
        Date dateFin = new Date(1555936663979L);

        info += "Yakovlev" + " | ";
        info += dateGive + "  |  ";
        info += dateFin;

        return info;

    }
}
