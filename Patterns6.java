package PATTERNS;

public class Patterns6{
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print((n-j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns6 sol= new Patterns6();
        int n = 5;
        sol.pattern(n);
    }
}
