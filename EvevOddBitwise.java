import java.util.Scanner;
public class EvevOddBitwise {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        if( (n & 1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
