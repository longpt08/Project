/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class SuatChieu_ctrl extends Oracle {
    public Vector<String> ListNgayChieu (){
        Vector<String> ngaychieu = new Vector<String>();
        String query = "Select NGAYCHIEU from SUATCHIEU group by NGAYCHIEU";
        try{
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()){
                ngaychieu.add(rs.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ngaychieu;
    }
}
