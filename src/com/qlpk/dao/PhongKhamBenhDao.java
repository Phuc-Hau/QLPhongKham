/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.dao;

import com.qlpk.entity.PhongKham;
import com.qlpk.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class PhongKhamBenhDao  extends PhongKhamDao<PhongKham, String>{

    @Override
    public void insert(PhongKham entity) {
        String sql = "INSERT INTO PhongKham ( MaPhongKham, TenPhongKham, GhiChu) VALUES (?,?,?)";
        JdbcHelper.Update(sql, entity.getMaPK(),
                                entity.getTenPhongKham(),
                                entity.getGhiChu());
    }

    @Override
    public void update(PhongKham entity) {
        String sql = "UPDATE PhongKham SET TenPhongKham=?, GhiChu=? WHERE MaPK=?";
        JdbcHelper.Update(sql, entity.getTenPhongKham(),
                                entity.getGhiChu(),
                                entity.getMaPK());
    }

    @Override
    public void detele(String id) {
        String sql="DELETE FROM PhongKham WHERE MaPK=?";
        JdbcHelper.Update(sql, id);
    }

    @Override
    public PhongKham selectByID(String id) {
        String sql = "SELECT * FROM PhongKham WHERE MaPK=?";
        List<PhongKham> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhongKham> selectAll() {
        String sql="SELECT * FROM PhongKham";
        return selectBySql(sql);
    }

    @Override
    protected List<PhongKham> selectBySql(String sql, Object... args) {
        List<PhongKham> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while(rs.next()){
                    PhongKham entity=new PhongKham();
                    entity.setMaPK(rs.getString("MaPK"));
                    entity.setTenPhongKham(rs.getString("TenPhongKham"));
                    entity.setGhiChu(rs.getString("GhiChu"));
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
