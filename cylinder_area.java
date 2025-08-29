import java.util.Scanner;
class cylinder{
    int radius;
    int height;
    double area;
    public cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
        
        
        public double getarea(){
            area=2*3.14*radius*height;
            return area;


        }

    
    

}

public class cylinder_area{
    public static void main(String[] args){
        cylinder C=new cylinder(3,4);
        System.out.println(C.getarea());
    }
}