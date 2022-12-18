package pr_3;
import java.util.Formatter;
public class Shells{        //Задание на оболочки
    Double shell;

    public void creation(double i){
        shell = Double.valueOf(i);
        byte a = shell.byteValue();
        short b = shell.shortValue();
        int c = shell.intValue();
        long d = shell.longValue();
        //Character e = Character.valueOf();
        float f = shell.floatValue();
        System.out.println("Your double obj is "+ a +" in byte type");
        System.out.println("Your double obj is "+b+" in short type");
        System.out.println("Your double obj is "+c+" in integer type");
        System.out.println("Your double obj is "+d+" in long type");
        System.out.println("Your double obj is "+f+" in float type");
        double doub=3.14;

        System.out.println("Your double literal is string " + String.valueOf(doub));

        System.out.println("Your double object is here: "+shell);
    }
    public void stringTransfrom(String i){
        System.out.println("Your string -> double: "+Double.parseDouble(i));
    }

}
