/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class DatVe_ctrl extends Oracle{
    public boolean GheDaDat(String ViTri, String MaSuatChieu){
        String query = "Select dv.MaGhe "+
                       "from DatVe dv inner join ghe on dv.maghe=ghe.maghe "+
                       "where vitri ='"+ViTri+"' and masc = '"+MaSuatChieu+"'";
        try{
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            if (rs.next()) {
                return true;
            }
            else return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
