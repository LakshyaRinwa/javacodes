import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Operator: ");
        char op=sc.next().charAt(0);
        System.out.println("Enter the number: ");
        int b=sc.nextInt();
        switch (op) {
            default:
            System.out.println("Wrong Operetor entered");
                break;
            case '+':
            int sum=a+b;
                System.out.println(sum);
                break;
                case '-':
                int sub=a-b;
                    System.out.println(sub);
                    break;
                    case '*':
            int mul=a*b;
                System.out.println( mul);
                break;
                case '/':
            int div=a/b;
                System.out.println( div);
                break;
            
        }

    }
}
