import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayNumber = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayNumber.add(i + 1);
        }
        List<Integer> collect = arrayNumber.
                stream().
                filter(num -> num % 5 == 0)
                .map(number -> number + 1)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
