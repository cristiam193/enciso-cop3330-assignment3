package ex45.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    private FileWriter writer;
    private ArrayList<String> list;

    public WriteFile(String name, ArrayList<String> list) throws IOException {
        ReadFile readFile = new ReadFile();
        writer = new FileWriter("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex45/base/" + name);
        this.list = list;
    }
    public void WriteToFile() throws IOException {
        for(int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            String str = "utilize";
            int index = 0;
            while(true) {
                index = temp.indexOf(str, index);
                if(index != -1) {
                    index += str.length();
                }
                else {
                    break;
                }
            }
            temp = temp.replaceAll("utilize", "use");
            writer.write(temp +"\n");
        }
        writer.close();
    }
}
