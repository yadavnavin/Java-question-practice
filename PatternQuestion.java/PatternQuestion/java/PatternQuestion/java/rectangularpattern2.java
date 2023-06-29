public class rectangularpattern2 {
    public static void main(String[] args) {
        int r=4;
        int c=6;
        for(int i=1;i<=r;i++){
          for(int j=1;j<=c;j++){
            if(j%2==0){
                System.out.print(".");
            }
            else{
                System.out.print("*");
            }
          }
          System.out.print("\n");
        }
    }
}
