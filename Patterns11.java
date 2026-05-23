package PATTERNS;

public class Patterns11 {
    public void pattern(int n){
        int start;
        int i,j;
        for(i=0;i<n;i++){
            if (i%2==0) start=1;
            else start=0;
            for(j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns11 sol = new Patterns11();
        int n =5;
        sol.pattern(n);
    }
}
