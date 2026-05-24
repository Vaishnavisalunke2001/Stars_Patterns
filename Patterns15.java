package PATTERNS;

public class Patterns15 {
    public void pattern(int n){
        int i;
        for(i=1;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns15 sol = new Patterns15();
        int n =5;
        sol.pattern(n);
    }
}


