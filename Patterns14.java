package PATTERNS;

public class Patterns14 {
    public void pattern(int n){
        int i;
        for(i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns14 sol = new Patterns14();
        int n =5;
        sol.pattern(n);
    }
}
