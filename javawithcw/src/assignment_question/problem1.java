package assignment_question;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to my showroom\n we have two choices in car company");
        System.out.println("1.Mahindra");
        System.out.println("2.Tata");
        System.out.println("press 1 for tata and press 2 for mahindra");
        int company=sc.nextInt();
        switch(company){
            case 1:
                System.out.println("In Tata we have\n 1.Tata Tigor\n2.Tata Tiyago");
                int car=sc.nextInt();
                if(car==1){
                    System.out.println("The Tata Tigor has 1 Petrol Engine and 1 CNG Engine on offer. The Petrol engine is 1199 cc while\n the CNG engine is 1199 cc . It is available with Manual & Automatic transmission.Depending upon the variant and \nfuel type the Tigor has a mileage of 19.28 kmpl to 26.49 km/kg . The Tigor is a 5\n seater 3 cylinder car and has length of 3993mm, width of 1677 and a wheelbase");
                }
                else if(car==2){
                    System.out.println("The Tata Tiago has 1 Petrol Engine and 1 CNG Engine on offer. The Petrol engine is 1199 cc while the CNG engine\n is 1199 cc . It is available with Manual & Automatic transmission.Depending upon the variant and fuel type the Tiago has a mileage of 19.0 kmpl\n to 26.49 km/kg & Ground clearance of Tiago is 168. The Tiago is a 5 seater 3 cylinder\n car and has length of 3765mm,");
                }

        }
    }
}
