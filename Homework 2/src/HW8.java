import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import javax.xml.stream.events.Characters;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class HW8 {
    public static void main(String[] args) throws FileNotFoundException {
//Create a list and fill it with some integers. Then write a few lines of code using a set in Java to
//determine how many different numbers are in the list. For instance, if the list is
//[3, 9, 8, 4, 3, 8, 4, 3, 2], the answer should be 5 since there are 5 numbers that appear in the list:
//3, 4, 8, 9, and 2. Make sure your answer uses a Java set and not something else to solve the problem.
        List<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 3, 9, 8, 4, 3, 8, 4, 3, 2);
        numbers = new ArrayList<Integer>(new LinkedHashSet<Integer>(numbers));
        System.out.println(numbers.size());
//Create a Java map where the keys are the characters A, B, C, D, and E, and the values are the numbers
//2, 4, 6, 8, and 10. Then use the map to do the following:
//(a) Print out the value corresponding to the key E.
//(b) Loop over the map and print out just the values.
        Map<Character, Integer> maps = new LinkedHashMap<Character, Integer>();
        maps.put('A', 2);
        maps.put('B', 4);
        maps.put('C', 6);
        maps.put('D', 8);
        maps.put('E', 10);
        System.out.println("The key that is corresponding to E is: " + maps.get('E'));
        for (Character key : maps.keySet()) {
            System.out.println(maps.get(key));
        }
        System.out.println();
//(a)included with this assignment is a file elements.txt. Use Java to read the file and create a map
//whose keys are the element symbols and whose values are the element names.
//(b) Ask the user to enter a chemical formula (like H2O, HCl, Fe2O3, or C6H12O6) and use the map from part
//(a) to print out the names of the elements in the formula. For instance, for C6H12O6, it
//would print out Carbon, Hydrogen, and Oxygen
        Scanner textFile = new Scanner(new File("elements.txt"));
        Map<String, String> map = new LinkedHashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter your Chem: ");
        //String userChem = scan.nextLine();
        while (textFile.hasNextLine()) {
            String file = textFile.nextLine();
            String splitFile = file.substring(file.indexOf("-") + 1);
            map.put(splitFile, splitFile.substring(splitFile.indexOf("-") + 2));
            System.out.println(map.get(splitFile));
        }
//ask the user to enter a string. Then create a map whose keys are the characters of the string and
//whose values are how many times that character appears. For instance, if the string is chatty, the
//map would be {'a':1, 'c':1, 'h':1, 't':2, 'y':1}.
//(b) Ask the user to enter another string. Create another map just like part (a) for this string. Then
//print out whether or not the two maps have the exact same keys and corresponding values. For
//instance, if the two strings entered are “there” and “three”, the answer would be yes because they
//both have the map {'e':2, 'h':1, 'r':1, 't':1}. In other words, we are checking if the two
//words are anagrams of each other.
        Map<String, Integer> userMap = new LinkedHashMap<String, Integer>();
        System.out.println("Enter a String here: ");
        String userString = scan.nextLine();
    }
}
