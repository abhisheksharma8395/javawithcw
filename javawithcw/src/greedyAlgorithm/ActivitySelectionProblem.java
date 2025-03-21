package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelectionProblem {
    public static class Activity {
        public int startDay;
        public int endDay;
        public Activity(int startDay, int endDay) {
            this.startDay = startDay;
            this.endDay = endDay;
        }
        public String toString() {
            return startDay + " - " + endDay;
        }
    }
    public static int ActivitySelection(int[] startDay, int[] endDay){
        int count = 0;
        ArrayList<Activity> activities = new ArrayList<>();
        for(int i = 0; i<startDay.length; i++){
             activities.add(new Activity(startDay[i], endDay[i]));
        }
        activities.sort(Comparator.comparing((Activity a)-> a.endDay));
        int prevEndDay = -1;
        for(Activity a : activities){
            if(a.startDay > prevEndDay){
                prevEndDay = a.endDay;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Activities : ");
        int n = sc.nextInt();
        int[] startDay = new int[n];
        int[] endDay = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the start Day of "+(i+1)+" Activity :");
            startDay[i] = sc.nextInt();
            System.out.println("Enter the end Day of "+(i+1)+" Activity :");
            endDay[i] = sc.nextInt();
        }
        System.out.println(ActivitySelection(startDay, endDay));
    }
}
