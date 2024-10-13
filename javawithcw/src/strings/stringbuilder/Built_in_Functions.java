package strings.stringbuilder;

public class Built_in_Functions {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        System.out.println(s); //prints hello
        s.setCharAt(0,'D');
        System.out.println(s); //prints Dello
        s.append(", World!");
        System.out.println(s);//prints Dello, World!
        s.insert(2,'y');
        System.out.println(s); //prints Deyllo, World!
        System.out.println(s.delete(0,4)); // print lo, World!
        System.out.println(s.reverse()); //prints !dlrow ,ol
    }
}
