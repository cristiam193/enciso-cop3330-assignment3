package ex45.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the output file: ");
        String output = in.nextLine();
        //get input for output file
        ReadFile readfile = new ReadFile();
        readfile.readFromFile();
        // read from input file
        ArrayList<String> list = readfile.getList();
        // return the file in list form
        WriteFile writer = new WriteFile(output ,list);
        writer.WriteToFile();
        // Parse through file
        // Write to a new file

    }
}
