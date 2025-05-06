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
public class Bai03b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i)) == true)
                dem++;
            }
        System.out.printf("So ky tu hoa: %d", dem);
        }
    }
