package pr13;

public class Shirt {
    private String id;
    private String model;
    private String color;
    private String size;

    public Shirt(String id, String model, String color, String size) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public Shirt(String info) {
        String[] temp = info.split(",");
        this.id = temp[0];
        this.model = temp[1];
        this.color = temp[2];
        this.size = temp[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
