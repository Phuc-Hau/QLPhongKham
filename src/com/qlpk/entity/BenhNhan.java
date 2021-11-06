
package com.qlpk.entity;

import java.util.Date;


public class BenhNhan {

    
   String MaBN;
    String TenBenhNhan;
    boolean GioiTinh;
    String SDT;
    Date NgaySinh;
    int Tuoi;
    String DiaChi;
    String NgheNghiep;
    String GhiChu;

    public BenhNhan() { 
    }

    public BenhNhan(String MaBN, String TenBenhNhan, boolean GioiTinh, String SDT, Date NgaySinh, int Tuoi, String DiaChi, String NgheNghiep, String GhiChu) {
        this.MaBN = MaBN;
        this.TenBenhNhan = TenBenhNhan;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.NgaySinh = NgaySinh;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.NgheNghiep = NgheNghiep;
        this.GhiChu = GhiChu;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getTenBenhNhan() {
        return TenBenhNhan;
    }

    public void setTenBenhNhan(String TenBenhNhan) {
        this.TenBenhNhan = TenBenhNhan;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
