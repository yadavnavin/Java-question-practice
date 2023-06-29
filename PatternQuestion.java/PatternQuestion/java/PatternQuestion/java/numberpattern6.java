import java.util.*;
public class numberpattern6 {
    public static void main(String[] args) {
        int n,i,j,k,l;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        for(i=n+1;i>1;i--){
            for( j=i;j>2;j--){
                System.out.print(" ");
            }
            for( k=1;k<=n-i+1;k++){
                System.out.print(k);
            }
            for( l=k;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
