package loops;
public class first_multiple_of_5_which_is_also_multiple_of_7 {
    public static void main(String[] args) {
        int num=1;
        while(true){
            if((num%5==0)&&(num%7==0)){
                System.out.println("Found number is "+num);
                break;
            }
            num++;
        }
    }
}
