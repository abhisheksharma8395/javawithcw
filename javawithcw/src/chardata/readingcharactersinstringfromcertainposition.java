package chardata;
import java.util.Scanner;
public class readingcharactersinstringfromcertainposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        char ch=sc.next().charAt(0);
        System.out.println(ch);
    }
}
