import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
        this.number = "80297026495";
        this.model = "Samsung";
        this.weight = 220;
    }
    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone (String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String receiveCall (String name) {
        System.out.println("Calling " + name + "number " + getNumber());
        return getNumber();
    }
    public void receiveCall (String name, String number) {
        System.out.println("Calling " + name + "number " + number);

    }
    public void sendMessage(String... number) {
        System.out.println(Arrays.deepToString(number) + " send u message");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

}
