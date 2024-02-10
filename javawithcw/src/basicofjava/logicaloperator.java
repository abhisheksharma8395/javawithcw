package basicofjava;
public class logicaloperator {
    public static void main(String[] args) {
        int p=15,q=10,r=5;
        System.out.println((p>q)&&(p>r)); //true
        System.out.println((p>q)&&(p<r)); //false
        System.out.println((q>r)||(q>p)); //true
        System.out.println((p>q)||(q>r)); //true
        System.out.println((p<q)&&(q<r)); //false
    }
}
