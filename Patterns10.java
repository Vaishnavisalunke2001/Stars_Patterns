package PATTERNS;

public class Patterns10{
    public void pattern(int n){
        int i,j;
        for(i=0;i<=2*n-1;i++){
            int stars =i;
            if (i>n) stars=2*n-i;
            for(j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns10 sol=new Patterns10();
        int n = 5;
        sol.pattern(n);
    }
}