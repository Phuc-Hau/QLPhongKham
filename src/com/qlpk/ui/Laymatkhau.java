/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import com.qlpk.dao.NhanVienDao;
import java.util.List;
import com.qlpk.entity.NhanVien;
import com.qlpk.utils.*;

/**
 *
 * @author fptshop
 */
public class Laymatkhau extends javax.swing.JFrame{

    /**
     * Creates new form LaymatkhauJDialog
     */
    public Laymatkhau() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Lấy lại mật khẩu EduSys");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        pnlXacthuc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btngui = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        pnlXacMinh = new javax.swing.JPanel();
        txtma = new javax.swing.JTextField();
        btnxem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnQuaylai = new javax.swing.JButton();
        btnResetMa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnHuy1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblTaiKhoang = new javax.swing.JLabel();
        pnlDoipass = new javax.swing.JPanel();
        btnDoipass = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHuy2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlXacthuc.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 150, 27));
        jLabel1.setText("Lấy mật khẩu");

        jLabel2.setText("Email đăng ký: ");

        btngui.setBackground(new java.awt.Color(0, 255, 63));
        btngui.setText("gui");
        btngui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguiActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 0, 0));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlXacthucLayout = new javax.swing.GroupLayout(pnlXacthuc);
        pnlXacthuc.setLayout(pnlXacthucLayout);
        pnlXacthucLayout.setHorizontalGroup(
            pnlXacthucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacthucLayout.createSequentialGroup()
                .addGroup(pnlXacthucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlXacthucLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(pnlXacthucLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlXacthucLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btngui, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlXacthucLayout.setVerticalGroup(
            pnlXacthucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacthucLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlXacthucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(pnlXacthucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngui)
                    .addComponent(btnHuy))
                .addGap(23, 23, 23))
        );

        tabs.addTab("tab1", pnlXacthuc);

        pnlXacMinh.setBackground(new java.awt.Color(204, 255, 255));

        btnxem.setBackground(new java.awt.Color(0, 255, 55));
        btnxem.setText("Xác nhận");
        btnxem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã xác minh: ");

        btnQuaylai.setBackground(new java.awt.Color(255, 249, 4));
        btnQuaylai.setText("Quay lại");
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });

        btnResetMa.setBackground(new java.awt.Color(235, 0, 255));
        btnResetMa.setText("Lấy lại mã");
        btnResetMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 150, 27));
        jLabel4.setText("Xác minh");

        btnHuy1.setBackground(new java.awt.Color(255, 0, 0));
        btnHuy1.setText("Hủy");
        btnHuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuy1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Tài khoảng: ");

        lblTaiKhoang.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout pnlXacMinhLayout = new javax.swing.GroupLayout(pnlXacMinh);
        pnlXacMinh.setLayout(pnlXacMinhLayout);
        pnlXacMinhLayout.setHorizontalGroup(
            pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacMinhLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pnlXacMinhLayout.createSequentialGroup()
                        .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlXacMinhLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnxem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlXacMinhLayout.createSequentialGroup()
                                .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlXacMinhLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlXacMinhLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(26, 26, 26)))
                                .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtma, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(lblTaiKhoang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlXacMinhLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnResetMa))
                            .addGroup(pnlXacMinhLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnHuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlXacMinhLayout.setVerticalGroup(
            pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacMinhLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaiKhoang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlXacMinhLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxem)
                            .addComponent(btnQuaylai)
                            .addComponent(btnHuy1))
                        .addGap(21, 21, 21))
                    .addGroup(pnlXacMinhLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pnlXacMinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnResetMa))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabs.addTab("tab2", pnlXacMinh);

        pnlDoipass.setBackground(new java.awt.Color(204, 255, 255));

        btnDoipass.setBackground(new java.awt.Color(0, 255, 30));
        btnDoipass.setText("Đổi mật khẩu");
        btnDoipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoipassActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 150, 27));
        jLabel5.setText("Mật khẩu mới");

        jLabel6.setText("Mật khẩu mới ");

        jLabel7.setText("Xác nhận mật khẩu ");

        btnHuy2.setBackground(new java.awt.Color(255, 0, 0));
        btnHuy2.setText("Hủy");
        btnHuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuy2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDoipassLayout = new javax.swing.GroupLayout(pnlDoipass);
        pnlDoipass.setLayout(pnlDoipassLayout);
        pnlDoipassLayout.setHorizontalGroup(
            pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoipassLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlDoipassLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(btnDoipass)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addComponent(btnHuy2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDoipassLayout.createSequentialGroup()
                            .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(33, 33, 33)
                            .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNewPass)
                                .addComponent(txtConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlDoipassLayout.setVerticalGroup(
            pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoipassLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pnlDoipassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoipass)
                    .addComponent(btnHuy2))
                .addGap(26, 26, 26))
        );

        tabs.addTab("tab3", pnlDoipass);

        getContentPane().add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 380, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    NhanVienDao daoNV = new NhanVienDao();
    
    boolean fillTK(){
        try {
            NhanVien nv =daoNV.selectByEmail(txtEmail.getText());
            if(nv==null){
                Msgbox.alert(this, "Tài khoảng chưa đăng ký");
                return false;
            } else{
                lblTaiKhoang.setText(nv.getMaNV());
                Auth.user =nv;
            }
            return true;   
        } catch (Exception e) {
            Msgbox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        return false;
    }
    
    String ST="";
    String SK="";
    void usingMathClass() {
        ST="";
        for (int i = 0; i < 6; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 9+1;
            ST += (int) randomDouble;
        }
        SK=ST;
    }
    void guiEmail(){
        try {
            String email ="qlphongkhamytamcuc@gmail.com";
            String pass ="iitiucxfrjjsfyem";
            //cau hinh
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", 587);
            
            // dang nhap
            
            Session s = Session.getInstance(p,
            new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
            return new javax.mail.PasswordAuthentication(email,pass);
            }
            });
            
            // noi dung
            String from =email;
            String to =txtEmail.getText();
            String subject ="Mã xác minh QLPhongKham_Y_Tam_Cuc";
            String body ="Mã xác minh \n"
                    + "Mã xác minh bạn cần dùng để truy cập vào Tài khoản QLPhongKham_Y_Tam_Cuc của mình ("+txtEmail.getText()+") là: \n\n"
                    + ST+" \n\n"
                    + "Nếu bạn không yêu cầu mã này thì có thể là ai đó đang tìm cách truy cập vào Tài khoản QLPhongKham_Y_Tam_Cuc "+txtEmail.getText()+". Không chuyển tiếp hoặc cung cấp mã này cho bất kỳ ai.\n"
                    + "Trân trọng!";
            
            Message msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setText(body);
            // gui
            Transport.send(msg);   
            ST="";
            tabs.setSelectedIndex(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void btnguiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguiActionPerformed
        // TODO add your handling code here:
        if(Utility.parseEmail(txtEmail) && fillTK()){
            usingMathClass();
            guiEmail();
        }
    }//GEN-LAST:event_btnguiActionPerformed

    void xacMinh(){
        if(txtma.getText().equals(SK)){
            tabs.setSelectedIndex(2);
        } else{
            Msgbox.alert(this, "Mã xác minh không chính xác");
        }
    }
    private void btnxemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemActionPerformed
        // TODO add your handling code here:
        xacMinh();
    }//GEN-LAST:event_btnxemActionPerformed

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(0);
        ST="";
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    private void btnResetMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMaActionPerformed
        // TODO add your handling code here:
        usingMathClass();
        guiEmail();
    }//GEN-LAST:event_btnResetMaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        new DangNhapJDialong(" ").setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnHuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuy1ActionPerformed
        // TODO add your handling code here:
        new DangNhapJDialong(" ").setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHuy1ActionPerformed

    private void btnHuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuy2ActionPerformed
        // TODO add your handling code here:
        new DangNhapJDialong(" ").setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHuy2ActionPerformed

    public NhanVien getModel(){
        NhanVien nv =new NhanVien();
        nv.setMaNV(Auth.user.getMaNV());
        nv.setHoTen(Auth.user.getHoTen());
        nv.setGioiTinh(Auth.user.isGioiTinh());
        nv.setNgaySinh(Auth.user.getNgaySinh());
        nv.setEmail(Auth.user.getEmail());
        nv.setSoDT(Auth.user.getSoDT());
        nv.setDiaChi(Auth.user.getDiaChi());
        nv.setChucVu(Auth.user.getChucVu());
        nv.setChuyenNganh(Auth.user.getChuyenNganh());
        nv.setLuong(Auth.user.getLuong());
        nv.setPass(new String(txtNewPass.getPassword()));
        nv.setHinh(Auth.user.getHinh());
        return nv;
    }
    void doiPass(){
        NhanVien nv =getModel();
        try {
            daoNV.update(nv);
            Msgbox.alert(this, "Đổi mật khẩu thành công");
            new DangNhapJDialong(nv.getMaNV());
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnDoipassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoipassActionPerformed
        // TODO add your handling code here:
        String NewPass =  new String(txtNewPass.getPassword());
        String ConfirmPass =  new String(txtConfirm.getPassword());
        if(NewPass.equals(ConfirmPass)){
            if(Utility.CheckPass(txtNewPass)){
                doiPass();
            }
        } else{
            Msgbox.alert(this, "Xác thực mật khẩu không đúng");
        }
    }//GEN-LAST:event_btnDoipassActionPerformed

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
            java.util.logging.Logger.getLogger(Laymatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laymatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laymatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laymatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laymatkhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoipass;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnHuy1;
    private javax.swing.JButton btnHuy2;
    private javax.swing.JButton btnQuaylai;
    private javax.swing.JButton btnResetMa;
    private javax.swing.JButton btngui;
    private javax.swing.JButton btnxem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblTaiKhoang;
    private javax.swing.JPanel pnlDoipass;
    private javax.swing.JPanel pnlXacMinh;
    private javax.swing.JPanel pnlXacthuc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JTextField txtma;
    // End of variables declaration//GEN-END:variables

}
