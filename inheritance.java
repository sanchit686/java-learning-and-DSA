import java.util.Scanner;
class base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
        System.out.println("i am in base stting x now");

    }
    public void printme(){
        System.out.println(ï am Constructor);
    }

}
class derived extends base{
        int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
        System.out.println("i am in derieved stting x now");

    }
    public void printme(){
        System.out.println(ï am Constructor);
    }

}
    public class inheritance{
        public static void main(String[] args){
            base b=new base();
            b.setx(4);
            System.out.println(b.getx());
            derived d=new derived();
            d.sety(67); 
            System.out.println(d.gety());
            derived e=new derived();
            e.sety(77); 
            System.out.println(e.gety());




        }
    }

