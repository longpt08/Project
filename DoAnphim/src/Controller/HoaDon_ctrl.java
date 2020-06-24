/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.Oracle.con;
import java.sql.CallableStatement;
import java.sql.Types;

/**
 *
 * @author PC
 */
public class HoaDon_ctrl extends Oracle {
        public int TaoHoaDon(String MANV, String MATV,float TONGTIEN,String MAKM, long DTL){
        String f_create_hoadon = "{?=call F_CREATE_HOADON_DATVE(?,?,?,?,?)}";
        int sohd =0;
        try{
            CallableStatement smt = con.prepareCall(f_create_hoadon);
            smt.registerOutParameter(1, Types.NUMERIC);
            smt.setString(2,MANV);
            smt.setString(3,MATV);
            smt.setFloat(4,TONGTIEN);
            smt.setString(5,MAKM);
            smt.setLong(6,DTL);
            smt.executeUpdate();
            sohd = smt.getInt(1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return sohd;
    }
}
