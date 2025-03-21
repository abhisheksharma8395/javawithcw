package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MaxMeeting {
    public static class Meeting {
        public int startTime;
        public int endTime;
        public int index;
        public Meeting(int startTime, int endTime,int index) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.index = index;
        }
        public String toString() {
            return startTime + " - " + endTime;
        }
    }
    public static ArrayList<Integer> MaxMeetingInRoom(int[] startTime, int[] endTime){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Meeting> meetings = new ArrayList<>();
        for(int i = 0; i<startTime.length; i++){
            Meeting meeting = new Meeting(startTime[i], endTime[i],i+1);
            meetings.add(meeting);
        }
        meetings.sort(Comparator.comparing((Meeting m)-> m.endTime));
        int prevEndTime = -1;
        for(Meeting m : meetings){
            if(m.startTime >= prevEndTime){
                prevEndTime = m.endTime;
                ans.add(m.index);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of meetings ");
        int n = sc.nextInt();
        int[] startTime = new int[n];
        int[] endTime = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the start time of "+(i+1)+" Meeting :");
            startTime[i] = sc.nextInt();
            System.out.println("Enter the end time of "+(i+1)+" Meeting :");
            endTime[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = MaxMeetingInRoom(startTime, endTime);
        System.out.println(ans);
    }
}
