package strings;

public class Interning {
    public static void main(String[] args) {
        // String literal, "hello" goes to the String pool
        String str1 = "hello";

        // Another string literal, references the same "hello" in the pool
        String str2 = "hello";

        // Using new keyword, creates a new object outside the pool
        String str3 = new String("hello");

        // Intern str3 to make it refer to the pool version of "hello"
        String str4 = str3.intern();

        // Check references
        System.out.println(str1 == str2); // true, both reference the same literal in the pool
        System.out.println(str1 == str3); // false, str3 is a new object
        System.out.println(str1 == str4); // true, str4 is interned to the pool
        System.out.println(str1.equals(str3)); //true
    }
}
