/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttt.baithuchanhonthi;

/**
 *
 * @author MY PC
 */
public class KhuyenMaiA extends KhuyenMai{
    public static int dem;
    private double tyLeGiam;

    public KhuyenMaiA(double tyLeGiam) {
        this.maKm = String.format("A%02d", ++dem);
        this.tyLeGiam = tyLeGiam;
 
    }

    @Override
    public String toString() {
        return String.format("%s - Ty le: %.1f\n", super.toString(), this.tyLeGiam);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    /**
     * @return the tyLeGiam
     */
    public double getTyLeGiam() {
        return tyLeGiam;
    }

    /**
     * @param tyLeGiam the tyLeGiam to set
     */
    public void setTyLeGiam(double tyLeGiam) {
        this.tyLeGiam = tyLeGiam;
    }
    
}
