//if we not use static in method


import java.util.Scanner;
public class callling_using_object{
     int sum(int a,int b) {
        int c=a+b;
        return c;

    }
    public static void main(String[] args) {
        int x=9;
        int y=8;
        callling_using_object obj = new callling_using_object();
        int z=obj.sum(x,y);
        System.out.println(z);}}
        