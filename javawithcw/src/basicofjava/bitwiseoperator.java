package basicofjava;
public class bitwiseoperator {
    public static void main(String[] args) {
        int p=9,q=10;
        System.out.println(p|q); // 9 in binary is 1001 and 10 in binary is 1010
        // 1001
        // 1010
        // or gate =1011 which equals to 11 in decimal
        // and gate =1000 which equals to 8 in decimal
        // xor gate =0011 which equals to 8 in decimal
        System.out.println(p&q); //it print 8
        System.out.println(p^q);  //it print 3
        System.out.println(p<<1);  //it is left shift it turns 1001 to 10010 in decimal it is 18
        System.out.println(p<<2);  //it turns 1001 to 100100 in decimal it is 36
        // now right shift
        System.out.println(p>>1);  //it turns 1001 to 100 in decimal it is 4
        System.out.println(p>>2);  //it turns 1001 to 10 in decimal it is 2
        System.out.println(~q);  //q=10 it turns 1010 to 0101 in decimal it is 5


    }
}
