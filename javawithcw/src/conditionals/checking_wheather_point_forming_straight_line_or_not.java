package conditionals;
import java.util.Scanner;
public class checking_wheather_point_forming_straight_line_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3,m1,m2;
        System.out.println("Enter X1:");
        x1=sc.nextDouble();
        System.out.println("Enter Y1:");
        y1=sc.nextDouble();
        System.out.println("Enter X2:");
        x2=sc.nextDouble();
        System.out.println("Enter Y2:");
        y2=sc.nextDouble();
        System.out.println("Enter X3:");
        x3=sc.nextDouble();
        System.out.println("Enter Y3:");
        y3=sc.nextDouble();
        m1=(y2-y1)/(x2-x1);
        m2=(y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("The three point lies on a straight line");
        }
        else{
            System.out.println("they do not lie on straight line");
        }
    }
}
