/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.bai03_baithuchanh03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



/**
 *
 * @author MY PC
 */
public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public void themSp(SanPham... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void xoaSp(int id){
        this.ds.removeIf(s -> s.getId() == id);
    }
    public void hienThi(){
        this.ds.forEach(s -> s.hienThi());
    }
    public SanPham timKiem(int id){
        return this.ds.stream().filter(s ->s.getId()== id).findFirst().get();
    }
    
    public List<SanPham> timKiem(String str){
        //Uu tien tim theo loai
        try{
            Class c = Class.forName(str);
            return this.ds.stream().filter(s ->c.isInstance(s)).collect(Collectors.toList());
        //Tim theo ten
        }catch (ClassNotFoundException ex){
            return this.ds.stream().filter(s -> s.getTenSp().contains(str)).collect(Collectors.toList());
        }
    }
    
    public void sapXep(){
        this.ds.sort((s1,s2) -> - Double.compare(s1.getGia(), s2.getGia()));
    }
    
    public void sapXep2(){
        this.ds.sort((s1,s2)->{
        double g1 = s1.getGia();
        double g2 = s2.getGia();
        //Cung gia thi sap xep ten
        if(Double.compare(g1, g2)==0)
            return s1.getTenSp().compareTo(s2.getTenSp()); 
        return -Double.compare(g1, g2);
                
    });
    }
    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
    
}
