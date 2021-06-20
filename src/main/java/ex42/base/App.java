package ex42.base;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static int counter = 0;
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arr = new ArrayList<String>();
        arr = getInput();
        // get input from file
        ArrayList<Person> people = new ArrayList<Person>();
        people = PersonList.parseList(arr);
        // parse information
        //System.out.print(people.get(0).getLastName());

        PersonList.printTable(people);
        // print out in table format
    }

    public static ArrayList<String> getInput() throws FileNotFoundException {
        Scanner in = new Scanner(new File("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex42/base/exercise42_input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (in.hasNext()) {
            list.add((in.next()));

        }
        in.close();
        return list;
    }

}
