package ex41.base;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static int counter = 0;

    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> alpha_arr = new ArrayList<String>();
        arr = getInput("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex41/base/exercise41_input.txt");
        // Get Input
        alpha_arr = List.sortList(arr);
        // Sort arraylist alphabetically
        List.output_List(alpha_arr, counter);
        // Print out to file

    }
    public static ArrayList<String> getInput(String file) throws FileNotFoundException {
        Scanner in = new Scanner(new File(file));
        ArrayList<String>list = new ArrayList<String>();
        while (in.hasNextLine()) {
            list.add(in.nextLine());
            counter++;
        }
        in.close();
        return list;
    }
}
