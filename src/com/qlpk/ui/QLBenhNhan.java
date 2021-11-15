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
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class QLBenhNhan extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public QLBenhNhan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
        this.setTitle("Thông tin bệnh nhân");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNgaysinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhsach = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgheNghiep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnthemmoi = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        txtDienthoai = new javax.swing.JTextField();
        txtGhichu = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btntim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Thông tin bệnh nhân");

        jLabel2.setText("Mã BN :");

        txtMaBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaBNActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ và tên :");

        jLabel4.setText("Giới tính :");

        jLabel5.setText("Địa Chỉ :");

        txtNgaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaysinhActionPerformed(evt);
            }
        });

        jLabel6.setText("Điện thoại :");

        tblDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã BN ", "Họ và tên", "Giới tính", "SĐT", "Ngày sinh", "Tuổi", "Địa chỉ", "Nghề nghiệp", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhsach);

        jLabel7.setText("Ngày sinh :");

        jLabel8.setText("Nghề nghiệp :");

        jLabel9.setText("Ghi chú :");

        jLabel10.setText("Tuổi :");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        btnthemmoi.setText("Nhập mới ");
        btnthemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemmoiActionPerformed(evt);
            }
        });

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa ");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        btnfirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/next_1.png"))); // NOI18N
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/forward-button_1.png"))); // NOI18N
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/forward-button.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/forward-button.png"))); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimkiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        btntim.setText("Tìm");
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttimkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntim)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntim))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaBN)
                                .addComponent(txtHoten)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgheNghiep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiachi)
                            .addComponent(txtDienthoai)
                            .addComponent(txtGhichu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnthemmoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnfirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlast)
                        .addGap(81, 81, 81)
                        .addComponent(btnthoat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)
                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfirst, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthemmoi)
                        .addComponent(btnthem)
                        .addComponent(btnxoa)
                        .addComponent(btnsua))
                    .addComponent(btnprev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnnext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnlast, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnthoat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabs.addTab("Nhập thông tin", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaBNActionPerformed

    private void txtNgaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaysinhActionPerformed

    private void tblDanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDanhsach.getSelectedRow();
            this.editFormBenhNhan();
        }
    }//GEN-LAST:event_tblDanhsachMouseClicked

    private void btnthemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemmoiActionPerformed
        // TODO add your handling code here:
        this.clearFormBenhNhan();
    }//GEN-LAST:event_btnthemmoiActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        if (checkTrungMa(txtMaBN)) {
            if (Error()) {
                this.insert();
            }
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        if (Error()) {
            this.update();
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnlastActionPerformed

    private void txttimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemKeyPressed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        // TODO add your handling code here:
        this.timKiem();
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed
        // TODO add your handling code here:
        this.timKiem();
    }//GEN-LAST:event_btntimActionPerformed

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLBenhNhan dialog = new QLBenhNhan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btntim;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhsach;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtDienthoai;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    BenhNhanDao daoBN = new BenhNhanDao();
    int row = -1;

    private void init() {
        this.setLocationRelativeTo(null);
        this.FillTableBenhNhan();
        this.UpdateStatusBenhNhan();
    }

    void FillTableBenhNhan() {
        DefaultTableModel model = (DefaultTableModel) tblDanhsach.getModel();
        model.setRowCount(0);
        try {
            String keyword = txttimkiem.getText();
            List<BenhNhan> list = daoBN.selectByKeyword(keyword);
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
                    bn.getGhiChu()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        BenhNhan bn = this.getformBenhNhan();
        try {
            daoBN.insert(bn);
            FillTableBenhNhan();
            this.clearFormBenhNhan();
            Msgbox.alert(this, "Thêm thành công!");
        } catch (Exception e) {
            Msgbox.alert(this, "Thêm thất bại!");
            e.printStackTrace();
        }
    }

    void update() {
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

    void delete() {
        String mabn = txtMaBN.getText();
        if (Msgbox.confirm(this, "Bạn thực sự muốn xóa bệnh nhân này?")) {
            try {
                daoBN.detele(mabn);
                FillTableBenhNhan();
                this.clearFormBenhNhan();
                Msgbox.alert(this, "Xóa thành công!");
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
        bn.setNgaySinh(XDate.toDate(txtNgaysinh.getText(), "dd/MM/yyyy"));
        bn.setTuoi(Integer.valueOf(txtTuoi.getText()));
        bn.setDiaChi(txtDiachi.getText());
        bn.setNgheNghiep(txtNgheNghiep.getText());
        bn.setGhiChu(txtGhichu.getText());
        return bn;
    }

    void setFormBenhNhan(BenhNhan bn) {
        txtMaBN.setText(bn.getMaBN());
        txtHoten.setText(bn.getTenBenhNhan());
        rdoNam.setSelected(bn.isGioiTinh());
        rdoNu.setSelected(!bn.isGioiTinh());
        txtDienthoai.setText(bn.getSDT());
        txtNgaysinh.setText(XDate.toString(bn.getNgaySinh(), "dd/MM/YYYY"));
        txtTuoi.setText(String.valueOf(bn.getTuoi()));
        txtDiachi.setText(bn.getDiaChi());
        txtNgheNghiep.setText(bn.getNgheNghiep());
        txtGhichu.setText(bn.getGhiChu());
    }

    void clearFormBenhNhan() {
        txtMaBN.setText("");
        txtHoten.setText("");
        txtGhichu.setText("");
        txtNgaysinh.setText("");
        txtTuoi.setText("");
        txtDiachi.setText("");
        txtNgheNghiep.setText("");
        txtDienthoai.setText("");
        rdoNam.setSelected(true);
        this.row = -1;
        this.UpdateStatusBenhNhan();
    }

    void editFormBenhNhan() {
        String mabn = (String) tblDanhsach.getValueAt(this.row, 0);
        BenhNhan bn = daoBN.selectByID(mabn);
        this.setFormBenhNhan(bn);
        tabs.setSelectedIndex(0);
        this.UpdateStatusBenhNhan();
    }

    void UpdateStatusBenhNhan() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhsach.getRowCount() - 1);
        // Trạng thái form
        txtMaBN.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);

        // Trạng thái điều hướng
        btnfirst.setEnabled(edit && !first);
        btnprev.setEnabled(edit && !first);
        btnnext.setEnabled(edit && !last);
        btnlast.setEnabled(edit && !last);
    }

    void first() {
        this.row = 0;
        this.editFormBenhNhan();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.editFormBenhNhan();
        }
    }

    void next() {
        if (this.row < tblDanhsach.getRowCount() - 1) {
            this.row++;
            this.editFormBenhNhan();
        }
    }

    void last() {
        this.row = tblDanhsach.getRowCount() - 1;
        this.editFormBenhNhan();
    }

    private void timKiem() {
        this.FillTableBenhNhan();
        this.clearFormBenhNhan();
        this.row = -1;
        UpdateStatusBenhNhan();
    }

    boolean Error() {
        if (Utility.checkNullText(txtMaBN)
                && Utility.checkMaBenhNhan(txtMaBN)
                && Utility.checkNullText(txtHoten)
                && Utility.checkNullText(txtNgaysinh)
                && Utility.checkNullText(txtDiachi)
                && Utility.checkNullText(txtDienthoai)
                && Utility.checkSDT(txtDienthoai)
                && Utility.checkNullText(txtTuoi)
                && Utility.checkNullText(txtNgheNghiep)
                //&& Utility.checkNullText(cboChucVu)
                && Utility.checkNullText(txtGhichu)) {
            return true;
        } else {
            return false;
        }
    }
    // dan

    public boolean checkTrungMa(JTextField txt) {
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
