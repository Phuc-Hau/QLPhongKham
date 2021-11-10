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
public class DonThuoc {
    int donThuoc;
    String maBN;
    int maPhieuKham;
    int soLuong;

    public DonThuoc() {
    }

    public DonThuoc(int donThuoc, String maBN, int maPhieuKham, int soLuong) {
        this.donThuoc = donThuoc;
        this.maBN = maBN;
        this.maPhieuKham = maPhieuKham;
        this.soLuong = soLuong;
    }

    public int getDonThuoc() {
        return donThuoc;
    }

    public void setDonThuoc(int donThuoc) {
        this.donThuoc = donThuoc;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public int getMaPhieuKham() {
        return maPhieuKham;
    }

    public void setMaPhieuKham(int maPhieuKham) {
        this.maPhieuKham = maPhieuKham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
