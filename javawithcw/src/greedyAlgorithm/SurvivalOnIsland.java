package greedyAlgorithm;

import java.util.Scanner;

public class SurvivalOnIsland {
    public static int SurvivalonTheIsland(int S,int N,int M){
        if(M>N || 7*M>6*N){
            return -1;
        }
        int totalFoodRequirred = S*M;
        return (int) Math.ceil((double)totalFoodRequirred/N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Days you requirred to survive on Islands : ");
        int S = sc.nextInt();
        System.out.println("Maximum unit of food you can buy each day from shop(Monday to Saturday) : ");
        int N = sc.nextInt();
        System.out.println("Unit of food requirred each day to survive on Islands : ");
        int M = sc.nextInt();
        int a = SurvivalonTheIsland(S,N,M);
        if(a==-1){
            System.out.println("Sorry! but You can't survive on Islands");
        }
        else{
            System.out.println("Minimum numbers of days on which you need to buy");
            System.out.println(a);
        }
    }
}
