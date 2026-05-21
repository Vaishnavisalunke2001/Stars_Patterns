package PATTERNS;
class Patterns2{
    public void pattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patterns2 sol=new Patterns2();
        int n=5;
        sol.pattern(n);
    }
}