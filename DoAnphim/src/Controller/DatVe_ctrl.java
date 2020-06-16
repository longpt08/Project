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
    public boolean DatVe(String MANV, String MATV,String MASC,String MAGHE,float TONGTIEN,String MAKM){
        String query = "{call SP_DatVe(?,?,?,?,?,?)}";
        try{
            CallableStatement smt = con.prepareCall(query);
            smt.setString(1,MANV);
            smt.setString(2,MATV);
            smt.setString(3,MASC);
            smt.setString(4,MAGHE);
            smt.setFloat(5,TONGTIEN);
            smt.setString(6,MAKM);
            if (smt.executeUpdate()>0) {
                return true;
            }
            else return false;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
