import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class HWSep15 {
    public static void main(String[] args) {
/*Using a loop and three print statements, print out your first name, followed by 50 blank lines,
followed by your last name.*/
        System.out.println("Reginald");
        for(int i = 0; i <50; i++){
            System.out.println(" "+i);
        }
        System.out.println("Hankins");
/*ask the user to enter a string. Then create a new string that consists of each of characters of the user’s
string doubled. For instance, if they enter “abca”, the resulting string should be “aabbccaa”.*/
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String x = scan.nextLine();
        for (int i =0; i<x.length(); i++) {
            sb.append(x.charAt(i)).append(x.charAt(i));
            System.out.println(sb);
        }
//Create an array that holds 100 values and fill it with 100 randomly generated (by Java) integers
//ranging from 1 to 50.
        Random rand = new Random();
        int[] ar = new int[100];
        for (int i=0; i<100; i++){
            ar[i]= rand.nextInt(50);
            System.out.println(ar[i]);
        }
//Use a loop to build up an array of 26 strings whose elements are “a”, “ab”, “abc”, “abcd”, etc., with
//each string adding one more alphabet letter until you get to a string with the entire alphabet.
        StringBuilder newSb = new StringBuilder();
        String [] string = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i=0; i<26; i++){
            newSb.append(string[i]);
            System.out.println(newSb);
        }
        StringBuilder newSb2 = new StringBuilder();
        String [] string1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i=0; i<26; i++){
            newSb2.append(string1[i]);
            newSb2.append(string1[i].repeat(i));
            System.out.println(newSb2);
        }
//Create an array of 100 randomly generated (by Java) integers from 1 to 10. Then if it ever happens in
//that array that there is a 2 followed by a 4 followed by a 6, print out the message “it happened” and
//otherwise print out “no”. [Hint: you’ll need to use the loop variable i carefully and you’ll have to be
//careful to avoid an index out of bounds error.]*/
        int[]num= {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<100; i++){
            int nums = rand.nextInt(1,10);
            System.out.println(num[nums]);
            if (num[nums]==2){
                if (num[nums]==4){
                    if(num[nums]==6){
                        System.out.println("It happened");
                    }
                }
            }
            else{
                System.out.println("No");
            }
        }
    }
}
