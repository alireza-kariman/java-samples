package anotherfuckingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        getInputFromUser(numbersList);
        removeEvensFromNumbersList(numbersList);
        printList(numbersList);
    }

    private static void getInputFromUser(ArrayList<Integer> numbersList) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Please Enter Number " + (i + 1));
            int num = scanner.nextInt();
            numbersList.add(num);
        }
    }

    private static void removeEvensFromNumbersList(ArrayList<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                numbersList.remove(i);
                --i;
            }
        }
    }

    private static void printList(ArrayList<Integer> numberList) {
        System.out.println(numberList);
    }
}
