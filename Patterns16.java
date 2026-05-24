package PATTERNS;

public class Patterns16 {
    public void PATTERNS(int n){
        int i,j;
        for(i=0;i<n;i++){
            char ch=(char)('A'+i);
            for(j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Patterns16 sol = new Patterns16();
        int n =5;
        sol.PATTERNS(n);
    }
}
