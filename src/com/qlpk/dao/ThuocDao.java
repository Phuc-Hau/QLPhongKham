
package com.qlpk.dao;

import com.qlpk.entity.PhieuKham;
import com.qlpk.entity.Thuoc;
import com.qlpk.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class ThuocDao extends PhongKhamDao<Thuoc, String>{

    @Override
    public void insert(Thuoc entity) {
        String Insert ="INSERT INTO Thuoc (LoaiThuoc, TenThuoc, GiaNhap, GiaBan, GhiChu) VALUES (?,?,?,?,?)";
        JdbcHelper.Update(Insert, 
                entity.getLoaiThuoc(),
                entity.getTenThuoc(),
                entity.getGiaNhap(),
                entity.getGiaBan(),
                entity.getGhiChu()
                );
    }

    @Override
    public void update(Thuoc entity) {
        String Update ="UPDATE Thuoc SET TenThuoc =?, GiaNhap =?, GiaBan =?, GhiChu =? WHERE (LoaiThuoc = ?)";
        JdbcHelper.Update(Update, 
                entity.getTenThuoc(),
                entity.getGiaNhap(),
                entity.getGiaBan(),
                entity.getGhiChu(),
                entity.getLoaiThuoc()
                );
    }

    @Override
    public void detele(String id) {
        String Delete ="DELETE FROM Thuoc WHERE (LoaiThuoc = ?";
        JdbcHelper.Update(Delete, id);
    }

    @Override
    public Thuoc selectByID(String id) {
        String SelectID ="SELECT Thuoc.* FROM thuoc WHERE (LoaiThuoc = ?)";
        List<Thuoc> list =selectBySql(SelectID, id);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public List<Thuoc> selectAll() {
        String SelectAll ="selsect * from Thuoc";
        return selectBySql(SelectAll);
    }

    @Override
    protected List<Thuoc> selectBySql(String sql, Object... args) {
        List<Thuoc> list = new ArrayList<>();
        try {
            ResultSet rs =null;
            try {
                rs = JdbcHelper.query(sql, args);
                Thuoc th = new Thuoc();
                th.setLoaiThuoc(rs.getString("LoaiThuoc"));
                th.setTenThuoc(rs.getString("TenThuoc"));
                th.setGiaNhap(rs.getInt("GiaNhap"));
                th.setGiaBan(rs.getInt("GiaBan"));       
                th.setGhiChu(rs.getString("GhiChu"));
                list.add(th);
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
}
