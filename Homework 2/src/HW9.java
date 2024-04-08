import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) throws FileNotFoundException {
//Write a function called getBillTotal that takes a bill amount and tip percentage (both doubles) and
//returns the total bill amount (also a double).
        System.out.println(getBillTotal(100,10));

        System.out.println();
        System.out.println();


//Write a function called repeat that takes a string s and an integer n and returns a string containing n
//copies of s.
        String s = "abcd";
        int n = 4;
        System.out.println(repeat(s,n));

        System.out.println();
        System.out.println();


//Write a function called printLines that takes a file name (as a string) as its only argument and prints
//out all the lines of the file. It shouldn’t return anything
        printLines("capitals.txt");

        System.out.println();
        System.out.println();


//Write a function called midRange that takes an integer list as its only argument and returns the average
//of the maximum and minimum values of the list. For instance, if the list is [3, 9, 4, 2, 8], it should
//return 5.5, since that is the average of the minimum and maximum values, 2 and 9, in the list.
        List<Integer> x = new ArrayList<Integer>();
        Collections.addAll(x, 3, 9, 4, 2, 8);
        System.out.println(midRange(x));

        System.out.println();
        System.out.println();


//Write a class called BankAccount that has the following:
//(a) A private double field called amount that stores the amount of money in the account.
//(b) A private double field called interestRate that stores the account’s interest rate.
//(c) A private string field called name that stores the name of the account holder.
//(d) A constructor that just sets the values of the three fields above.
//(e) Getters and setters for each of the three fields.
//(f) A method called applyInterest that takes no arguments and applies the interest to the account.
//For instance, if the account has $1000 in it and the interest rate is 3%, then the amount variable
//should be changed to $1030 ($1000 + 3% interest)
        bankAccount bank = new bankAccount("Bank of America", 1000, 3);
        System.out.println(bank.applyInterest());
    }
//FUNCTIONS DOWN BELOW

//write a function called printLines that takes a file name (as a string) as its only argument and prints
//out all the lines of the file. It shouldn’t return anything
    public static void printLines(String fileName) throws FileNotFoundException {
        Scanner textFile = new Scanner(new File(fileName));
        while (textFile.hasNextLine()){
            String printFile = textFile.nextLine();
            System.out.println(printFile);
        }
    }
//write a function called midRange that takes an integer list as its only argument and returns the average
//of the maximum and minimum values of the list. For instance, if the list is [3, 9, 4, 2, 8], it should
//return 6.5, since that is the average of the minimum and maximum values, 2 and 9, in the list.
    public static List<Integer> midRange(List<Integer> list){
        double average = 0.0;
        for (int i=0;i<list.size();i++) {
            Collections.sort(list);
            int max = Collections.max(list);
            int min = Collections.min(list);
            average = (double) (min + max)/2;
        }
        System.out.println(average);
        return list;
    }
//write a function called repeat that takes a string s and an integer n and returns a string containing n
//copies of s.
    public static String repeat(String s, Integer n){
        for(int i=1; i<n; i++){
            System.out.println(s);
        }
        return s;
    }
//write a function called getBillTotal that takes a bill amount and tip percentage (both doubles) and
//returns the total bill amount (also a double).
    public static double getBillTotal (double bill, double percent){
        double percentage = percent/100;
        return bill*percentage;
    }
}
