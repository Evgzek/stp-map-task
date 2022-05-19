package ru.bgpu.task.map;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\79991\\Desktop\\access.log");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            Map<String, Integer> res = new LinkedHashMap<String, Integer>();
            Map<String, Integer> top_10 = new LinkedHashMap<String, Integer>();
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
            map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(e -> res.put(e.getKey(), e.getValue()));
            for (String key : res.keySet()){
                System.out.println(key + " " + res.get(key));
            }
            System.out.println("Top 10");
            int n = 0;
            for (String key : res.keySet()){
                n++;
                if (n > 10){
                    break;
                }else {
                    top_10.put(key, res.get(key));
                }
            }
            for (String key : top_10.keySet()){
                System.out.println(key + " " + top_10.get(key));
            }
            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
