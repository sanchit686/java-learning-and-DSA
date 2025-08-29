import java.util.Scanner;
public class recusion{
    static int factorial(int n){
        if(n==0||n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner fac=new Scanner(System.in);
        int a=fac.nextInt();
        System.out.println(factorial(a));


    }
}