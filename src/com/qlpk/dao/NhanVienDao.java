
package com.qlpk.dao;

import com.qlpk.entity.NhanVien;
import com.qlpk.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/** 
 *
 * @author Administrator
 */
public class NhanVienDao extends PhongKhamDao<NhanVien,String>{
     String INSERT_SQL="INSERT INTO NhanVien(MaNV, HoTen, GioiTinh, NgaySinh, SoDT, Email, DiaChi, ChucVu, ChuyenNganh, Luong, Pass, Hinh) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
     String UPDATE_SQL="UPDATE NhanVien SET HoTen =?, GioiTinh =?, NgaySinh =?, SoDT =?, Email =?, DiaChi =?, ChucVu =?, ChuyenNganh =?, Luong =?, Pass =?, Hinh =? WHERE MaNV=?";
     String DELETE_SQL="DELETE FROM NhanVien WHERE MaNV=?";
     String SELECT_ALL_SQL="SELECT*FROM NhanVien";
     String SELECT_BY_ID_SQL="SELECT*FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
       JdbcHelper.Update(INSERT_SQL,
               entity.getMaNV(),
               entity.getHoTen(),
               entity.isGioiTinh(),
               entity.getNgaySinh(),
               entity.getSoDT(),
               entity.getEmail(),
               entity.getDiaChi(),
               entity.getChucVu(),
               entity.getChuyenNganh(),
               entity.getLuong(),
               entity.getPass(),
               entity.getHinh()
               ); 
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.Update(UPDATE_SQL,
               entity.getHoTen(),
               entity.isGioiTinh(),
               entity.getNgaySinh(),
               entity.getSoDT(),
               entity.getEmail(),
               entity.getDiaChi(),
               entity.getChucVu(),
               entity.getChuyenNganh(),
               entity.getLuong(),
               entity.getPass(),
               entity.getHinh(),
               entity.getMaNV()
                );
    }

    @Override
    public void detele(String id) {
       JdbcHelper.Update(DELETE_SQL,id);
    }

    @Override
    public NhanVien selectByID(String id) {
         List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return  this.selectBySql(SELECT_ALL_SQL);
    }
    
    public NhanVien selectByEmail(String id) {
        String Sql = "SELECT*FROM NhanVien WHERE Email = ? and ChuyenNganh  not like '' ";
         List<NhanVien> list = this.selectBySql(Sql,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<NhanVien> selectBS(String id) {
        return  this.selectBySql("select * from NhanVien where ChucVu = N'Bác Sĩ' and ChuyenNganh = ? ",id);
    }
    
    public List<NhanVien> selectNV() {
        return  this.selectBySql("select * from NhanVien where not ChucVu = N'Bác Sĩ'");
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
       List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {   
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setSoDT(rs.getString("SoDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setChucVu(rs.getString("ChucVu"));
                entity.setChuyenNganh(rs.getString("ChuyenNganh"));
                entity.setLuong(rs.getFloat("Luong"));
                entity.setPass(rs.getString("Pass")); 
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);     
            }
             rs.getStatement().getConnection().close();
              return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
     public List<NhanVien> selectByKeyword(String keyword){
        String sql ="SELECT*FROM NhanVien WHERE HoTen LIKE ?";
        return this.selectBySql(sql,"%"+keyword+"%");
    }
   
}
