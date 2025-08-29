import javax.sound.sampled.SourceDataLine;

class employee{
    private int id;
    private String name;
    public int getid(){
        return id;
    }    
    public void setid(int i){
        id=i;

    } 
    public String getname(){
        return name;}
        public void setname(String n){
name=n;
        }
    }


public class getters_and_setter{
    public static void main(String[] args) {
        
    
employee sanchit=new employee();
sanchit.setid(24153121);
sanchit.setname("sanchit");
System.out.println(sanchit.getid());
System.out.println(sanchit.getname());
}}