import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        System.out.println("please enter your number");
        int[] array = new int[5];
        getFromUser(userNumber,array);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }


    private static void getFromUser(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
}
