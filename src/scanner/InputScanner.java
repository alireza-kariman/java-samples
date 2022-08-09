package scanner;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner userInformationScanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name=userInformationScanner.nextLine();
    }
}
