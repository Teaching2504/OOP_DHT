/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baiithuchanh01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Bai03c {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/main/resources/data.txt");
        File f1 = new File("src/main/resources/out.txt");
        try (Scanner sc = new Scanner(f); 
                PrintWriter w = new PrintWriter(f1)) {
            String s = sc.nextLine();
            s= s.replaceAll("\\{file\\}", "Tap tin");
            System.out.println(s);
            w.println(s);
        }
    }
}
