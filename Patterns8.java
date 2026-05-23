package PATTERNS;

public class Patterns8 {
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns8 sol = new Patterns8();
        int n = 5;
        sol.pattern(n);
    }
}
