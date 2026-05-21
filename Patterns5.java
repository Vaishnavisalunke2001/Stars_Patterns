package PATTERNS;

public class Patterns5 {
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns5 sol=new Patterns5();
        int n = 5;
        sol.pattern(n);
    }
}
