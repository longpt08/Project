create or replace procedure pro_datve (p_MaGhe nvarchar2,
p_MaSC nvarchar2,
p_MaKM nvarchar2,
p_MaNV nvarchar2,
p_MaTV nvarchar2,
p_ThanhTien number)
as
        v_sohd   HOADON.SOHD%TYPE;
        v_ngayhd HOADON.NGAYHD%type;
begin
        v_ngayhd := to_date(current_date(),'dd-mm-YYYY');
        insert into hoadon (MaNV, matv, NGAYHD,tongtien)
            values(p_MaNV, p_MaTV, v_ngayhd, p_ThanhTien);
        select  hd.soHD into v_sohd
        from    hoadon hd, datve d
        where   hd.sohd = d.sohd
                and ngayhd = v_ngayhd;
        insert into datve values(p_MaGhe, p_MaSC, v_sohd, p_MaKM, p_ThanhTien);    
        commit;
end;

select vitri from datve join ghe on datve.maghe=ghe.maghe where masc ='1sc';
commit;
