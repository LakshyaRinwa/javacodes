import java.util.Scanner;
public class EachDigit {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int digit=0;
        int p=1;
        while(n!=0){
            int rem;
            rem=n%10;
            if(rem!=9)
            rem+=1;
            n=n/10;
            digit=digit+(rem*p);
            p=p*10;
        }
        
        System.out.println(digit);
    }
}
