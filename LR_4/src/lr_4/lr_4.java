package lr_4;

public class lr_4 {
    public static void main(String[] args) {
        Priceable priceable = new Headphones();
        priceable.getPrice(4500);
        priceable = new Monitor();
        priceable.getPrice(21999);
        priceable = new Software();
        priceable.getPrice(4999);
    }
}

interface Priceable{
    public void getPrice(int price);
}

class Headphones implements Priceable{
    int price;

    public void getPrice(int price){//определяем метод getName()
        System.out.println(getClass()+"'s price is "+price);
    }
}

class Monitor implements Priceable{
    int height, weight;
    public void getPrice(int price){//определяем метод getName()
        System.out.println(getClass()+"'s price is "+price);
    }
}

class Software implements Priceable{
    int speed, price;
    public void getPrice(int price){//определяем метод getName()
        System.out.println(getClass()+"'s price is "+price);
    }
}