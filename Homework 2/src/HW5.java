import java.util.*;
import java.util.Collections;
public class HW5 {
    public static void main(String[] args) {
//Create a two-dimensional array of integers with 20 rows and 20 columns where all the entries are 2
//except along the main diagonal, where they are 7. The first few rows and columns should look like
//this:
//7 2 2 2 . . .
//2 7 2 2 . . .
//2 2 7 2 . . .
//2 2 2 7
        int[][] num = new int[20][20]; //this code make the number go up
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i == j) {
                    num[i][j] = 7;  // Set elements along the main diagonal to 7
                } else {
                    num[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < num.length; i++) { //this makes the columns and rows layout
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[][] list = new char[26][26];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                list[i][j] = alpha.charAt((i + j) % 26);
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int count = 0;
        String count1 = String.valueOf(count);
        Random rand = new Random();
        int[][] ranNum = new int[20][20];
        for (int i = 0; i < ranNum.length; i++) {
            for (int j = 0; j < ranNum.length; j++) {
                ranNum[i][j] = rand.nextInt(11);
            }
        }
        for (int i = 0; i < ranNum.length; i++) {
            for (int j = 0; j < ranNum.length; j++) {
                /*if(ranNum[i][j]==0){
                    ranNum[i][j]=5;
                }*/ //Code to change all the 0's to 5's
                System.out.printf("%-3d ", ranNum[i][j]);
                if (i == 2 && ranNum[i][j] == 0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.toString(ranNum[2]));
        System.out.println("The number of 0's in the third line are: " + count);
        System.out.println();
//Create a list (ArrayList) and use a loop to fill it with the strings “a”, “aa”, “aaa”, etc., up to a string of
//50 a’s.
        List<String> aList = new ArrayList<String>();
        for (int i=0;i<50; i++){
            aList.add("a");
            System.out.println(aList);
        }
        System.out.println();
        List <Integer> randList = new ArrayList<Integer>();
        int sevenCount = 0;
        for(int i=0; i <50; i++){
            int random= rand.nextInt(20)+1;
            randList.add(random);
            if (randList.contains(7)){
                sevenCount++;
            }
        }
        sevenCount = Collections.frequency(randList,7);
        System.out.println("Unsorted list" +randList);
        Collections.sort(randList);
        System.out.println("Sorted list" +randList);
        int min = randList.get(0);
        System.out.println("The first number is: " +min);
        int max = randList.get(49);
        System.out.println("The last number is: " + max);
        if (randList.contains(5)){
            System.out.println("The location of the number 5 is at "+ randList.indexOf(5));
        }
        else{
            System.out.println("There is no 5 in here.");
        }
        randList.set(49,-1);
        System.out.println("List with -1 as the last number" +randList);
        System.out.println("There are " +sevenCount +" 7's in this list");
        System.out.println();
//Write a program that contains a list of at least 5 verbs, a list of at least 5 nouns, and a list of at least 5
//adjectives. Then have the program randomly generate and print a sentence of the form “The
//<adjective> <noun 1> <verb> the <noun 2>.” All the words except “the” should be randomly pulled
//from the appropriate lists.
        List<String> sentence = new ArrayList<String>();
        String[] verbs = {"ran into","jumped over","swing","ate","sweep"};
        String[] adjectives = {"enormous","fun", "red", "clean", "kind"};
        String[] noun = {"a car", "the phone","the dog","a cat","the table"};
        System.out.println("The "+adjectives[rand.nextInt(adjectives.length)]+" "+noun[rand.nextInt(noun.length)]+" "+verbs[rand.nextInt(verbs.length)]+" "+noun[rand.nextInt(noun.length)]);
    }
}
