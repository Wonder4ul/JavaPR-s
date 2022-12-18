package pr_3;
import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    public void converter(double number) {
        //double number = 123.4567;
//определяем локализацию
        Locale locFR = new Locale("rus");
        Locale.setDefault(Locale.US);
//определяем форматировщик 1
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(number));
//определяем форматировщик 2
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println("Денежная единица в канадской локали: " + numberFormat2.format(number));
//        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
//        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number*0.7311));
        NumberFormat numberFormat5 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("Денежная единица во китайской локали: " + numberFormat5.format(number*5.2549));
        NumberFormat numberFormat6 = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
        System.out.println("Денежная единица во японской локали: " + numberFormat6.format(number*106.7435));
        NumberFormat numberFormat7 = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        System.out.println("Денежная единица во немецкой локали: " + numberFormat7.format(number*0.7311));
        NumberFormat numberFormat8 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("Денежная единица во итальянской локали: " + numberFormat8.format(number*0.7311));
        NumberFormat numberFormat9 = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.println("Денежная единица во корейской локали: " + numberFormat9.format(number*1034.6933));
//        NumberFormat numberFormat7 = NumberFormat.getCurrencyInstance(Locale.);
//        System.out.println("Денежная единица во французской локали: " + numberFormat7.format(number));
    }
}