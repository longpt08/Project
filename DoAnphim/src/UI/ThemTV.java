/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static DAO.DAO.getConnection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.ThanhVien;

/**
 *
 * @author Phon
 */
public class ThemTV extends javax.swing.JFrame {

    private String gioiTinh;

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public ThemTV() {
        initComponents();
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
        this.setTitle("Quanly");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);//chạy chương trình
        //tạo button group giới tính
        ButtonGroup bt = new ButtonGroup();
        bt.add(jradio_nu);
        bt.add(jradio_nam);

        text_diachi.setWrapStyleWord(true);//tách từ có nghĩa nếu xuống dòng
        text_diachi.setLineWrap(true);//căn xuống dòng
        
        //random id cho matv
         Random ran = new Random();
         int n = ran.nextInt(202000)+1;
         String val = String.valueOf(n);
         txt_matv.setText(val+"tv");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_matv = new javax.swing.JTextField();
        txt_diem = new javax.swing.JTextField();
        jradio_nam = new javax.swing.JRadioButton();
        jradio_nu = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_diachi = new javax.swing.JTextArea();
        txt_tentv = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_cmnd = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        panel_exit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel_dong = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jDate_ngaysinh = new com.toedter.calendar.JDateChooser();
        jDate_ngaydangky = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(244, 249, 248));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm Thành viên mới");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 40, 500, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Mã thành viên: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 110, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tên thành viên: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 110, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Giới tính: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 190, 70, 16);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Điểm tích luỹ: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 510, 100, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Địa chỉ:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 310, 60, 20);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("SDT:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 380, 40, 20);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("CMND: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 430, 60, 19);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Ngày đăng ký: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 470, 110, 20);

        txt_matv.setEditable(false);
        jPanel1.add(txt_matv);
        txt_matv.setBounds(140, 90, 290, 30);

        txt_diem.setText("0");
        txt_diem.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_diem.setDoubleBuffered(true);
        txt_diem.setDragEnabled(true);
        txt_diem.setEnabled(false);
        jPanel1.add(txt_diem);
        txt_diem.setBounds(140, 510, 290, 30);

        jradio_nam.setBackground(new java.awt.Color(244, 249, 248));
        jradio_nam.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jradio_nam.setText("Nam");
        jradio_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio_namActionPerformed(evt);
            }
        });
        jPanel1.add(jradio_nam);
        jradio_nam.setBounds(160, 190, 60, 24);

        jradio_nu.setBackground(new java.awt.Color(244, 249, 248));
        jradio_nu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jradio_nu.setText("Nữ");
        jradio_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio_nuActionPerformed(evt);
            }
        });
        jPanel1.add(jradio_nu);
        jradio_nu.setBounds(260, 190, 50, 27);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Ngày sinh: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 240, 78, 19);

        text_diachi.setColumns(20);
        text_diachi.setRows(5);
        jScrollPane1.setViewportView(text_diachi);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 300, 300, 50);
        jPanel1.add(txt_tentv);
        txt_tentv.setBounds(140, 140, 290, 30);
        jPanel1.add(txt_sdt);
        txt_sdt.setBounds(140, 380, 290, 30);
        jPanel1.add(txt_cmnd);
        txt_cmnd.setBounds(140, 430, 290, 30);

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Nhập lại");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(410, 550, 80, 30);

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Thêm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(300, 550, 80, 30);

        panel_exit.setBackground(new java.awt.Color(244, 249, 248));
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

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        panel_exit.add(jLabel7);
        jLabel7.setBounds(0, 10, 30, 20);

        jPanel1.add(panel_exit);
        panel_exit.setBounds(490, 0, 30, 30);

        panel_dong.setBackground(new java.awt.Color(244, 249, 248));
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
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(panel_dong);
        panel_dong.setBounds(460, 0, 30, 30);

        jDate_ngaysinh.setBackground(new java.awt.Color(0, 153, 153));
        jDate_ngaysinh.setDateFormatString("dd-MM-yyyy");
        jDate_ngaysinh.setMaxSelectableDate(new java.util.Date(253370743279000L));
        jDate_ngaysinh.setMinSelectableDate(new java.util.Date(-62135791121000L));
        jPanel1.add(jDate_ngaysinh);
        jDate_ngaysinh.setBounds(140, 240, 290, 30);

        jDate_ngaydangky.setBackground(new java.awt.Color(0, 153, 153));
        jDate_ngaydangky.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDate_ngaydangky);
        jDate_ngaydangky.setBounds(140, 469, 290, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txt_matv.setText("");
        jDate_ngaydangky.setDate(null);
        jDate_ngaysinh.setDate(null);
        txt_sdt.setText("");
        txt_tentv.setText("");
        text_diachi.setText("");
        txt_cmnd.setText("");


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try {
            ThanhVien tv = new ThanhVien();
           
           
            tv.setMatv(txt_matv.getText());
            tv.setTentv(txt_tentv.getText());
            tv.setGioitinh(gioiTinh);
            tv.setDiachi(text_diachi.getText());
            tv.setCmnd(txt_cmnd.getText());
            tv.setSdt(txt_sdt.getText());
            tv.setDiemtichluy(0);
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try {
//                Calendar c = jDate_ngaysinh.getCalendar();
//                Calendar dk = jDate_ngaydangky.getCalendar();
//                String ngdk = dk.getTime().getDate()+"-"+dk.getTime().getMonth()+"-"+dk.getTime().getYear();
//                
//                String ngsinh = c.getTime().getDate()+"-"+c.getTime().getMonth()+"-"+c.getTime().getYear();
                //ngsinh co dang(dd-mm-yyyy)
                //insert: to_date(ngsinh,'dd-mm-yyyy')
                String ngsinh = sdf.format(jDate_ngaysinh.getDate());
                tv.setNgaysinh(ngsinh);
                String ngdk = sdf.format(jDate_ngaydangky.getDate());
                tv.setNgaydk(ngdk);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi ngày tháng năm");
                e.printStackTrace();
            }

            if (new ThemTV().addThanhVien(tv)) {
                JOptionPane.showMessageDialog(null, "Thêm Thành viên thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }//GEN-LAST:event_jButton8ActionPerformed
 
    private void jradio_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio_nuActionPerformed
        setGioiTinh("Nu");
    }//GEN-LAST:event_jradio_nuActionPerformed

    private void jradio_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio_namActionPerformed
        setGioiTinh("Nam");
    }//GEN-LAST:event_jradio_namActionPerformed

    private void panel_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseEntered
        panel_exit.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_exitMouseEntered

    private void panel_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseExited
        panel_exit.setBackground(new Color(244, 249, 248));
    }//GEN-LAST:event_panel_exitMouseExited

    private void panel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseClicked
        this.dispose(); //tắt tab
    }//GEN-LAST:event_panel_exitMouseClicked

    private void panel_dongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseClicked
        this.setState(ThemTV.ICONIFIED);//đóng
    }//GEN-LAST:event_panel_dongMouseClicked

    private void panel_dongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseEntered
        panel_dong.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_dongMouseEntered

    private void panel_dongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseExited
        panel_dong.setBackground(new Color(244, 249, 248));
    }//GEN-LAST:event_panel_dongMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        ThemTV themTV = new ThemTV();
    }
    public boolean addThanhVien(ThanhVien t){
//        String  ngay = ""
        String query = "INSERT INTO THANHVIEN VALUES(?,?,?,to_date(?,'dd-mm-yyyy'),?,?,?,to_date(?,'dd-mm-yyyy'),?)";
        //String q = "insert into thanhvien(hoten,masv,ngsinh) values(?,?,to_date(....))
        try {
            PreparedStatement pt = getConnection().prepareStatement(query);
            pt.setString(1,t.getMatv());
            
            pt.setString(2,t.getTentv());
            pt.setString(3,t.getGioitinh());
            pt.setString(4,  t.getNgaysinh());
            pt.setString(5,t.getDiachi());
            pt.setString(6,t.getSdt());
            pt.setString(7,t.getCmnd());
            pt.setString(8,  t.getNgaydk());
            pt.setInt(9, t.getDiemtichluy());
            
            return pt.executeUpdate() >0;
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally{try {
                getConnection().close();
            } catch (Exception e) {
            }}
        return false;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDate_ngaydangky;
    private com.toedter.calendar.JDateChooser jDate_ngaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jradio_nam;
    private javax.swing.JRadioButton jradio_nu;
    private javax.swing.JPanel panel_dong;
    private javax.swing.JPanel panel_exit;
    private javax.swing.JTextArea text_diachi;
    private javax.swing.JTextField txt_cmnd;
    private javax.swing.JTextField txt_diem;
    private javax.swing.JTextField txt_matv;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tentv;
    // End of variables declaration//GEN-END:variables
}
