package lr_3;

public class lr_3 {
    public static void main(String[] args) {
        Dog dogs[] = new Dog[3];//массив на 3 собаки
        dogs[0] = new Husky("Gray", 20, 53);//создали Хаски
        dogs[1] = new Bulldog("Brown", 23, 56);//создали Бульдога
        dogs[2] = new Dalmatian("White-Black", 26, 58);//создали Далматинца

        for(Dog dog: dogs)//вывод информации о каждой собаке
            dog.getInfo();
    }
}

abstract class Dog {//абстрактный класс собака
    int Weight, Height;//поля: вес, рост
    String Color;//цвет

    public Dog(String color, int weight, int height) {//конструктор объекта
        Weight = weight;
        Height = height;
        Color = color;
    }

    public String getColor(){//общий метод для каждой собаки - возвращает её цвет
        return Color;
    }
    public abstract void doBark();//абстрактный метод - лай собаки
    public abstract void getInfo();//абстрактный метод - вывод информации о собаке
}

class Husky extends Dog {//класс Хаски
    public Husky(String color, int weight, int height)//констурктор объекта
    {
        super(color, weight, height);//вызов родительского конструктора в классе Dog
    }

    public void doBark(){//переопределяем метод лай собаки для Хаски
        System.out.println("Husky barks");
    }

    public void getInfo(){//переопределяем метод лай собаки для Хаски
        System.out.println("Husky color is " + Color + "\nweight is " + Weight +
                "\nheight is " + Height + "\n");
    }
}

class Bulldog extends Dog {//класс Бульдог
    public Bulldog(String color, int weight, int height)//констурктор объекта
    {
        super(color, weight, height);//вызов родительского конструктора в классе Dog
    }

    public void doBark(){//переопределяем метод лай собаки для Бульдога
        System.out.println("Bulldog barks");
    }

    public void getInfo(){//переопределяем метод вывода информации для Бульдога
        System.out.println("Bulldog color is " + Color + "\nweight is " + Weight +
                "\nheight is " + Height + "\n");
    }
}


class Dalmatian extends Dog {//класс Даламатинец
    public Dalmatian(String color, int weight, int height)//констурктор объекта
    {
        super(color, weight, height);//вызов родительского конструктора в классе Dog
    }

    public void doBark(){//переопределяем метод лай собаки для Далматинца
        System.out.println("Dalmatian barks");
    }

    public void getInfo(){//переопределяем метод вывода информации для Далматинца
        System.out.println("Dalmatian color is " + Color + "\nweight is " + Weight +
                "\nheight is " + Height + "\n");
    }
}