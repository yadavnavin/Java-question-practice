import java.util.*;
public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int ans=1;
            for(int i=2;i<=n;i++){
              ans*=i;
            }
            System.out.println(ans);
        }
    }
}
