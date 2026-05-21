package PATTERNS;

public class Patterns3 {
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Patterns3 sol = new Patterns3();
        int n = 5;
        sol.pattern(n);
    }
}
