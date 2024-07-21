import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        arr[i]=x.nextInt();
int sum=0;
        for(int ele : arr)
        sum+=ele;
        System.out.println(sum);
    }
}
