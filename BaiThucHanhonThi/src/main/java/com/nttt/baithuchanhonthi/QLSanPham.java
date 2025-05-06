/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baithuchanhonthi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author MY PC
 */
public class QLSanPham {
    private List<SanPham> ds = new ArrayList<>();

    public void themSp(SanPham... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThi(){
        this.ds.forEach(h ->h.hienThi());
    }
    public SanPham timKiem(int id){
        return this.ds.stream().filter(s ->s.getId()==id).findFirst().get();
    }
    public List<SanPham> timKiem(String kw){
        return this.ds.stream().filter(s ->s.getTenSp().contains(kw)).collect(Collectors.toList());
    }
    public List<SanPham> timTheoLoaiKm(String tenLopKm) throws ClassNotFoundException{
        Class c = Class.forName(tenLopKm);
        return this.ds.stream().filter(s-> s.isKm(c)).collect(Collectors.toList());
    }
    //Giam dan theo so luong k,
    public void sapXep(){
        this.ds.sort((s1,s2)->-(s1.getKm().size() - s2.getKm().size()));
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
