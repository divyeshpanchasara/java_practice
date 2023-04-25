import java.util.Scanner;

public class test{

    static boolean myPrime(int i){
        int count=0;
        for(int k=1;k<=i;k++){
            if(i%k==0)
                count++;
        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean j=myPrime(n);
        if(j)
            System.out.println("I am prime");
        else
            System.out.println("Ops not a prime");
        sc.close();
    }
}