import java.util.Scanner;
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        arr[i]=x.nextInt();
int min=arr[0],max=arr[0];
        for(int ele : arr){
         min=(ele<min?ele:min);
         max=(ele>max?ele:max);
        }
        
        System.out.println(min+""+max);
    }
}
