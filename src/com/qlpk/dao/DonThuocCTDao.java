/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.dao;

import com.qlpk.entity.DonThuocCT;
import com.qlpk.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class DonThuocCTDao extends PhongKhamDao<DonThuocCT, Integer>{

    @Override
    public void insert(DonThuocCT entity) {
        String sql = "INSERT INTO DonThuocCT ( DonThuoc, LoaiThuoc, SoLuong) VALUES (?,?,?)";
        JdbcHelper.Update(sql, 
                entity.getDonThuoc(),
                entity.getLoaiThuoc(),
                entity.getSoLuong());
    }

    @Override
    public void update(DonThuocCT entity) {
        String sql = "UPDATE DonThuocCT SET LoaiThuoc=?, SoLuong=? WHERE DonThuoc=?";
        JdbcHelper.Update(sql, 
                
                entity.getLoaiThuoc(),
                entity.getSoLuong(),
                entity.getDonThuoc());
    }

    @Override
    public void detele(Integer id) {
        String sql="DELETE FROM DonThuocCT WHERE DonThuoc=?";
        JdbcHelper.Update(sql, id);
    }

    @Override
    public DonThuocCT selectByID(Integer id) {
        String sql = "SELECT * FROM DonThuocCT WHERE DonThuoc= ?";
        List<DonThuocCT> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DonThuocCT> selectAll() {
        String sql="SELECT * FROM DonThuocCT";
        return selectBySql(sql);
    }

    @Override
    protected List<DonThuocCT> selectBySql(String sql, Object... args) {
        List<DonThuocCT> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while(rs.next()){
                    DonThuocCT entity=new DonThuocCT();
                    entity.setDonThuoc(rs.getInt("DonThuoc"));
                    entity.setLoaiThuoc(rs.getString("LoaiThuoc"));
                    entity.setSoLuong(rs.getInt("SoLUong"));
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

    public List<DonThuocCT> selectByDT(int id) {
        String sql = "SELECT * FROM DonThuocCT WHERE DonThuoc= ?";
        return selectBySql(sql,id);
    }
    
}
