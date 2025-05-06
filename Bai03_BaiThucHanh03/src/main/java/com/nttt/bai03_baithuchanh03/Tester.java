/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.bai03_baithuchanh03;

/**
 *
 * @author MY PC
 */
public class Tester {

    public static void main(String[] args) {
        SanPham s1 = new Sach("OOP", 80, 100);
        SanPham s2 = new BangDia("OU", 60, 100);
        SanPham s3 = new Sach("OOP Design Pattern", 100, 200);
        SanPham s4 = new BangDia("AI", 90, 120);

        QuanLySanPham q1 = new QuanLySanPham();
        q1.themSp(s1, s2, s3, s4);
        q1.hienThi();
        
        System.out.println("==XOA s3 ===");
        q1.xoaSp(3);
        q1.hienThi();
        
        System.out.println("==TIM SACH ===");
        //tim theo loai san pham la sach
        q1.timKiem("com.ntt.sp.sach").forEach(s -> s.hienThi());
        //chua oop
        q1.timKiem("O").forEach(s -> s.hienThi());
        q1.hienThi();
        
        System.out.println("==Sap xep==");
        q1.sapXep2();
        q1.hienThi();
    }
}
