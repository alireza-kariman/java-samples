package class_object;

public class Car {
    private String color;
    private int speed;
    private String name;
    private int model;

    public Car(int speed, String name, int model) {
        if (speed > 500 || speed < 0) {
            throw new IllegalStateException("koskhol hamchin sorrati nadarim aslan");
        }
        this.speed = speed;
        this.name = name;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getFullInformation() {
        return color + model + name + speed;
    }

}
