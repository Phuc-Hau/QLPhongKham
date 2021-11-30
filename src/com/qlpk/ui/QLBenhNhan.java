/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import com.qlpk.dao.BenhNhanDao;
import com.qlpk.entity.BenhNhan;
import com.qlpk.utils.Msgbox;
import com.qlpk.utils.Utility;
import com.qlpk.utils.XDate;
import java.awt.Color;
import static java.awt.Color.white;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fptshop
 */
public class QLBenhNhan extends javax.swing.JPanel {

    /**
     * Creates new form QLBenhNhanKham
     */
    public QLBenhNhan() {
        initComponents();
        inti();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDanhsachBenhNhan = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtNgheNghiep = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnthemmoiBN = new javax.swing.JButton();
        btnthemBN = new javax.swing.JButton();
        btnxoaBN = new javax.swing.JButton();
        btnsuaBN = new javax.swing.JButton();
        btnfirstBN = new javax.swing.JButton();
        btnprevBN = new javax.swing.JButton();
        btnnextBN = new javax.swing.JButton();
        btnlastBN = new javax.swing.JButton();
        txtDienthoai = new javax.swing.JTextField();
        txtGhichu = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txttimkiemBN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DateNgaySinhBN = new com.toedter.calendar.JDateChooser();
        lblNgayTao = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();

        jPanel3.setBackground(new java.awt.Color(255, 211, 19));
        jPanel3.setPreferredSize(new java.awt.Dimension(985, 612));

        jLabel38.setText("Mã BN :");

        txtMaBN.setEditable(false);
        txtMaBN.setForeground(new java.awt.Color(242, 0, 0));
        txtMaBN.setName("MaBN"); // NOI18N

        jLabel39.setText("Họ và tên :");

        jLabel40.setText("Giới tính :");

        jLabel41.setText("Địa Chỉ :");

        jLabel42.setText("Điện thoại :");

        tblDanhsachBenhNhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã BN ", "Họ và tên", "Giới tính", "SĐT", "Ngày sinh", "Tuổi", "Địa chỉ", "Nghề nghiệp", "Ghi chú", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhsachBenhNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachBenhNhanMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDanhsachBenhNhan);

        jLabel43.setText("Ngày sinh :");

        jLabel44.setText("Nghề nghiệp :");

        jLabel45.setText("Ghi chú :");

        jLabel46.setText("Tuổi :");

        rdoNam.setBackground(new java.awt.Color(255, 211, 19));
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        rdoNu.setBackground(new java.awt.Color(255, 211, 19));
        rdoNu.setText("Nữ");

        btnthemmoiBN.setBackground(new java.awt.Color(255, 174, 0));
        btnthemmoiBN.setText("Nhập mới ");
        btnthemmoiBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemmoiBNActionPerformed(evt);
            }
        });

        btnthemBN.setBackground(new java.awt.Color(0, 255, 63));
        btnthemBN.setText("Thêm");
        btnthemBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemBNActionPerformed(evt);
            }
        });

        btnxoaBN.setBackground(new java.awt.Color(255, 0, 0));
        btnxoaBN.setText("Xóa ");
        btnxoaBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaBNActionPerformed(evt);
            }
        });

        btnsuaBN.setBackground(new java.awt.Color(252, 255, 0));
        btnsuaBN.setText("Sửa");
        btnsuaBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaBNActionPerformed(evt);
            }
        });

        btnfirstBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/next_1.png"))); // NOI18N
        btnfirstBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstBNActionPerformed(evt);
            }
        });

        btnprevBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/forward-button_1.png"))); // NOI18N
        btnprevBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevBNActionPerformed(evt);
            }
        });

        btnnextBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/forward-button.png"))); // NOI18N
        btnnextBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextBNActionPerformed(evt);
            }
        });

        btnlastBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/forward-button.png"))); // NOI18N
        btnlastBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastBNActionPerformed(evt);
            }
        });

        txtDienthoai.setName("SDT"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txttimkiemBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemBNKeyReleased(evt);
            }
        });

        jLabel1.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(txttimkiemBN, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiemBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        DateNgaySinhBN.setBackground(new java.awt.Color(255, 211, 19));
        DateNgaySinhBN.setDate(new Date());
        DateNgaySinhBN.setDateFormatString("dd-MM-yyyy");

        lblNgayTao.setText("Ngày tạo :");

        txtNgayTao.setForeground(new java.awt.Color(255, 3, 3));
        txtNgayTao.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaBN)
                                .addComponent(txtHoten)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(DateNgaySinhBN, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgheNghiep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiachi)
                            .addComponent(txtDienthoai)
                            .addComponent(txtGhichu)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnthemBN)
                        .addGap(18, 18, 18)
                        .addComponent(btnsuaBN)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoaBN)
                        .addGap(18, 18, 18)
                        .addComponent(btnthemmoiBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnfirstBN)
                        .addGap(18, 18, 18)
                        .addComponent(btnprevBN)
                        .addGap(18, 18, 18)
                        .addComponent(btnnextBN)
                        .addGap(18, 18, 18)
                        .addComponent(btnlastBN)
                        .addGap(94, 94, 94))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtDienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(jLabel46)
                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateNgaySinhBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnlastBN)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnextBN)
                            .addComponent(btnprevBN)
                            .addComponent(btnfirstBN)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnthemmoiBN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnxoaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnsuaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnthemBN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhsachBenhNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachBenhNhanMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.rowBN = tblDanhsachBenhNhan.getSelectedRow();
            this.editFormBenhNhan();
        }
    }//GEN-LAST:event_tblDanhsachBenhNhanMouseClicked

    private void btnthemmoiBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemmoiBNActionPerformed
        // TODO add your handling code here:
        this.clearFormBenhNhan();
        this.LoatMaBN();
    }//GEN-LAST:event_btnthemmoiBNActionPerformed

    private void btnthemBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemBNActionPerformed
        // TODO add your handling code here:
        if (checkTrungMaBenhNhan(txtMaBN)) {
            if (ErrorBenhNhan()) {
                this.insertBenhNhan();
            }
        }
    }//GEN-LAST:event_btnthemBNActionPerformed

    private void btnxoaBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaBNActionPerformed
        // TODO add your handling code here:
        this.deleteBenhNhan();
    }//GEN-LAST:event_btnxoaBNActionPerformed

    private void btnsuaBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaBNActionPerformed
        // TODO add your handling code here:
        if (ErrorBenhNhan()) {
            this.updateBenhNhan();
        }
    }//GEN-LAST:event_btnsuaBNActionPerformed

    private void btnfirstBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstBNActionPerformed
        // TODO add your handling code here:
        this.firstBenhNhan();
    }//GEN-LAST:event_btnfirstBNActionPerformed

    private void btnprevBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevBNActionPerformed
        // TODO add your handling code here:
        this.prevBenhNhan();
    }//GEN-LAST:event_btnprevBNActionPerformed

    private void btnnextBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextBNActionPerformed
        // TODO add your handling code here:
        this.nextBenhNhan();
    }//GEN-LAST:event_btnnextBNActionPerformed

    private void btnlastBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastBNActionPerformed
        // TODO add your handling code here:
        this.lastBenhNhan();
    }//GEN-LAST:event_btnlastBNActionPerformed

    private void txttimkiemBNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemBNKeyReleased
        // TODO add your handling code here:
        this.timKiemBenhNhan();
    }//GEN-LAST:event_txttimkiemBNKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateNgaySinhBN;
    private javax.swing.JButton btnfirstBN;
    private javax.swing.JButton btnlastBN;
    private javax.swing.JButton btnnextBN;
    private javax.swing.JButton btnprevBN;
    private javax.swing.JButton btnsuaBN;
    private javax.swing.JButton btnthemBN;
    private javax.swing.JButton btnthemmoiBN;
    private javax.swing.JButton btnxoaBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblDanhsachBenhNhan;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtDienthoai;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JTextField txttimkiemBN;
    // End of variables declaration//GEN-END:variables

    BenhNhanDao daoBN = new BenhNhanDao();
    int rowBN = -1;
    void inti(){
        this.FillTableBenhNhan();
        this.UpdateStatusBenhNhan();
        txtNgayTao.setText(XDate.toString(new Date(),"dd-MM-yyyy"));
        LoatMaBN();
    }
    
    void LoatMaBN(){
        int n = tblDanhsachBenhNhan.getRowCount();
        if(n-1 !=-1){
            String str = (String) tblDanhsachBenhNhan.getValueAt(n-1, 0);
            String tym="" ;
            for (int i = 2; i < 7; i++) {
                tym+= str.charAt(i);
            }
            int m = Integer.valueOf(tym)+1;
            tym =String.valueOf(m);
            for (int i = 0; i < 5; i++) {
                if(tym.length()<5){
                    String t = "0";
                    String u = t+tym;
                    tym = u;
                }else{
                    break;
                }
            }
            String maBN = "BN"+tym;
            txtMaBN.setText(maBN);
        }else{
            txtMaBN.setText("BN00001");
        }
    }
    
    void FillTableBenhNhan() {
        DefaultTableModel model = (DefaultTableModel) tblDanhsachBenhNhan.getModel();
        model.setRowCount(0);
        try {
            String keyword = txttimkiemBN.getText();
            List<BenhNhan> list = new ArrayList<>();
            if(keyword.matches("-?\\d+(\\.\\d+)?")){
                list = daoBN.selectBySDT(keyword);
            } else{
                list = daoBN.selectByKeyword(keyword);
            }
            
            for (BenhNhan bn : list) {
                Object[] row = {
                    bn.getMaBN(),
                    bn.getTenBenhNhan(),
                    bn.isGioiTinh() ? "Nam" : "Nữ",
                    bn.getSDT(),
                    bn.getNgaySinh(),
                    bn.getTuoi(),
                    bn.getDiaChi(),
                    bn.getNgheNghiep(),
                    bn.getGhiChu(),
                    XDate.toString(bn.getNgayTao(), "dd/MM/yyyy")
                };
                model.addRow(row);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insertBenhNhan() {
        BenhNhan bn = this.getformBenhNhan();
        try {
            daoBN.insert(bn);
            FillTableBenhNhan();
            this.clearFormBenhNhan();
            Msgbox.alert(this, "Thêm thành công!");
            LoatMaBN();
        } catch (Exception e) {
            Msgbox.alert(this, "Thêm thất bại!");
            e.printStackTrace();
        }
    }

    void updateBenhNhan() {
        BenhNhan bn = this.getformBenhNhan();
        try {
            daoBN.update(bn);
            FillTableBenhNhan();
            Msgbox.alert(this, "Sửa thành công!");
        } catch (Exception e) {
            Msgbox.alert(this, "Sửa thất bại!");
            e.printStackTrace();
        }
    }

    void deleteBenhNhan() {
        String mabn = txtMaBN.getText();
        if (Msgbox.confirm(this, "Bạn thực sự muốn xóa bệnh nhân này?")) {
            try {
                daoBN.detele(mabn);
                FillTableBenhNhan();
                this.clearFormBenhNhan();
                Msgbox.alert(this, "Xóa thành công!");
                LoatMaBN();
            } catch (Exception e) {
                Msgbox.alert(this, "Xóa thất bại!");
            }
        }
    }

    BenhNhan getformBenhNhan() {
        BenhNhan bn = new BenhNhan();
        bn.setMaBN(txtMaBN.getText().toUpperCase());
        bn.setTenBenhNhan(txtHoten.getText());
        bn.setGioiTinh(rdoNam.isSelected());
        bn.setSDT(txtDienthoai.getText());
        bn.setNgaySinh(DateNgaySinhBN.getDate());
        bn.setTuoi(Integer.valueOf(txtTuoi.getText()));
        bn.setDiaChi(txtDiachi.getText());
        bn.setNgheNghiep(txtNgheNghiep.getText());
        bn.setGhiChu(txtGhichu.getText());
        bn.setNgayTao(new Date());
        
        return bn;
    }

    void setFormBenhNhan(BenhNhan bn) {
        txtMaBN.setText(bn.getMaBN());
        txtHoten.setText(bn.getTenBenhNhan());
        rdoNam.setSelected(bn.isGioiTinh());
        rdoNu.setSelected(!bn.isGioiTinh());
        txtDienthoai.setText(bn.getSDT());
        DateNgaySinhBN.setDate(bn.getNgaySinh());
        txtTuoi.setText(String.valueOf(bn.getTuoi()));
        txtDiachi.setText(bn.getDiaChi());
        txtNgheNghiep.setText(bn.getNgheNghiep());
        txtGhichu.setText(bn.getGhiChu());
    }

    void clearFormBenhNhan() {
        BenhNhan bn = new BenhNhan();
        DateNgaySinhBN.setDate(new Date());
        txtHoten.setText("");
        txtGhichu.setText("");
        txtTuoi.setText("");
        txtDiachi.setText("");
        txtNgheNghiep.setText("");
        txtDienthoai.setText("");
        rdoNam.setSelected(true);
        txtNgayTao.setText(XDate.toString(new Date(),"dd/MM/yyyy"));
        this.rowBN = -1;
        this.UpdateStatusBenhNhan();
    }

    void editFormBenhNhan() {
        String mabn = (String) tblDanhsachBenhNhan.getValueAt(this.rowBN, 0);
        BenhNhan bn = daoBN.selectByID(mabn);
        this.setFormBenhNhan(bn);
        this.UpdateStatusBenhNhan();
    }

    void UpdateStatusBenhNhan() {
        boolean edit = (this.rowBN >= 0);
        boolean first = (this.rowBN == 0);
        boolean last = (this.rowBN == tblDanhsachBenhNhan.getRowCount() - 1);
        // Trạng thái form
        btnthemBN.setEnabled(!edit);
        btnsuaBN.setEnabled(edit);
        btnxoaBN.setEnabled(edit);
        // Trạng thái điều hướng
        btnfirstBN.setEnabled(edit && !first);
        btnprevBN.setEnabled(edit && !first);
        btnnextBN.setEnabled(edit && !last);
        btnlastBN.setEnabled(edit && !last);
    }

    void firstBenhNhan() {
        this.rowBN = 0;
        this.editFormBenhNhan();
    }

    void prevBenhNhan() {
        if (this.rowBN > 0) {
            this.rowBN--;
            this.editFormBenhNhan();
        }
    }

    void nextBenhNhan() {
        if (this.rowBN < tblDanhsachBenhNhan.getRowCount() - 1) {
            this.rowBN++;
            this.editFormBenhNhan();
        }
    }

    void lastBenhNhan() {
        this.rowBN = tblDanhsachBenhNhan.getRowCount() - 1;
        this.editFormBenhNhan();
    }

    private void timKiemBenhNhan() {
        this.FillTableBenhNhan();
        this.clearFormBenhNhan();
        this.rowBN = -1;
        UpdateStatusBenhNhan();
    }

    boolean ErrorBenhNhan() {
        if (Utility.checkNullText(txtMaBN)
                && Utility.checkMaBenhNhan(txtMaBN)
                && Utility.checkNullText(txtHoten)
                && Utility.checkNullText(txtDiachi)
                && Utility.checkNullText(txtDienthoai)
                && Utility.checkSDT(txtDienthoai)
                && Utility.checkNullText(txtTuoi)
                && Utility.checkNullText(txtNgheNghiep)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTrungMaBenhNhan(JTextField txt) {
        txtMaBN.setBackground(white);
        if (daoBN.selectByID(txtMaBN.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.red);
            Msgbox.alert(this, " Mã bệnh nhân đã tồn tại");
            return false;
        }
    }
}
