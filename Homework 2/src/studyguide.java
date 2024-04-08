import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class studyguiide {
    public static void main(String[] args) {
//Generate 100 random numbers from 1 to 100 and count how many of them are greater than 50.
//instead; if it is divisible by 5, print out Buzz instead, and if it is divisible by both, print out FizzBuzz instead.
//3. Create the list [a, aa, aaa, . . . ] going all the way up to 50 copies of a.
//4. Ask the user to enter a Mount course code (something like MATH 247 or CMSCI 120). Print out if the course is a
//400-level course or not.
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt();
            if (i > x) {
                count++;
            }
        }
        System.out.println("There are " + count + " nums tht is greater than 50");

        System.out.println(isLeapYear(2024));

        List<Integer>x= new ArrayList<Integer>();
        Collections.addAll(x, 23,54,1,325,53,11,32,23,121);
        System.out.println(secondLargest(x));
    }
//create a function called secondLargest that takes an integer list and returns
// the second-largest number in that list (which could be equal to the largest if
//the largest item is repeated. For instance, if the list is [4, 2, 10, 8] it
//would return 8, and if the list is [4, 10, 10, 8], it would return 10
    public static List<Integer> secondLargest(List<Integer> number) {
        for (int i = 0; i < number.size(); i++) {
            Collections.sort(number);
        }
        Collections.reverse(number);
        System.out.println("The second largest is "+number.get(1));
        return number;
    }
//Generally, a year is a leap year it is divisible by 4. However, if it is also divisible by 100,
// then it is not a leap year, except in the case that it is actually divisible by 400,
// in which case it is a leap year. Write a function called
//isLeapYear that takes a year and returns whether or not it is a leap year.
    public static boolean isLeapYear(Integer year) {
        if (year % 100 == 0) {
            if (year % 4 != 0) {
                return false;
            }
        } else if (year % 4 == 0) {
            return true;
        }
        if (year % 100 != 0) {
            if (year % 4 == 0) {
                return true;
            }
        } else if (year % 4 != 0) {
            return false;
        }
        return false;
    }
}

