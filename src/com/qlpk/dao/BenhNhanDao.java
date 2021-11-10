/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.dao;
import com.qlpk.entity.BenhNhan;
import com.qlpk.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class BenhNhanDao extends PhongKhamDao<BenhNhan, String>{
    
    String INSERT_SQL = "INSERT INTO BenhNhan(MaBN, TenBenhNhan, GioiTinh, SDT, NgaySinh, Tuoi, DiaChi, NgheNghiep, GhiChu) VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE BenhNhan SET  TenBenhNhan=?, GioiTinh=?, SDT=?, NgaySinh=?,"
            + " Tuoi=?, DiaChi=?, NgheNghiep=?, GhiChu=? WHERE MaBN=?";
    String DELETE_SQL = "DELETE FROM BenhNhan WHERE MaBN=?";
    String SELECT_ALL_SQL = "SELECT * FROM BenhNhan";
    String SELECT_BY_ID_SQL = "SELECT * FROM BenhNhan WHERE MaBN=?";
    String SELECT_BY_NOTPHIEUKHAM ="select BenhNhan.* from BenhNhan left join PhieuKham on BenhNhan.MaBN = PhieuKham.MABN";

    @Override
    public void insert(BenhNhan entity) {
        JdbcHelper.Update(INSERT_SQL, entity.getMaBN(), entity.getTenBenhNhan(), entity.isGioiTinh(),
                 entity.getSDT(), entity.getNgaySinh(), entity.getTuoi(), entity.getDiaChi(), entity.getNgheNghiep(), entity.getGhiChu());
    }

    @Override
    public void update(BenhNhan entity) {
        JdbcHelper.Update(UPDATE_SQL, entity.getTenBenhNhan(), entity.isGioiTinh(),
                 entity.getSDT(), entity.getNgaySinh(), entity.getTuoi(), entity.getDiaChi(), entity.getNgheNghiep(), entity.getGhiChu(), entity.getMaBN());
    }

    @Override
    public void detele(String id) {
        JdbcHelper.Update(DELETE_SQL, id);
    }

    @Override
    public BenhNhan selectByID(String id) {
        List<BenhNhan> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<BenhNhan> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<BenhNhan> selectBySql(String sql, Object... args) {
        List<BenhNhan> list = new ArrayList<>();
        try {
             ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                BenhNhan entity = new BenhNhan();
                entity.setMaBN(rs.getString("MaBN"));
                entity.setTenBenhNhan(rs.getString("TenBenhNhan"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setSDT(rs.getString("SDT"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setTuoi(rs.getInt("Tuoi"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setNgheNghiep(rs.getString("NgheNghiep"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list; 
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    
}
