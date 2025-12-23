import java.util.ArrayList;
import java.util.List;

public class MaxFinder {
    public static int findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}