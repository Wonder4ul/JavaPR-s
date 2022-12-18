package pr7;

public class TestStr {
    public static void main(String[] args) {
        StringIF StringIF = new StringWorker();
        String example = "abshg";
        System.out.printf("symbolsCount(%2$s) = %1$s\n",StringIF.symbolsCount(example),example);
        System.out.printf("unevenString(%2$s) = %1$s\n",StringIF.unevenString(example),example);
        System.out.printf("invertString(%2$s) = %1$s",StringIF.invertString(example),example);
    }
}