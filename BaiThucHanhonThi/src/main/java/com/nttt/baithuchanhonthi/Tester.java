/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baithuchanhonthi;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MY PC
 */
public class Tester {
    public static void main(String[] args) throws ClassNotFoundException {
        SanPham s1 = new SanPham("SP 1", 50);
        SanPham s2 = new SanPham("SP OU 2", 80);
        SanPham s3 = new SanPham("SP 3", 70);
        
        QLSanPham q1 = new QLSanPham();
        
        System.out.println("===Cau a===");
        q1.themSp(s1, s2, s3);
        q1.hienThi();
        
        System.out.println("===b===");
        KhuyenMai k1 = new KhuyenMaiA(0.3);
        KhuyenMai k2 = new KhuyenMaiB(Arrays.asList("Gau bong"));
        KhuyenMai k3 = new KhuyenMaiB(Arrays.asList("Ly"));
        s1.themKm(k1);
        s2.themKm(k2, k3);
  
        q1.hienThi();
        
        System.out.println("===c===");
        SanPham kq1 = q1.timKiem(1);
        System.out.println("Danh sach khuyen mai id 1" );
        kq1.getKm().forEach(s -> System.out.println(s));
        List<SanPham> kq2 = q1.timKiem("OU");
        System.out.println("Danh sach khuyen mai ma kw = OU");
        for(var k:kq2)
            k.getKm().forEach(s ->System.out.println(s));
        
         System.out.println("===d===");
         List<SanPham> kq = q1.timTheoLoaiKm("com.nttt.baithuchanhonthi.KhuyenMaiB");
         kq.forEach(s ->s.hienThi());
         
        System.out.println("===e===");
        q1.sapXep();
        q1.hienThi();
    }
}
