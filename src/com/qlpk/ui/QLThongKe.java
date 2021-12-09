 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.ui;

import com.qlpk.dao.ThongKeDao;
import com.qlpk.dao.ThuocDao;
import com.qlpk.entity.Thuoc;
import com.qlpk.utils.DTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author fptshop
 */
public class QLThongKe extends javax.swing.JPanel {

    /**
     * Creates new form QLThongKe
     */
    public QLThongKe() {
        initComponents();
        inti();
    }

    ThongKeDao dao = new ThongKeDao();
    ThuocDao daoTH = new ThuocDao();
    DTable dTable = new DTable();
    
    void inti(){
        fillcoboNam();
        fillTableSLThuoc();
        tblThongKeThuoc.setDefaultRenderer(tblThongKeThuoc.getColumnClass(0), dTable);
    }
    
    void fillcoboNam(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        try {
            List<Integer> list = dao.getNam();
            for (Integer i : list) {
                model.addElement(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    void fillTableSLThuoc(){
        DefaultTableModel model = (DefaultTableModel) tblThongKeThuoc.getModel();
        model.setRowCount(0);
        int SumLoiNhuan=0;
        try {
            if(cboNam.getItemCount()>0){
                int nam = (Integer) cboNam.getSelectedItem();
                List<Object[]> list = dao.getThuoc(nam);
                for (Object[] i : list) {
                    int SL = (int) i[2];
                    Thuoc th= daoTH.selectByID((String) i[0]);
                    int LoiNhuan = (th.getGiaBan()-th.getGiaNhap())* SL;
                    SumLoiNhuan += LoiNhuan;
                    
                    model.addRow(new Object[]{i[0],i[1],i[2],formatter.format(LoiNhuan)});
                }
            }        
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtTong.setText(String.valueOf(formatter.format(SumLoiNhuan)+" VND"));
    }
    
    public void showPieChart(){
        
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset( );
        try {
            if(cboNam.getItemCount()>0){
                int nam = (Integer) cboNam.getSelectedItem();
                List<Object[]> list = dao.getTuoi(Integer.valueOf(nam));
                for (Object[] i : list) {
                    int T18 = (int) i[0];
                    int T1860 = (int) i[1];
                    int TR60 =(int) i[2];
                    barDataset.setValue( "Tuổi dưới 18" , new Integer( T18 ) );  
                    barDataset.setValue( "Tuổi 18-60" , new Integer( T1860 ) );   
                    barDataset.setValue( "Tuổi Trên 60" , new Integer( TR60 ) );
                    lblTuoi18.setText(String.valueOf(T18));
                    lblTuoi1860.setText(String.valueOf(T1860));
                    lblTuoiTren60.setText(String.valueOf(TR60));
                    lblTongNguoi.setText(String.valueOf(T18+T1860+TR60));
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Độ Tuổi Khám",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
        //changing pie chart blocks colors
        piePlot.setSectionPaint("Tuổi dưới 18", new Color(255,255,102));
        piePlot.setSectionPaint("Tuổi 18-60", new Color(102,255,102));
        piePlot.setSectionPaint("Tuổi Trên 60", new Color(255,102,153));
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        pnlTuoi.removeAll();
        pnlTuoi.add(barChartPanel, BorderLayout.CENTER);
        pnlTuoi.validate();
    }
    
    
    public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < cboNam.getItemCount(); i++) {
            int SumLoiNhuan=0;
            int nam = Integer.valueOf(String.valueOf(cboNam.getItemAt(i)));
            try {
                List<Object[]> list = dao.getThuoc(nam);
                for (Object[] u : list) {
                    int SL = (int) u[2];
                    Thuoc th= daoTH.selectByID((String) u[0]);
                    int LoiNhuan = (th.getGiaBan()-th.getGiaNhap())* SL;
                    SumLoiNhuan += LoiNhuan;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            dataset.setValue(SumLoiNhuan, "VND", cboNam.getItemAt(i));
            SumLoiNhuan=0;
            
        }
            
        JFreeChart chart = ChartFactory.createBarChart("Doanh Thu","Năm","VND", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        pnlBieuDoDoanhThu.removeAll();
        pnlBieuDoDoanhThu.add(barpChartPanel, BorderLayout.CENTER);
        pnlBieuDoDoanhThu.validate();
        
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
        pnlfrom = new javax.swing.JPanel();
        cboNam = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        pnlTuoi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTuoi18 = new javax.swing.JLabel();
        lblTuoi1860 = new javax.swing.JLabel();
        lblTuoiTren60 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTongNguoi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKeThuoc = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtTong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblBieuDo = new javax.swing.JLabel();
        pnlBieuDo = new javax.swing.JPanel();
        pnlBieuDoDoanhThu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblThongKeNam = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlfrom.setBackground(new java.awt.Color(89, 194, 246));
        pnlfrom.setOpaque(false);

        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 102))); // NOI18N

        pnlTuoi.setBackground(new java.awt.Color(255, 255, 255));
        pnlTuoi.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Tuổi Dưới 18");

        jLabel2.setText("Tuổi Từ 18-60");

        jLabel3.setText("Tuổi Trên 60");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        lblTuoi18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTuoi1860.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTuoiTren60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setText("Tổng số");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTuoi18, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(lblTuoiTren60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTuoi1860, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTongNguoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTuoi18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblTuoi1860, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(lblTuoiTren60, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblTongNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblThongKeThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Loại Thuốc", "Tên Thuốc", "Số Lượng", "Lợi Nhuận"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThongKeThuoc);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Năm");

        txtTong.setEditable(false);
        txtTong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTong.setForeground(new java.awt.Color(223, 12, 163));
        txtTong.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel5.setBackground(new java.awt.Color(255, 242, 16));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Tổng Lợi Nhuận Của năm ");

        lblBieuDo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBieuDo.setForeground(new java.awt.Color(0, 0, 255));
        lblBieuDo.setText("Biểu Đồ Thống kê>>");
        lblBieuDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBieuDoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlfromLayout = new javax.swing.GroupLayout(pnlfrom);
        pnlfrom.setLayout(pnlfromLayout);
        pnlfromLayout.setHorizontalGroup(
            pnlfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlfromLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(pnlfromLayout.createSequentialGroup()
                .addGroup(pnlfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlfromLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlfromLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlfromLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        pnlfromLayout.setVerticalGroup(
            pnlfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfromLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tabs.addTab("tab1", pnlfrom);

        pnlBieuDo.setBackground(new java.awt.Color(255, 255, 255));
        pnlBieuDo.setOpaque(false);

        pnlBieuDoDoanhThu.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Biều Đồ Thống Kê Doanh Thu Hằng Năm");

        lblThongKeNam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblThongKeNam.setForeground(new java.awt.Color(0, 0, 255));
        lblThongKeNam.setText("Thống Kê Năm>> ");
        lblThongKeNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThongKeNamMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlBieuDoLayout = new javax.swing.GroupLayout(pnlBieuDo);
        pnlBieuDo.setLayout(pnlBieuDoLayout);
        pnlBieuDoLayout.setHorizontalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBieuDoLayout.createSequentialGroup()
                .addGroup(pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBieuDoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlBieuDoDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)))
                    .addGroup(pnlBieuDoLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblThongKeNam)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pnlBieuDoLayout.setVerticalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBieuDoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBieuDoDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblThongKeNam)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tabs.addTab("tab2", pnlBieuDo);

        add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -38, 1030, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        showPieChart();
        fillTableSLThuoc();
    }//GEN-LAST:event_cboNamActionPerformed

    private void lblBieuDoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBieuDoMousePressed
        // TODO add your handling code here:
        tabs.setSelectedIndex(1);
        showBarChart();
    }//GEN-LAST:event_lblBieuDoMousePressed

    private void lblThongKeNamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeNamMousePressed
        // TODO add your handling code here:
        tabs.setSelectedIndex(0);
    }//GEN-LAST:event_lblThongKeNamMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBieuDo;
    private javax.swing.JLabel lblThongKeNam;
    private javax.swing.JLabel lblTongNguoi;
    private javax.swing.JLabel lblTuoi18;
    private javax.swing.JLabel lblTuoi1860;
    private javax.swing.JLabel lblTuoiTren60;
    private javax.swing.JPanel pnlBieuDo;
    private javax.swing.JPanel pnlBieuDoDoanhThu;
    private javax.swing.JPanel pnlTuoi;
    private javax.swing.JPanel pnlfrom;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblThongKeThuoc;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}
