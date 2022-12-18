package pr13;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        String temp = "";
        if (surname != null) temp += surname + " ";
        temp += name + " ";
        if(patronymic != null) temp += patronymic;
        return temp;
    }
}