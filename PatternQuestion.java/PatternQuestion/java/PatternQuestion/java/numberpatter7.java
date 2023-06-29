import java.util.*;
public class numberpatter7 {
    public static void main(String[] args) {
        int n,i,j,k,l;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1;i>1;i--){
            for(j=i;j>2;j--){
                System.out.print(" ");
            }
            for(k=1;k<=(n-i+1);k++){
                if(k==1){
                    System.out.print(n-i+2);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(l=k;l>=1;l--){
                if(l==1){
                    System.out.print(n-i+2);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
