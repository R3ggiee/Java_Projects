import java.util.Scanner;

public class CMSCI125HW2 {
    public static void main(String[] args) {
/*Write a program that asks the user to enter a string. The program should then print the following:
(a) How many characters are in the string
(b) Whether or not the string equals “hello”
(c) The string converted to an all uppercase string
(d) The location of the first 'z' if there is one and otherwise the message “there is no z”.
(e) The first three characters of the string
(f) The last three characters of the string
(g) The string with all its spaces changed to underscores
(h) Whether or not the string contains the substring "abc".*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String line = scanner.nextLine();
        int a = line.length();
        System.out.println(a);
        if (!line.equalsIgnoreCase("hello"))
            System.out.println("This string does not equals to hello.");
        else {
            System.out.println("This string does equal to hello");
        }
        String upper = line.toUpperCase();
        System.out.println(upper);

        boolean z = line.contains("z");
        if (!z)
            System.out.println("theres no z");
        if (z) {
            char find = 'z';
            System.out.println("The z is here:" + line.indexOf(find));
        }
        System.out.println("The first three letters are:" + line.substring(0, 3));
        System.out.println(line.length() - 3);
        System.out.println("Spaces replaced with underscores: " + line.replace(" ", "_"));
        //put code for string abc


/*Write a program that asks the user to enter a word and prints out whether that word contains
any lowercase vowels (a, e, i, o, or u).*/
        System.out.println("Put in a word:");
        String userVowels = scanner.nextLine();
        String lowerCase = userVowels.toLowerCase();

        boolean clowerCase = false;
        if (userVowels.contains("a") || userVowels.contains("e") || userVowels.contains("i") || userVowels.contains("o") || userVowels.contains("u")) {
            clowerCase = true;
        }
        if (clowerCase) {
            System.out.println("This word has a, e, i, o, or u in it.");
        } else {
            System.out.println("This word does not have a, e, i, o, or u in it.");
        }

/*Write a program that asks the user to enter a string, converts that string to lowercase, removes all
punctuation from it, and prints out the result. Here are the seven punctuation characters to remove:
? ! " . , ; : */
        String strip = "";
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        String lower = string.toLowerCase();
        System.out.println(lower);
        strip = string.replace("?", "").replace(",", "").replace(".","").replace("\"","");
        System.out.println(strip);
/*Ask the user to enter a course code, like MATH 247 or CMSCI 125. The code consists of a department
code followed by a course number. If the course number is not in the range from 100 to 499, then
output that the user’s entry is invalid.*/
        System.out.println("Enter a class code: ");
        String classCode = scanner.nextLine();
        System.out.println("Enter class number: ");
        int classNum = scanner.nextInt();
        if (classNum >100 && classNum <499){
            System.out.println(classCode + classNum);}
        else
            System.out.println("Your entry is invalid.");

/*Write a program that asks the user to enter a height in the format feet'inches" (like 5'11" or 6'3". Add
4 inches to the height and print the result in the feet'inches" format. For example, if the user enters
5'11", the result should be 6'3".*/
        System.out.println("Please enter you height: ");
        String height = scanner.nextLine();
        int convert = Integer.parseInt(height);
        System.out.println(height);
        System.out.println(convert + 4);

    }
}