import java .util.Scanner;
public class varargs{
    static int any_no_of_args(int...arr){
        int result=0;
        for(int element:arr){
            result+=element;
            
        }
        return result;
    }
        public static void main(String[] args){
            System.out.println("sum of 3,4 and 5 is:"+ any_no_of_args(3,4,5));

        }
    }
