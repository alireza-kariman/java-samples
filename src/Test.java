import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your number");
        int x = getInputFromUser(scanner);
        int y = getInputFromUser(scanner);
        printUserInput(x,y);
    }

    private static int getInputFromUser(Scanner scr){
       return scr.nextInt();

    }


    private static void printUserInput(int x , int y){
        System.out.println(x+" "+y);
    }


}
