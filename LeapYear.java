import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int year=x.nextInt();
        int c=0;
        while(true){
            if(year%400!=0 && year%100==0){
               c=2;
            }
            else if(year%4==0 || year%400==0){
                c=1;
            }
            if(c==1){
                System.out.println("leap year");
                break;
            }
            else{
            System.out.println("not leap");
            break;
             }
             }
    }
}
