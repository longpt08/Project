/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class SuatChieu_ctrl extends Oracle {
    public Vector<String> ListNgayChieu (){
        Vector<String> ListNgayChieu = new Vector<String>();
        String query = "Select NGAYCHIEU from SUATCHIEU group by NGAYCHIEU";
        try{
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()){
                String date =rs.getString(1).substring(8,10)+"-"+rs.getString(1).substring(5,8)+rs.getString(1).substring(0,4);
                ListNgayChieu.add(date);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListNgayChieu;
    }
    public Vector<String> ListLoaiPhim(String NgayChieu){
        Vector<String> ListLoaiPhim = new Vector<String>();
        String query = "select  tenlp "
                       +"from    ((select malp, tenlp from loaiphim) lp inner join "
                               +"(select maphim, malp from phim) p on lp.malp = p.malp) inner join "
                               +"(select maphim from suatchieu where ngaychieu = TO_DATE('"+NgayChieu+"', 'DD-MM-YYYY','NLS_DATE_LANGUAGE = American')) sc on sc.maphim = p.maphim "
                               +"group by tenlp";
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()){
                ListLoaiPhim.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListLoaiPhim;
    }
}
