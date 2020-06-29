/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Controller.CTHD_ctrl;
import Controller.DatVe_ctrl;
import Controller.HoaDon_ctrl;
import Controller.KhuyenMai_ctrl;
import Controller.ThanhVien_ctrl;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
/**
 *
 * @author PC
 */
public class ThanhToan__SP_UI extends javax.swing.JFrame {

    /**
     * Creates new form ThanhToan_UI
     */
    public ThanhToan__SP_UI() {
        initComponents();
        this.setTitle("Thanh Toán");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CB_MaGiamGia_No.setSelected(true);
        Txt_MaGiamGia.setEditable(false);
        CB_MaTV_No.setSelected(true);
        Txt_MaTV.setEditable(false);      
        setSlider();
        Lbl_TongTien_Num.setText(Home.tongtien+"");
        Lbl_ThanhTien_num.setText(Home.tongtien+"");
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
        Lbl_ThanhToan = new javax.swing.JLabel();
        Lbl_MaTV = new javax.swing.JLabel();
        CB_MaTV_No = new javax.swing.JCheckBox();
        CB_MaTV_Yes = new javax.swing.JCheckBox();
        Txt_MaTV = new javax.swing.JTextField();
        Lbl_MaGiamGia = new javax.swing.JLabel();
        CB_MaGiamGia_No = new javax.swing.JCheckBox();
        CB_MaGiamGia_Yes = new javax.swing.JCheckBox();
        Txt_MaGiamGia = new javax.swing.JTextField();
        Lbl_TongTien = new javax.swing.JLabel();
        Lbl_TongTien_Num = new javax.swing.JLabel();
        Lbl_GiamGia = new javax.swing.JLabel();
        Lbl_GiamGia_num = new javax.swing.JLabel();
        Sl_DTL = new javax.swing.JSlider();
        Lbl_DiemTichLuy = new javax.swing.JLabel();
        Txt_DTL_HienCo = new javax.swing.JTextField();
        Txt_DTL_use = new javax.swing.JTextField();
        Lbl_ThanhTien = new javax.swing.JLabel();
        Lbl_ThanhTien_num = new javax.swing.JLabel();
        Btn_ThanhToan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setLayout(null);

        Lbl_ThanhToan.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Lbl_ThanhToan.setText("Thanh Toán");

        Lbl_MaTV.setText("Mã Thành Viên:");

        CB_MaTV_No.setText("Không");
        CB_MaTV_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MaTV_NoActionPerformed(evt);
            }
        });

        CB_MaTV_Yes.setText(":");
        CB_MaTV_Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MaTV_YesActionPerformed(evt);
            }
        });

        Txt_MaTV.setText("Mã Thành Viên");
        Txt_MaTV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_MaTVKeyPressed(evt);
            }
        });

        Lbl_MaGiamGia.setText("Mã Giảm Giá:");

        CB_MaGiamGia_No.setText("Không");
        CB_MaGiamGia_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MaGiamGia_NoActionPerformed(evt);
            }
        });

        CB_MaGiamGia_Yes.setText(":");
        CB_MaGiamGia_Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MaGiamGia_YesActionPerformed(evt);
            }
        });

        Txt_MaGiamGia.setText("Mã Giảm Giá");
        Txt_MaGiamGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_MaGiamGiaKeyPressed(evt);
            }
        });

        Lbl_TongTien.setText("Tổng tiền:");

        Lbl_TongTien_Num.setText("0");

        Lbl_GiamGia.setText("Giảm giá:");

        Lbl_GiamGia_num.setText("0");

        Sl_DTL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sl_DTLStateChanged(evt);
            }
        });

        Lbl_DiemTichLuy.setText("Điểm Tích lũy:");

        Txt_DTL_HienCo.setText("0");

        Txt_DTL_use.setText("0");
        Txt_DTL_use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DTL_useActionPerformed(evt);
            }
        });

        Lbl_ThanhTien.setText("Thành Tiền:");

        Lbl_ThanhTien_num.setText("0");

        Btn_ThanhToan.setText("Thanh Toán");
        Btn_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ThanhToanActionPerformed(evt);
            }
        });

        jLabel1.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_MaTV, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_MaTV_No)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_MaTV_Yes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_MaTV))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_MaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_MaGiamGia_No)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_MaGiamGia_Yes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_MaGiamGia))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lbl_GiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lbl_TongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                            .addComponent(Lbl_ThanhTien))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_ThanhTien_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_GiamGia_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_TongTien_Num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_DiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DTL_HienCo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DTL_use, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sl_DTL, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lbl_ThanhToan)
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_MaTV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_MaTV_No)
                    .addComponent(Txt_MaTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_MaTV_Yes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sl_DTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lbl_DiemTichLuy)
                        .addComponent(Txt_DTL_HienCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_DTL_use, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_MaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_MaGiamGia_No)
                    .addComponent(Txt_MaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_MaGiamGia_Yes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_TongTien)
                    .addComponent(Lbl_TongTien_Num))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_GiamGia)
                    .addComponent(Lbl_GiamGia_num))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ThanhTien)
                    .addComponent(Lbl_ThanhTien_num))
                .addGap(65, 65, 65)
                .addComponent(Btn_ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_MaTV_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MaTV_NoActionPerformed
        CB_MaTV_Yes.setSelected(false);
        Txt_MaTV.setText("Mã Thành Viên");
        Txt_MaTV.setEditable(false);
    }//GEN-LAST:event_CB_MaTV_NoActionPerformed

    private void CB_MaGiamGia_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MaGiamGia_NoActionPerformed
        CB_MaGiamGia_Yes.setSelected(false);
        Txt_MaGiamGia.setText("Mã Giảm Giá");
        Txt_MaGiamGia.setEditable(false);
    }//GEN-LAST:event_CB_MaGiamGia_NoActionPerformed

    private void CB_MaTV_YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MaTV_YesActionPerformed
        CB_MaTV_No.setSelected(false);
        Txt_MaTV.setEditable(true);
    }//GEN-LAST:event_CB_MaTV_YesActionPerformed

    private void CB_MaGiamGia_YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MaGiamGia_YesActionPerformed
        CB_MaGiamGia_No.setSelected(false);
        Txt_MaGiamGia.setEditable(true);
    }//GEN-LAST:event_CB_MaGiamGia_YesActionPerformed

    private void Txt_MaTVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_MaTVKeyPressed
        if (Txt_MaTV.isEditable()){
            String MaTV = Txt_MaTV.getText();
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {  
                ThanhVien_ctrl  tvc = new ThanhVien_ctrl();
                if (tvc.isThanhVien(MaTV)) {       
                    int DTL = tvc.getDiemTichLuy(MaTV);
                    Sl_DTL.setMaximum(DTL);
                    Txt_DTL_HienCo.setText(DTL+"");
                }
                else
                    JOptionPane.showMessageDialog(null,"Mã thành viên không hợp lệ");                
            }
        }
    }//GEN-LAST:event_Txt_MaTVKeyPressed

    private void Sl_DTLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sl_DTLStateChanged
        int value = Sl_DTL.getValue();
        Txt_DTL_use.setText(value+"");
        if (value>Value_of_Slider) {
            int giamgiadtl = value - Value_of_Slider;
            Value_of_Slider = value;
            float giamgia = Float.parseFloat(Lbl_GiamGia_num.getText());
            giamgia = giamgia + giamgiadtl;
            Lbl_GiamGia_num.setText(giamgia+"");
            int tongtien = Integer.parseInt(Lbl_TongTien_Num.getText());
            float thanhtien = Float.parseFloat(Lbl_ThanhTien_num.getText());
            thanhtien = tongtien - giamgia;
            Lbl_ThanhTien_num.setText(thanhtien+"");
        }
        else{
            int giamgiadtl =  Value_of_Slider - value;
            Value_of_Slider = value;
            float giamgia = Float.parseFloat(Lbl_GiamGia_num.getText());
            giamgia = giamgia-giamgiadtl;
            Lbl_GiamGia_num.setText(giamgia+"");
            int tongtien = Integer.parseInt(Lbl_TongTien_Num.getText());
            float thanhtien = Float.parseFloat(Lbl_ThanhTien_num.getText());
            thanhtien = tongtien - giamgia;
            Lbl_ThanhTien_num.setText(thanhtien+"");            
        }
    }//GEN-LAST:event_Sl_DTLStateChanged

    private void Txt_DTL_useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DTL_useActionPerformed
        int i = Integer.parseInt(Txt_DTL_use.getText());
        Sl_DTL.setValue(i);
        int value = Sl_DTL.getValue();
        if (value>Value_of_Slider) {
            int giamgiadtl = value - Value_of_Slider;
            Value_of_Slider = value;
            float giamgia = Float.parseFloat(Lbl_GiamGia_num.getText());
            giamgia = giamgia + giamgiadtl;
            Lbl_GiamGia_num.setText(giamgia+"");
            int tongtien = Integer.parseInt(Lbl_TongTien_Num.getText());
            float thanhtien = Float.parseFloat(Lbl_ThanhTien_num.getText());
            thanhtien = tongtien - giamgia;
            Lbl_ThanhTien_num.setText(thanhtien+"");
        }
        else{
            int giamgiadtl =  Value_of_Slider - value;
            Value_of_Slider = value;
            float giamgia = Float.parseFloat(Lbl_GiamGia_num.getText());
            giamgia = giamgia-giamgiadtl;
            Lbl_GiamGia_num.setText(giamgia+"");
            int tongtien = Integer.parseInt(Lbl_TongTien_Num.getText());
            float thanhtien = Float.parseFloat(Lbl_ThanhTien_num.getText());
            thanhtien = tongtien - giamgia;
            Lbl_ThanhTien_num.setText(thanhtien+"");          
        }
    }//GEN-LAST:event_Txt_DTL_useActionPerformed

    private void Txt_MaGiamGiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_MaGiamGiaKeyPressed
        if (Txt_MaGiamGia.isEditable()){
            String MaGG = Txt_MaGiamGia.getText();
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {  
                KhuyenMai_ctrl  kmc = new KhuyenMai_ctrl();
                if (kmc.isKhuyenMai(MaGG)) {       
                    int TLKM = kmc.getTyleKM(MaGG);
                    long tongtien = Long.parseLong(Lbl_TongTien_Num.getText());
                    float giamgia_ma = (float)tongtien*TLKM/100;
                    float giamgia = Float.parseFloat(Lbl_GiamGia_num.getText());
                    giamgia = giamgia + giamgia_ma;
                    Lbl_GiamGia_num.setText(giamgia+"");
                    float thanhtien = Float.parseFloat(Lbl_ThanhTien_num.getText());
                    thanhtien = tongtien - giamgia;
                    Lbl_ThanhTien_num.setText(thanhtien+"");
                }
                else
                    JOptionPane.showMessageDialog(null,"Mã khuyến mãi không hợp lệ");                
            }
        }
    }//GEN-LAST:event_Txt_MaGiamGiaKeyPressed

    private void Btn_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ThanhToanActionPerformed
        HoaDon_ctrl hdc = new HoaDon_ctrl();
        String MANV = DangNhap.MaNV;
        long DTL = Long.parseLong(Txt_DTL_use.getText());
        String MATV = null;
        if(CB_MaTV_Yes.isSelected()){
            MATV = Txt_MaTV.getText();
        }
        float ThanhTien = Float.parseFloat(Lbl_ThanhTien_num.getText());
        String MAKM = null;
        if(CB_MaGiamGia_Yes.isSelected()){
            MAKM = Txt_MaGiamGia.getText();
        }
        int sohd = hdc.TaoHoaDon(MANV, MATV, ThanhTien, MAKM,DTL);
        CTHD_ctrl ctc = new CTHD_ctrl();
        boolean tmp = true;
        if (Home.sl_sp1>0) {
            if(!ctc.Tao_CTHD("SP1", sohd, Home.sl_sp1, 45000*Home.sl_sp1))
                tmp=false;
        }
        if (Home.sl_sp2>0) {
            if(!ctc.Tao_CTHD("SP2", sohd, Home.sl_sp2, 55000*Home.sl_sp2))
                tmp=false;
        }
        if (Home.sl_sp3>0) {
            if(!ctc.Tao_CTHD("SP3", sohd, Home.sl_sp3, 30000*Home.sl_sp3))
                tmp=false;
        }
        if (Home.sl_sp4>0) {
            if(ctc.Tao_CTHD("SP4", sohd, Home.sl_sp4, 40000*Home.sl_sp4))
                tmp=false;
        }
        if (Home.sl_sp5>0) {
            if(!ctc.Tao_CTHD("SP5", sohd, Home.sl_sp5, 30000*Home.sl_sp5))
                tmp=false;
        }
        if (Home.sl_sp6>0) {
            if(ctc.Tao_CTHD("SP6", sohd, Home.sl_sp6, 40000*Home.sl_sp6))
                tmp=false;
        }
        if (Home.sl_sp7c>0) {
            if(ctc.Tao_CTHD("SP7C", sohd, Home.sl_sp7c, 70000*Home.sl_sp7c))
                tmp=false;
        }
        if (Home.sl_sp8c>0) {
            if(ctc.Tao_CTHD("SP8C", sohd, Home.sl_sp8c, 80000*Home.sl_sp8c))
                tmp=false;
        }
        if (Home.sl_sp9c>0) {
            if(ctc.Tao_CTHD("SP9C", sohd, Home.sl_sp9c, 80000*Home.sl_sp9c))
                tmp=false;
        }
        if (Home.sl_sp10c>0) {
            if(ctc.Tao_CTHD("SP10C", sohd, Home.sl_sp10c, 90000*Home.sl_sp10c))
                tmp=false;
        }
        if (Home.sl_sp11c>0) {
            if(ctc.Tao_CTHD("SP11C", sohd, Home.sl_sp11c, 100000*Home.sl_sp11c))
                tmp=false;
        }
        if (Home.sl_sp12c>0) {
            if(ctc.Tao_CTHD("SP12C", sohd, Home.sl_sp12c, 110000*Home.sl_sp12c))
                tmp=false;
        }
        if (tmp) {
            JOptionPane.showMessageDialog(null, "Thanh toán thành công");
        }
        else JOptionPane.showMessageDialog(null, "Thanh toán không thành công");
        this.dispose();
    }//GEN-LAST:event_Btn_ThanhToanActionPerformed

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
            java.util.logging.Logger.getLogger(ThanhToan__SP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan__SP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan__SP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan__SP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan__SP_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ThanhToan;
    private javax.swing.JCheckBox CB_MaGiamGia_No;
    private javax.swing.JCheckBox CB_MaGiamGia_Yes;
    private javax.swing.JCheckBox CB_MaTV_No;
    private javax.swing.JCheckBox CB_MaTV_Yes;
    private javax.swing.JLabel Lbl_DiemTichLuy;
    private javax.swing.JLabel Lbl_GiamGia;
    private javax.swing.JLabel Lbl_GiamGia_num;
    private javax.swing.JLabel Lbl_MaGiamGia;
    private javax.swing.JLabel Lbl_MaTV;
    private javax.swing.JLabel Lbl_ThanhTien;
    private javax.swing.JLabel Lbl_ThanhTien_num;
    private javax.swing.JLabel Lbl_ThanhToan;
    private javax.swing.JLabel Lbl_TongTien;
    private javax.swing.JLabel Lbl_TongTien_Num;
    private javax.swing.JSlider Sl_DTL;
    private javax.swing.JTextField Txt_DTL_HienCo;
    private javax.swing.JTextField Txt_DTL_use;
    private javax.swing.JTextField Txt_MaGiamGia;
    private javax.swing.JTextField Txt_MaTV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private int Value_of_Slider=0;
    private void setSlider(){
        Sl_DTL.setValue(0);
    }
}