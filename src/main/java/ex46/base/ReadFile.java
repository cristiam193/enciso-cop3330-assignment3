package ex46.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
    private ArrayList<String> list;
    private Scanner in;

    public void readFile() throws FileNotFoundException {
        list = new ArrayList<String>();
        File file = new File("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex46/base/exercise46_input.txt");
        in = new Scanner(file);

    }
    public void readFromFile() {
        try {
            int i = 0;
            while(in.hasNext()) {
                String filedata = in.next();
                list.add(filedata);
            }
        }
        finally {
            in.close();
        }
    }
    public ArrayList<String> getList() {
        return list;

    }

    public void wordFrequency(ArrayList<String> list) {
        Set<String> unique = new HashSet<String>(list);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(list, key));


        }

    }

}
