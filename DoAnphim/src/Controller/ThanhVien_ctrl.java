/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
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
}
