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

/**
 *
 * @author PC
 */
public class TaiKhoan_ctrl extends Oracle {
    public boolean Login (String username, String password){
        String query = "select * from TaiKhoan where TenTK = '"+username+"' and Password = '"+password+"'";
        try{
            Statement smt = con.createStatement();
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
        String query = "select manv\n" +
                       "from (select manv from nhanvien) nv join (select manguoidung, tentk from taikhoan where tentk = '"+username+"') tk\n"+
                       "on nv.manv=tk.manguoidung";
        try{   
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            if(rs.next()){
                MaNV = rs.getString(1);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return MaNV;
    }
}
