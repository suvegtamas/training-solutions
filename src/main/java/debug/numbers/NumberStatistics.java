package debug.numbers;

import java.util.Arrays;
import java.util.List;

public class NumberStatistics {
    private List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for (int n : numbers) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for (int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1) >= 0 ? numbers.get(i) - numbers.get(i + 1) : numbers.get(i + 1) - numbers.get(i);
            if (actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        NumberStatistics numbers = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3));
        int positiveSum = numbers.sumPositives();
        System.out.println(positiveSum);

        int difference = numbers.minDifferenceBetweenNeighbours();
        System.out.println(difference);
        NumberStatistics numbers2 = new NumberStatistics(Arrays.asList(-3, -4));
        System.out.println(numbers2.sumPositives());

        NumberStatistics numbers3 = new NumberStatistics((Arrays.asList(1)));
        System.out.println(numbers3.minDifferenceBetweenNeighbours());

    }
}
