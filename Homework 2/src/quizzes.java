import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class quizzes {
    public static void main(String[] args) {
        //Write a program that asks the user for an angle in degrees-minutes-seconds form, such as 49d33'22''
//or 153d4'22'', where the input will starts with the number of degrees (0 to 360), followed by the letter
//d, followed by the number of minutes (0 to 60), followed by an apostrophe, followed by the number
//of seconds (0 to 60), followed by two apostrophes. The program should convert that angle to decimal
//form, rounded to two decimal places. For instance, 49d33'22 should become 49.56 and 153d4'22''
//should become 153.07. To convert from degrees/minutes/seconds to the decimal form, used + m 60 + s
// 3600 , where d, m, and s are the numbers of degrees, minutes, and seconds, respectively.
        Scanner userAngle = new Scanner(System.in);
        System.out.println("Enter your angle here:");
        String[] angle = userAngle.nextLine().split("d");
        String [] x = angle[1].split("'");
        int d = Integer.parseInt(angle[0]);
        int m = Integer.parseInt((x[0]));
        int s = Integer.parseInt((x[1]));
        double conversion = (d+m/60.0+s/3600.0);
        System.out.printf("%.2f", conversion);
        int t =3; int y=2;
        y+=2;
        System.out.println();
        System.out.println((double) t/y);

        int a = 60;
        int b = 200;
        int result = highestDivisorSumPercent(a, b);
        System.out.println(result);
    }
    public static int highestDivisorSumPercent (Integer a, Integer b){
        int num = a;
        double maxPercent = 0;

        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            double percent = (double) sum / i * 100;

            if (percent > maxPercent) {
                maxPercent = percent;
                num = i;
            }
        }
        return num;
    }
}
