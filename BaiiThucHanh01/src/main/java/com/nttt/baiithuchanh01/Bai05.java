/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baiithuchanh01;

import java.util.stream.IntStream;

/**
 *
 * @author MY PC
 */
public class Bai05 {

    public static int[][] nhapMaTran(int m, int n) {
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        return a;
    }

    public static void xuatMaTran(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void xuatMaTran(int[][] a) {
        for (var x : a) {
            for (var y : x) {
                System.out.printf("%d\t", y);
            }
            System.out.println();
        }
    }

    // Tinh tong tung 
    public static void main(String[] args) {
        int[][] a = nhapMaTran(3, 4);
//       xuatMaTran(a, 3, 4);
        xuatMaTran(a);
        for (int i = 0; i < a.length; i++) {
            //Tong dong i
            System.out.printf("Tong dong %d: ", i);
            System.out.println(IntStream.of(a[i]).sum());
            //Max dong i
            System.out.printf("Max dong %d: ", i);
            System.out.println(IntStream.of(a[i]).max().getAsInt());
        }
    }

}
