package web.model;


public class Car  {

    private String model;
    private String type;
    private int year;

    public Car() {
    }

    public Car(String model, String type, int year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + model + '\'' +
                ", Type='" + type + '\'' +
                ", Year=" + year +
                '}';
    }
}
