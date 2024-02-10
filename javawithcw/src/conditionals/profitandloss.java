package conditionals;
import java.util.Scanner;
public class profitandloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price");
        int cp=sc.nextInt();
        System.out.println("Enter the selling price");
        int sp=sc.nextInt();
        int net=cp-sp;
        if(sp<cp){
            System.out.println("The shopkeeper having loss of "+(net)+" rupees.");
        }
        else if(cp<sp) {
            System.out.println("The shopkeeper having profit of "+(-net)+" rupees.");
        }
        else{
            System.out.println("The shopkeeper neither in loss and nor in profit");
        }
    }
}
