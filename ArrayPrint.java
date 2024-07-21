import java.util.Scanner;
public class ArrayPrint {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        arr[i]=x.nextInt();

        for(int ele : arr)
        System.out.println(ele);
    }
}
