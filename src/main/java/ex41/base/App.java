package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 Exercise 41 - Name Sorter
Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.
Challenges
Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */

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
