/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.entity;

/**
 *
 * @author My PC
 */
public class PhongKham {
    String maPK;
    String tenPhongKham;
    String ghiChu;

    public PhongKham() {
    }

    public PhongKham(String maPK, String tenPhongKham, String ghiChu) {
        this.maPK = maPK;
        this.tenPhongKham = tenPhongKham;
        this.ghiChu = ghiChu;
    }

    public String getMaPK() {
        return maPK;
    }

    public void setMaPK(String maPK) {
        this.maPK = maPK;
    }

    public String getTenPhongKham() {
        return tenPhongKham;
    }

    public void setTenPhongKham(String tenPhongKham) {
        this.tenPhongKham = tenPhongKham;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
