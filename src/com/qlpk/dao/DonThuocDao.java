/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.dao;

import com.qlpk.entity.DonThuoc;
import com.qlpk.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class DonThuocDao extends PhongKhamDao<DonThuoc, Integer>{


    @Override
    public void insert(DonThuoc entity) {
        String sql = "SET IDENTITY_INSERT DonThuoc ON  INSERT INTO DonThuoc ( DonThuoc, MaBN, MaPhieuKham) VALUES (?,?,?)";
        JdbcHelper.Update(sql, 
                entity.getDonThuoc(),
                entity.getMaBN(),
                entity.getMaPhieuKham());
    }

    @Override
    public void update(DonThuoc entity) {
        String sql = "UPDATE DonThuoc SET  MaBN=?, MaPhieuKham=?, WHERE DonThuoc=? ";
        JdbcHelper.Update(sql, 
                entity.getMaBN(),
                entity.getMaPhieuKham(),
                entity.getDonThuoc());
    }

    @Override
    public void detele(Integer id) {
        String sql="DELETE FROM DonThuoc WHERE DonThuoc=?";
        JdbcHelper.Update(sql, id);
    }

    @Override
    public DonThuoc selectByID(Integer id) {
        String sql = "SELECT * FROM DonThuoc WHERE DonThuoc=?";
        List<DonThuoc> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DonThuoc> selectAll() {
        String sql="SELECT * FROM DonThuoc";
        return selectBySql(sql);
    }

    @Override
    protected List<DonThuoc> selectBySql(String sql, Object... args) {
        List<DonThuoc> list=new ArrayList<>();
        try {
             ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while(rs.next()){
                    DonThuoc entity=new DonThuoc();
                    entity.setDonThuoc(rs.getInt("DonThuoc"));
                    entity.setMaBN(rs.getString("MaBN"));
                    entity.setMaPhieuKham(rs.getInt("MaPhieuKham"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
}
