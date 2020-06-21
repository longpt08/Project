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
import model.NhanVien;
import model.TaiKhoan;

/**
 *
 * @author PC
 */
public class TaiKhoan_ctrl extends Oracle {
    public boolean Login (String username, String password){
        String query = "select * from TaiKhoan where TenTK = '"+username+"' and Password = '"+password+"'";
        try{
            Statement smt = Oracle.getConnection().createStatement();
            ResultSet rs = smt.executeQuery(query);
            if (rs.next())
                return true;
            else return false;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public String getThongTinDangNhap(String username){
        String MaNV = "";
        String query = "select manv from (select manv from nhanvien) nv join (select manguoidung, tentk from taikhoan where tentk = ?) tk on nv.manv=tk.manguoidung;";
        try{   
            PreparedStatement smt = Oracle.getConnection().prepareStatement(query);
            smt.setString(1, username);
            ResultSet rs = smt.executeQuery();
            if(rs.next()){
                MaNV = rs.getString(1);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return MaNV;
    }
     public boolean addTaiKhoan(model.TaiKhoan t){

        String query = "INSERT INTO TAIKHOAN VALUES(?,?,?,?,?)";
       
        try {
            PreparedStatement pt = getConnection().prepareStatement(query);
            pt.setString(1,t.getMatK());
            
            pt.setString(2,t.getMaNguoiDung());
            pt.setString(3,t.getTenTK());
            pt.setString(4,  t.getPassword());
            pt.setString(5,t.getLoaiTK());
           
            return pt.executeUpdate() >0;
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally{try {
                getConnection().close();
            } catch (Exception e) {
            }}
        return false;

    }
     public static  void showtaikhoan (String manv){
         model.TaiKhoan tk = new TaiKhoan();
         model.NhanVien nv = new NhanVien();
         String query = "select * from taikhoan tk join nhanvien nv on tk.manguoidung = nv.manv where manv = ?";
          try {
            PreparedStatement pt = getConnection().prepareStatement(query);
            pt.setString(1,manv);
          ResultSet rs = pt.executeQuery() ;
          while(rs.next())
              tk.setMatK(rs.getString(1));
              tk.setTenTK(rs.getString(3));
              nv.setHoTenNV(rs.getString(9));
              nv.setGioiTinh(rs.getString(10));
              nv.setNgaySinh(rs.getString(11));
              nv.setDiaChi(rs.getString(12));
              nv.setSDT(rs.getString(13));
           
        } catch (Exception e) {
            e.printStackTrace();}}
     
}
