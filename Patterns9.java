package PATTERNS;

public class Patterns9{
    public void firsthalf(int n){
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
    public void sechalf(int n){
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
    public static void main (String[] args){
        Patterns9 sol = new Patterns9();
        int n = 5;
        sol.firsthalf(n);
        sol.sechalf(n);
    }
}