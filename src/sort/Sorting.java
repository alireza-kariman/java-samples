package sort;

public class Sorting {
    public static void main(String[] args) {
        int[] unSortedArray = {23, 2, 11, 8, 13};
        int temp = 0;
        for (int i = 0; i < unSortedArray.length - 1; i++) {
            for (int j = i + 1; j < unSortedArray.length; j++) {
                if (unSortedArray[i] > unSortedArray[j]) {
                    temp = unSortedArray[i];
                    unSortedArray[i] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(unSortedArray[i]);
        }

    }
}
