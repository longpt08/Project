/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.DatVe_ctrl;
import Controller.SuatChieu_ctrl;
import java.awt.Color;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Phon
 */
public class DatVe extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public DatVe() {
        initComponents();
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
        this.setTitle("Đăng nhập");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//thoát chương trình khi bấm exit
        this.setVisible(true);//chạy chương trình
        panel_datve2.setVisible(true);
        HienThiNgayChieu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        panel_exit = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panel_dong = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panel_datve2 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        CBB_NgayChieu = new javax.swing.JComboBox<>();
        Lbl_NgayChieu = new javax.swing.JLabel();
        CBB_Phim = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        CBB_SuatChieu = new javax.swing.JComboBox<>();
        jPanel49 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        Lbl_TenPhim_Ve = new javax.swing.JLabel();
        Lbl_NgayChieu_Ve = new javax.swing.JLabel();
        Lbl_Gia_Ve = new javax.swing.JLabel();
        Lbl_GioChieu_Ve = new javax.swing.JLabel();
        Lbl_Rap_Ve = new javax.swing.JLabel();
        Lbl_Ghe_Ve = new javax.swing.JLabel();
        Lbl_Gia1_Ve1 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        E6 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        Btn_Huy = new javax.swing.JButton();
        Btn_DatVe = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Btn_ThanhToan = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        CBB_LoaiPhim = new javax.swing.JComboBox<>();
        Btn_XacNhan = new java.awt.Button();
        A2 = new javax.swing.JToggleButton();
        A1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));

        panel_exit.setBackground(new java.awt.Color(0, 153, 153));
        panel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_exitMouseExited(evt);
            }
        });
        panel_exit.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        panel_exit.add(jLabel8);
        jLabel8.setBounds(0, 10, 30, 20);

        panel_dong.setBackground(new java.awt.Color(0, 153, 153));
        panel_dong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_dongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_dongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_dongMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("_");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panel_dongLayout = new javax.swing.GroupLayout(panel_dong);
        panel_dong.setLayout(panel_dongLayout);
        panel_dongLayout.setHorizontalGroup(
            panel_dongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        panel_dongLayout.setVerticalGroup(
            panel_dongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dongLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(1025, Short.MAX_VALUE)
                .addComponent(panel_dong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_dong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_datve2.setBackground(new java.awt.Color(0, 102, 102));
        panel_datve2.setLayout(null);

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Phim:");
        panel_datve2.add(jLabel49);
        jLabel49.setBounds(50, 140, 40, 20);

        CBB_NgayChieu.setBackground(new java.awt.Color(0, 153, 153));
        CBB_NgayChieu.setForeground(new java.awt.Color(255, 255, 255));
        CBB_NgayChieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày chiếu" }));
        CBB_NgayChieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        CBB_NgayChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBB_NgayChieuActionPerformed(evt);
            }
        });
        panel_datve2.add(CBB_NgayChieu);
        CBB_NgayChieu.setBounds(90, 40, 330, 22);

        Lbl_NgayChieu.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_NgayChieu.setText("Ngày chiếu:");
        panel_datve2.add(Lbl_NgayChieu);
        Lbl_NgayChieu.setBounds(10, 40, 70, 16);

        CBB_Phim.setBackground(new java.awt.Color(0, 153, 153));
        CBB_Phim.setForeground(new java.awt.Color(255, 255, 255));
        CBB_Phim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phim" }));
        CBB_Phim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBB_PhimActionPerformed(evt);
            }
        });
        panel_datve2.add(CBB_Phim);
        CBB_Phim.setBounds(90, 140, 330, 22);

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Suất chiếu: ");
        panel_datve2.add(jLabel51);
        jLabel51.setBounds(20, 190, 70, 16);

        CBB_SuatChieu.setBackground(new java.awt.Color(0, 153, 153));
        CBB_SuatChieu.setForeground(new java.awt.Color(255, 255, 255));
        CBB_SuatChieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suất chiếu" }));
        CBB_SuatChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBB_SuatChieuActionPerformed(evt);
            }
        });
        panel_datve2.add(CBB_SuatChieu);
        CBB_SuatChieu.setBounds(90, 190, 330, 22);

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setLayout(null);

        jLabel52.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        jLabel52.setText("Universal Cinemas");
        jLabel52.setToolTipText("");
        jPanel49.add(jLabel52);
        jLabel52.setBounds(50, 10, 340, 40);

        Lbl_TenPhim_Ve.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Lbl_TenPhim_Ve.setText("Tên phim");
        jPanel49.add(Lbl_TenPhim_Ve);
        Lbl_TenPhim_Ve.setBounds(20, 140, 380, 40);

        Lbl_NgayChieu_Ve.setText("Ngày chiếu");
        jPanel49.add(Lbl_NgayChieu_Ve);
        Lbl_NgayChieu_Ve.setBounds(20, 66, 180, 20);

        Lbl_Gia_Ve.setText("0");
        jPanel49.add(Lbl_Gia_Ve);
        Lbl_Gia_Ve.setBounds(60, 260, 110, 20);

        Lbl_GioChieu_Ve.setText("Giờ chiếu");
        jPanel49.add(Lbl_GioChieu_Ve);
        Lbl_GioChieu_Ve.setBounds(20, 100, 180, 20);

        Lbl_Rap_Ve.setText("Rạp: ");
        jPanel49.add(Lbl_Rap_Ve);
        Lbl_Rap_Ve.setBounds(20, 210, 70, 20);

        Lbl_Ghe_Ve.setText("Ghế: ");
        jPanel49.add(Lbl_Ghe_Ve);
        Lbl_Ghe_Ve.setBounds(110, 210, 70, 20);

        Lbl_Gia1_Ve1.setText("Giá:");
        jPanel49.add(Lbl_Gia1_Ve1);
        Lbl_Gia1_Ve1.setBounds(20, 260, 30, 20);

        panel_datve2.add(jPanel49);
        jPanel49.setBounds(10, 260, 410, 340);

        jPanel50.setBackground(new java.awt.Color(0, 153, 153));
        jPanel50.setLayout(null);

        jPanel51.setBackground(new java.awt.Color(0, 153, 153));
        jPanel51.setLayout(null);
        jPanel50.add(jPanel51);
        jPanel51.setBounds(270, 430, 190, 20);

        panel_datve2.add(jPanel50);
        jPanel50.setBounds(450, 20, 10, 590);

        jPanel52.setBackground(new java.awt.Color(0, 153, 153));
        jPanel52.setLayout(null);

        jLabel53.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("MÀN HÌNH");
        jPanel52.add(jLabel53);
        jLabel53.setBounds(190, 0, 190, 40);

        panel_datve2.add(jPanel52);
        jPanel52.setBounds(490, 40, 570, 50);

        E6.setBackground(new java.awt.Color(0, 153, 153));
        E6.setText("E6");
        panel_datve2.add(E6);
        E6.setBounds(990, 420, 70, 50);

        C6.setBackground(new java.awt.Color(0, 153, 153));
        C6.setText("C6");
        panel_datve2.add(C6);
        C6.setBounds(990, 280, 70, 50);

        E2.setBackground(new java.awt.Color(0, 153, 153));
        E2.setText("E2");
        panel_datve2.add(E2);
        E2.setBounds(570, 420, 70, 50);

        E3.setBackground(new java.awt.Color(0, 153, 153));
        E3.setText("E3");
        panel_datve2.add(E3);
        E3.setBounds(650, 420, 70, 50);

        E4.setBackground(new java.awt.Color(0, 153, 153));
        E4.setText("E4");
        panel_datve2.add(E4);
        E4.setBounds(830, 420, 70, 50);

        E5.setBackground(new java.awt.Color(0, 153, 153));
        E5.setText("E5");
        panel_datve2.add(E5);
        E5.setBounds(910, 420, 70, 50);

        E1.setBackground(new java.awt.Color(0, 153, 153));
        E1.setText("E1");
        panel_datve2.add(E1);
        E1.setBounds(490, 420, 70, 50);

        A3.setBackground(new java.awt.Color(0, 153, 153));
        A3.setText("A3");
        panel_datve2.add(A3);
        A3.setBounds(650, 140, 70, 50);

        A4.setBackground(new java.awt.Color(0, 153, 153));
        A4.setText("A4");
        panel_datve2.add(A4);
        A4.setBounds(830, 140, 70, 50);

        A5.setBackground(new java.awt.Color(0, 153, 153));
        A5.setText("A5");
        panel_datve2.add(A5);
        A5.setBounds(910, 140, 70, 50);

        A6.setBackground(new java.awt.Color(0, 153, 153));
        A6.setText("A6");
        panel_datve2.add(A6);
        A6.setBounds(990, 140, 70, 50);

        B6.setBackground(new java.awt.Color(0, 153, 153));
        B6.setText("B6");
        panel_datve2.add(B6);
        B6.setBounds(990, 210, 70, 50);

        B5.setBackground(new java.awt.Color(0, 153, 153));
        B5.setText("B5");
        panel_datve2.add(B5);
        B5.setBounds(910, 210, 70, 50);

        B4.setBackground(new java.awt.Color(0, 153, 153));
        B4.setText("B4");
        panel_datve2.add(B4);
        B4.setBounds(830, 210, 70, 50);

        B3.setBackground(new java.awt.Color(0, 153, 153));
        B3.setText("B3");
        panel_datve2.add(B3);
        B3.setBounds(650, 210, 70, 50);

        B2.setBackground(new java.awt.Color(0, 153, 153));
        B2.setText("B2");
        panel_datve2.add(B2);
        B2.setBounds(570, 210, 70, 50);

        B1.setBackground(new java.awt.Color(0, 153, 153));
        B1.setText("B1");
        panel_datve2.add(B1);
        B1.setBounds(490, 210, 70, 50);

        D6.setBackground(new java.awt.Color(0, 153, 153));
        D6.setText("D6");
        panel_datve2.add(D6);
        D6.setBounds(990, 350, 70, 50);

        C2.setBackground(new java.awt.Color(0, 153, 153));
        C2.setText("C2");
        panel_datve2.add(C2);
        C2.setBounds(570, 280, 70, 50);

        C3.setBackground(new java.awt.Color(0, 153, 153));
        C3.setText("C3");
        panel_datve2.add(C3);
        C3.setBounds(650, 280, 70, 50);

        C4.setBackground(new java.awt.Color(0, 153, 153));
        C4.setText("C4");
        panel_datve2.add(C4);
        C4.setBounds(830, 280, 70, 50);

        C5.setBackground(new java.awt.Color(0, 153, 153));
        C5.setText("C5");
        panel_datve2.add(C5);
        C5.setBounds(910, 280, 70, 50);

        C1.setBackground(new java.awt.Color(0, 153, 153));
        C1.setText("C1");
        panel_datve2.add(C1);
        C1.setBounds(490, 280, 70, 50);

        D1.setBackground(new java.awt.Color(0, 153, 153));
        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        panel_datve2.add(D1);
        D1.setBounds(490, 350, 70, 50);

        D2.setBackground(new java.awt.Color(0, 153, 153));
        D2.setText("D2");
        panel_datve2.add(D2);
        D2.setBounds(570, 350, 70, 50);

        D3.setBackground(new java.awt.Color(0, 153, 153));
        D3.setText("D3");
        panel_datve2.add(D3);
        D3.setBounds(650, 350, 70, 50);

        D4.setBackground(new java.awt.Color(0, 153, 153));
        D4.setText("D4");
        panel_datve2.add(D4);
        D4.setBounds(830, 350, 70, 50);

        D5.setBackground(new java.awt.Color(0, 153, 153));
        D5.setText("D5");
        panel_datve2.add(D5);
        D5.setBounds(910, 350, 70, 50);

        Btn_Huy.setBackground(new java.awt.Color(102, 102, 0));
        Btn_Huy.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Huy.setText("Huỷ");
        panel_datve2.add(Btn_Huy);
        Btn_Huy.setBounds(950, 560, 110, 40);

        Btn_DatVe.setBackground(new java.awt.Color(102, 102, 0));
        Btn_DatVe.setForeground(new java.awt.Color(255, 255, 255));
        Btn_DatVe.setText("Đặt vé");
        Btn_DatVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DatVeActionPerformed(evt);
            }
        });
        panel_datve2.add(Btn_DatVe);
        Btn_DatVe.setBounds(680, 560, 110, 40);

        jPanel53.setBackground(new java.awt.Color(0, 153, 153));
        jPanel53.setLayout(null);
        panel_datve2.add(jPanel53);
        jPanel53.setBounds(460, 480, 620, 10);

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Tổng tiền :");
        panel_datve2.add(jLabel54);
        jLabel54.setBounds(470, 500, 100, 30);

        jPanel54.setBackground(new java.awt.Color(184, 207, 229));
        jPanel54.setLayout(null);
        panel_datve2.add(jPanel54);
        jPanel54.setBounds(830, 510, 20, 20);

        jPanel55.setBackground(new java.awt.Color(0, 153, 153));
        jPanel55.setLayout(null);
        panel_datve2.add(jPanel55);
        jPanel55.setBounds(970, 510, 20, 20);

        jPanel56.setBackground(new java.awt.Color(255, 51, 51));
        jPanel56.setLayout(null);
        panel_datve2.add(jPanel56);
        jPanel56.setBounds(700, 510, 20, 20);

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Ghế đã đặt");
        panel_datve2.add(jLabel55);
        jLabel55.setBounds(730, 510, 70, 16);

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Ghế trống");
        panel_datve2.add(jLabel56);
        jLabel56.setBounds(1000, 510, 80, 16);

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Ghế đã chọn");
        panel_datve2.add(jLabel57);
        jLabel57.setBounds(860, 510, 80, 16);

        Btn_ThanhToan.setBackground(new java.awt.Color(102, 102, 0));
        Btn_ThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ThanhToan.setText("Thanh Toán");
        Btn_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ThanhToanActionPerformed(evt);
            }
        });
        panel_datve2.add(Btn_ThanhToan);
        Btn_ThanhToan.setBounds(820, 560, 110, 40);

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Loại phim:");
        panel_datve2.add(jLabel58);
        jLabel58.setBounds(20, 90, 70, 16);

        CBB_LoaiPhim.setBackground(new java.awt.Color(0, 153, 153));
        CBB_LoaiPhim.setForeground(new java.awt.Color(255, 255, 255));
        CBB_LoaiPhim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại Phim" }));
        CBB_LoaiPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBB_LoaiPhimActionPerformed(evt);
            }
        });
        panel_datve2.add(CBB_LoaiPhim);
        CBB_LoaiPhim.setBounds(90, 90, 330, 22);

        Btn_XacNhan.setLabel("Xác Nhận");
        Btn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_XacNhanActionPerformed(evt);
            }
        });
        panel_datve2.add(Btn_XacNhan);
        Btn_XacNhan.setBounds(280, 230, 140, 24);

        A2.setBackground(new Color(0,153,153));
        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        panel_datve2.add(A2);
        A2.setBounds(570, 140, 70, 50);

        A1.setBackground(new Color(0,153,153));
        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        panel_datve2.add(A1);
        A1.setBounds(490, 140, 70, 50);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_datve2, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 635, Short.MAX_VALUE)))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(panel_datve2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_dongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseClicked
        this.setState(ThemTV.ICONIFIED);//đóng
    }//GEN-LAST:event_panel_dongMouseClicked

    private void panel_dongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseEntered
        panel_dong.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_dongMouseEntered

    private void panel_dongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseExited
        panel_dong.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_panel_dongMouseExited

    private void panel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseClicked
        this.dispose(); //tắt tab
    }//GEN-LAST:event_panel_exitMouseClicked

    private void panel_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseEntered
        panel_exit.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_exitMouseEntered

    private void panel_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseExited
        panel_exit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_panel_exitMouseExited

    private void Btn_DatVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DatVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DatVeActionPerformed

    private void Btn_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ThanhToanActionPerformed

    private void CBB_LoaiPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBB_LoaiPhimActionPerformed
        HienThiPhim();
    }//GEN-LAST:event_CBB_LoaiPhimActionPerformed

    private void Btn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_XacNhanActionPerformed
        DoiMauGheDaDat(A2);
        DoiMauGheDaDat(A2);
