/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baiithuchanh01;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author MY PC
 */
public class Bai04 {

    public static int[] nhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a%d = ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatMang(int[] a) {
        for (var x : a) {
            System.out.printf("%d\t", x);
        }
        System.out.println();
    }

    //Kiem tra SNT
    public static boolean isSNT(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = nhapMang(4);
        xuatMang(a);

        //Xuat tong gia tri cua mang
        System.out.print("Tong gia tri cua mang: ");
        System.out.println(IntStream.of(a).sum());
        //Tim so long nhat cua mang
        System.out.print("Gia tri lon nhat cua mang: ");
        System.out.println(IntStream.of(a).max().getAsInt());
        //Tim so nho nhat cua mang
        System.out.print("Gia tri nho nhat cua mang: ");
        System.out.println(IntStream.of(a).min().getAsInt());
        //Tinh tong SNT trong mang
        System.out.print("Tong cac SNT cua mang: ");
        System.out.println(IntStream.of(a).filter(x -> isSNT(x) == true).sum());
        //Tim SNT nho nhat trong mang
        System.out.print("SNT nho nhat cua mang: ");
        System.out.println(IntStream.of(a).filter(x -> isSNT(x) == true).min().getAsInt());
        //Tim SNT lon nhat trong mang
        System.out.print("SNT lon nhat cua mang: ");
        System.out.println(IntStream.of(a).filter(x -> isSNT(x) == true).max().orElse(0));

        //Tim kiem 
        int k = 3;
        int idx = Arrays.binarySearch(a, k);
        if (idx < 0) {
            System.out.println("Khong tim thay");
        } else {
            System.out.printf("Tim thay %d", k);
        }

    }
}
