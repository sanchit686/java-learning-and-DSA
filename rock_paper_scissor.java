import java.util.Scanner;
import java.util.Random;
class Main{
    public static void main(String[] args){
       
       System.out.println("intro");
       System.out.println("0 for rock");
       System.out.println("1 for paper");
       System.out.println("2 for scissor");

        Scanner sc=new Scanner(System.in);
          System.out.println("please enter your input");
        int userno=sc.nextInt();
        Random rand=new Random();
        int computerno=rand.nextInt(3);
        if(userno>=0&&userno<=2){
            
        
      
        if(userno==0){
            System.out.println("user input= rock");
        }
          if(userno==1){
            System.out.println("user input= paper");
            
        }
          if(userno==2){
            System.out.println("user input= scissor");
        }
        
        if(computerno==0){
            System.out.println("pc input=rock");
        }
        if(computerno==1){
            System.out.println("pc input=paper");
        }
        if(computerno==2){
            System.out.println("pc input=scissor");
        }
    
    
    
        if(userno==computerno){
            System.out.println("draw");
        }
            else if((userno==0&&computerno==2)||(userno==1&&computerno==0)||(userno==2&&computerno==1)){
                System.out.println("YOU WON");
            }
            
            
        
        else{
            System.out.println("YOU LOSS");
        }
    }
        else{
        System.out.println("wrong input");
        
    }
}
}