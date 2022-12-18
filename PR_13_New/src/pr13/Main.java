package pr13;

public class Main {
    public static void main(String[] args) {
        //1
        String str = "I like Java!!!";
        firstEx(str);
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a','o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,6));

        //2

        Person person1 = new Person("Andrey", "Yakovlev", "Maksimovich");
        Person person2 = new Person("Andrey");
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());

        //3
        Address address = new Address();
        address.setAddress1("Russia, Moscow, Moscow, Lenina, 34, 3, 4");
        address.setAddress2("Russia, Moscow, Moscow, Lenina, 34, 3, 4");
        System.out.println(address.getCity());


        //4
        String[] shirts = new String[11];
         shirts[0] = "S001,Black Polo Shirt,Black,XL";
         shirts[1] = "S002,Black Polo Shirt,Black,L";
         shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
         shirts[3] = "S004,Blue Polo Shirt,Blue,M";
         shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
         shirts[5] = "S006,Black T- Shirt,Black,XL";
         shirts[6] = "S007,White T-Shirt,White,XL";
         shirts[7] = "S008,White T-Shirt,White,L";
         shirts[8] = "S009,Green T-Shirt,Green,S";
         shirts[9] = "S010,Orange T-Shirt,Orange,S";
         shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

         Shirt[] shirts1 = new Shirt[11];

        for (int i = 0; i < shirts.length; i++) {
            shirts1[i] = new Shirt(shirts[i]);
        }

        for (Shirt shirt : shirts1) {
            System.out.println(shirt);
        }

        //5
       TelNum telNum = new TelNum("+104289652211");
       telNum.printNumber();

        System.out.println();

       telNum = new TelNum("89175655655");
       telNum.printNumber();

        System.out.println();

        telNum = new TelNum("+79205529029");
        telNum.printNumber();


        //6

        ParseStr parseStr = new ParseStr("file-data-aboba-entered-added-fff-doom");
        parseStr.sortList();
        parseStr.createBuilder();
        parseStr.printBuilder();

    }

    public static void firstEx(String s1){
        return;
    }

}