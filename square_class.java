import java.util.Scanner;
class square{
    int side;
    public int area(){
        return (side*side);
    }
        public int perimeter(){
            return(4*side);


    }
    
}
    public class square_class{

        public static void main(String[] args) {
            square s=new square();
            
            Scanner sc=new Scanner(System.in);
            int side=sc.nextInt();
            s.side=side;
            System.out.println("Area is:"+s.area());
            System.out.println("Perimeter is:"+s.perimeter()); 





        }
    }
