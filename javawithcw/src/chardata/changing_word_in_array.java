package chardata;
public class changing_word_in_array {
    public static void main(String[] args) {
        String s = "abc";
        char[] sArray = s.toCharArray();
        sArray[2] = 'd';
        s = new String(sArray);
        System.out.println(s);
    }
}

