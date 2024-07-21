import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 5;
        findPairs(array, sum);
    }

    public static void findPairs(int[] array, int sum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        List<String> pairs = new ArrayList<>();

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == sum) {
                pairs.add("(" + array[left] + ", " + array[right] + ")");
                left++;
                right--;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        if (pairs.isEmpty()) {
            System.out.println("No pairs found with sum " + sum);
        } else {
            System.out.println("Pairs with sum " + sum + ": " + pairs);
        }
    }
}