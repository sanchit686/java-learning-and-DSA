import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
 class base1{
    
    base1(){
        System.out.println("i am in constructor");
        
            
        }
        base1(int x){
            System.out.println("value of x is "+x);
        }

    }
 
class derieved1 extends base1{
       derieved1(){
        
        System.out.println("i am in derieved");

       }
       derieved1(int x,int y){
super(x);
        System.out.println(" value of  y is"+y);

       }

}
class child_of_derieved1 extends derieved1{
    child_of_derieved1(){

System.out.println(" iam child of derieved");
    }
     child_of_derieved1(int x,int y, int z){
        super(x,y);
        System.out.println("value of  z is"+z);
     }

}

public class inheritence_and_constructor {
    public static void main(String[] args){

base1 b=new base1();
//derieved1 d=new derieved1();//it will call derieved() from the method
//derieved1 d1=new derieved1(9,14);
child_of_derieved1 cod=new child_of_derieved1(9,8,12);
    }

    
}
