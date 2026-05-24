package PATTERNS;

public class Patterns12 {
    public void pattern(int n){
        int i,j;
        int spaces=2*(n-1);
        for(i=1;i<=n;i++){
            for ( j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for ( j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for ( j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces=spaces-2;
        }
    }
    public static void main(String[] args){
        Patterns12 sol = new Patterns12();
        int n =5;
        sol.pattern(n);
    }
}
