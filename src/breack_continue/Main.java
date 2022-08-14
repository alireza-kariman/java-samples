package breack_continue;

public class Main {
    public static void main(String[] args) {
        continueMethod();
    }

    private static void continueMethod() {
        int array[] = {2, 4, 18, 15, 22};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 18)
                continue;
            System.out.println(array[i]);
            System.out.println(array[i]);
            System.out.println(array[i]);
            System.out.println(array[i]);
        }
    }

    private static void breakMethod() {
        int array[] = {2, 8, 32, 5, 4};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);
            else break;
        }
    }
}
