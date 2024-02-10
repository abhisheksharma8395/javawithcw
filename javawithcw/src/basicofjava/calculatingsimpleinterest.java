package basicofjava;

public class calculatingsimpleinterest {
    public static void main(String[] args) {
        double principal,rate,time,si;
        principal=1000;
        rate=5;
        time=2;
        si=(principal*rate*time)/100;
        System.out.println(si);
    }
}
