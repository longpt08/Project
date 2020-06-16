/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DatVe_ctrl extends Oracle{
    public ArrayList<String> ViTriDaDat(String MaSuatChieu){
        ArrayList<String> ViTri = new ArrayList<>();
        String query = "Select ViTri "+
                       "from DatVe dv inner join ghe on dv.maghe=ghe.maghe "+
                       "where masc = '"+MaSuatChieu+"'";
        try{
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                ViTri.add(rs.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ViTri;
    }
    public boolean DatVe(String MAGHE,String MASC, int SOHD){
        String sp_datve = "{call SP_DATVE(?,?,?)}";
        try{
            CallableStatement smt=con.prepareCall(sp_datve);
            smt.setString(1,MAGHE);
            smt.setString(2,MASC);
            smt.setInt(3,SOHD);
            if(smt.executeUpdate()>0){
                return true;
            }
            else return false;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public int TaoHoaDon(String MANV, String MATV,float TONGTIEN,String MAKM){
        String f_create_hoadon = "{?=call F_CREATE_HOADON_DATVE(?,?,?,?)}";
        int sohd =0;
        try{
            CallableStatement smt = con.prepareCall(f_create_hoadon);
            smt.registerOutParameter(1, Types.NUMERIC);
            smt.setString(2,MANV);
            smt.setString(3,MATV);
            smt.setFloat(4,TONGTIEN);
            smt.setString(5,MAKM);
            smt.executeUpdate();
            sohd = smt.getInt(1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return sohd;
    }
    public int KiemTraGhe(String MAGHE, String MASC){
        int check = 0;
        String f_check_seat = "{? = call F_CHECK_SEAT(?,?)}";
        try{
            CallableStatement smt = con.prepareCall(f_check_seat);
            smt.registerOutParameter(1, Types.NUMERIC);
            smt.setString(2,MAGHE);
            smt.setString(3,MASC);
            smt.executeUpdate();
            check = smt.getInt(1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
}
