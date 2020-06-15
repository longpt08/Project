/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import model.ThanhVien;
/**
 *
 * @author PC
 */
public class ThanhVien_ctrl extends Oracle{
    public boolean ThemThanhVien(ThanhVien tv){
        String query = "insert into ThanhVien values (?,?,?,?,to_date(?,'dd-mm-yyyy','NLS_DATE_LANGUAGE=American'),?,?,?,to_date(?,'dd-mm-yyyy','NLS_DATE_LANGUAGE=American'),?)";
        try{
            PreparedStatement presmt = con.prepareStatement(query);
            presmt.setString(1, tv.getMaTV());
            presmt.setString(2, "NV1");
            presmt.setString(3, tv.getTenTV());
            presmt.setString(4, tv.getGioiTinh());
            presmt.setString(5, tv.getNgaySinh());
            presmt.setString(6, tv.getDiaChi());
            presmt.setString(7, tv.getSDT());
            presmt.setString(8, tv.getCMND());
            presmt.setString(9, tv.getNgayDangKy());
            presmt.setInt(10, 0);
            if (presmt.executeUpdate()>0)
                return true;
            else return false;    
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public static ArrayList<ThanhVien> getAllMember(){
        ArrayList<ThanhVien> memberList = new ArrayList<>();
        String sql = "SELECT * FROM THANHVIEN";
        try {
            PreparedStatement pt = con.prepareStatement(sql);
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
                ThanhVien tv = new ThanhVien();
                tv.setMaTV(mtv);
                tv.setTenTV(tentv);
                tv.setDiaChi(dchi);
                tv.setCMND(cm);
                tv.setGioiTinh(gt);
                tv.setNgayDangKy(ngdk);
                tv.setSDT(dth);
                tv.setDiemTichLuy(dtl);
                tv.setNgaySinh(ngsinh);
                memberList.add(tv);
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberList;
    }
    public boolean XoaTV(ThanhVien tv){
        String sql = "DELETE FROM THANHVIEN WHERE MATV =?";
          try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,tv.getMaTV());
            int tmp = pre.executeUpdate();
              if (tmp>0) {
                  return true;
              }
              else return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean CapNhatTV(ThanhVien tv){
        String query = "UPDATE THANHVIEN SET TENTV =?,GIOITINH = ?, NGAYSINH= to_date(?,'dd-mm-yyyy'),DIACHI= ? "
                       +",SDT= ? ,CMND= ? ,NGAYDANGKY= to_date(?,'dd-mm-yyyy'), DIEMTICHLUY= ? WHERE MATV = ?";
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1,tv.getTenTV());
            pt.setString(2, tv.getGioiTinh());
            pt.setString(3, tv.getNgaySinh());
            pt.setString(4, tv.getDiaChi());
            pt.setString(5, tv.getSDT());
            pt.setString(6, tv.getCMND());
            pt.setString(7, tv.getNgayDangKy());
            pt.setInt(8, tv.getDiemTichLuy());
            pt.setString(9, tv.getMaTV());
            int tmp = pt.executeUpdate();
            con.close();
            if (tmp>0) {
                return true;
            }
            else return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public int getDiemTichLuy(String MaTV){
        int DTL = 0;
        String query = "select DiemTichLuy\n" +
                       "from thanhvien\n" +
                       "where matv ='"+MaTV+"'";
        try {
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        if (rs.next())
            DTL = rs.getInt(1);
        con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return DTL;
    }
}
