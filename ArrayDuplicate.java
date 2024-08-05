import java.util.Scanner;

public class ArrayDuplicate {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }

        int k = 0;
        arr[k++] = arr[0]; 

        for(int i=1;i<n;i++){
            boolean dup=false;
            for(int j=0;j<k;j++){
                if(arr[j]==arr[i]){
                    dup=true;
                    break;
                }
            }
            if(!dup)
            arr[k++]=arr[i];

        }

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}