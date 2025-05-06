/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.bai03_baithuchanh03;

/**
 *
 * @author MY PC
 */
public class BangDia extends SanPham{
    private double doDaiThoiGian;

    public BangDia( String tenSp, double gia, double doDaiThoiGian) {
        super(tenSp, gia);
        this.doDaiThoiGian = doDaiThoiGian;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Do dai thoi gian phat = %.1f\n", this.doDaiThoiGian);
    }
    
}
