package staticc;

public class Counter {
    private static int number = 0;

    public static int increase() {
        number++;
        return number;
    }

    public static int decrease() {
        number--;
        return number;
    }

    public static void reset() {
        number = 0;
    }

    public static int getNumber() {
        return number;
    }
}


