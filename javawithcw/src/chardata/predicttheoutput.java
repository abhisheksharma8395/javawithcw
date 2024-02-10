//input is 20 and Physics Wallah
package chardata;
import java.util.Scanner;
public class predicttheoutput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();  //it takes 20 as input given by user
        String ch=s.next();   //it takes Physics because of next it dont take input after space
        System.out.print(x);//it print 20
        System.out.println(ch);// it print Physics in same line with 20 without space
        //full output is 20Physics
    }
}
