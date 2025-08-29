class employee{
    int id;
    String name;
    //constructor
    public employee(int i,String n){
        id=i;
        name=n;}
        public int getid(){
            return id;

        }
    public String getname(){
        return name;
    }
}
public class constructor{
    public static void main(String[] args) {
        employee ayush=new employee(24,"ayush");
        System.out.println(ayush.getid());
        System.out.println(ayush.getname());
    }
}