/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import com.qlpk.dao.DonThuocDao;
import com.qlpk.dao.ThuocDao;
import com.qlpk.entity.DonThuoc;
import com.qlpk.entity.Thuoc;
import com.qlpk.utils.Msgbox;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My PC
 */
public class DonThuocJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DonThuocJDialog
     */
    public DonThuocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlCapnhap = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonThuoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaPhieuKham = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThuoc = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        pnlDanhsach = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonThuoc = new javax.swing.JTable();
        pnlThuoc = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnThemThuoc = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_danhsach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ ĐƠN THUỐC");

        jLabel2.setText("Mã Nhân Viên :");

        jLabel3.setText("Mã Bệnh Nhân :");

        jLabel4.setText("Đơn Thuốc :");

        jLabel5.setText("Mã Phiếu Khám :");

        tblThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Loại Thuốc", "Số Lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThuoc);

        btnThem.setText("Thêm");

        btnXoa.setText("Xóa");

        btnSua.setText("Sửa");

        btnMoi.setText("Mới");

        javax.swing.GroupLayout pnlCapnhapLayout = new javax.swing.GroupLayout(pnlCapnhap);
        pnlCapnhap.setLayout(pnlCapnhapLayout);
        pnlCapnhapLayout.setHorizontalGroup(
            pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapnhapLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapnhapLayout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCapnhapLayout.createSequentialGroup()
                        .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addGroup(pnlCapnhapLayout.createSequentialGroup()
                                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDonThuoc, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(txtMaBN, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtMaPhieuKham))))
                        .addGap(95, 95, 95))))
        );
        pnlCapnhapLayout.setVerticalGroup(
            pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapnhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnMoi))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tabs.addTab("Cập nhập", pnlCapnhap);

        tblDonThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Đơn Thuốc", "Mã Phiếu Khám", "Bệnh Nhân", "Bác Sĩ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDonThuoc);

        javax.swing.GroupLayout pnlDanhsachLayout = new javax.swing.GroupLayout(pnlDanhsach);
        pnlDanhsach.setLayout(pnlDanhsachLayout);
        pnlDanhsachLayout.setHorizontalGroup(
            pnlDanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhsachLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        pnlDanhsachLayout.setVerticalGroup(
            pnlDanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhsachLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", pnlDanhsach);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)), "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnThemThuoc.setText("Thêm");

        tbl_danhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại thuốc", "Tên thuốc", "Giá nhập", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_danhsach);

        javax.swing.GroupLayout pnlThuocLayout = new javax.swing.GroupLayout(pnlThuoc);
        pnlThuoc.setLayout(pnlThuocLayout);
        pnlThuocLayout.setHorizontalGroup(
            pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThuocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThuocLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(pnlThuocLayout.createSequentialGroup()
                        .addGroup(pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlThuocLayout.setVerticalGroup(
            pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThuocLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemThuoc)
                .addContainerGap())
        );

        tabs.addTab("Thuốc", pnlThuoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DonThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DonThuocJDialog dialog = new DonThuocJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemThuoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlCapnhap;
    private javax.swing.JPanel pnlDanhsach;
    private javax.swing.JPanel pnlThuoc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDonThuoc;
    private javax.swing.JTable tblThuoc;
    private javax.swing.JTable tbl_danhsach;
    private javax.swing.JTextField txtDonThuoc;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPhieuKham;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    
    void init() {
        setLocationRelativeTo(null);

        this.fillTableDonThuoc();
        this.fillTableThuoc();
        this.row = -1;
        this.updateStatus();
        tabs.setSelectedIndex(1);
    }
    int row = -1;
    ThuocDao dao = new ThuocDao();
    DonThuocDao dtdao = new DonThuocDao();
    void clearForm() {
        txtMaBN.setText("");
        txtDonThuoc.setText("");
        txtMaNV.setText("");
        txtMaPhieuKham.setText("");
        DefaultTableModel model = (DefaultTableModel) tblThuoc.getModel();
        model.setRowCount(0);
        this.row = -1;
        //this.UpdateStatus();
    }
    
    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
           this.edit();
        }
    }

    void next() {
        if (this.row < tbl_danhsach.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tbl_danhsach.getRowCount() - 1;
        this.edit();
    }
    
    void edit() {
        int th =   (int) tblDonThuoc.getValueAt(this.row, 0);
        DonThuoc dt = dtdao.selectByID(th);
        this.setForm(dt);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }
    
    
    void insert() {
        //if (kt()) {
        DonThuoc th = getForm();
        //boolean kt = false;
        try {
            //kt=true;
            dtdao.insert(th);
            this.fillTableDonThuoc();
            this.clearForm();
            Msgbox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            //kt=false;
            Msgbox.alert(this, "Thêm mới thất bại!, Thiếu hình");
        //}       
        }
    }
    
    void update() {
        DonThuoc th = getForm();
        try {
            dtdao.update(th);
            this.fillTableDonThuoc();
            //this.clearForm();
            Msgbox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            Msgbox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        //if (!Auth.isManager()) {
        //    MsgBox.alert(this, "Bạn không có quyền xóa Loại thuốc này!");
        //} else {
            int MaDT = Integer.valueOf(txtDonThuoc.getText());
            if (Msgbox.confirm(this, "Bạn thực sự muốn xóa loại thuốc này?")) {
                try {
                    dtdao.detele(MaDT);
                    this.fillTableDonThuoc();
                    this.clearForm();
                    Msgbox.alert(this, "Xoá thành công!");
                } catch (Exception e) {
                    Msgbox.alert(this, "Xóa thất bại!");
                }
            //}
        }
    }
    //Đỗ dữ liệu vào tblDonThuoc
    void fillTableDonThuoc() {
        DefaultTableModel model = (DefaultTableModel) tblDonThuoc.getModel();
        model.setRowCount(0);
        try {
            List<DonThuoc> list = dtdao.selectAll();
            for (DonThuoc th : list) {
                Object[] row = {th.getDonThuoc(), th.getMaPhieuKham(), th.getMaBN(), th.()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    //Đỗ dữ liệu vào tbl_danhSach
    void fillTableThuoc() {
        DefaultTableModel model = (DefaultTableModel) tbl_danhsach.getModel();
        model.setRowCount(0);
        try {
            List<Thuoc> list = dao.selectAll();
            for (Thuoc th : list) {
                Object[] row = {th.getLoaiThuoc(), th.getTenThuoc(), th.getGiaNhap(), th.getGiaBan()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    //Hien thi donthuoc len form
    void setForm(DonThuoc th) {
        
    }

    //tao donthuoc tu form
    Thuoc getForm() {
        
        return null;
        
    }

    //cap nhap trang thai cac nut
    void updateStatus() {
   
    }
}
