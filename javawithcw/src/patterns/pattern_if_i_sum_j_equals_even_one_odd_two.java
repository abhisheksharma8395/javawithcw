package patterns;
import java.util.Scanner;
public class pattern_if_i_sum_j_equals_even_one_odd_two {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows (n):");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("2");
                    }
                }
                System.out.println();
            }
        }
}
