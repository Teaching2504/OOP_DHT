/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baiithuchanh01;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Bai03a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dia chi mail: ");
        String a = sc.nextLine();
        
        System.out.printf("Dia chi: %s\n",a.substring(0, a.indexOf("@")));
    }
}
