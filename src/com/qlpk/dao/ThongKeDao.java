/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.qlpk.utils.JdbcHelper;

/**
 *
 * @author fptshop
 */
public class ThongKeDao {

    public List<Integer> getNam(){
        String sql ="select YEAR(NgayKham) as Nam from PhieuKham GROUP BY YEAR(NgayKham)";
        List<Integer> list=new ArrayList<>();
        try {
            ResultSet rs=null;
            try {
                rs=JdbcHelper.query(sql);
                while (rs.next()) {    
                    list.add(rs.getInt("Nam"));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Object[]> getThuoc(int nam){
        String sql ="{call SP_SLThuoc (?)}";
        List<Object[]> list =new ArrayList<>();
        try {
            ResultSet rs=null;
            try {
                rs=JdbcHelper.query(sql, nam);
                while (rs.next()) {                    
                    Object[] model ={
                        rs.getString("LoaiThuoc"),
                        rs.getString("TenThuoc"),
                        rs.getInt("SL")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Object[]> getTuoi(int nam){
        String sql ="{call SP_ThongKeTuoi (?)}";
        List<Object[]> list =new ArrayList<>();
        try {
            ResultSet rs=null;
            try {
                rs=JdbcHelper.query(sql, nam);
                while (rs.next()) {                    
                    Object[] model ={
                        rs.getInt("TuoiDuoi18"),
                        rs.getInt("Tuoi1860"),
                        rs.getInt("TuoiTren60")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
