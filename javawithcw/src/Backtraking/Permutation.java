package Backtraking;

public class Permutation {
    private static void printpath(String s,String t){
        if(s.isEmpty()){
            System.out.println(t);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String total = left + right;
            printpath(total,t+a);
        }
    }

    public static void main(String[] args) {
        String s="abc";
        printpath(s,"");
    }
}
