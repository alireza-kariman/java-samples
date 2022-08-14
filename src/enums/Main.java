package enums;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(TrafficLight.RED);
            Thread.sleep(7000);
            System.out.println(TrafficLight.YELLOW);
            Thread.sleep(2000);
            System.out.println(TrafficLight.GREEN);
            Thread.sleep(5000);
        }
    }
}
