import java.util.*;

public class Nextgreater {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 25};
        int[] result = nextGreaterElement(array);
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] nextGreaterElement(int[] array) {
        int[] result = new int[array.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = array.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(array[i]);
        }

        return result;
    }
}