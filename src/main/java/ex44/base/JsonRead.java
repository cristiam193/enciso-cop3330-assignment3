package ex44.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class JsonRead {
    public void readFromFile(){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/Users/cristiamenciso/enciso-cop3330-assignment3/src/main/java/ex44/base/exercise44_input.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("products");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            int flag = 0;
            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();
            Iterator iterator = subjects.iterator();
            while(iterator.hasNext()) {
                JSONObject json = (JSONObject) iterator.next();
                String name = (String)json.get("name");
                if(input.toLowerCase().equals(name.toLowerCase())) {
                    System.out.println("Name: "+ name);
                    System.out.println("Price: "+ json.get("price"));
                    System.out.println("Quantity: "+ json.get("quantity"));
                    flag = 1;
                }
            }
            if(flag == 0) {
                System.out.println("Sorry, that product was not found in our directory.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
