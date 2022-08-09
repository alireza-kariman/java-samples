import class_object.Car;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner userScore = new Scanner(System.in);
        System.out.println("please enter your score");
        int [] array = new int [5];
        for(int i = 0 ;i < array.length;i++) {
            array[i] = userScore.nextInt();

        }
         for (int i = 0 ; i < array.length;i++) {
             if (array[i]%2==0){
                 System.out.println(array[i]);
             }

         }





























//        int[] scores = {20, 18, 10, 16, 17, 15, 13, 18};
//        System.out.println(scores[0]);
//        average(scores);
/*        int[] array = new int[30];
        Car[] cars = new Car[5];
        cars[0] = new Car(230, "Persia", 1998);
        cars[1] = new Car(60, "priad", 1995);
        System.out.println(cars[1]);*/
    }

    private static void average(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        float avg = (float) sum / scores.length;
        System.out.println(avg);
    }
}
