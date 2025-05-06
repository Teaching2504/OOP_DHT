/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baithuchanhonthi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jdk.dynalink.linker.support.Guards;

/**
 *
 * @author MY PC
 */
public class SanPham {
    private static int dem;
    private int id = ++ dem;
    private String tenSp;
    private double giaSp;
    private List<KhuyenMai> km;

    public SanPham(String tenSp, double giaSp) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.km = new ArrayList<>();
    }

    
    public void hienThi(){
        System.out.printf("%d - %s - %.1f - So Km: %d\n", this.id, this.tenSp, this.giaSp, this.km.size());
        this.km.forEach(k -> System.out.println(k));
    }
    
    public void themKm(KhuyenMai... k){
        this.km.addAll(Arrays.asList(k));
    }
    public boolean isKm(Class c){
        return this.km.stream().filter(k -> c.isInstance(k)).count()>0;//Lon hong 0 la ton tai
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the giaSp
     */
    public double getMaSp() {
        return giaSp;
    }

    /**
     * @param maSp the giaSp to set
     */
    public void setMaSp(double maSp) {
        this.giaSp = maSp;
    }

    /**
     * @return the km
     */
    public List<KhuyenMai> getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(List<KhuyenMai> km) {
        this.km = km;
    }
}
