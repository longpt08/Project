/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.Oracle;
import static Controller.Oracle.getConnection;
import java.awt.Color;
import java.sql.Statement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ThanhVien;

/**
 *
 * @author Phon
 */
public class TraCuuTV extends javax.swing.JFrame {

    private static void setModel(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    
    /**
     * Creates new form QLThanhVien
     */
    public TraCuuTV() {
        initComponents();
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//thoát chương trình khi bấm exit
        this.setVisible(true);//chạy chương trình
       //set màu cho table
        JTableHeader table = table_thanhvien.getTableHeader();
        table.setBackground(new Color(0,153,153));
        table.setForeground(Color.black);
        showThanhVien();
       
    }
    public ArrayList<ThanhVien> getAllMember(){
        ArrayList<ThanhVien> memberList = new ArrayList<>();
        String sql = "SELECT * FROM THANHVIEN";
        try {
            PreparedStatement pt = getConnection().prepareStatement(sql);
            ResultSet rss = pt.executeQuery();
            
            while(rss.next()){
               
                String mtv = rss.getString(1);
                
                String tentv = rss.getString(2);
                String gt = rss.getString(3);
                String ngsinh = rss.getString(4);
                String dchi = rss.getString(5);
                String dth = rss.getString(6);
                String cm = rss.getString(7);
                String ngdk = rss.getString(8);
                int dtl = rss.getInt(9);
              
               
               
              
               
                
                
                memberList.add(new ThanhVien(mtv, tentv, gt, dchi, dth, cm, ngsinh, ngdk, dtl));
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{try {
                getConnection().close();
            } catch (Exception e) {
            }}
        return memberList;
        
        
    }
    public void showThanhVien(){
        
        ArrayList<ThanhVien> list = getAllMember();
        DefaultTableModel model = (DefaultTableModel) table_thanhvien.getModel();
        Object[] row = new Object[9];
        for(int i=0;i< list.size();i++){
            row[0]=list.get(i).getMatv();
            
            row[1]=list.get(i).getTentv();
            row[2]=list.get(i).getGioitinh();
            row[3]=list.get(i).getNgaysinh();
            row[4]=list.get(i).getDiachi();
            row[5]=list.get(i).getSdt();
            row[6]=list.get(i).getCmnd();
            row[7]=list.get(i).getNgaydk();
            row[8]=list.get(i).getDiemtichluy();
            model.addRow(row);
            
            
        }
        
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
        txt_tracuu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_thanhvien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        panel_exit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel_dong = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_diem1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_matv1 = new javax.swing.JTextField();
        txt_tentv2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_ngaysinh1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_diachi1 = new javax.swing.JTextArea();
        txt_gioitinh1 = new javax.swing.JTextField();
        txt_ngaydangky1 = new com.toedter.calendar.JDateChooser();
        txt_sdt1 = new javax.swing.JTextField();
        txt_cmnd1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        button_tracuu1 = new javax.swing.JButton();
        button_tracuu2 = new javax.swing.JButton();
        butt_capnhat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(244, 249, 248));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Thông Tin Thành Viên");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(340, 10, 410, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 30, 1120, 60);

        txt_tracuu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_tracuu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_tracuu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_tracuuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tracuuFocusLost(evt);
            }
        });
        txt_tracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tracuuActionPerformed(evt);
            }
        });
        txt_tracuu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tracuuKeyReleased(evt);
            }
        });
        jPanel1.add(txt_tracuu);
        txt_tracuu.setBounds(440, 100, 430, 30);

        table_thanhvien.setForeground(new java.awt.Color(0, 0, 0));
        table_thanhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaTV", "Tên", "Giới tính", "Ngày sinh", "Địa chỉ", "SDT", "CMND", "Ngày ĐK", "Điểm "
            }
        ));
        table_thanhvien.setOpaque(false);
        table_thanhvien.setSelectionBackground(new java.awt.Color(0, 204, 204));
        table_thanhvien.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_thanhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_thanhvienMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table_thanhvienMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_thanhvien);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(440, 150, 670, 530);

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Nhập các thông tin tra cứu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 100, 240, 20);

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
        panel_exit.setBounds(1090, 0, 30, 30);

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
        panel_dong.setBounds(1060, 0, 30, 30);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin thành viên");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 150, 450, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Mã thành viên: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 180, 110, 30);
        jPanel1.add(txt_diem1);
        txt_diem1.setBounds(130, 600, 290, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Tên thành viên: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 230, 110, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Giới tính: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 280, 70, 16);

        txt_matv1.setEditable(false);
        txt_matv1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_matv1);
        txt_matv1.setBounds(130, 180, 290, 30);
        jPanel1.add(txt_tentv2);
        txt_tentv2.setBounds(130, 230, 290, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Ngày sinh: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 330, 78, 19);

        txt_ngaysinh1.setDateFormatString("dd-MM-yyyy");
        txt_ngaysinh1.setMaxSelectableDate(new java.util.Date(253370743279000L));
        txt_ngaysinh1.setMinSelectableDate(new java.util.Date(-62135791121000L));
        jPanel1.add(txt_ngaysinh1);
        txt_ngaysinh1.setBounds(130, 330, 290, 30);

        txt_diachi1.setColumns(20);
        txt_diachi1.setRows(5);
        jScrollPane1.setViewportView(txt_diachi1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 380, 300, 50);
        jPanel1.add(txt_gioitinh1);
        txt_gioitinh1.setBounds(130, 280, 290, 30);

        txt_ngaydangky1.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(txt_ngaydangky1);
        txt_ngaydangky1.setBounds(130, 550, 290, 30);
        jPanel1.add(txt_sdt1);
        txt_sdt1.setBounds(130, 450, 290, 30);
        jPanel1.add(txt_cmnd1);
        txt_cmnd1.setBounds(130, 500, 290, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Địa chỉ:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 380, 60, 20);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("SDT:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 450, 40, 20);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("CMND: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 500, 60, 19);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Ngày đăng ký: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 550, 110, 20);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Điểm tích luỹ: ");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 600, 100, 30);

        button_tracuu1.setBackground(new java.awt.Color(0, 153, 153));
        button_tracuu1.setForeground(new java.awt.Color(255, 255, 255));
        button_tracuu1.setText("Huỷ");
        button_tracuu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_tracuu1MouseClicked(evt);
            }
        });
        button_tracuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tracuu1ActionPerformed(evt);
            }
        });
        jPanel1.add(button_tracuu1);
        button_tracuu1.setBounds(350, 640, 80, 30);

        button_tracuu2.setBackground(new java.awt.Color(0, 153, 153));
        button_tracuu2.setForeground(new java.awt.Color(255, 255, 255));
        button_tracuu2.setText("Xoá");
        button_tracuu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tracuu2ActionPerformed(evt);
            }
        });
        jPanel1.add(button_tracuu2);
        button_tracuu2.setBounds(90, 640, 80, 30);

        butt_capnhat.setBackground(new java.awt.Color(0, 153, 153));
        butt_capnhat.setForeground(new java.awt.Color(255, 255, 255));
        butt_capnhat.setText("Cập nhật");
        butt_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_capnhatActionPerformed(evt);
            }
        });
        jPanel1.add(butt_capnhat);
        butt_capnhat.setBounds(210, 640, 90, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tải lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(970, 100, 67, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tracuuActionPerformed
       
    }//GEN-LAST:event_txt_tracuuActionPerformed

    private void txt_tracuuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tracuuFocusGained
          
    }//GEN-LAST:event_txt_tracuuFocusGained

    private void txt_tracuuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tracuuFocusLost
         
    }//GEN-LAST:event_txt_tracuuFocusLost

    private void panel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseClicked
        this.dispose(); //tắt tab
    }//GEN-LAST:event_panel_exitMouseClicked

    private void panel_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseEntered
        panel_exit.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_exitMouseEntered

    private void panel_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseExited
        panel_exit.setBackground(new Color(244,249,248));
    }//GEN-LAST:event_panel_exitMouseExited

    private void panel_dongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseClicked
        this.setState(ThemTV.ICONIFIED);//đóng
    }//GEN-LAST:event_panel_dongMouseClicked

    private void panel_dongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseEntered
        panel_dong.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_dongMouseEntered

    private void panel_dongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseExited
        panel_dong.setBackground(new Color(244,249,248));
    }//GEN-LAST:event_panel_dongMouseExited

    private void txt_tracuuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tracuuKeyReleased
        DefaultTableModel table = (DefaultTableModel)table_thanhvien.getModel();
        String search = txt_tracuu.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        table_thanhvien.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
       
    }//GEN-LAST:event_txt_tracuuKeyReleased

    private void table_thanhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_thanhvienMouseClicked
       
       
        int i = table_thanhvien.getSelectedRow();
        TableModel model = table_thanhvien.getModel();
        txt_matv1.setText(model.getValueAt(i, 0).toString());
        txt_tentv2.setText(model.getValueAt(i, 1).toString());
        txt_gioitinh1.setText(model.getValueAt(i, 2).toString());
        txt_diachi1.setText(model.getValueAt(i, 4).toString());
        txt_sdt1.setText(model.getValueAt(i, 5).toString());
        txt_cmnd1.setText(model.getValueAt(i, 6).toString());
