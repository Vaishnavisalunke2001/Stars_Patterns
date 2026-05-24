package PATTERNS;

public class Patterns13 {
    public void pattern(int n){
        int i,j;
        int num=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns13 sol = new Patterns13();
        int n =5;
        sol.pattern(n);
    }
}
