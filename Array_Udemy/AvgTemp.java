import java.util.*;

class AvgTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperature? : ");
        int totalDays = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=totalDays; i++) {
            System.out.println("Day "+ i + "'s High temparature :");;
            int numDays = sc.nextInt();
            sum = sum + numDays;
        }

        double average = sum / totalDays;
        System.out.println("average temprature : " + average);
    }
}