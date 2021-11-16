/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import com.qlpk.dao.*;
import com.qlpk.entity.*;
import com.qlpk.utils.*;
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
        this.init();
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
        tabsDonThuoc = new javax.swing.JTabbedPane();
        pnlCapnhap = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBacSi = new javax.swing.JTextField();
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
        txtTenBenhNhan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlThuoc = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnThemThuoc = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldanhsachThuoc = new javax.swing.JTable();
        pnlBenhNhan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPhieuKham = new javax.swing.JTable();
        pnlDanhsach = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonThuoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ ĐƠN THUỐC");

        jLabel2.setText("Bác sĩ");

        txtBacSi.setEditable(false);

        jLabel3.setText("Mã Bệnh Nhân :");

        txtMaBN.setEditable(false);

        jLabel4.setText("Đơn Thuốc :");

        txtDonThuoc.setEditable(false);

        jLabel5.setText("Mã Phiếu Khám :");

        txtMaPhieuKham.setEditable(false);

        tblThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại Thuốc", "Tên Thuốc", "Số Lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThuoc);

        btnThem.setBackground(new java.awt.Color(0, 255, 63));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(252, 255, 0));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(255, 174, 0));
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        txtTenBenhNhan.setEditable(false);

        jLabel6.setText("Tên Bệnh Nhân ");

        btnFirst.setText("<|");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCapnhapLayout = new javax.swing.GroupLayout(pnlCapnhap);
        pnlCapnhap.setLayout(pnlCapnhapLayout);
        pnlCapnhapLayout.setHorizontalGroup(
            pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapnhapLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapnhapLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(pnlCapnhapLayout.createSequentialGroup()
                        .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBacSi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonThuoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPhieuKham, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(pnlCapnhapLayout.createSequentialGroup()
                                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(76, 76, 76)
                                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTenBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCapnhapLayout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)
                        .addGap(106, 106, 106))))
        );
        pnlCapnhapLayout.setVerticalGroup(
            pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapnhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBacSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst)
                        .addComponent(btnPrev)
                        .addComponent(btnNext)
                        .addComponent(btnLast))
                    .addGroup(pnlCapnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSua)
                        .addComponent(btnMoi)
                        .addComponent(btnXoa)))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        tabsDonThuoc.addTab("Cập nhập", pnlCapnhap);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)), "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

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
        btnThemThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThuocActionPerformed(evt);
            }
        });

        tbldanhsachThuoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tbldanhsachThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldanhsachThuocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbldanhsachThuoc);

        javax.swing.GroupLayout pnlThuocLayout = new javax.swing.GroupLayout(pnlThuoc);
        pnlThuoc.setLayout(pnlThuocLayout);
        pnlThuocLayout.setHorizontalGroup(
            pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThuocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThuocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        pnlThuocLayout.setVerticalGroup(
            pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThuocLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnThemThuoc)
                .addGap(53, 53, 53))
        );

        tabsDonThuoc.addTab("Thuốc", pnlThuoc);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        tblPhieuKham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu Khám", "Mã Bệnh Nhân", "Bác Sĩ", "Phòng Khám", "Ngày Khám"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuKham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuKhamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPhieuKham);

        javax.swing.GroupLayout pnlBenhNhanLayout = new javax.swing.GroupLayout(pnlBenhNhan);
        pnlBenhNhan.setLayout(pnlBenhNhanLayout);
        pnlBenhNhanLayout.setHorizontalGroup(
            pnlBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBenhNhanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlBenhNhanLayout.setVerticalGroup(
            pnlBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBenhNhanLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsDonThuoc.addTab("Bệnh Nhân", pnlBenhNhan);

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
        tblDonThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonThuocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDonThuoc);

        javax.swing.GroupLayout pnlDanhsachLayout = new javax.swing.GroupLayout(pnlDanhsach);
        pnlDanhsach.setLayout(pnlDanhsachLayout);
        pnlDanhsachLayout.setHorizontalGroup(
            pnlDanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhsachLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlDanhsachLayout.setVerticalGroup(
            pnlDanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhsachLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        tabsDonThuoc.addTab("Danh sách", pnlDanhsach);

        tabsDonThuoc.setSelectedIndex(3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tabsDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabsDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThuocActionPerformed
        // TODO add your handling code here:
        this.AddTableThuocKham();
    }//GEN-LAST:event_btnThemThuocActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.deleteDonThuoc();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
       if(this.CheckErrorDonThuoc()){
            this.insertDonThuoc();
       }
    }//GEN-LAST:event_btnThemActionPerformed

    
    private void tbldanhsachThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldanhsachThuocMouseClicked
        // TODO add your handling code here:
        indexDanhsachThuoc=tbldanhsachThuoc.getSelectedRow();
        if(evt.getClickCount()==2){
            this.AddTableThuocKham();
            tabsDonThuoc.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tbldanhsachThuocMouseClicked

    
    private void tblPhieuKhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuKhamMouseClicked
        // TODO add your handling code here:
        indexPK=tblPhieuKham.getSelectedRow();
        String maPk = (String) tblPhieuKham.getValueAt(indexPK, 0);
        if(evt.getClickCount()==2){
            PhieuKham pk = daoPK.selectByID(Integer.valueOf(maPk));
            this.setDonThuocBenhNhan(pk);
            tabsDonThuoc.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblPhieuKhamMouseClicked

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        this.timKiem();
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(this.CheckErrorDonThuoc()){
            this.updateDonThuoc();
       }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblDonThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonThuocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDonThuoc.getSelectedRow();
            this.editDT();
        }
    }//GEN-LAST:event_tblDonThuocMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

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
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemThuoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlBenhNhan;
    private javax.swing.JPanel pnlCapnhap;
    private javax.swing.JPanel pnlDanhsach;
    private javax.swing.JPanel pnlThuoc;
    private javax.swing.JTabbedPane tabsDonThuoc;
    private javax.swing.JTable tblDonThuoc;
    private javax.swing.JTable tblPhieuKham;
    private javax.swing.JTable tblThuoc;
    private javax.swing.JTable tbldanhsachThuoc;
    private javax.swing.JTextField txtBacSi;
    private javax.swing.JTextField txtDonThuoc;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtMaPhieuKham;
    private javax.swing.JTextField txtTenBenhNhan;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    
    void init() {
        setLocationRelativeTo(null);
        this.fillTableDonThuoc();
        this.fillTableDanhSachThuoc();
        this.fillTableDonThuocBenhNhan();
        this.fillTableBenhNhan();
        this.row = -1;
        this.updateStatus();
        tabsDonThuoc.setSelectedIndex(2);
    }
    int row = -1;
    int indexDanhsachThuoc=-1;
    int indexPK=-1;
    PhieuKhamDao daoPK = new PhieuKhamDao();
    BenhNhanDao daoBN = new BenhNhanDao();
    ThuocDao daoThuoc = new ThuocDao();
    PhongKhamBenhDao daoPKBenh = new PhongKhamBenhDao();
    DonThuocDao daoDT = new DonThuocDao();
    DonThuocCTDao daoDTCT = new DonThuocCTDao();
    void clearForm() {
        txtMaBN.setText("");
        txtDonThuoc.setText("");
        txtBacSi.setText("");
        txtMaPhieuKham.setText("");
        DefaultTableModel model = (DefaultTableModel) tblThuoc.getModel();
        model.setRowCount(0);
        this.row = -1;
        //this.UpdateStatus();
    }
    
    void first() {
        this.row = 0;
        this.editDT();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
           this.editDT();
        }
    }

    void next() {
        if (this.row < tbldanhsachThuoc.getRowCount() - 1) {
            this.row++;
            this.editDT();
        }
    }

    void last() {
        this.row = tbldanhsachThuoc.getRowCount() - 1;
        this.editDT();
    }
    
    void editDT() {
        int th =   (int) tblDonThuoc.getValueAt(this.row, 0);
        DonThuoc dt = daoDT.selectByID(th);
        this.setForm(dt);
        tabsDonThuoc.setSelectedIndex(0);
        this.updateStatus();
    }

    
    void insertDonThuoc() {
        DonThuoc th = getForm();
        try {
            daoDT.insert(th);
            for (int i = 0; i < tblThuoc.getRowCount(); i++) {
                DonThuocCT dtct = getFormDTCT(i);
                daoDTCT.insert(dtct);
            }
            this.fillTableDonThuoc();
            this.fillTableDonThuocBenhNhan();
            this.clearForm();
            Msgbox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            Msgbox.alert(this, "Thêm mới thất bại!");
        }
    }
    
    void updateDonThuoc() {
        DonThuoc th = getForm();
        
        try {
            daoDT.update(th);
            for (int i = 0; i < tblThuoc.getRowCount(); i++) {
                DonThuocCT dtct = getFormDTCT(i);
                daoDTCT.update(dtct);
            }
            this.fillTableDonThuoc();
            //this.clearForm();
            Msgbox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            Msgbox.alert(this, "Cập nhật thất bại!");
        }
    }

    void deleteDonThuoc() {
        //if (!Auth.isManager()) {
        //    MsgBox.alert(this, "Bạn không có quyền xóa Loại thuốc này!");
        //} else {
             int MaDT = Integer.valueOf(txtDonThuoc.getText());
            if (Msgbox.confirm(this, "Bạn thực sự muốn xóa loại thuốc này?")) {
                try {
                    daoDT.detele(MaDT);
                    daoDTCT.detele(MaDT);
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
            List<DonThuoc> list = daoDT.selectAll();
            for (DonThuoc th : list) {
                Object[] row = {th.getDonThuoc(), th.getMaPhieuKham(), th.getMaBN()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    //Đỗ dữ liệu vào tbl_danhSach
    void fillTableDanhSachThuoc() {
        DefaultTableModel model = (DefaultTableModel) tbldanhsachThuoc.getModel();
        model.setRowCount(0);
        try {
            String keyWord = txtTimKiem.getText();
            List<Thuoc> list = daoThuoc.selectByKeyword(keyWord);
            for (Thuoc th : list) {
                Object[] row = {th.getLoaiThuoc(), th.getTenThuoc(), th.getGiaNhap(), th.getGiaBan()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    //Đỗ dữ liệu vào tblThuoc
    void fillTableThuocKham(){
        DefaultTableModel model = (DefaultTableModel) tblThuoc.getModel();
        model.setRowCount(0);
        try {
            List<DonThuocCT> list = daoDTCT.selectAll();
            for (DonThuocCT dt : list) {
                Object[] row = {dt.getLoaiThuoc(),dt.getSoLuong()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    void AddTableThuocKham(){
        DefaultTableModel model = (DefaultTableModel) tblThuoc.getModel();
        String LoaiThuoc = (String) tbldanhsachThuoc.getValueAt(indexDanhsachThuoc, 0);
        try {
            Thuoc thuoc = daoThuoc.selectByID(LoaiThuoc);
            
                Object[] row = {thuoc.getLoaiThuoc(),thuoc.getTenThuoc()};
                model.addRow(row);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    void fillTableDonThuocBenhNhan(){
        DefaultTableModel model = (DefaultTableModel) tblPhieuKham.getModel();
        model.setRowCount(0);
        try {
            List<PhieuKham> list = daoPK.selectChuaCoDonThuoc();
            for (PhieuKham pk : list) {
                PhongKham phongKham = daoPKBenh.selectByID(pk.getMaPK());
                model.addRow(new Object[]{pk.getMaPhieuKham(),pk.getMaBN(),pk.getBS(),phongKham.getTenPhongKham(),pk.getNgayKham()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    
    void fillTableBenhNhan(){
        DefaultTableModel model = (DefaultTableModel) tblPhieuKham.getModel();
        model.setRowCount(0);
        try {
            List<PhieuKham> list = daoPK.selectBenhNhanNotDonThuoc();
            for (PhieuKham pk : list) {
                PhongKham phongKham = daoPKBenh.selectByID(pk.getMaPK());
                model.addRow(new Object[]{pk.getMaPhieuKham(),pk.getMaBN(),pk.getBS(),phongKham.getTenPhongKham(),pk.getNgayKham()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    
    //Hien thi donthuoc len form
    void setForm(DonThuoc th) {
        txtDonThuoc.setText(String.valueOf(th.getDonThuoc()));
        txtMaBN.setText(th.getMaBN());
        txtMaPhieuKham.setText(String.valueOf(th.getMaPhieuKham()));
    }
    
    void setDonThuocBenhNhan(PhieuKham pk){
        txtBacSi.setText(pk.getBS());
        txtMaBN.setText(pk.getMaBN());
        txtMaPhieuKham.setText(pk.getMaPhieuKham());
        BenhNhan bn = daoBN.selectByID(pk.getMaBN());
        txtTenBenhNhan.setText(bn.getTenBenhNhan());
        txtDonThuoc.setText(pk.getMaPhieuKham());
    }

    //tao donthuocct tu form
    DonThuocCT getFormDTCT(int i){
        DonThuocCT thct = new DonThuocCT();
        thct.setDonThuoc(Integer.valueOf(txtDonThuoc.getText()));
        thct.setLoaiThuoc((String) tblThuoc.getValueAt(i, 0));
        thct.setSoLuong((int) tblThuoc.getValueAt(i, 2));
        return thct;
    }
    //tao donthuoc tu form
    DonThuoc getForm() {
        DonThuoc th = new DonThuoc();
        th.setDonThuoc(Integer.valueOf(txtDonThuoc.getText()));
        th.setMaBN(txtMaBN.getText());
        th.setMaPhieuKham(Integer.valueOf(txtMaPhieuKham.getText()));
        return th;
    }

    //cap nhap trang thai cac nut
    void updateStatus() {
   
    }
    
    boolean CheckErrorDonThuoc(){
        int error=0;
        if(!Utility.checkNullText(txtDonThuoc)){
            error ++;
            Msgbox.alert(this, "Dơn thuốc không bỏ trống");
        } else
        if(!Utility.checkSLTable(tblThuoc)){
            error ++;
            Msgbox.alert(this, "Số Lượng không bỏ trống");
        }
        if(error !=0){
             return false;
        } else{
            return true;
        }
       
    }
    void timKiem(){
        this.fillTableDanhSachThuoc();
        this.row = -1;
    }
}
