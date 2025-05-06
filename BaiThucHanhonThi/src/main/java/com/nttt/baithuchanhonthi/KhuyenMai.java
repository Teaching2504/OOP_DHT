/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baithuchanhonthi;

/**
 *
 * @author MY PC
 */
public abstract class KhuyenMai {
    protected String maKm;

    @Override
    public String toString() {
        return this.maKm; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    /**
     * @return the maKm
     */
    public String getMaKm() {
        return maKm;
    }

    /**
     * @param maKm the maKm to set
     */
    public void setMaKm(String maKm) {
        this.maKm = maKm;
    }
    
}
