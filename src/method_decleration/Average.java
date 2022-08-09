package method_decleration;

public class Average {
    public static void main(String[] args) {
        int x = 13;
        int y = 15;
        int z = 18;
        int q = 17;
        float u = 13.5f;
        float avg = printAverage(1, 2, 3, 4, 5.6f);

    }

    public static float printAverage(int x ,int y,int z,int q,float u){
        return x+y+z+q+u/5;
    }

    private void printStar() {
        System.out.println("****************************************************");
    }

}
