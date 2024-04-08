import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(2,20);
        System.out.println(x);
        int y = 0;
        while (y<6){
            System.out.println(y);
            ++y;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user = scan.nextInt();
        int result = --user;
        System.out.println(result);
        result *= 2;
        System.out.println(result);
        int value = 9;
        String u = String.valueOf(value); //converting number to a string
        System.out.println(u+2);

        int[] a = {99,4,66,74,45,12,68,70};
        System.out.println(a[3]);
        String[] cars= {"nocar","bifcar","hitccar"};
        System.out.println(cars[2]);
        cars[1]="deeznuts";
        System.out.println("this is new thing:" +cars[1]);
        for (int i=0; i<a.length; i++){
        System.out.println(a[i]);
    }
        //line of code to count up the numbers starting from 1 to 100
        int[] l = new int[100];//the highest this number can go in the loop
        for (int i=0; i<100; i++) {
            l[i] = i + 1;
            System.out.println(l[i]);
        }
        //line of code to add 1 to the numbers that is in the array
        System.out.println("");
        for (int i=0; i<a.length; i++) {
            a[i]++;
            System.out.println(a[i]);
        }
        
    }
}

