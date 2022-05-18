package ru.bgpu.task.map;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\79991\\Desktop\\test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            HashMap<String, String> map = new HashMap<String, String>();
            br.readLine();
            while ((strLine = br.readLine()) != null){
                String[] parts = strLine.split("\\s+");
//                System.out.println(parts[2] + " " + parts[4]);
//                String key = parts[2];
//                String value = parts[4];
//                map.put(key, value);

            }

//            for (String key : map.keySet()){
//                System.out.println(key + " " + map.get(key));
//            }
            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
