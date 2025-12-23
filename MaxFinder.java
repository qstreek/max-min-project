import java.util.ArrayList;
import java.util.List;

public class MaxFinder {
    public static int findMin(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}