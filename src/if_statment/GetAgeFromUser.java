package if_statment;

import java.util.Scanner;

public class GetAgeFromUser {
    public static void main(String[] args) {
        while (true) {
            System.out.println("please enter your age");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
            if (age >= 18) {
                System.out.println("che sibilaye shakhi dari");
            } else if (age > 15) {
                System.out.println("gol pesar");
            } else {
                for (int i = 0; i < 100; i++) {
                    System.out.println("joooooon");
                }
            }
        }
    }
}

