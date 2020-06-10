/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author Phon
 */
public class ThanhVien implements Serializable{
    private String matv,tentv,gioitinh,diachi,sdt,cmnd;
    private String ngaysinh, ngaydk;
    private int diemtichluy;

    public ThanhVien(String matv, String tentv, String gioitinh, String diachi, String sdt, String cmnd, String ngaysinh, String ngaydk, int diemtichluy) {
        this.matv = matv;
        this.tentv = tentv;
        
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.ngaysinh = ngaysinh;
        this.ngaydk = ngaydk;
        this.diemtichluy = diemtichluy;
    }

    public ThanhVien() {
    }

    public String getMatv() {
        return matv;
    }

    public void setMatv(String matv) {
        this.matv = matv;
    }

    public String getTentv() {
        return tentv;
    }

    public void setTentv(String tentv) {
        this.tentv = tentv;
    }

   
    

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(String ngaydk) {
        this.ngaydk = ngaydk;
    }

    public int getDiemtichluy() {
        return diemtichluy;
    }

    public void setDiemtichluy(int diemtichluy) {
        this.diemtichluy = diemtichluy;
    }
    
    
    
}
