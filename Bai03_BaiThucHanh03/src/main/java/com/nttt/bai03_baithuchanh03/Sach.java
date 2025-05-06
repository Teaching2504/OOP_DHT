/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.bai03_baithuchanh03;

/**
 *
 * @author MY PC
 */
public class Sach extends SanPham{
    private int soTrang;

    public Sach( String tenSp, double gia, int soTrang) {
        super(tenSp, gia);
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("So trang = %d\n",this.soTrang);
    }
    
}
