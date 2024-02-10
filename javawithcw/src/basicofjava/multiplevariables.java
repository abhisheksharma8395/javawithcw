package basicofjava;

public class multiplevariables {
    public static void main(String[] args) {
        int p=9,q=10,r=6;
        System.out.print("The value of p is :");
        System.out.println(p);
        System.out.println("The value of q is :"+q);
        r=p;
        System.out.println(r);
        System.out.println("mast cheeze"+p+q+r);
        // the above statement give output of mast cheeze9109
        System.out.println(""+p+q+r);
        // the above statement give output of 9109
        System.out.println(p+q+""+r);
        // the above statement give output of 199
        System.out.println("hello pw"+"hello cw");

    }
}
