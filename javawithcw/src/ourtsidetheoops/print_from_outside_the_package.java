package ourtsidetheoops;
import oops.*;
public class print_from_outside_the_package {
    public static void main(String[] args) {
        access_modifiers obj1=new access_modifiers();
        System.out.println("Outside Package "+obj1.st1);
        access_modifierss obj2=new access_modifierss();
        obj2.printfromchildclass();
    }
}
//child class                   parent class
class access_modifierss extends access_modifiers{
    void printfromchildclass(){
        access_modifierss obj1=new access_modifierss();
        System.out.println(obj1.st1);
    }
}
