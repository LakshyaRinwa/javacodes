 import java.util.*;
public class ArraySort {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        arr[i]=x.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[4]+" "+arr[3]+" "+arr[2]);
    }
}