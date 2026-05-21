package PATTERNS;

public class Patterns4 {
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=1;j<i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Patterns4 sol = new Patterns4();
        int n = 5;
        sol.pattern(n);
    }
}
