import java.util.Scanner;
public class ElectricityBill {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("0-100  1.5 Rupees");
        System.out.println("100-200  3 Rupees");
        System.out.println("200-300  5 Rupees");
        System.out.println("300-aboved  10 Rupees");

        System.out.println("Enter the Units: ");
        double units=sc.nextDouble();
        System.out.println("Enter the number of days of delay payment: ");
        int delayDays=sc.nextInt();
        
        double TotalAmount=0.0;
       if(units>0&&units<100){
          TotalAmount=units*1.5;
          TotalAmount=TotalAmount+(delayDays*2);
        }
       else if(units>=100&&units<200){
          TotalAmount=units*3;
TotalAmount=TotalAmount+(delayDays*2);
        }
       else if(units>=200&&units<300){
          TotalAmount=units*5;
TotalAmount=TotalAmount+(delayDays*2);
        }
       else if(units>300){
          TotalAmount=units*10;
TotalAmount=TotalAmount+(delayDays*2);
        }

System.out.println("TotalAmount of bill" +TotalAmount);
    
}

}
