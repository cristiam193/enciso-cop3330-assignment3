package ex41.base;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static ArrayList<String> sortList(ArrayList<String> list) {
        Collections.sort(list);

        return list;
    }
    public static void output_List(ArrayList<String> list,int counter) throws IOException {
        FileWriter writer = new FileWriter("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex41/base/exercise41_output.txt");
        writer.write("Total of " + counter + " names\n-----------------\n");
        for(String str : list) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }
}
