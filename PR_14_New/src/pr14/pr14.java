package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr14 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();

    }

    public static void first(){
        System.out.print("Enter string: ");
        String text = scanner.nextLine();
        System.out.print("Enter pattern: ");
        String regex = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.pattern());
        String[] strings = pattern.split(text);
        for(String string: strings) System.out.println(string);
    }

    public static void second(){
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String string1 = "abcdefghijklmnopqrstuv18340";
        String string2 = "abcdefghijklmnopqrstuv18340adas";
        System.out.printf("String '%1$s' - %2$s\n",string1,pattern.matcher(string1).matches());
        System.out.printf("String '%1$s' - %2$s\n",string2,pattern.matcher(string2).matches());
    }
    public static void third(){
        String text = "25.004 USD, 44 ERR, 4 EU";
        Pattern pattern = Pattern.compile("(\\d+.|)\\d+( |)(USD|EU|RU)");
        print(pattern.matcher(text),text);
    }

    public static void fourth(){
        String string1 = "(1 + 8) - 9 / 4";
        String string2   = "6 / 5 - 2 * 9";
        Pattern pattern = Pattern.compile("\\d+( |)\\+");
        System.out.printf("In string '%1$s' - %2$s\n",string1,pattern.matcher(string1).find());
        System.out.printf("In string '%1$s' - %2$s\n",string2,pattern.matcher(string2).find());
    }

    public static void fifth(){
        String[] dates = {"29/02/2000","30/04/2003","01/01/2003","29/02/2001","30-04-2003","1/1/1899","29/02/2004"};
        Pattern pattern = Pattern.compile("(((((0+[1-9]|1\\d|2[0-8])\\/(0+[1-9]|1[0-2]))|" +
                "((29|30)\\/(0+[469]|11))|((29|30|31)\\/(0+[13578]|1[02])))\\/(19|[2-9]\\d)\\d{2})|29\\/02\\/" +
                "(19|[2-9]\\d)([02468][048]|[13579][26]))");
        for(String date: dates){
            Matcher matcher = pattern.matcher(date);
            System.out.printf("Date %1$s in correct format dd/mm/yyyy - %2$s\n",date,matcher.matches());
        }
    }
    private static void print(Matcher matcher,String text){
        while(matcher.find()) System.out.println(text.substring(matcher.start(),matcher.end()));
    }
}
