package switchstament;

public class Main {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        if (day == Day.SATURDAY)
            System.out.println("emroz shanbas eshgham");

        if (day == Day.SUNDAY)
            System.out.println("eshgham");

        if (day == Day.MONDAY)
            System.out.println("eshgham");

        if (day == Day.THURSDAY)
            System.out.println("eshgham");

        if (day == Day.WEDNESDAY)
            System.out.println(" eshgham");

        if (day == Day.THURSDAY)
            System.out.println("eshgham");

        if (day == Day.FRIDAY)
            System.out.println("ridi eshgham");

        switch (day) {
            case SATURDAY:
            case SUNDAY:
            case MONDAY:
                System.out.println("hanoz avale haftast pare ie");
                break;
            case TUESDAY:
                System.out.println("seshanbe");
                break;
            case WEDNESDAY:
                System.out.println("charshanbe");
                break;
            case THURSDAY:
                System.out.println("panjshanbe");
                break;
            case FRIDAY:
                System.out.println("ridi eshgham");
        }

    }
}
