import java.util.*;
public class Fibonacciseries {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
        }
         int a=1;
        int b=1;
        int sum;
        for(int i=0;i<=n;i++){
          System.out.print(a +" ");
           sum=a+b;
           a=b;
          b=sum;
            }
    }
}
