public class recursion_sum{
    static int sum(int n){
     if(n==0)
     {
        return 0;

     }  
     else{
        return n+sum(n-1);

         }}
public static void main(String[] args)
{
    int n=5;
System.out.println("sum of this is"+sum(n));

    
}


}