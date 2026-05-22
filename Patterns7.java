package PATTERNS;

public class Patterns7 {
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){

            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns7 sol= new Patterns7();
        int n =5;
        sol.pattern(n);
    }
}
