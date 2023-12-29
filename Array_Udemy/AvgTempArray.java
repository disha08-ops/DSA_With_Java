import java.util.*;

class AvgTempArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's temparature ?");
        int totalDays = sc.nextInt();
        int[] temps = new int[totalDays];

        int sum = 0;
        for(int i = 0; i<totalDays; i++){
            System.out.print("Day"+ (i+1) + "'s High Temparature : ");
            temps[i] = sc.nextInt();
            sum = sum + temps[i];
        }

        double average = sum / totalDays;
        
        for(int i = 0; i<temp.length; i++){

        }
    }
}