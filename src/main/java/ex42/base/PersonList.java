package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PersonList {

    public static ArrayList<Person> parseList(ArrayList<String> list) {
        ArrayList<Person> people = new ArrayList<Person>();
        for (int i = 0; i < list.size(); i++) {
            Person worker = new Person();
            worker.setLastName(list.get(i).split(",")[0]);
            worker.setFirstName(list.get(i).split(",")[1]);
            worker.setSalary(list.get(i).split(",")[2]);
            people.add(worker);
        }
        return people;
    }
    public static void printTable(ArrayList<Person> list) {

        System.out.print("Last\t\tFirst\t\tSalary\n---------------------------------\n");
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%-8s\t%-8s\t%-8s\n", list.get(i).getLastName(), list.get(i).getFirstName(), list.get(i).getSalary());
        }

    }
}
