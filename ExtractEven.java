import java.util.Scanner;
public class ExtractEven {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int digit=0;
        int p=1;
        while(n!=0){
            int rem;
            rem=n%10;
            n=n/10;
            if(rem%2==0){
            digit=digit+(rem*p);
            p=p*10;
            }
        }
        
        System.out.println(digit);
    }
}
