package staticc;

public class Main {
    public static void main(String[] args) {

        Counter.increase();
        Counter.increase();
        Counter.increase();
        Counter.increase();

        System.out.println(Counter.getNumber());
    }
}
