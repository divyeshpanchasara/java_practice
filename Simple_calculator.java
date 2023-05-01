import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        Double a = sc.nextDouble();
        System.out.print("Enter Other Number:");
        Double b = sc.nextDouble();
        System.out.print("Enter The Operation + - * /:");
        char c = sc.next().charAt(0);
        sc.close();
        if(c=='+'){
            System.out.printf("The sum is %f",a+b);
        }
        else if(c=='-'){
            System.out.printf("The difference is %f",a-b);
        }
        else if(c=='*'){
            System.out.printf("The difference is %f",a*b);
        }
        else if(c=='/'){
            System.out.printf("The difference is %f",a/b);
        }

    }
}
