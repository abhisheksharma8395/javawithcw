package oops;
import java.util.Scanner;
class algebra{
    int a,b;
    algebra(int x,int y){
        a=x;
        b=y;
        System.out.println("Constructor of Algebra class called");
    }
    int add(){
        int sum=a+b;
        return sum;
    }
    int sub(){
        int subt=a-b;
        return subt;
    }
    int multiply(){
        int mul=a*b;
        return mul;
    }
    int devide(){
        int dev=a/b;
        return dev;
    }
    int remainder(){
        int remain=a%b;
        return remain;
    }
}
public class constructor {
    public static void main(String[] args) {
        algebra obj1=new algebra(10,7);
        Scanner sc=new Scanner(System.in);
        System.out.println(obj1.add());
        System.out.println(obj1.sub());
        System.out.println(obj1.multiply());
        System.out.println(obj1.devide());
        System.out.println(obj1.remainder());
    }

}
