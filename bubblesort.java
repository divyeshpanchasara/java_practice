import java.util.Scanner;
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n-1;j++){

                if(a[j]>a[j+1]){

                    int temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        sc.close();
        System.out.println(Arrays.toString(a));
    }    
}
