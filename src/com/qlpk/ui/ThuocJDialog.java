//
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
 * @author Huy PC
 */
public class ThuocJDialog extends javax.swing.JDialog {

    /**
     * Creates new form Thuoc
     */
    public ThuocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    void init() {
        setLocationRelativeTo(null);

        this.fillTableThuoc();
        this.updateStatusThuoc();
        Tabs.setSelectedIndex(1);
    }
    int rowThuoc = -1;
    ThuocDao daoThuoc = new ThuocDao();
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
        String th = (String) tbl_Thuoc.getValueAt(this.rowThuoc, 0);
        Thuoc cd = daoThuoc.selectByID(th);
        this.setFormThuoc(cd);
        this.updateStatusThuoc();
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
            Msgbox.alert(this, "Thêm mới thất bại!, Thiếu hình");      
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
        DefaultTableModel model = (DefaultTableModel) tbl_Thuoc.getModel();
        model.setRowCount(0);
        try {
            List<Thuoc> list = daoThuoc.selectAll();
            for (Thuoc th : list) {
                Object[] row = {th.getLoaiThuoc(), th.getTenThuoc(), th.getGiaNhap(), th.getGiaBan()};
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        Tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_loaithuoc = new javax.swing.JTextField();
        txt_tenthuoc = new javax.swing.JTextField();
        txt_gianhap = new javax.swing.JTextField();
        txt_giaban = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ghichu = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lbl_anh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Thuoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Loại thuốc:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên thuốc:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Giá nhập:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Giá bán:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ghi chú:");

        txt_loaithuoc.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_loaithuoc.setPreferredSize(new java.awt.Dimension(6, 25));

        txt_ghichu.setColumns(20);
        txt_ghichu.setRows(5);
        jScrollPane2.setViewportView(txt_ghichu);

        lbl_anh.setToolTipText("CHỌN ẢNH");
        lbl_anh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_anhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_anh, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_anh, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("VNĐ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("VNĐ");

        btn_new.setBackground(new java.awt.Color(255, 174, 0));
        btn_new.setText("NEW");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(btn_them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sua)
                .addGap(2, 2, 2)
                .addComponent(btn_xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_new))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_new)
                .addComponent(btn_sua)
                .addComponent(btn_them)
                .addComponent(btn_xoa))
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_loaithuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_tenthuoc))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_loaithuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tenthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tabs.addTab("Nội dung", jPanel2);

        tbl_Thuoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Thuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ThuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Thuoc);

        Tabs.addTab("Danh sách", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        this.deleteThuoc();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        this.clearFormThuoc();;
    }//GEN-LAST:event_btn_newActionPerformed

    private void lbl_anhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_anhMouseClicked
        // TODO add your handling code here:
        this.selectImage();
    }//GEN-LAST:event_lbl_anhMouseClicked

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

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        if(txt_loaithuoc.getText()==null){
            if (ErrorThuoc()) {
                this.updateThuoc();
            }
        } 
    }//GEN-LAST:event_btn_suaActionPerformed

    private void tbl_ThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThuocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.rowThuoc = tbl_Thuoc.getSelectedRow();
            this.editThuoc();
        }
    }//GEN-LAST:event_tbl_ThuocMouseClicked

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
            java.util.logging.Logger.getLogger(ThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThuocJDialog dialog = new ThuocJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_anh;
    private javax.swing.JTable tbl_Thuoc;
    private javax.swing.JTextArea txt_ghichu;
    private javax.swing.JTextField txt_giaban;
    private javax.swing.JTextField txt_gianhap;
    private javax.swing.JTextField txt_loaithuoc;
    private javax.swing.JTextField txt_tenthuoc;
    // End of variables declaration//GEN-END:variables
}
