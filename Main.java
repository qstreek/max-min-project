import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите элементы:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int max = MaxFinder.findMax(numbers);
        System.out.println("Максимальное значение: " + max);

        scanner.close();
    }
}