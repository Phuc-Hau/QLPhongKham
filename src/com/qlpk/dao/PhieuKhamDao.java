
package com.qlpk.dao;
import com.qlpk.entity.PhieuKham;
import com.qlpk.utils.JdbcHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;


public class PhieuKhamDao extends PhongKhamDao<PhieuKham, Integer>{

    @Override
    public void insert(PhieuKham entity) {
        String Insert ="";
        JdbcHelper.Update(Insert, 
                entity.getMaPhieuKham(),
                entity.getMaBN(),
                entity.getMaPK(),
                entity.getMaNV(),
                entity.getBS(),
                entity.getNgayKham(),
                entity.getKhamLamSang(),
                entity.getBenhKem(),
                entity.getChuanDoan(),
                entity.getNhipTim(),
                entity.getNhietDo(),
                entity.getHuyetAp(),
                entity.getCanNang(),
                entity.getChieuCao(),
                entity.getKetQuaDieuTri()
                );
    }

    @Override
    public void update(PhieuKham entity) {
        String Update ="";
        JdbcHelper.Update(Update, 
                entity.getMaBN(),
                entity.getMaPK(),
                entity.getMaNV(),
                entity.getBS(),
                entity.getNgayKham(),
                entity.getKhamLamSang(),
                entity.getBenhKem(),
                entity.getChuanDoan(),
                entity.getNhipTim(),
                entity.getNhietDo(),
                entity.getHuyetAp(),
                entity.getCanNang(),
                entity.getChieuCao(),
                entity.getKetQuaDieuTri(),
                entity.getMaPhieuKham()
                );
    }

    @Override
    public void detele(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PhieuKham selectByID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PhieuKham> selectAll() {
        String SelectAll ="selsect * from PhieuKham";
        return selectBySql(SelectAll);
    }

    @Override
    protected List<PhieuKham> selectBySql(String sql, Object... args) {
        List<PhieuKham> list = new ArrayList<>();
        try {
            ResultSet rs =null;
            try {
                rs = JdbcHelper.query(sql, args);
                PhieuKham pk = new PhieuKham();
                pk.setMaPhieuKham(rs.getString("MaPhieuKham"));
                pk.setMaBN(rs.getString("MABN"));
                pk.setMaPK(rs.getString("MaPK"));
                pk.setMaNV(rs.getString("MaNV"));
                pk.setBS(rs.getString("BS"));
                pk.setNgayKham(rs.getDate("NgayKham"));
                pk.setKhamLamSang(rs.getString("KhamLamSang"));
                pk.setBenhKem(rs.getString("BenhKem"));
                pk.setChuanDoan(rs.getString("ChuanDoanICD"));
                pk.setNhipTim(rs.getInt("NhipTim"));
                pk.setNhietDo(rs.getInt("NhietDo"));
                pk.setHuyetAp(rs.getInt("HuyenAp"));
                pk.setCanNang(rs.getFloat("CanNang"));
                pk.setChieuCao(rs.getFloat("ChieuCao"));
                pk.setKetQuaDieuTri(rs.getString("KetLuan_DieuTri"));
                
                list.add(pk);
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    
    
}