//     
         txt_diem1.setText(model.getValueAt(i,8).toString());
          try {
              //chuyển từ string qua date và gán vào jdate
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         String ngsinh = model.getValueAt(i, 3).toString();
         String ngdk = model.getValueAt(i, 7).toString();
         txt_ngaysinh1.setDate(sdf.parse(ngsinh));
         txt_ngaydangky1.setDate(sdf.parse(ngdk));
         
        } catch (Exception e) {
            e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Lỗi");
        }
        
    }//GEN-LAST:event_table_thanhvienMouseClicked

    private void button_tracuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tracuu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_tracuu1ActionPerformed

    private void button_tracuu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tracuu2ActionPerformed
         int xacnhanxoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá thành viên này không?", "Xác nhận cậpt nhật",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(xacnhanxoa == JOptionPane.YES_OPTION)
        {
           
        try {
        String sql = "DELETE FROM THANHVIEN WHERE MATV =?";
          try {
            PreparedStatement pre = getConnection().prepareStatement(sql);
            pre.setString(1, txt_matv1.getText());
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xoá Thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xoá không thành công !");
        }
        }catch(Exception e){
            e.printStackTrace();
        }}
    }//GEN-LAST:event_button_tracuu2ActionPerformed

    private void butt_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_capnhatActionPerformed
        
        int xacnhan = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thành viên này không?", "Xác nhận cậpt nhật",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(xacnhan == JOptionPane.YES_OPTION)
        {
           
        try {
            ThanhVien tv = new ThanhVien();
           
           
            tv.setMatv(txt_matv1.getText());
            tv.setTentv(txt_tentv2.getText());
            tv.setGioitinh(txt_gioitinh1.getText());
            tv.setDiachi(txt_diachi1.getText());
            tv.setCmnd(txt_cmnd1.getText());
            tv.setSdt(txt_sdt1.getText());
            tv.setDiemtichluy(Integer.parseInt(txt_diem1.getText()));
         
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String ngsinh = sdf.format(txt_ngaysinh1.getDate());
                tv.setNgaysinh(ngsinh);
                String ngdk = sdf.format(txt_ngaydangky1.getDate());
                tv.setNgaydk(ngdk);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi ngày tháng năm");
                e.printStackTrace();
            }

            if (new TraCuuTV().UpdateTV(tv)) {
                JOptionPane.showMessageDialog(null, "Cập nhật Thành viên thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
           
        }
        
     
         
    }//GEN-LAST:event_butt_capnhatActionPerformed

    private void button_tracuu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_tracuu1MouseClicked
        txt_cmnd1.setText("");
        txt_diachi1.setText("");
        txt_diem1.setText("");
        txt_gioitinh1.setText("");
        txt_matv1.setText("");
        txt_ngaydangky1.setDate(null);
        txt_ngaysinh1.setDate(null);
        txt_sdt1.setText("");
        txt_tentv2.setText("");
        
                
    }//GEN-LAST:event_button_tracuu1MouseClicked

    private void table_thanhvienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_thanhvienMouseReleased
         
    }//GEN-LAST:event_table_thanhvienMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       table_thanhvien.setModel(new DefaultTableModel(null,new String[]{"MaTV","Tên","Giới Tính", "Ngày sinh", "Địa chỉ","SDT","CMND","Ngày DK","Điểm"}));
       showThanhVien();
       
    }//GEN-LAST:event_jButton1ActionPerformed

   public boolean UpdateTV(ThanhVien t){

        String query = "UPDATE THANHVIEN SET TENTV =?,GIOITINH = ?, NGAYSINH= to_date(?,'dd-mm-yyyy'),DIACHI= ? "
                 +     ",SDT= ? ,CMND= ? ,NGAYDANGKY= to_date(?,'dd-mm-yyyy'), DIEMTICHLUY= ? WHERE MATV = ?";
        //String q = "insert into thanhvien(hoten,masv,ngsinh) values(?,?,to_date(....))
        try {
            PreparedStatement pt = getConnection().prepareStatement(query);
            pt.setString(1,t.getTentv());
            
            pt.setString(2,t.getGioitinh());
            pt.setString(3,t.getNgaysinh());
            pt.setString(4,  t.getDiachi());
            pt.setString(5,t.getSdt());
            pt.setString(6,t.getCmnd());
            pt.setString(7,t.getNgaydk());
            pt.setInt(8,  t.getDiemtichluy());
            pt.setString(9, t.getMatv());
            
            return pt.executeUpdate() >0;
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    } 
    public static void main(String args[]) {
       
        TraCuuTV traCuuTV = new TraCuuTV();
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt_capnhat;
    private javax.swing.JButton button_tracuu1;
    private javax.swing.JButton button_tracuu2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_dong;
    private javax.swing.JPanel panel_exit;
    private javax.swing.JTable table_thanhvien;
    private javax.swing.JTextField txt_cmnd1;
    private javax.swing.JTextArea txt_diachi1;
    private javax.swing.JTextField txt_diem1;
    private javax.swing.JTextField txt_gioitinh1;
    private javax.swing.JTextField txt_matv1;
    private com.toedter.calendar.JDateChooser txt_ngaydangky1;
    private com.toedter.calendar.JDateChooser txt_ngaysinh1;
    private javax.swing.JTextField txt_sdt1;
    private javax.swing.JTextField txt_tentv2;
    private javax.swing.JTextField txt_tracuu;
    // End of variables declaration//GEN-END:variables
}
