public class numberpattern3 {
    public static void main(String[] args) {
        int r=4;
        int c=6;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(j==1 ||j==c||i==1|| i==r){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
