package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 Exercise 42 - Parsing a Data File
Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500
Constraints
Write your own code to parse the data. Don't use a CSV parser.
Challenges
Make each column one space longer than the longest value in the column.
Format the salary as currency with dollar signs and commas.
Sort the results by salary from highest to lowest.
Rework your program to use a CSV parsing library and compare the results.
 */

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
