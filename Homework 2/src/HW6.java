import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) throws IOException {
//Ask the user to enter a sentence with no punctuation. Then use the split method to break the sentence
//into words and print the first letter of each word
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence here: ");
        String userSen = scanner.nextLine();
        String[] split = userSen.split(" ", -2);
        for (String a: split){
            System.out.println(a);
        }
//Use wordlist.txt to print out all 5-letter words that start with ch and end with a vowel.
        List<String> line = new ArrayList<String>();
        Scanner textFile = new Scanner(new File("wordlist.txt"));
        while(textFile.hasNextLine()){
            String t = textFile.nextLine();
            if(t.length()==5 && t.startsWith("ch") ){
                if(t.endsWith("a")||t.endsWith("e")||t.endsWith("i")||t.endsWith("o")||t.endsWith("u")) {
                    line.add(t);
                }
            }
        }
        for (int i=0;i<line.size(); i++){
            System.out.println(line.get(i));
        }
//Add up all the numbers in the file expenses.txt.
        List<Integer> expense = new ArrayList<Integer>();
        Scanner numFile = new Scanner(new File("expenses.txt"));
        while(numFile.hasNextInt()){
            int nums = numFile.nextInt();
            expense.add(nums);
        }
        int total=0;
        for (int i = 0; i < expense.size(); i++) {
            total += expense.get(i);
        }
        System.out.println("Total expense: " + total);
//The file yob2021.txt has the names of babies born in 2021 along with whether the name is male or
//female and how many babies got that name. Read the file and print out all the names that start with X
//with at least 100 babies getting that name. [Note: some names are both male and female, like Xavier.
//It’s simplest to just treat those as separate names and not worry about adding up the two.]
        List<String> names = new ArrayList<String>();
        Scanner yobFile = new Scanner(new File("yob2021.txt"));
        int mfTotal=0;
        while (yobFile.hasNextLine()){
            String file=yobFile.nextLine();
            if (file.startsWith("X")){
                names.add(file);
                mfTotal++;
            }
        }
        for (int i =0;i< names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("There are "+mfTotal+" names that start with X");
        System.out.println();

//The file grades.txt has test grades for several students. Read the file and write to a new file called
//new_grades.txt that has on each line the person’s name, then a tab character, and then their average
//grade on the three tests.
        List<String> grades= new ArrayList<String>();
        Scanner gradeFile= new Scanner(new File("grades.txt"));
        PrintWriter newFile = new PrintWriter("new_grades.txt");
        while(gradeFile.hasNextLine()){
            String [] grade =gradeFile.nextLine().split(" ");
            String name=grade[0];
            int firstGrade= Integer.parseInt(grade[1]);
            int secondGrade= Integer.parseInt(grade[2]);
            int thirdGrade= Integer.parseInt(grade[3]);
            int average = firstGrade+secondGrade+thirdGrade;
            newFile.println(name+"\t"+average/3);
        }
        newFile.close();

//have Java give the user a random country name and five random capitals to choose from,
// with one of them being the correct
//capital of that country. When printing, label the choices with (a), (b), (c), (d), or (e), like a multiple
//choice quiz. Ask the user for the correct capital (a, b, c, d, or e), and print out a message indicating if
//they got it right or not.
        List<String> capitals =new ArrayList<String>();
        Random rand= new Random();
        int random=rand.nextInt();
        Scanner capFile= new Scanner(new File("capitals.txt"));
        while(capFile.hasNextLine()){
            String cap=capFile.nextLine();
            //String[] x=cap.split(" ");
            //String capital=x[0];
            //String country=x[1];
            capitals.add(cap);
        }
        for(int i=0; i<capitals.size();i++){
            String v= capitals.get(rand.nextInt(0,capitals.size()));
            System.out.println(v);
        }
    }
}
