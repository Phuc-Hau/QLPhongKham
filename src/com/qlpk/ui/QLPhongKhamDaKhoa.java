/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author fptshop
 */
public class QLPhongKhamDaKhoa extends javax.swing.JFrame {

    /**
     * Creates new form QLPhongKhamDaKhoa
     */
    public QLPhongKhamDaKhoa() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Phòng Khám Đa Khoa");
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

        jPanel1 = new javax.swing.JPanel();
        pnlChucNang = new javax.swing.JPanel();
        pnlBenhNhan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlColorBenhNhan = new javax.swing.JPanel();
        pnlPhongKham = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlcolorPhongKham = new javax.swing.JPanel();
        pnlPhieuKham = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlcolorPhieuKham = new javax.swing.JPanel();
        pnlDonThuoc = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlcolorDonThuoc = new javax.swing.JPanel();
        pnlThuoc = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnlcolorThuoc = new javax.swing.JPanel();
        pnlNhanVien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlcolorNhanVien = new javax.swing.JPanel();
        pnlDichvu = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlChucNang.setBackground(new java.awt.Color(65, 3, 88));

        pnlBenhNhan.setBackground(new java.awt.Color(160, 126, 173));
        pnlBenhNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBenhNhanMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bệnh Nhân");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/patient.png"))); // NOI18N

        pnlColorBenhNhan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlColorBenhNhanLayout = new javax.swing.GroupLayout(pnlColorBenhNhan);
        pnlColorBenhNhan.setLayout(pnlColorBenhNhanLayout);
        pnlColorBenhNhanLayout.setHorizontalGroup(
            pnlColorBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlColorBenhNhanLayout.setVerticalGroup(
            pnlColorBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBenhNhanLayout = new javax.swing.GroupLayout(pnlBenhNhan);
        pnlBenhNhan.setLayout(pnlBenhNhanLayout);
        pnlBenhNhanLayout.setHorizontalGroup(
            pnlBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBenhNhanLayout.createSequentialGroup()
                .addComponent(pnlColorBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        pnlBenhNhanLayout.setVerticalGroup(
            pnlBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBenhNhanLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlBenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
            .addComponent(pnlColorBenhNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlPhongKham.setBackground(new java.awt.Color(160, 126, 173));
        pnlPhongKham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPhongKhamMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Phòng Khám");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/phongkham.png"))); // NOI18N

        pnlcolorPhongKham.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlcolorPhongKhamLayout = new javax.swing.GroupLayout(pnlcolorPhongKham);
        pnlcolorPhongKham.setLayout(pnlcolorPhongKhamLayout);
        pnlcolorPhongKhamLayout.setHorizontalGroup(
            pnlcolorPhongKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlcolorPhongKhamLayout.setVerticalGroup(
            pnlcolorPhongKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPhongKhamLayout = new javax.swing.GroupLayout(pnlPhongKham);
        pnlPhongKham.setLayout(pnlPhongKhamLayout);
        pnlPhongKhamLayout.setHorizontalGroup(
            pnlPhongKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhongKhamLayout.createSequentialGroup()
                .addComponent(pnlcolorPhongKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        pnlPhongKhamLayout.setVerticalGroup(
            pnlPhongKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhongKhamLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlPhongKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21))
            .addComponent(pnlcolorPhongKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlPhieuKham.setBackground(new java.awt.Color(160, 126, 173));
        pnlPhieuKham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPhieuKhamMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phiếu Khám");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/PhieuKham.png"))); // NOI18N

        pnlcolorPhieuKham.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlcolorPhieuKhamLayout = new javax.swing.GroupLayout(pnlcolorPhieuKham);
        pnlcolorPhieuKham.setLayout(pnlcolorPhieuKhamLayout);
        pnlcolorPhieuKhamLayout.setHorizontalGroup(
            pnlcolorPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlcolorPhieuKhamLayout.setVerticalGroup(
            pnlcolorPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPhieuKhamLayout = new javax.swing.GroupLayout(pnlPhieuKham);
        pnlPhieuKham.setLayout(pnlPhieuKhamLayout);
        pnlPhieuKhamLayout.setHorizontalGroup(
            pnlPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhieuKhamLayout.createSequentialGroup()
                .addComponent(pnlcolorPhieuKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        pnlPhieuKhamLayout.setVerticalGroup(
            pnlPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuKhamLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(pnlcolorPhieuKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlDonThuoc.setBackground(new java.awt.Color(160, 126, 173));
        pnlDonThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDonThuocMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Đơn Thuốc");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/DonThuoc.png"))); // NOI18N

        pnlcolorDonThuoc.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlcolorDonThuocLayout = new javax.swing.GroupLayout(pnlcolorDonThuoc);
        pnlcolorDonThuoc.setLayout(pnlcolorDonThuocLayout);
        pnlcolorDonThuocLayout.setHorizontalGroup(
            pnlcolorDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlcolorDonThuocLayout.setVerticalGroup(
            pnlcolorDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlDonThuocLayout = new javax.swing.GroupLayout(pnlDonThuoc);
        pnlDonThuoc.setLayout(pnlDonThuocLayout);
        pnlDonThuocLayout.setHorizontalGroup(
            pnlDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDonThuocLayout.createSequentialGroup()
                .addComponent(pnlcolorDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        pnlDonThuocLayout.setVerticalGroup(
            pnlDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDonThuocLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(pnlcolorDonThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlThuoc.setBackground(new java.awt.Color(160, 126, 173));
        pnlThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlThuocMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Thuốc");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/thuoc.png"))); // NOI18N

        pnlcolorThuoc.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlcolorThuocLayout = new javax.swing.GroupLayout(pnlcolorThuoc);
        pnlcolorThuoc.setLayout(pnlcolorThuocLayout);
        pnlcolorThuocLayout.setHorizontalGroup(
            pnlcolorThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlcolorThuocLayout.setVerticalGroup(
            pnlcolorThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlThuocLayout = new javax.swing.GroupLayout(pnlThuoc);
        pnlThuoc.setLayout(pnlThuocLayout);
        pnlThuocLayout.setHorizontalGroup(
            pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThuocLayout.createSequentialGroup()
                .addComponent(pnlcolorThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnlThuocLayout.setVerticalGroup(
            pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThuocLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(pnlcolorThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlNhanVien.setBackground(new java.awt.Color(160, 126, 173));
        pnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNhanVienMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nhân Viên");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/NhanVien.png"))); // NOI18N

        pnlcolorNhanVien.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlcolorNhanVienLayout = new javax.swing.GroupLayout(pnlcolorNhanVien);
        pnlcolorNhanVien.setLayout(pnlcolorNhanVienLayout);
        pnlcolorNhanVienLayout.setHorizontalGroup(
            pnlcolorNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlcolorNhanVienLayout.setVerticalGroup(
            pnlcolorNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addComponent(pnlcolorNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(pnlcolorNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlDichvu.setBackground(new java.awt.Color(153, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 36, 246));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Dịch Vụ & Chức Nặng");

        javax.swing.GroupLayout pnlDichvuLayout = new javax.swing.GroupLayout(pnlDichvu);
        pnlDichvu.setLayout(pnlDichvuLayout);
        pnlDichvuLayout.setHorizontalGroup(
            pnlDichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDichvuLayout.setVerticalGroup(
            pnlDichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlpk/icon/Log out.png"))); // NOI18N
        lblExit.setText("Thoát");

        javax.swing.GroupLayout pnlChucNangLayout = new javax.swing.GroupLayout(pnlChucNang);
        pnlChucNang.setLayout(pnlChucNangLayout);
        pnlChucNangLayout.setHorizontalGroup(
            pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBenhNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPhongKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPhieuKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDonThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDichvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlChucNangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChucNangLayout.setVerticalGroup(
            pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlDichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlPhieuKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPhongKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlChucNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Bệnh Nhân");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel11.setBackground(new java.awt.Color(207, 81, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 820, 100));

        jToolBar1.setBackground(new java.awt.Color(15, 202, 223));
        jToolBar1.setRollover(true);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    void inti(){
        
    }
    
    void setColor(JPanel pane,JPanel indicators){
        pane.setBackground(new Color(14,227,250));
        indicators.setBackground(new Color(222,175,239));
    }
    
    void reserColor(JPanel [] pane, JPanel [] indicators){
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(255,255,255));
        }
        
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setBackground(new Color(160,126,173));
        }
    }
    
    private void pnlBenhNhanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBenhNhanMousePressed
        // TODO add your handling code here:
        this.setColor(pnlColorBenhNhan,pnlBenhNhan);
        this.reserColor(new JPanel[]{pnlcolorPhieuKham,pnlcolorPhongKham,pnlcolorDonThuoc,pnlcolorThuoc,pnlcolorNhanVien}, 
                new JPanel[]{pnlPhieuKham,pnlPhongKham,pnlDonThuoc,pnlThuoc,pnlNhanVien});
        
        
    }//GEN-LAST:event_pnlBenhNhanMousePressed

    private void pnlPhieuKhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPhieuKhamMousePressed
        // TODO add your handling code here:
        this.setColor(pnlcolorPhieuKham,pnlPhieuKham);
        this.reserColor(new JPanel[]{pnlColorBenhNhan,pnlcolorPhongKham,pnlcolorDonThuoc,pnlcolorThuoc,pnlcolorNhanVien}, 
                new JPanel[]{pnlBenhNhan ,pnlPhongKham,pnlDonThuoc,pnlThuoc,pnlNhanVien});
        
        
    }//GEN-LAST:event_pnlPhieuKhamMousePressed

    private void pnlPhongKhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPhongKhamMousePressed
        // TODO add your handling code here:
        this.setColor(pnlcolorPhongKham,pnlPhongKham);
        this.reserColor(new JPanel[]{pnlColorBenhNhan,pnlcolorPhieuKham,pnlcolorDonThuoc,pnlcolorThuoc,pnlcolorNhanVien}, 
                new JPanel[]{pnlBenhNhan ,pnlPhieuKham,pnlDonThuoc,pnlThuoc,pnlNhanVien});
        
        
    }//GEN-LAST:event_pnlPhongKhamMousePressed

    private void pnlDonThuocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDonThuocMousePressed
        // TODO add your handling code here:
        this.setColor(pnlcolorDonThuoc,pnlDonThuoc);
        this.reserColor(new JPanel[]{pnlColorBenhNhan,pnlcolorPhieuKham,pnlcolorPhongKham,pnlcolorThuoc,pnlcolorNhanVien}, 
                new JPanel[]{pnlBenhNhan ,pnlPhieuKham,pnlPhongKham,pnlThuoc,pnlNhanVien});
        
        
    }//GEN-LAST:event_pnlDonThuocMousePressed

    private void pnlThuocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThuocMousePressed
        // TODO add your handling code here:
        this.setColor(pnlcolorThuoc,pnlThuoc);
        this.reserColor(new JPanel[]{pnlColorBenhNhan,pnlcolorPhieuKham,pnlcolorPhongKham,pnlcolorDonThuoc,pnlcolorNhanVien}, 
                new JPanel[]{pnlBenhNhan ,pnlPhieuKham,pnlDonThuoc,pnlPhongKham,pnlNhanVien});
        
        
    }//GEN-LAST:event_pnlThuocMousePressed

    private void pnlNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMousePressed
        // TODO add your handling code here:
        this.setColor(pnlcolorNhanVien,pnlNhanVien);
        this.reserColor(new JPanel[]{pnlColorBenhNhan,pnlcolorPhieuKham,pnlcolorPhongKham,pnlcolorDonThuoc,pnlcolorThuoc}, 
                new JPanel[]{pnlBenhNhan ,pnlPhieuKham,pnlDonThuoc,pnlPhongKham,pnlThuoc,pnlThuoc});
        
        
    }//GEN-LAST:event_pnlNhanVienMousePressed

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
            java.util.logging.Logger.getLogger(QLPhongKhamDaKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPhongKhamDaKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPhongKhamDaKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPhongKhamDaKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPhongKhamDaKhoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JPanel pnlBenhNhan;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlColorBenhNhan;
    private javax.swing.JPanel pnlDichvu;
    private javax.swing.JPanel pnlDonThuoc;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlPhieuKham;
    private javax.swing.JPanel pnlPhongKham;
    private javax.swing.JPanel pnlThuoc;
    private javax.swing.JPanel pnlcolorDonThuoc;
    private javax.swing.JPanel pnlcolorNhanVien;
    private javax.swing.JPanel pnlcolorPhieuKham;
    private javax.swing.JPanel pnlcolorPhongKham;
    private javax.swing.JPanel pnlcolorThuoc;
    // End of variables declaration//GEN-END:variables
}
