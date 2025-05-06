/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baiithuchanh01;
//import java.util.Scanner;
/**
 *
 * @author MY PC
 */
public class Bai03de {
     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap chuoi: ");
//        String s = sc.nextLine();
        String s = "    JAVA   ;,;;;,  is ;,;;;  siMPle     ";
        //Cat chuoi thanh cac tu
        String[] a = s.trim().split("[,;\\s]+");

        //Tim so tu trong chuoi
        System.out.println("So tu: " + a.length);

        //Tim so tu dai nhat trong chuoi
        //Khoi tao tu dai nhat la tu dau tien
        String longa = a[0];

        //Duyet tung phan tu de tim tu dai nhat
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > longa.length()) {
                longa = a[i];
            }
        }
        System.out.println("Tu dai nhat: " + longa);
        
        //chuan hoa chuoi - xoa khoang trang
        StringBuilder b = new StringBuilder();
        for(var w:a)
           b.append(w.substring(0,1).toUpperCase()) .append(w.substring(1).toLowerCase()).append(" ");
         System.out.println("Chuoi da chuan hoa: "+b.toString().trim());
    }
}