//        DoiMauGheDaDat(A3);
//        DoiMauGheDaDat(A4);
//        DoiMauGheDaDat(A5);
//        DoiMauGheDaDat(A6);
//        DoiMauGheDaDat(B1);
//        DoiMauGheDaDat(B2);
//        DoiMauGheDaDat(B3);
//        DoiMauGheDaDat(B4);
//        DoiMauGheDaDat(B5);
//        DoiMauGheDaDat(B6);
//        DoiMauGheDaDat(C1);
//        DoiMauGheDaDat(C2);
//        DoiMauGheDaDat(C3);
//        DoiMauGheDaDat(C4);
//        DoiMauGheDaDat(C5);
//        DoiMauGheDaDat(C6);
//        DoiMauGheDaDat(D1);
//        DoiMauGheDaDat(D2);
//        DoiMauGheDaDat(D3);
//        DoiMauGheDaDat(D4);
//        DoiMauGheDaDat(D5);
//        DoiMauGheDaDat(D6);
//        DoiMauGheDaDat(E1);
//        DoiMauGheDaDat(E2);
//        DoiMauGheDaDat(E3);
//        DoiMauGheDaDat(E4);
//        DoiMauGheDaDat(E5);
//        DoiMauGheDaDat(E6); 
    }//GEN-LAST:event_Btn_XacNhanActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none

    }//GEN-LAST:event_none

    private void CBB_NgayChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBB_NgayChieuActionPerformed
        HienThiLoaiPhim();
        Lbl_NgayChieu_Ve.setText(CBB_NgayChieu.getSelectedItem().toString());
    }//GEN-LAST:event_CBB_NgayChieuActionPerformed

    private void CBB_PhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBB_PhimActionPerformed
        HienThoiGianChieu();
        Lbl_TenPhim_Ve.setText(CBB_Phim.getSelectedItem().toString());
    }//GEN-LAST:event_CBB_PhimActionPerformed

    private void CBB_SuatChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBB_SuatChieuActionPerformed
        Lbl_GioChieu_Ve.setText(CBB_SuatChieu.getSelectedItem().toString());
        SuatChieu_ctrl scc = new SuatChieu_ctrl();
        String ThoiGianChieu = CBB_SuatChieu.getSelectedItem().toString();
        String NgayChieu = CBB_NgayChieu.getSelectedItem().toString();
        String Rap = scc.RapDaChon(NgayChieu, ThoiGianChieu);
        Lbl_Rap_Ve.setText(Rap);
    }//GEN-LAST:event_CBB_SuatChieuActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        ChonGhe(A2);
    }//GEN-LAST:event_A2ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        ChonGhe(A1);
    }//GEN-LAST:event_A1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        DatVe datVe = new DatVe();
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton Btn_DatVe;
    private javax.swing.JButton Btn_Huy;
    private javax.swing.JButton Btn_ThanhToan;
    private java.awt.Button Btn_XacNhan;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JComboBox<String> CBB_LoaiPhim;
    private javax.swing.JComboBox<String> CBB_NgayChieu;
    private javax.swing.JComboBox<String> CBB_Phim;
    private javax.swing.JComboBox<String> CBB_SuatChieu;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JLabel Lbl_Ghe_Ve;
    private javax.swing.JLabel Lbl_Gia1_Ve1;
    private javax.swing.JLabel Lbl_Gia_Ve;
    private javax.swing.JLabel Lbl_GioChieu_Ve;
    private javax.swing.JLabel Lbl_NgayChieu;
    private javax.swing.JLabel Lbl_NgayChieu_Ve;
    private javax.swing.JLabel Lbl_Rap_Ve;
    private javax.swing.JLabel Lbl_TenPhim_Ve;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel panel_datve2;
    private javax.swing.JPanel panel_dong;
    private javax.swing.JPanel panel_exit;
    // End of variables declaration//GEN-END:variables

    private void HienThiNgayChieu() {
        SuatChieu_ctrl scc = new SuatChieu_ctrl();
        Vector<String> ListNgayChieu = new Vector<String>();
        ListNgayChieu = scc.ListNgayChieu();
        CBB_NgayChieu.setModel(new DefaultComboBoxModel<String>(ListNgayChieu.toArray(new String[ListNgayChieu.size()])));
    }
    private void HienThiLoaiPhim(){
        String NgayChieu = CBB_NgayChieu.getSelectedItem().toString();
        SuatChieu_ctrl scc = new SuatChieu_ctrl();
        Vector<String> ListLoaiPhim = new Vector<String>();
        ListLoaiPhim= scc.ListLoaiPhim(NgayChieu);
        CBB_LoaiPhim.setModel(new DefaultComboBoxModel<String>(ListLoaiPhim.toArray(new String[ListLoaiPhim.size()])));
    }
        private void HienThiPhim(){
        String NgayChieu = CBB_NgayChieu.getSelectedItem().toString();
        String LoaiPhim = CBB_LoaiPhim.getSelectedItem().toString();
        SuatChieu_ctrl scc = new SuatChieu_ctrl();
        Vector<String> ListPhim = new Vector<String>();
        ListPhim= scc.ListPhim(NgayChieu,LoaiPhim);
        CBB_Phim.setModel(new DefaultComboBoxModel<String>(ListPhim.toArray(new String[ListPhim.size()])));
    }
        private void HienThoiGianChieu(){
        String NgayChieu = CBB_NgayChieu.getSelectedItem().toString();
        String LoaiPhim = CBB_LoaiPhim.getSelectedItem().toString();
        String TenPhim = CBB_Phim.getSelectedItem().toString();
        SuatChieu_ctrl scc = new SuatChieu_ctrl();
        Vector<String> ListThoiGianChieu = new Vector<String>();
        ListThoiGianChieu= scc.ListThoiGianChieu(NgayChieu,LoaiPhim,TenPhim);
        CBB_SuatChieu.setModel(new DefaultComboBoxModel<String>(ListThoiGianChieu.toArray(new String[ListThoiGianChieu.size()])));
    }
    private void DoiMauGheDaDat(javax.swing.JToggleButton a){
        String ViTri = a.getText();
        String NgayChieu = CBB_NgayChieu.getSelectedItem().toString();
        String LoaiPhim = CBB_LoaiPhim.getSelectedItem().toString();
        String TenPhim = CBB_Phim.getSelectedItem().toString();
        String ThoiGianChieu = CBB_SuatChieu.getSelectedItem().toString();
        DatVe_ctrl dvc = new DatVe_ctrl();
        SuatChieu_ctrl scc = new SuatChieu_ctrl();
        String MaSuatChieu = scc.SuatChieuDaChon(NgayChieu,ThoiGianChieu);
        boolean tmp = dvc.GheDaDat(ViTri, MaSuatChieu);
        if (tmp) {
            a.setBackground(new Color(255,51,51));
        }
    }
    private void ChonGhe(javax.swing.JToggleButton a){
        if (a.isSelected()) {
            a.setForeground(new Color(51,102,0));
            String tmp = Lbl_Ghe_Ve.getText()+ a.getText()+" ";
            Lbl_Ghe_Ve.setText(tmp);
            long gia = Long.parseLong(Lbl_Gia_Ve.getText())+40000;
            Lbl_Gia_Ve.setText(""+gia);
        }
        else{
            String tmp = Lbl_Ghe_Ve.getText().replace(a.getText()+" ","");
            Lbl_Ghe_Ve.setText(tmp);
            long gia = Long.parseLong(Lbl_Gia_Ve.getText())-40000;
            Lbl_Gia_Ve.setText(""+gia);
        }
    }
}
