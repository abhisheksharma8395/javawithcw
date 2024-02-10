package oops;

public class access_modifiers {
    public String st1 = "I am a Public Member";
    void printfromclass(){
        System.out.println("Within Class "+st1);
    }

    public static void main(String[] args) {
        access_modifiers am=new access_modifiers();
        outsideclass am2=new outsideclass();
        am.printfromclass();
        am2.printfromoutside();
    }
}
class outsideclass{
    void printfromoutside(){
        access_modifiers am=new access_modifiers();
        System.out.println("Outside Class,Within package "+am.st1);
    }
}