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
public class Bai01 {

    public static void main(String[] args) {

        int n = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int doan;
        do {
            System.out.println("So ban doan: ");

            doan = sc.nextByte();

            if (doan > n) {
                System.out.println("LON HON!");
            } else if (doan < n) {
                System.out.println("NHO HON!");
            } else {
                System.out.println("CHINH XAC");
            }
        } while (doan != n);

    }
}
