package class_object;

import class_object.Car;

public class CarApplication {

    public static void main(String[] args) {
        String color = "red";
        Car peykan = new Car(120, "peykan", 1960);

        System.out.println("============================================");
        System.out.println(peykan.getSpeed());

    }

}
