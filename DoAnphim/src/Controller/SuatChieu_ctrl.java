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
import model.SuatChieu;
/**
 *
 * @author PC
 */
public class SuatChieu_ctrl extends Oracle {
    public Vector<String> ListNgayChieu (){
            Vector<String> ListNgayChieu = new Vector<String>();
            String query = "select Ngaychieu from suatchieu group by ngaychieu having ngaychieu>sysdate";
            try{
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery(query);
                while (rs.next()){
                String date_before_convert = rs.getString(1);
                String date_after_convert = date_before_convert.substring(8,10)+"-"+date_before_convert.substring(5,8)+date_before_convert.substring(0,4);
                ListNgayChieu.add(date_after_convert);
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
    public Vector<String> ListPhim(String NgayChieu, String LoaiPhim){
        Vector<String> ListPhim = new Vector<String>();
        String query = "select  tenphim "
                       +"from    ((select malp from loaiphim where tenlp ='"+LoaiPhim+"') lp inner join "
                               +"(select maphim, malp, tenphim from phim) p on lp.malp = p.malp) inner join "
                               +"(select maphim from suatchieu where ngaychieu = TO_DATE('"+NgayChieu+"', 'DD-MM-YYYY','NLS_DATE_LANGUAGE = American')) sc on sc.maphim = p.maphim "
                               +"group by tenphim";
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()){
                ListPhim.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPhim;
    }
    public Vector<String> ListThoiGianChieu(String NgayChieu, String LoaiPhim, String TenPhim){
        Vector<String> ListThoiGianChieu = new Vector<String>();
        String query = "select  thoigianchieu "
                       +"from    ((select malp from loaiphim where tenlp ='"+LoaiPhim+"') lp inner join "
                               +"(select maphim, malp from phim where tenphim ='"+TenPhim+"') p on lp.malp = p.malp) inner join "
                               +"(select maphim,thoigianchieu from suatchieu where ngaychieu = TO_DATE('"+NgayChieu+"', 'DD-MM-YYYY','NLS_DATE_LANGUAGE = American')) sc on sc.maphim = p.maphim "
                               +"group by ThoiGianChieu";
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()){
                ListThoiGianChieu.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListThoiGianChieu;
    }
    public String SuatChieuDaChon(String NgayChieu, String ThoiGianChieu, String TenPhim){
            String MaSuatChieu = "";
            String query = "select  masc "
                          +"from    suatchieu sc join phim p on sc.maphim = p.maphim "
                          +"where   thoigianchieu ='"+ThoiGianChieu+"' and ngaychieu =TO_DATE('"+NgayChieu+"', 'DD-MM-YYYY','NLS_DATE_LANGUAGE = American') "
                          +"and tenphim = '"+TenPhim+"'";
            try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
                if (rs.next())
                    MaSuatChieu=rs.getString(1);
            } catch (Exception e) {
            e.printStackTrace();
            }
            return MaSuatChieu;
    }
    public String RapDaChon(String NgayChieu, String ThoiGianChieu){
            String MaRap = null;
            String query = "select  marap "
                          +"from    suatchieu "
                          +"where   thoigianchieu ='"+ThoiGianChieu+"' and ngaychieu =TO_DATE('"+NgayChieu+"', 'DD-MM-YYYY','NLS_DATE_LANGUAGE = American')";
            try {
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery(query);
                if (rs.next())
                    MaRap = rs.getString(1);
            } catch (Exception e) {
            e.printStackTrace();
            }
            return MaRap;
    }
}
