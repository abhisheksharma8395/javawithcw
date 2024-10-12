package strings;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Stringintchar {
    public static void main(String[] args) {
        String s = "Jai ";
        String u = "Shree ";
        String v = "Ram ";
        System.out.println(s+u+v);
        //does not modify the original string
        //because strings in Java are immutable. Instead, it returns a new string.
    }

}
