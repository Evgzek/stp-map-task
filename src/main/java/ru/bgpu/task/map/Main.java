package ru.bgpu.task.map;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\79991\\Desktop\\access.log");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            String strLine;
            br.readLine();
            while ((strLine = br.readLine()) != null){
                String[] parts = strLine.split("\\s+");
                String key = parts[2];
                int value = Integer.parseInt(parts[4]);
                if (map.containsKey(key)){
                    int p = map.get(key);
                    value = value + p;
                }
                map.put(key, value);
            }
            for (String key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
