/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baithuchanhonthi;

import java.util.List;

/**
 *
 * @author MY PC
 */
public class KhuyenMaiB extends KhuyenMai {

    private List<String> dichVu;

    public KhuyenMaiB(List<String> dichVu) {
        this.maKm = String.format("B%d - ",(int)(Math.random()*9999+1000));
        this.dichVu = dichVu;
    }

    @Override
    public String toString() {
       String s=super.toString();
       for(var d: this.dichVu){
           s+= String.format("%s\t", d);
       }
       return s;
    }
    
    /**
     * @return the dichVu
     */
    public List<String> getDichVu() {
        return dichVu;
    }

    /**
     * @param dichVu the dichVu to set
     */
    public void setDichVu(List<String> dichVu) {
        this.dichVu = dichVu;
    }

}
