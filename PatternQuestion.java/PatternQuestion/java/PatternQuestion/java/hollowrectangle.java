import java.util.*;
public class hollowrectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r=sc.nextInt();
            int c=sc.nextInt();
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i==0||i==r-1||j==0||j==c-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
       
    }
    
}
