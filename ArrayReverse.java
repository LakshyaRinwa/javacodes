import java.util.*;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = 5;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = x.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer number : arr)
            System.out.println(number);
    }
}