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
public class Bai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("x = ");
        double x = sc.nextDouble();

        double gt = 0;
        for (int i = 0; i <= n; i++) {
            System.out.printf("a%d = ", i);
            double a = sc.nextDouble();
            gt += a * Math.pow(x, i);
        }

        System.out.printf("Gia tri cua bieu thuc: %f\n", gt);
    }
}
