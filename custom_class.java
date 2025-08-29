import java.nio.channels.Pipe.SourceChannel;

class employee{
    int id;
    int salary;
    String name;
public void printDetail(){
    System.out.println("ID is :"+id);
    System.out.println("name is:"+name);

}   
public int getsalary(){
    return salary;
} 

}
public class custom_class{
    public static void main(String[] args) {
        System.out.println("FIrst custom class");
        employee Sanchit= new employee();
        Sanchit.id=24153121;
        Sanchit.name="mai nhi bataungaa";
        Sanchit.printDetail();
       
        Sanchit.salary=12000;
        
        int salary=Sanchit.getsalary();
        System.out.println(salary);




    }
}