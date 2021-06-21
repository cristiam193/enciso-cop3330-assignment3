package ex45.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    private ArrayList<String> list;
    private  Scanner in;

    public ReadFile() throws FileNotFoundException {
        list = new ArrayList<String>();
        File file = new File("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex45/base/exercise45_input.txt");
        in = new Scanner(file);
    }
    public void readFromFile() {
        try {
            int i = 0;
            while(in.hasNext()) {
                String filedata = in.nextLine();
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



}
