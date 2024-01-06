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
        int above = 0;
        for(int i = 0; i<temps.length; i++){
            if(temps[i]>average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average temparature: "+average);
        System.out.println(above + " days are above average");
    }
}