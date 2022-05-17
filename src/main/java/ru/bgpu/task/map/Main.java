package ru.bgpu.task.map;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\79991\\Desktop\\access.log");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            br.readLine();
            fstream.close();
//            while ((br.readLine()) != null){
//               System.out.println(strLine);
//            }
//            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
