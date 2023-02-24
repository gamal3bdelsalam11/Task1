import java.util.Scanner;


public class Main {
    static String safe = "Safe zone";
    static String dan = "Dangerous zone";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of selected numbers in your list");
        int n = in.nextInt();
        long max = 0;
        long min = 0;
        System.out.println("Please enter the selected numbers");
        int i;
        for (i = 0; i < n; i++) {
            long x = in.nextLong();
            if (i == 0) {
                max = x;
                min = x;
            }
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;

            }
        }
        long Difference= max-min;
        System.out.println("The max number is :"+" "+ max);
        System.out.println("The min number is :"+" "+min);
        System.out.println("The Difference is :"+" "+Difference);
        System.out.println(zone(Difference,max));

    }
    static String zone(long Difference,long max){
        if (Difference>=max/2){
            return safe;

        } else if (Difference<=max/2) {
            return dan;

        }

        return null;
    }

}
