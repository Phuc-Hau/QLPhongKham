/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import com.qlpk.dao.ThuocDao;
import com.qlpk.entity.Thuoc;
import com.qlpk.utils.Msgbox;
import com.qlpk.utils.Utility;
import com.qlpk.utils.XImage;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fptshop
 */
public class QLThuoc extends javax.swing.JPanel {

    /**
     * Creates new form QLThuoc
     */
    public QLThuoc() {
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_loaithuoc = new javax.swing.JTextField();
        txt_tenthuoc = new javax.swing.JTextField();
        txt_gianhap = new javax.swing.JTextField();
        txt_giaban = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_ghichu = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_sua = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        lbl_anh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_thuoc = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        btn_luu1 = new javax.swing.JButton();
        btn_xoa1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Loại thuốc:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("Tên thuốc:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Giá nhập:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("Giá bán:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Ghi chú:");

        txt_loaithuoc.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_loaithuoc.setPreferredSize(new java.awt.Dimension(6, 25));

        txt_ghichu.setColumns(20);
        txt_ghichu.setRows(5);
        jScrollPane3.setViewportView(txt_ghichu);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 224, 0));
        jLabel36.setText("VNĐ");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 224, 0));
        jLabel37.setText("VNĐ");

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        btn_sua.setBackground(new java.awt.Color(252, 255, 0));
        btn_sua.setText("SỬA");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_them.setBackground(new java.awt.Color(0, 255, 63));
        btn_them.setText("THÊM");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(255, 0, 0));
        btn_xoa.setText("XÓA");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_new.setBackground(new java.awt.Color(255, 174, 0));
        btn_new.setText("NEW");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them)
                .addGap(18, 18, 18)
                .addComponent(btn_sua)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa)
                .addGap(18, 18, 18)
                .addComponent(btn_new)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbl_anh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_anh.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lbl_anh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_anhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel34))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(10, 10, 10)
                                .addComponent(txt_loaithuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jLabel37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tenthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_giaban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_loaithuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(txt_tenthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(txt_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_thuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại thuốc", "Tên thuốc", "Giá nhập", "Giá bán", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_thuoc);

        jPanel13.setBackground(new java.awt.Color(19, 224, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel80.setText("Tìm kiếm:");

        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyReleased(evt);
            }
        });

        btn_luu1.setText("Lưu");
        btn_luu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu1ActionPerformed(evt);
            }
        });

        btn_xoa1.setText("Xóa");
        btn_xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_xoa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_luu1)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(btn_luu1)
                    .addComponent(btn_xoa1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        if (ErrorThuoc()) {
            this.updateThuoc();
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        if(txt_loaithuoc.getText()==null){
            if (ErrorThuoc()) {
                this.insertThuoc();
            }
        } else{
            if (ErrorThuoc()&&checkTrungMaThuoc(txt_loaithuoc)) {
                this.insertThuoc();
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        this.deleteThuoc();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        this.clearFormThuoc();
    }//GEN-LAST:event_btn_newActionPerformed

    private void lbl_anhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_anhMouseClicked
        // TODO add your handling code here:
        this.selectImage();
    }//GEN-LAST:event_lbl_anhMouseClicked

    private void tbl_thuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thuocMouseClicked
        // TODO add your handling code here:
        this.rowDonThuocThuoc = tbl_thuoc.getSelectedRow();
        if (evt.getClickCount() == 2) {
            this.rowThuoc = tbl_thuoc.getSelectedRow();
            this.editThuoc();
        }
    }//GEN-LAST:event_tbl_thuocMouseClicked

    private void txt_timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyReleased
        // TODO add your handling code here:
        this.timkiem();
    }//GEN-LAST:event_txt_timkiemKeyReleased

    private void btn_luu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu1ActionPerformed
        // TODO add your handling code here:
        this.updateSoLuong();
    }//GEN-LAST:event_btn_luu1ActionPerformed

    private void btn_xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa1ActionPerformed
        // TODO add your handling code here:
        this.fillTableThuocKham(rowDonThuocThuoc);
    }//GEN-LAST:event_btn_xoa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_luu1;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton btn_xoa1;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_anh;
    private javax.swing.JTable tbl_thuoc;
    private javax.swing.JTextArea txt_ghichu;
    private javax.swing.JTextField txt_giaban;
    private javax.swing.JTextField txt_gianhap;
    private javax.swing.JTextField txt_loaithuoc;
    private javax.swing.JTextField txt_tenthuoc;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    
    int rowDonThuocThuoc=-1;
    int rowThuoc = -1;
    ThuocDao daoThuoc = new ThuocDao();
    
    void inti() {
        this.fillTableThuoc();
        this.updateStatusThuoc();
    }
    
    
    private ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbl_anh.getWidth(), lbl_anh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    void clearFormThuoc() {
        txt_loaithuoc.setText("");
        txt_tenthuoc.setText("");
        txt_gianhap.setText("");
        txt_giaban.setText("");
        txt_ghichu.setText("");
        lbl_anh.setIcon(ResizeImage(String.valueOf(" ")));
        this.rowThuoc = -1;
        this.updateStatusThuoc();
    }
    
    void editThuoc() {
        String th = (String) tbl_thuoc.getValueAt(this.rowThuoc, 0);
        Thuoc cd = daoThuoc.selectByID(th);
        this.setFormThuoc(cd);
        this.updateStatusThuoc();
    }
    private void timkiem(){
        this.fillTableThuoc();
        //this.clearForm();
        this.rowThuoc = -1;
        updateStatusThuoc();
    }
    void selectImage() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lbl_anh.setIcon(icon);
            lbl_anh.setToolTipText(file.getName());
                     
        }
    }
    
    boolean ErrorThuoc(){
        if (Utility.checkNullText(txt_loaithuoc)           
                && Utility.checkNullText(txt_tenthuoc)
                && Utility.checkNullText(txt_gianhap)
                && Utility.checkNullText(txt_giaban)
                
                ) {
            return true;
        }else return false;  
    }
    
    public  boolean checkTrungMaThuoc(JTextField txt){
        txt.setBackground(white);
        if (daoThuoc.selectByID(txt.getText())==null) {
            return true;    
        }else{
            txt.setBackground(Color.red);
           Msgbox.alert(this,txt.getName()+" Mã đã tồn tại");
            return false;
        
        }
    } 
    
    boolean kt() {
        String gianhap = txt_gianhap.getText();
        String giaban = txt_giaban.getText();
        String tenthuoc = txt_tenthuoc.getText();
        if (tenthuoc.matches("[0-9]{1,5000}")) {
            JOptionPane.showMessageDialog(this, "Tên thuốc phải là chữ!");
            txt_tenthuoc.requestFocus();
            return false;
        }else if (!gianhap.matches("[0-9]{1,100000}") ) {
            JOptionPane.showMessageDialog(this, "Sai định dạng số, phải có ít nhất 2 số!");
            txt_gianhap.requestFocus();
            return false;
        }else if (!giaban.matches("[0-9]{1,100000}") ) {
            JOptionPane.showMessageDialog(this, "Sai định dạng số, phải có ít nhất 2 số!");
            txt_giaban.requestFocus();
            return false;
        }
        return true;
    }
    
    void insertThuoc() {
        if (kt()) {
        Thuoc th = getFormThuoc();
        boolean kt = false;
        try {
            kt=true;
            daoThuoc.insert(th);
            this.fillTableThuoc();
            this.clearFormThuoc();
            Msgbox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            kt=true;
            Msgbox.alert(this, "Thêm mới thất bại!");      
        }
        }
    }
    
    void updateThuoc() {
        Thuoc cd = getFormThuoc();
        try {
            daoThuoc.update(cd);
            this.fillTableThuoc();
            //this.clearForm();
            Msgbox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            Msgbox.alert(this, "Cập nhật thất bại!");
        }
    }

    void deleteThuoc() {
        //if (!Auth.isManager()) {
        //    MsgBox.alert(this, "Bạn không có quyền xóa Loại thuốc này!");
        //} else {
            String loaith = txt_loaithuoc.getText();
            if (Msgbox.confirm(this, "Bạn thực sự muốn xóa loại thuốc này?")) {
                try {
                    Thuoc th = daoThuoc.selectByID(loaith);
                    XImage.DeleteFile(th.getHinh());
                    daoThuoc.delete(loaith);
                    this.fillTableThuoc();
                    this.clearFormThuoc();
                    Msgbox.alert(this, "Xoá thành công!");
                } catch (Exception e) {
                    Msgbox.alert(this, "Xóa thất bại!");
                }
            //}
        }
    }
    
    //Đỗ dữ liệu vào tbl_danhsach
    void fillTableThuoc() {
        DefaultTableModel model = (DefaultTableModel) tbl_thuoc.getModel();
        model.setRowCount(0);
        try {
            String keyword = txt_timkiem.getText();
            List<Thuoc> list = daoThuoc.selectByKeyword(keyword);
            for (Thuoc th : list) {
                Object[] row = {th.getLoaiThuoc(), th.getTenThuoc(), th.getGiaNhap(), th.getGiaBan(), th.getSoLuong()};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    void setFormThuoc(Thuoc th) {
        txt_loaithuoc.setText(th.getLoaiThuoc());
        txt_tenthuoc.setText(th.getTenThuoc());
        txt_gianhap.setText(String.valueOf(th.getGiaNhap()));
        txt_giaban.setText(String.valueOf(th.getGiaBan()));
        txt_ghichu.setText(th.getGhiChu());
        if (th.getHinh() != null) {
            lbl_anh.setToolTipText(th.getHinh());
            lbl_anh.setIcon(XImage.read(th.getHinh()));
        }
    }

    //tao thuoc tu form
    Thuoc getFormThuoc() {
        Thuoc th = new Thuoc();
        th.setLoaiThuoc(txt_loaithuoc.getText());
        th.setTenThuoc(txt_tenthuoc.getText());
        th.setGiaNhap(Integer.valueOf(txt_gianhap.getText()));
        th.setGiaBan(Integer.valueOf(txt_giaban.getText()));
        th.setGhiChu(txt_ghichu.getText());
        th.setHinh(lbl_anh.getToolTipText());
        th.setSoLuong("1");
        return th;
    }
    
    void updateStatusThuoc() {
        boolean edit = (this.rowThuoc >= 0);
        //Trang thai form
        txt_loaithuoc.setEditable(!edit);
        btn_them.setEnabled(!edit);
        btn_sua.setEnabled(edit);
        btn_xoa.setEnabled(edit);
    }
    void fillTableThuocKham(int n){
        String loaith = txt_loaithuoc.getText();
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to delete?", "Confirm",
        JOptionPane.YES_NO_OPTION);
        if(ret != JOptionPane.YES_OPTION) {
            try {
                    Thuoc th = daoThuoc.selectByID(loaith);
                    daoThuoc.delete(loaith);
                    this.fillTableThuoc();
                    //this.clearFormThuoc();
                    Msgbox.alert(this, "Xoá thành công!");
                } catch (Exception e) {
                    Msgbox.alert(this, "Xóa thất bại!");
                }
        return;
        }    
        DefaultTableModel model = (DefaultTableModel) tbl_thuoc.getModel();            
        if (ret != -1) {
         JOptionPane.showMessageDialog(this, "Thuốc đã được xóa!");
        }                
    }
    void updateSoLuong(){      
        try {
        for(int i=0; i<tbl_thuoc.getRowCount(); i++){
                String maThuoc = (String) tbl_thuoc.getValueAt(i, 0);
                Thuoc hv = daoThuoc.selectByID(maThuoc);
                hv.setSoLuong((String) tbl_thuoc.getValueAt(i, 4));            
                daoThuoc.update(hv);                         
            }    
            Msgbox.alert(this, "Cập nhật thuốc thành công!");
            } catch (Exception e) {    
                JOptionPane.showMessageDialog(this, "Lỗi điểm");
                JOptionPane.showMessageDialog(this, e);
        }
    }
    DefaultTableModel modelProducts;
}
