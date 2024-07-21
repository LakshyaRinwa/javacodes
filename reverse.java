import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Integer[] a = new Integer[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) 
            a[i] = x.nextInt();
        Arrays.asList(a).replaceAll(Integer::valueOf);
        Collections.reverse(Arrays.asList(a));
        System.out.println("Reversed array:");
        for (int i = 0; i < 5; i++) 
            System.out.println(a[i]);
    }
    
}