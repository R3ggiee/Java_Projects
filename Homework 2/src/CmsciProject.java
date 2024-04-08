import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CmsciProject {
    public static void main(String[] args) throws FileNotFoundException {
//1. Generate two random numbers, each ranging from 0 to 9.
//Then print out the result of multiplying them together.
        Random rand = new Random();
        int randomNum1 = rand.nextInt(10);
        int randomNum2 = rand.nextInt(10);
        int sum = randomNum1*randomNum2;

        System.out.println("First random number: " +randomNum1);
        System.out.println("Second random number: " +randomNum2);
        System.out.println("Result of " + randomNum1+ " and " + randomNum2+ " equals: "+sum);

        System.out.println();
//2. A company charges $29.99 per item if you buy less than 100 items. If you buy from 100 to 499 items,
//the cost is $25.99 per item. If you buy 500 or more items, the cost is $22.99 per item. Write a program
//that asks the user how many items they are buying and prints the total cost. For instance, if they enter
//200, the program should print out $5198.
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items are you buying?");
        int userItems = scan.nextInt();

        if (userItems<100){
            System.out.println("The cost is $29.99 per item.");
            float total = (float) (userItems*29.99);
            System.out.println("Your total price is $"+ total);
        }

        if(userItems>100&&userItems<500){
            System.out.println("The cost is $25.99 per item.");
            float total = (float) (userItems*25.99);
            System.out.println("Your total price is $"+ total);
        }

        if (userItems>500){
            System.out.println("The cost is $22.99 per item.");
            float total = (float) (userItems*22.99);
            System.out.println("Your total price is $"+ total);
        }

        System.out.println();
        System.out.println();
//3. Write a program that asks the user to enter a string. If the string is at least five characters long, then
//create a new string that consists of the first five characters of the string along with three asterisks at
//the end. Otherwise, add enough exclamation points (!) to the end of the string in order to get the
//length up to five. Print out the resulting string.
        String newString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String here:");
        String userString = scanner.nextLine();

        for (int i=0; i<userString.length();i++){
            if (userString.length()>5){
                newString+=userString+"***";
            }

            while(userString.length()<5){
                newString+=userString+"!";
                userString=newString;
            }
        }
        System.out.println(newString);

        System.out.println();
        System.out.println();
//Create a Java list that holds the multiples of 4 from 4 to 9996 except that all the multiple of 10 should
//be replaced with 0s. For instance, the first few items in the list should be 4, 8, 12, 16, 0, 24, 28, 32,
//36, 0, 44, 48, 52, 56, 0, 64, 68, . . .
        List<Integer> multipleOfFour = new ArrayList<Integer>();

        for (int i=0;i<9996; i+=4){
            if(i%10!=0){
                System.out.println(i);
            }

            else {
                System.out.println(0);
            }
        }

        System.out.println();
        System.out.println();
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
//Write a function called weirdReverse that takes an integer as its parameter and returns a new list that
//consists of the first five things of the caller’s list, but in reverse order, and then has the rest of the
//caller’s list unchanged. For instance, if the caller’s list is [2,4,7,8,9,14,15,16], then the returned list
//should be [9,8,7,4,2,14,15,16].
        List<Integer> f = new ArrayList<Integer>();

        Collections.addAll(f,2,7,4,9,8,16,15,14);
        System.out.println(weirdReverse(f));

        System.out.println();
        System.out.println();

//Write a program that asks the user for a string and then one-by-one randomly replaces all of its
//characters by asterisks, printing out each step. For instance, if the string is “list”, then a possible
//output is l*st, l**t, ***t, ****
        System.out.println("Enter a string here:");
        Scanner scans=new Scanner(System.in);
        String userString2= scans.nextLine();

        for (int i=0;i<userString2.length();i++){
            userString2=userString2.replace(userString2.charAt(rand.nextInt(userString2.length())),'*');
            System.out.println(userString2);
        }

        System.out.println();
        System.out.println();
//Level 3. part 2: The file nfl1978-2013.txt contains the results of every regular-season NFL game from 1978 to 2013.
//Open the file to see how it is arranged. Allow the user to enter two team names (you can assume they
//enter the names correctly) and have the program print out all of the games involving the two teams
//where one of the teams was shut out (scored no points).
        Scanner userTeams = new Scanner(System.in);
        Scanner textFile = new Scanner(new File("nfl1978-2013.txt"));
        System.out.println("Enter your first and second teams here:");
        String firstUserTeam = userTeams.nextLine();
        String secondUserTeam = userTeams.nextLine();

        while (textFile.hasNextLine()) {
            String file = textFile.nextLine();
            String[] a = file.split(",");
            int scoreOne = Integer.parseInt(a[2].trim());
            int scoreTwo = Integer.parseInt(a[4].trim());
            String teamOne = a[1].trim();
            String teamTwo = a[3].trim();

            if ((firstUserTeam.equalsIgnoreCase(teamOne) || firstUserTeam.equalsIgnoreCase(teamTwo) ||
                    secondUserTeam.equalsIgnoreCase(teamOne) || secondUserTeam.equalsIgnoreCase(teamTwo))
                    && (scoreOne == 0 || scoreTwo == 0)) {
                System.out.println(file);
            }
        }
        System.out.println();
        System.out.println();

//Level 3. pr.4: The file scores.txt contains the results of every 2009-10 NCAA Division I basketball game. Each line
//of that file looks like below: 11/09/2009 Alcorn St. 60 OhioSt. 100
//Each line consists of the date of the game, the away team, their score, the home team, and their score,
//in that order, each separated by a space. There are no spaces in the team names. Using this file, write
//a program that outputs all the teams with winning records who were collectively (over the course of
//the season) outscored by their opponents. (Hint: George Mason is one of the teams.)
        Scanner basketballFile = new Scanner(new File("scores.txt"));
        Map<String,Integer> a = new LinkedHashMap<String,Integer>();
        while(basketballFile.hasNextLine()){
            String basketball = basketballFile.nextLine();
            String [] results = basketball.split(" ");
            String awayTeam = results[1];
            int awayPoints = Integer.parseInt(results[2]);
            String homeTeam = results[3];
            int homePoints = Integer.parseInt(results[4]);
            a.put(awayTeam, awayPoints);
            a.put(homeTeam, homePoints);

        }



    }
    public static List<Integer> weirdReverse (List<Integer> x){
        Collections.sort(x);
        Collections.reverse(x.subList(0,5));
    return x;
    }
//The proper divisors of a positive integer are its positive divisors, excluding the number itself. For
//example, the proper divisors of 12 are 1, 2, 3, 4, and 6. Write a function called
//highestDivisorSumPercent that takes two integers a and b and returns the integer in the range from a
//to b (inclusive), for which the sum of its proper divisors is largest when measured as a percentage of
//the number. For example, if a is 1 and b is 100, then the function should return 60, because its divisor
//sum is 108, which is 180% of 60, and no other number from 1 to 100 has that high a percentage. If
//more than one number share the highest percentage, you can return whichever of them you like.

    /*int a = 60;
        int b = 200;
        int result = highestDivisorSumPercent(a, b);
        System.out.println(result);*/

    public static int highestDivisorSumPercent (Integer a, Integer b){
        int num = a;
        double bigPercent = 0;

        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            double percent = (double) sum / i * 100;

            if (percent > bigPercent) {
                bigPercent = percent;
                num = i;
            }
        }
        return num;
    }

}
