/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.Oracle.con;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class KhuyenMai_ctrl extends Oracle {
    public boolean isKhuyenMai (String MaKM){
        String query = "select *\n" +
                       "from khuyenmai\n" +
                       "where makm ='"+MaKM+"'";
        try {
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        if (rs.next()){
            return true;
        }
        else return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public int getTyleKM(String MaKM){
        int TLKM = 0;
        String query = "select TyleKM\n" +
                       "from khuyenmai\n" +
                       "where makm ='"+MaKM+"'";
        try {
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        if (rs.next())
            TLKM = rs.getInt(1);
        con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return TLKM;
    }
}
